package parseTree;

import parseTree.parseTree.*;

import java.util.StringTokenizer;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.TypeParameter;
import com.github.javaparser.ast.body.AnnotationDeclaration;
import com.github.javaparser.ast.body.AnnotationMemberDeclaration;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.EmptyMemberDeclaration;
import com.github.javaparser.ast.body.EmptyTypeDeclaration;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.InitializerDeclaration;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.MultiTypeParameter;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.body.VariableDeclaratorId;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.AssertStmt;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.BreakStmt;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.stmt.ContinueStmt;
import com.github.javaparser.ast.stmt.DoStmt;
import com.github.javaparser.ast.stmt.EmptyStmt;
import com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.stmt.ForeachStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.LabeledStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.SwitchEntryStmt;
import com.github.javaparser.ast.stmt.SwitchStmt;
import com.github.javaparser.ast.stmt.SynchronizedStmt;
import com.github.javaparser.ast.stmt.ThrowStmt;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.stmt.TypeDeclarationStmt;
import com.github.javaparser.ast.stmt.WhileStmt;
import com.github.javaparser.ast.type.*;

import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

import static com.github.javaparser.ast.internal.Utils.isNullOrEmpty;

public class MyVisit extends VoidVisitorAdapter<Object>{

	private ParseTree parseTree ;
	private int dim;
	private String className = null;
	private HashMap<String,String> classVariableType = new HashMap<String,String>();
	private HashMap<String,String> variableType = new HashMap<String,String>();
	private LinkedList<String> ownImport = new LinkedList<String>();
	private String ownPackage;
	private HashMap<String,Integer> classNameIndex = new HashMap<String,Integer>();
	private String extendsName;
	private HashMap<String,MyFileRepresenter> classFileRep = new HashMap<String,MyFileRepresenter>();

	private int count = 0;

	private int commentCount = 0;
	private int usefulCommentCount = 0;

	public MyVisit(int dim, String className, HashMap<String,String> classVariableType,LinkedList<String> ownImport, String ownPackage, HashMap<String,Integer> classNameIndex,String extendsName,HashMap<String,MyFileRepresenter> classFileRep){
		this.dim = dim;
		this.className = className;
		this.classVariableType = classVariableType;
		this.ownImport = ownImport;
		this.ownPackage = ownPackage;
		this.classNameIndex = classNameIndex;
		this.extendsName = extendsName;
		this.classFileRep = classFileRep;

		parseTree = new ParseTree(dim);
	}

	public ParseTree getParseTree(){
		return this.parseTree;
	}

	public int getCommentNum(){
		return commentCount;
	}

	public int getUsefulCommentCount(){
		return usefulCommentCount;
	}

	private int judgeClass(String type){
                int i;
                int pos;
                for (i = 0; i < ownImport.size(); ++i){
                        String impo = ownImport.get(i);
                        pos = impo.lastIndexOf('.');
                        if (pos != -1){
                                if (type.equals(impo.substring(pos+1,impo.length())))
                                        return i;
                        }
                }

                return -1;
        }


	private String eliminateSymbol(String name){
                int pos = name.indexOf('[');
                if (pos == -1)
                        return name;
                else return name.substring(0,pos);
        }


	private String getClassFullName(String type){
                int pos = judgeClass(type);
                if (pos != -1)
                        return ownImport.get(pos)+"."+type;
                else {
                        String classString = ownPackage+"."+type;
                        if (classNameIndex.containsKey(classString))
                                return classString;
                        else return null;
                }
        }

	// Compilation Unit
/*	@Override
	public void visit(CompilationUnit n, Object father){
		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}
		if (n.getPackage() != null) {
			n.getPackage().accept(this, father);
		}
		if (n.getImports() != null) {
			int index = parseTree.addNode(((Integer)father).intValue(),"Imports");
			for (ImportDeclaration i : n.getImports()) {
				i.accept(this, Integer.valueOf(index));
			}
		}
		if (n.getTypes() != null) {
			for (TypeDeclaration typeDeclaration : n.getTypes()) {
				typeDeclaration.accept(this, father);
			}
		}
	}
	@Override
	public void visit(PackageDeclaration n, Object father){
		int index = parseTree.addNode(((Integer)father).intValue(),"Package");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}


		if (n.getAnnotations() != null){
			for (AnnotationExpr a : n.getAnnotations()){
				a.accept(this,father);
			}
		}
		
		parseTree.addNode(index,n.getName().toString());
		//n.getName().accept(this,Integer.valueOf(index));
	}

	@Override
	public void visit(ImportDeclaration n, Object father){
		int index = parseTree.addNode(((Integer)father).intValue(),n.getName().toString());

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

	}

*/	//Body

	@Override
	public void visit(VariableDeclarator n, Object father){

//--------------------------------------------------------------
		if (n.getParentNode() instanceof VariableDeclarationExpr){
		String nameType = (eliminateSymbol(((VariableDeclarationExpr)n.getParentNode()).getType().toString()));
                String fullName = getClassFullName(nameType);
                if (fullName != null){
                        variableType.put(eliminateSymbol(n.getId().getName().toString()),fullName);
                }
		}

//--------------------------------------------------------------

		int index = parseTree.addNode(((Integer)father).intValue(),"VariableDeclarator");
		if (Bmcl.comment == 1 && n.getComment() != null){
//System.out.println("VariableDeclarator");
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		n.getId().accept(this,Integer.valueOf(index));
		if (n.getInit() != null){
//System.out.println("VariableDeclarator_Init  "+n.getInit().toString() + "  " + n.getInit().getClass().toString());
			int index2 = parseTree.addNode(index,"Init");
			n.getInit().accept(this, Integer.valueOf(index2));
		}
        //定义时除了type的部分
	}

	public void visit(VariableDeclaratorId n,Object father){
		int index = parseTree.addNode(((Integer)father).intValue(),"VariableDeclaratorId");
		if (Bmcl.comment == 1 && n.getComment() != null){
//System.out.println("VariableDeclaratorId");
			visitComment(n.getComment(),Integer.valueOf(index));
		}

        //@HHF
        List<String> full = dict.get(n.getName());
        if (full == null)
            full = split(n.getName()).get(0);
        if (full.size() == 1)
		    parseTree.addNode(index,n.getName());
        else {
            int index2 = parseTree.addNode(index, "CombineName");
            for (String s:full) {
                parseTree.addNode(index2, s);
            }
        }
//		super.visit(n,Integer.valueOf(index));
        //定义的id，以及函数的参数
	}

/*	@Override
	public void visit(ConstructorDeclaration n, Object father){
		int index = parseTree.addNode(((Integer)father).intValue(),"ConstructorDeclaration");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		super.visit(n,(Object)Integer.valueOf(index));
	}
*/
	@Override
	 public void visit(MethodDeclaration n, Object father) {
//		int index = parseTree.addNode(((Integer)father).intValue(),"MethodDeclaration");
        //函数体定义
		super.visit(n,father);

/*		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		if (n.getJavaDoc() != null) {
			n.getJavaDoc().accept(this, Integer.valueOf(index));
		}
		if (n.getAnnotations() != null) {
			for (final AnnotationExpr a : n.getAnnotations()) {
System.out.println("MethodDeclaration_AnnotationExpr "+a.toString()+"  " + a.getClass().toString());
				a.accept(this, Integer.valueOf(index));
			}
		}
		if (n.getTypeParameters() != null) {
			for (final TypeParameter t : n.getTypeParameters()) {
System.out.println("MethodDeclaration_TypeParameters "+t.toString()+" " + t.getClass().toString());
				t.accept(this, Integer.valueOf(index));
			}
		}

System.out.println("MethodDeclaration_Type "+n.getType().toString()+" " + n.getType().getClass().toString());
		n.getType().accept(this, Integer.valueOf(index));
		if (n.getParameters() != null) {
			for (final Parameter p : n.getParameters()) {
System.out.println("MethodDeclaration_Parameter "+p.toString() + "  " + p.getClass().toString());
				p.accept(this, Integer.valueOf(index));
			}
		}
		if (n.getThrows() != null) {
			int index2 = 0;
			if (n.getThrows().size() > 0)
				index2 = parseTree.addNode(((Integer)father).intValue(),"Throws");
			for (final NameExpr name : n.getThrows()) {
System.out.println("MethodDeclaration_Throws " + name.toString());
				name.accept(this, Integer.valueOf(index2));
			}
		}
		if (n.getBody() != null) {
System.out.println("MethodDeclaration_Body " + n.getBody().getClass().toString());
			n.getBody().accept(this, Integer.valueOf(index));
		}
*/	}

/*	public void visit(ClassOrInterfaceDeclaration n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"ClassOrInterfaceDeclaration");
		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}
		int index2 ;

		if (n.getJavaDoc() != null) {
			index2 = parseTree.addNode(index,"JavaDoc");
			n.getJavaDoc().accept(this, Integer.valueOf(index2));
		}
		if (n.getAnnotations() != null) {
			index2 = parseTree.addNode(index,"Annotations");
			for (final AnnotationExpr a : n.getAnnotations()) {
				a.accept(this, Integer.valueOf(index2));
			}
		}
		if (n.getTypeParameters() != null) {
			index2 = parseTree.addNode(index,"TypeParameters");
			for (final TypeParameter t : n.getTypeParameters()) {
				t.accept(this, Integer.valueOf(index2));
			}
		}
		if (n.getExtends() != null) {
			index2 = parseTree.addNode(index,"Extends");
			for (final ClassOrInterfaceType c : n.getExtends()) {
				c.accept(this, Integer.valueOf(index2));
			}
		}

		if (n.getImplements() != null) {
			index2 = parseTree.addNode(index,"Implements");
			for (final ClassOrInterfaceType c : n.getImplements()) {
				c.accept(this, Integer.valueOf(index2));
			}
		}
		if (n.getMembers() != null) {
			index2 = parseTree.addNode(index,"Members");
			for (final BodyDeclaration member : n.getMembers()) {
				member.accept(this, Integer.valueOf(index2));
			}
		}
	}
*/
	public void visit(EnumDeclaration n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"EnumDeclaration");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2;
        //enum定义结构
		if (n.getJavaDoc() != null) {
			index2 = parseTree.addNode(index,"JavaDoc");
			n.getJavaDoc().accept(this, Integer.valueOf(index2));
		}
		if (n.getAnnotations() != null) {
			index2 = parseTree.addNode(index,"Annotations");
			for (final AnnotationExpr a : n.getAnnotations()) {
				a.accept(this, Integer.valueOf(index2));
			}
		}
		if (n.getImplements() != null) {
			index2 = parseTree.addNode(index,"Implements");
			for (final ClassOrInterfaceType c : n.getImplements()) {
				c.accept(this, Integer.valueOf(index2));
			}
		}
		if (n.getEntries() != null) {
			index2 = parseTree.addNode(index,"Entries");
			for (final EnumConstantDeclaration e : n.getEntries()) {
				e.accept(this, Integer.valueOf(index2));
			}
		}
		if (n.getMembers() != null) {
			index2 = parseTree.addNode(index,"Members");
			for (final BodyDeclaration member : n.getMembers()) {
				member.accept(this, Integer.valueOf(index2));
			}
		}
	}

	public void visit(EmptyTypeDeclaration n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"EmptyTypeDeclaration");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		if (n.getJavaDoc() != null){
			int index2 = parseTree.addNode(index,"JavaDoc");
			n.getJavaDoc().accept(this,Integer.valueOf(index2));
		}
	}

	public void visit(EnumConstantDeclaration n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"EnumConstantDeclaration");
		int index2;
        //enum的常量
		if (n.getJavaDoc() != null) {
			index2 = parseTree.addNode(index,"JavaDoc");
			n.getJavaDoc().accept(this, Integer.valueOf(index2));
		}

		if (n.getAnnotations() != null) {
			index2 = parseTree.addNode(index,"Annotations");
			for (final AnnotationExpr a : n.getAnnotations()) {
				a.accept(this, Integer.valueOf(index2));
			}
		}

		index2 = parseTree.addNode(index,"Name");
        //@HHF
        List<String> list = split(n.getName()).get(0);
        if (list.size() == 1)
		    parseTree.addNode(index2,n.getName());
        else {
            int index3 = parseTree.addNode(index2, "CombineName");
            for (String s:list)
                parseTree.addNode(index3, s);
        }

		if (n.getArgs() != null) {
			index2 = parseTree.addNode(index,"Args");
			for (final Expression e : n.getArgs()) {
				e.accept(this, Integer.valueOf(index2));
			}
		}

		if (n.getClassBody() != null) {
			index2 = parseTree.addNode(index,"ClassBody");
			for (final BodyDeclaration member : n.getClassBody()) {
				member.accept(this, Integer.valueOf(index2));
			}
		}
	}

	public void visit(AnnotationDeclaration n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"AnnotationDeclaration");
		int index2;

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		if (n.getJavaDoc() != null) {
			index2 = parseTree.addNode(index,"JavaDoc");
			n.getJavaDoc().accept(this, Integer.valueOf(index2));
		}

		if (n.getAnnotations() != null) {
			index2 = parseTree.addNode(index,"Annotations");
			for (final AnnotationExpr a : n.getAnnotations()) {
				a.accept(this, Integer.valueOf(index2));
			}
		}

		if (n.getMembers() != null) {
			index2 = parseTree.addNode(index,"Memebrs");
			for (final BodyDeclaration member : n.getMembers()) {
				member.accept(this, Integer.valueOf(index2));
			}
		}
	}

	public void visit(AnnotationMemberDeclaration n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"AnnotationMemberDeclaration");
		int index2;

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		if (n.getJavaDoc() != null){
			index2 = parseTree.addNode(index,"JavaDoc");
			n.getJavaDoc().accept(this,Integer.valueOf(index2));
		}

		if (n.getAnnotations() != null){
			index2 = parseTree.addNode(index,"Annotations");
			for (AnnotationExpr a : n.getAnnotations()){
				a.accept(this,Integer.valueOf(index2));
			}
		}

		index2 = parseTree.addNode(index,"Type");
		n.getType().accept(this,arg);

		if (n.getDefaultValue() != null){
			index2 = parseTree.addNode(index,"DefaultValue");
			n.getDefaultValue().accept(this,Integer.valueOf(index2));
		}
	}

	public void visit(FieldDeclaration n, Object arg){
        //类的变量定义 非函数中
		int index = parseTree.addNode(((Integer)arg).intValue(),"FieldDeclaration");
		int index2;

		if (n.getJavaDoc() != null){
			index2 = parseTree.addNode(index,"JavaDoc");
			n.getJavaDoc().accept(this,Integer.valueOf(index2));
		}

		if (n.getAnnotations() != null){
			index2 = parseTree.addNode(index,"Annotations");
			for (AnnotationExpr a : n.getAnnotations()){
				a.accept(this,Integer.valueOf(index2));
			}
		}

		index2 = parseTree.addNode(index,"Type");
		n.getType().accept(this,Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"VariableDeclarator");
		for (VariableDeclarator var : n.getVariables()){
			var.accept(this,Integer.valueOf(index2));
		}
	}

	public void visit(Parameter n, Object arg){
        //函数的参数！！！
		int index = parseTree.addNode(((Integer)arg).intValue(),"Parameter");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		
                int index2;

                if (n.getAnnotations() != null){
                        index2 = parseTree.addNode(index,"Annotations");
                        for (AnnotationExpr a : n.getAnnotations()){
                                a.accept(this,Integer.valueOf(index2));
                        }
                }

		index2 = parseTree.addNode(index,"Type");
		n.getType().accept(this,Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"Id");
		n.getId().accept(this,Integer.valueOf(index2));
	}
	
	public void visit(MultiTypeParameter n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"MultiTypeParameter");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2;

		if (n.getAnnotations() != null){
			index2 = parseTree.addNode(index,"Annotations");
			for (AnnotationExpr a : n.getAnnotations()){
				a.accept(this,Integer.valueOf(index2));
			}
		}


		index2 = parseTree.addNode(index,"Type");
		for (final Type type : n.getTypes()) {	
			type.accept(this, Integer.valueOf(index2));
		}

		index2 = parseTree.addNode(index,"Id");
		n.getId().accept(this,Integer.valueOf(index2));
	}

	public void visit(EmptyMemberDeclaration n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"EmptyMemberDeclaration");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.toString());
	}

	public void visit(InitializerDeclaration n, Object arg){
        //类中的一段定义
		int index = parseTree.addNode(((Integer)arg).intValue(),"InitializerDeclaratoin");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Block");
		n.getBlock().accept(this,Integer.valueOf(index2));
	}

	public void visit(JavadocComment n, Object arg){

		if (Bmcl.comment == 1){
			int index = parseTree.addNode(((Integer)arg).intValue(),"JavadocComment");
//System.out.println("JavadocComment " + n.toString());
			visitComment(n.getComment(),Integer.valueOf(index));
		}

//		super.visit(n,arg);
	}

	//- Type ----------------------------------------------

	public void visit(ClassOrInterfaceType n, Object arg){
        //除了int void等的 类型，如String InputStream.包括a=new B()里面的B
		int index = parseTree.addNode(((Integer)arg).intValue(),"ClassOrInterfaceType");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

//System.out.println("ClassOrInterfaceType_name"+n.getName());
		int index2 = parseTree.addNode(index,"Name");
        //@HHF
        List<List<String>> list = split(n.getName());
        int numOfWords = 0;

	if (list.size() > 0){
		numOfWords = list.get(0).size();
		if (numOfWords == 1) parseTree.addNode(index2,n.getName());
	        else {
        	    int indexW = parseTree.addNode(index2, "CombineName");
	            for (String str:list.get(0))
        	        parseTree.addNode(indexW, str);
	        }
	}

		if (n.getScope() != null){
//System.out.println("ClassOrInterfaceType_scope "+ n.getScope().toString() + "  "+n.getScope().getClass().toString());
			index2 = parseTree.addNode(index,"Scope");
			n.getScope().accept(this,Integer.valueOf(index2));
		}
		if (n.getTypeArgs() != null){
			index2 = parseTree.addNode(index,"TypeArgs");
			for (Type t : n.getTypeArgs()){

//System.out.println("ClassOrInterfaceType_typeArgs "+ t.toString() + "  "+t.getClass().toString());
				t.accept(this,Integer.valueOf(index2));
			}
		}
//		super.visit(n,arg);
	}

	public void visit(PrimitiveType n, Object arg){
        //原始类型int float..
		int index = parseTree.addNode(((Integer)arg).intValue(),"PrimitiveType");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

//System.out.println("PrimitiveType  " + n.toString() +  "  " + n.getType().toString());
		parseTree.addNode(index,n.getType().toString());
	}

	public void visit(ReferenceType n, Object arg){
        //除了int void等的 类型，如String InputStream.不包括a=new B()里面的B
		int index = parseTree.addNode(((Integer)arg).intValue(),"ReferenceType");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

//System.out.println("ReferenceType  " + n.getType().toString() + "  " + n.getType().getClass().toString());
		n.getType().accept(this,Integer.valueOf(index));
	}

/*	@Override
    	public void visit(IntersectionType n, Object arg){
		super.visit(n,arg);
	}

   	public void visit(UnionType n, Object arg){
		super.visit(n,arg);
	}
*/
	public void visit(VoidType n, Object arg){
        //void
		int index = parseTree.addNode(((Integer)arg).intValue(),"VoidType");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.toString());
	}

	public void visit(WildcardType n, Object arg){
        // class<? extends T>
		int index = parseTree.addNode(((Integer)arg).intValue(),"WildcardType");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2;

		if (n.getExtends() != null){
			index2 = parseTree.addNode(index,"Extends");
			n.getExtends().accept(this,Integer.valueOf(index2));
		}

		if (n.getSuper() != null){
			index2 = parseTree.addNode(index,"Super");
			n.getSuper().accept(this,Integer.valueOf(index2));
		}
	}

	public void visit(UnknownType n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"UnknownType");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.toString());
	}

	public void visit(BlockComment n, Object father){
		
		if (Bmcl.comment == 1){
			int index = parseTree.addNode(((Integer)father).intValue(),"BlockComment");
//System.out.println("BlockComment " + n.toString());
			visitComment(n.getComment(),Integer.valueOf(index));
		}
	}

	// Expression
	public void visit(BinaryExpr n, Object father){
//		System.out.println("BinaryExpr");
        //二元表达式
		int index = parseTree.addNode(((Integer)father).intValue(),"BinaryExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}
	
//System.out.println("Left "+n.getLeft().getClass().toString());	
		int index2 = parseTree.addNode(index,"LeftExpr");
//		parseTree.addNode(index2,n.getLeft().toString());
		n.getLeft().accept(this,Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"Operator");
		parseTree.addNode(index2,n.getOperator().toString());

//System.out.println("Right "+n.getRight().getClass().toString());		
		index2 = parseTree.addNode(index,"RightExpr");
//		parseTree.addNode(index2,n.getRight().toString());
		n.getRight().accept(this,Integer.valueOf(index2));
	}

	@Override
	public void visit(MethodCallExpr n, Object father){
//		System.out.println("MethodCallExpr "+ n.getNameExpr().toString()+"  " + n.getName().toString());
//System.out.println(n.toString());
        //method 调用
		int index = parseTree.addNode(((Integer)father).intValue(),"MethodCallExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2;

		//所调用函数的变量名
		if (n.getScope() != null){
//			System.out.println("MethodCallExpr_Scope "+n.getScope().toString());
			index2 = parseTree.addNode(index,"VariableName");
			n.getScope().accept(this,Integer.valueOf(index2));
		}

		index2 = parseTree.addNode(index,"MethodName");

//----------------------------------------------------------------------------------------------
		//所调用函数的函数名
//		n.getNameExpr().accept(this,Integer.valueOf(index2));
		

		Expression exp = n.getScope();
		if (exp != null){
			String name = n.getScope().toStringWithoutComments();
			String method = n.getName().toString();
			String type = null;
			if (name != null){
				 if (classVariableType.containsKey(name)){
                        	        type = classVariableType.get(name);
                        	}
                        	else if (variableType.containsKey(name)){
                        	        type = variableType.get(name);
                	        }
			}

			String tmpFullName = "";	
			if (type != null){
				tmpFullName = type+"."+method;
//				parseTree.addNode(index2,type+"."+method);
			}
			else{
				if (extendsName != null){
					if (classFileRep.containsKey(extendsName)){
						tmpFullName = extendsName+"."+method;
//						parseTree.addNode(index2,extendsName+"."+method);
					}
					else{
						tmpFullName = className+"."+method;
//						parseTree.addNode(index2,className+"."+method);
					}
				}
				else{
					tmpFullName = className+"."+method;
//					parseTree.addNode(index2,className+"."+method);
				}
			}

//System.out.println(tmpFullName);
//System.out.println(Bmcl.functionNameToIndex.size());

			if (Bmcl.methodTopoSort.contains(tmpFullName)){
			    parseTree.addNode(index2,tmpFullName);
			}else{
        //@HHF
        List<String> list = split(method).get(0);
        if (list.size() == 1)
		    parseTree.addNode(index2,method);
        else {
            int index3 = parseTree.addNode(index2, "CombineName");
            for (String s:list)
                parseTree.addNode(index3, s);
        }
//			    parseTree.addNode(index2,method);
			}


//			    parseTree.addNode(index2,tmpFullName);

		}
//----------------------------------------------------------------------------------------------

		if (n.getTypeArgs() != null){
			for (Type t : n.getTypeArgs()){
//				System.out.println("MethodCallExpr_TypeArg "+t.toString());
				t.accept(this,Integer.valueOf(index));
			}
		}

		// 所调用函数的参数
		if (n.getArgs() != null){
			index2 = parseTree.addNode(index,"MethodParameters");
			for (Expression e : n.getArgs()){
//				System.out.println("MethodCallExpr_Expression " + e.toString());
				e.accept(this,Integer.valueOf(index2));
			}
		}
	}

	@Override
	public void visit(NameExpr n, Object father){
        //一切Name例如变量名、表达式出现的
//		System.out.println("NameExpr");
		
		int index = parseTree.addNode(((Integer)father).intValue(),"NameExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

        //@HHF
        List<String> full = dict.get(n.toString());
        if (full == null){
	    if (split(n.getName()).size() > 0)
            full = split(n.getName()).get(0);
	}

	if (full != null){
	        if (full.size() == 1)
	            parseTree.addNode(index,n.toString());
	        else {
	            int index2 = parseTree.addNode(index, "CombineName");
	            for (String s:full) {
	                parseTree.addNode(index2, s);
        	    }
	        }
	}
	}

	@Override
	public void visit(AssignExpr n, Object father){
        //无定义的 简单赋值语句
//		System.out.println("AssignExpr " + n.getTarget().toString() + " " + n.getTarget().getClass().toString());
//		System.out.println("AssignExpr_Value " + n.getValue().toString()+ " " + n.getValue().getClass().toString());
		int index = parseTree.addNode(((Integer)father).intValue(),"AssignExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		n.getTarget().accept(this,Integer.valueOf(index));
		int index2 = parseTree.addNode(index,"Operator");
		parseTree.addNode(index2,n.getOperator().toString());
		n.getValue().accept(this,Integer.valueOf(index));
	}

	public void visit(ArrayAccessExpr n, Object arg){
        //调用数组。如a[2]
		int index = parseTree.addNode(((Integer)arg).intValue(),"ArrayAccessExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Name");
		n.getName().accept(this,Integer.valueOf(index2));
		
		index2 = parseTree.addNode(index,"Index");
		n.getIndex().accept(this,Integer.valueOf(index2));
	}

	public void visit(ArrayCreationExpr n, Object arg){
        //数组定义处。如nwe int[23]
		int index = parseTree.addNode(((Integer)arg).intValue(),"ArrayCreationExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Type");
		n.getType().accept(this,Integer.valueOf(index2));

		if (!isNullOrEmpty(n.getDimensions())){
			index2 = parseTree.addNode(index,"Dimensions");
			for (Expression dim : n.getDimensions()){
				dim.accept(this,Integer.valueOf(index2));
			}
		} else {
			index2 = parseTree.addNode(index,"Initializer");
			n.getInitializer().accept(this,Integer.valueOf(index2));
		}
	}

	public void visit(ArrayInitializerExpr n, Object arg){
        //数组定义时候的初始化。{1,2}
		int index = parseTree.addNode(((Integer)arg).intValue(),"ArrayInitializerExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		if (n.getValues() != null){
			int index2 = parseTree.addNode(index,"Values");
			for (Expression expr : n.getValues()){
				expr.accept(this,Integer.valueOf(index2));
			}
		}
	}

	public void visit(CastExpr n, Object arg){
        //强制转换表达式(int)a
		int index = parseTree.addNode(((Integer)arg).intValue(),"CastExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Type");
		n.getType().accept(this,Integer.valueOf(index2));
		
		index2 = parseTree.addNode(index,"Expr");
		n.getExpr().accept(this,Integer.valueOf(index2));
	}

	public void visit(ClassExpr n, Object arg){
//类的表达式。A.class
		int index = parseTree.addNode(((Integer)arg).intValue(),"ClassExpr");
		
		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		n.getType().accept(this,Integer.valueOf(index));
	}

	public void visit(ConditionalExpr n, Object arg){
        //条件表达式 1>2?3:4
		int index = parseTree.addNode(((Integer)arg).intValue(),"ConditionalExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Condition");
		n.getCondition().accept(this,Integer.valueOf(index2));
		
		index2 = parseTree.addNode(index,"ThenExpr");
		n.getThenExpr().accept(this,Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"ElseExpr");
		n.getElseExpr().accept(this,Integer.valueOf(index2));
	}

	public void visit(EnclosedExpr n, Object arg){
        //(表达式)
		int index = parseTree.addNode(((Integer)arg).intValue(),"EnclosedExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		if (n.getInner() != null)
			n.getInner().accept(this,Integer.valueOf(index));
	}

	public void visit(FieldAccessExpr n, Object arg){
        //形如xx.xx的表达式。包含类，变量的方法，enum
//		System.out.println("FieldAccessExpr " + n.getScope().toString() + "  " + n.getScope().getClass().toString());
//		System.out.println("FieldAccessExpr_FieldExpr " + n.getFieldExpr().toString() + "  " + n.getFieldExpr().getClass().toString());

		int index = parseTree.addNode(((Integer)arg).intValue(),"FieldAccessExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}


		n.getScope().accept(this,Integer.valueOf(index));
		n.getFieldExpr().accept(this,Integer.valueOf(index));
	}

	public void visit(InstanceOfExpr n, Object arg){
        //xx instanceof xx xx
		int index = parseTree.addNode(((Integer)arg).intValue(),"InstanceOfExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Expr");
		n.getExpr().accept(this,Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"Type");
		n.getType().accept(this,Integer.valueOf(index2));
	}

	public void visit(StringLiteralExpr n, Object arg){
        //字符串
		int index = parseTree.addNode(((Integer)arg).intValue(),"StringLiteralExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

        //System.out.println(n.getValue());
		parseTree.addNode(index,n.getValue());
	}

	public void visit(IntegerLiteralExpr n, Object arg){
        //数字
		int index = parseTree.addNode(((Integer)arg).intValue(),"IntegerLiteralExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.toString());
	}

	public void visit(LongLiteralExpr n, Object arg){
        //L
		int index = parseTree.addNode(((Integer)arg).intValue(),"LongLiteralExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.toString());
	}

	public void visit(IntegerLiteralMinValueExpr n, Object arg){
        //
		int index = parseTree.addNode(((Integer)arg).intValue(),"IntegerLiteralMinValueExpr");


		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.toString());
	}

	public void visit(LongLiteralMinValueExpr n, Object arg){
        //
		int index = parseTree.addNode(((Integer)arg).intValue(),"LongLiteralMinValueExpr");
		parseTree.addNode(index,n.toString());
	}

	public void visit(CharLiteralExpr n, Object arg){
        //单字符
		int index = parseTree.addNode(((Integer)arg).intValue(),"CharLiteralExpr");
		
		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.toString());
	}

	public void visit(DoubleLiteralExpr n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"DoubleLiteralExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.toString());
	}

	public void visit(BooleanLiteralExpr n, Object arg){
        //
		int index = parseTree.addNode(((Integer)arg).intValue(),"BooleanLiteralExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		if (n.getValue())
			parseTree.addNode(index,"true");
		else 
			parseTree.addNode(index,"false");
	}

	public void visit(NullLiteralExpr n, Object arg){
        //null
		int index = parseTree.addNode(((Integer)arg).intValue(),"NullLiteralExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.toString());
	}

	public void visit(ObjectCreationExpr n, Object arg){
        //new 一个类
		int index = parseTree.addNode(((Integer)arg).intValue(),"ObjectCreationExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 ;

		if (n.getScope() != null) {
			index2 = parseTree.addNode(index,"Scope");
			n.getScope().accept(this, Integer.valueOf(index2));
		}
		if (n.getTypeArgs() != null) {
			index2 = parseTree.addNode(index,"TypeArgs");
			for (final Type t : n.getTypeArgs()) {
				t.accept(this, Integer.valueOf(index2));
			}
		}
		
		index2 = parseTree.addNode(index,"Type");
		n.getType().accept(this, Integer.valueOf(index2));

		if (n.getArgs() != null) {
			index2 = parseTree.addNode(index,"Args");
			for (final Expression e : n.getArgs()) {
				e.accept(this, Integer.valueOf(index2));
			}
		}
		if (n.getAnonymousClassBody() != null) {
			index2 = parseTree.addNode(index,"AnonymousClassBody");
			for (final BodyDeclaration member : n.getAnonymousClassBody()) {
				member.accept(this, Integer.valueOf(index2));
			}
		}

	}

	public void visit(QualifiedNameExpr n, Object arg){
        //包的xx.xx
		int index = parseTree.addNode(((Integer)arg).intValue(),"QualifiedNameExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		n.getQualifier().accept(this,Integer.valueOf(index));
	}

	public void visit(ThisExpr n, Object arg){
        //this
		int index = parseTree.addNode(((Integer)arg).intValue(),"ThisExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		if (n.getClassExpr() != null){
//System.out.println("ThisExpr " + n.getClassExpr().getClass().toString());
			n.getClassExpr().accept(this,Integer.valueOf(index));
		}
		else{
			parseTree.addNode(index,"this");
		}
	}

	public void visit(SuperExpr n, Object arg){
        //super
		int index = parseTree.addNode(((Integer)arg).intValue(),"SuperExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		if (n.getClassExpr() != null){
			n.getClassExpr().accept(this,Integer.valueOf(index));
		}
	}

	public void visit(UnaryExpr n, Object arg){
        //一元表达式如!a(d)
		int index = parseTree.addNode(((Integer)arg).intValue(),"UnaryExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Operator");
		parseTree.addNode(index2,n.getOperator().toString());
		n.getExpr().accept(this,Integer.valueOf(index));
	}

	public void visit(VariableDeclarationExpr n, Object arg){
        //变量定义的整个语句 除了分号
        int index = parseTree.addNode(((Integer)arg).intValue(),"VariableDeclarationExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		

		if (n.getAnnotations() != null){
			for (AnnotationExpr a : n.getAnnotations()){
//System.out.println("VariableDeclarationExpr_AnnotationExpr  " + a.toString());
				a.accept(this,Integer.valueOf(index));
			}
		}

//System.out.println("VariableDeclarationExpr_Type "+n.getType().getClass().toString());
		int index2 = parseTree.addNode(index,"Type");
		n.getType().accept(this,Integer.valueOf(index2));
		for (VariableDeclarator v : n.getVars()){
//System.out.println("VariableDeclarationExpr_VariableDeclarator  "+v.toString());
            //@HHF
            VariableDeclaratorId vid=v.getId();
            Expression ex= v.getInit();
            findFullName(n.getType(), vid, ex);
            if(vid!=null){
                //codes.add(vid.getName());
            }
            /*
            System.out.println(vid.getName());
            for(String s:dict.get(vid.getName()))
            System.out.print(s+"; ");System.out.println();
            */
			v.accept(this,Integer.valueOf(index));
		}

	}
	public void visit(MarkerAnnotationExpr n, Object arg){
        //@xxx
		int index = parseTree.addNode(((Integer)arg).intValue(),"MarkerAnnotationExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Name");
		n.getName().accept(this,Integer.valueOf(index2));
	}

	public void visit(SingleMemberAnnotationExpr n, Object arg){
        //@
		int index = parseTree.addNode(((Integer)arg).intValue(),"SingleMemberAnnotationExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Name");
		n.getName().accept(this,Integer.valueOf(index2));
		
		index2 = parseTree.addNode(index,"MemberValue");
		n.getMemberValue().accept(this,Integer.valueOf(index2));
	}

	public void visit(NormalAnnotationExpr n, Object arg){
        //@
		int index = parseTree.addNode(((Integer)arg).intValue(),"NormalAnnotationExpr");
		int index2 = parseTree.addNode(index,"Name");
		n.getName().accept(this,Integer.valueOf(index2));

		if (n.getPairs() != null){
			index2 = parseTree.addNode(index,"Pairs");
			for (MemberValuePair m : n.getPairs()){
				m.accept(this,Integer.valueOf(index2));
			}
		}
	}

	public void visit(MemberValuePair n, Object arg){
        //@中的东西
		int index = parseTree.addNode(((Integer)arg).intValue(),"MemberValuePair");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Name");
		parseTree.addNode(index2,n.getName());

		index2 = parseTree.addNode(index,"Value");
		n.getValue().accept(this,Integer.valueOf(index2));
	}

	//  Statement	
	public void visit(IfStmt n, Object father){
//		System.out.println("IfStmt "+n.toString());
//		System.out.println("IfStmt");
		//整个if语句
		int index = parseTree.addNode(((Integer)father).intValue(),"IfStmt");

		if (Bmcl.comment == 1){
//System.out.println("IfStmt\n"+n.getComment());
//		System.out.println("IfStmt "+n.toString());
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"IfToken");
		parseTree.addNode(index2,"if");
		int index3 = parseTree.addNode(index,"OpenParenToken");
		parseTree.addNode(index3,"(");
		index3 = parseTree.addNode(index,"Condition");
		n.getCondition().accept(this,Integer.valueOf(index3));
		index3 = parseTree.addNode(index,"CloseParenToken");
		parseTree.addNode(index3,")");

//		System.out.println("Condition "+n.getCondition().getClass());		

		index3 = parseTree.addNode(index,"ThenStmt");
		//parseTree.addNode(index3,n.getThenStmt().toString());
//		System.out.println("ThenStmt "+n.getThenStmt().getClass());
		n.getThenStmt().accept(this,Integer.valueOf(index3));
	
		if (n.getElseStmt() != null)
		{
			index3 = parseTree.addNode(index,"ElseStmt");
		//	parseTree.addNode(index3,n.getElseStmt().toString());
//			System.out.println("ElseStmt "+n.getElseStmt().getClass());
			n.getElseStmt().accept(this,Integer.valueOf(index3));
//			getClassOfStmt(n.getElseStmt());
//			visit((BlockStmt)n.getElseStmt(),null);
		}
		//super.visit(n,father);
//		System.out.println("IfStmt end");
	}

	@Override
	public void visit(BlockStmt n, Object father){
//		System.out.println("BlockStmt");
        //不包括switch里的block，for里的有
		if (count != 0){


		int index = parseTree.addNode(((Integer)father).intValue(),"BlockStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"BlockBeginToken");
		parseTree.addNode(index2,"{");
		if (n.getStmts() != null){
			for (Statement s : n.getStmts()){
//				System.out.println("BlockStatements "+s.getClass().toString());
		//		parseTree.addNode(index,s.toString());
				s.accept(this,Integer.valueOf(index));
			}
		}
		index2 = parseTree.addNode(index,"BlockEndToken");
		parseTree.addNode(index2,"}");
		}
		else{
			if (n.getStmts() != null){
	                        for (Statement s : n.getStmts()){
                        	        s.accept(this,father);
        	                }
                	}
		}

		count = 1;
	}

	public void visit(ExplicitConstructorInvocationStmt n, Object arg){
        //上级的构造函数
		int index = parseTree.addNode(((Integer)arg).intValue(),"ExplicitConstructorInvocationStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2;

		if (!n.isThis()){
			if (n.getExpr() != null){
				index2 = parseTree.addNode(index,"Expr");
				n.getExpr().accept(this,Integer.valueOf(index2));
			}
		}

		if (n.getTypeArgs() != null){
			index2 = parseTree.addNode(index,"TypeArgs");
			for (Type t : n.getTypeArgs()){
				t.accept(this,Integer.valueOf(index2));
			}
		}
	
		if (n.getArgs() != null){
			index2 = parseTree.addNode(index,"Args");
			for (Expression e: n.getArgs()){
				e.accept(this,Integer.valueOf(index2));
			}
		}
	}

	public void visit(TypeDeclarationStmt n, Object arg){
        //定义的类中类
		int index = parseTree.addNode(((Integer)arg).intValue(),"TypeDeclarationStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		n.getTypeDeclaration().accept(this,Integer.valueOf(index));
	}

	public void visit(AssertStmt n, Object arg){
        //assert(condi)
		int index = parseTree.addNode(((Integer)arg).intValue(),"AssertStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Check");
		n.getCheck().accept(this,Integer.valueOf(index2));
	
		if (n.getMessage() != null){
			index2 = parseTree.addNode(index,"Message");
			n.getMessage().accept(this,Integer.valueOf(index2));
		}
	}

	public void visit(LabeledStmt n, Object arg){
        //Label处开始那个东西
		int index = parseTree.addNode(((Integer)arg).intValue(),"LabeledStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Label");
		parseTree.addNode(index2,n.getLabel());

		index2 = parseTree.addNode(index,"Stmt");
		n.getStmt().accept(this,Integer.valueOf(index2));
	}

	public void visit(LineComment n, Object arg){

		if (Bmcl.comment == 1){
			int index = parseTree.addNode(((Integer)arg).intValue(),"LineComment");
//			System.out.println("LineComment " + n.toString());
			visitComment(n.getComment(),Integer.valueOf(index));
		}
	}

	public void visit(EmptyStmt n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"EmptyStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.toString());
	}

	public void visit(ExpressionStmt n, Object arg){
        //表达式，包括赋值
//		System.out.println("ExpressionStmt " + n.getExpression().getClass().toString());
		int index = parseTree.addNode(((Integer)arg).intValue(),"ExpressionStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		n.getExpression().accept(this,Integer.valueOf(index));
	}

	public void visit(SwitchStmt n, Object arg){
        //switch
		int index = parseTree.addNode(((Integer)arg).intValue(),"SwitchStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Selector");
		n.getSelector().accept(this,Integer.valueOf(index2));
	
		if (n.getEntries() != null){	
			index2 = parseTree.addNode(index,"Entries");
			for (SwitchEntryStmt e : n.getEntries()){
				e.accept(this,Integer.valueOf(index2));
			}
		}
	}

	public void visit(SwitchEntryStmt n, Object arg){
        //case/default
		int index = parseTree.addNode(((Integer)arg).intValue(),"SwitchEntryStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2;
		
		if (n.getLabel() != null){
			index2 = parseTree.addNode(index,"Label");
			n.getLabel().accept(this,Integer.valueOf(index2));
		}

		if (n.getStmts() != null){
			index2 = parseTree.addNode(index,"Stmts");
			for (Statement s : n.getStmts()){
				s.accept(this,Integer.valueOf(index2));
			}
		}
	}

	public void visit(BreakStmt n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"BreakStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.getId());
	}

	public void visit(ReturnStmt n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"ReturnStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"ReturnToken");
		parseTree.addNode(index2,"return");
		if (n.getExpr() != null){
//System.out.println("ReturnStmt " + n.getExpr().getClass().toString());
			n.getExpr().accept(this,Integer.valueOf(index));
		}
	}

	public void visit(WhileStmt n, Object arg){
//System.out.println("WhileStmt");
		int index = parseTree.addNode(((Integer)arg).intValue(),"WhileStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"WhileToken");
		parseTree.addNode(index2,"while");
		
		index2 = parseTree.addNode(index,"OpenParenToken");
		parseTree.addNode(index2,"(");

		index2 = parseTree.addNode(index,"Condition");
		n.getCondition().accept(this,Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"CloseParenToken");
		parseTree.addNode(index2,")");

		index2 = parseTree.addNode(index,"Body");
		n.getBody().accept(this,Integer.valueOf(index2));
//System.out.println("WhileStmt end");
	}

	public void visit(ContinueStmt n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"ContinueStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		parseTree.addNode(index,n.getId());
	}

	public void visit(DoStmt n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"DoStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Body");
		n.getBody().accept(this,Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"Condition");
		n.getCondition().accept(this,Integer.valueOf(index2));
	}

	public void visit(ForeachStmt n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"ForeachStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Variable");
		n.getVariable().accept(this, Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"Iterable");
		n.getIterable().accept(this,Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"Body");
		n.getBody().accept(this,Integer.valueOf(index2));
	}

	public void visit(ForStmt n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"ForStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2;

		if (n.getInit() != null){
			index2 = parseTree.addNode(index,"Init");
			for (Expression e : n.getInit()){
				e.accept(this,Integer.valueOf(index2));
			}
		}

		if (n.getCompare() != null){
			index2 = parseTree.addNode(index,"Compare");
			n.getCompare().accept(this,Integer.valueOf(index2));
		}

		if (n.getUpdate() != null){
			index2 = parseTree.addNode(index,"Update");
			for (Expression e: n.getUpdate()){
				e.accept(this,Integer.valueOf(index2));
			}
		}

		index2 = parseTree.addNode(index,"Body");
		n.getBody().accept(this,Integer.valueOf(index2));
	}

	public void visit(ThrowStmt n, Object arg){
        //thorw xxx()
		int index = parseTree.addNode(((Integer)arg).intValue(),"ThrowStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		n.getExpr().accept(this,Integer.valueOf(index));
	}

	public void visit(SynchronizedStmt n, Object arg){
        //s() {}
		int index = parseTree.addNode(((Integer)arg).intValue(),"SynchronizedStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Expr");
		n.getExpr().accept(this,Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"Block");
		n.getBlock().accept(this,Integer.valueOf(index2));
	}

	public void visit(TryStmt n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"TryStmt");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2;
		
		if (n.getResources() != null){
			index2 = parseTree.addNode(index,"Resources");
			for (final VariableDeclarationExpr v : n.getResources()) {
				v.accept(this, Integer.valueOf(index2));
			}
		}

		index2 = parseTree.addNode(index,"TryBlock");
		n.getTryBlock().accept(this,Integer.valueOf(index2));

		if (n.getCatchs() != null){
			index2 = parseTree.addNode(index,"Catchs");
			for (CatchClause c : n.getCatchs()){
				c.accept(this,Integer.valueOf(index2));
			}
		}

		if (n.getFinallyBlock() != null){
			index2 = parseTree.addNode(index,"FinallyBlock");
			n.getFinallyBlock().accept(this,Integer.valueOf(index2));
		}
	}

	public void visit(CatchClause n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"CatchClause");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Except");
		n.getExcept().accept(this,Integer.valueOf(index2));

		index2 = parseTree.addNode(index,"CatchBlock");
		n.getCatchBlock().accept(this,Integer.valueOf(index2));
	}

    	public void visit(LambdaExpr n, Object arg){
		int index = parseTree.addNode(((Integer)arg).intValue(),"LambdaExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2;
	
		if (n.getParameters() != null){
			index2 = parseTree.addNode(index,"Parameters");
			for (Parameter a : n.getParameters()){
				a.accept(this,Integer.valueOf(index2));
			}
		}

		if (n.getBody() != null){
			index2 = parseTree.addNode(index,"Body");
			n.getBody().accept(this,Integer.valueOf(index2));
		}
        }

    public void visit(MethodReferenceExpr n, Object arg){
        //找不到
		int index = parseTree.addNode(((Integer)arg).intValue(),"MethodReferenceExpr");

		if (Bmcl.comment == 1){
			visitComment(n.getComment(),Integer.valueOf(index));
		}

		int index2 = parseTree.addNode(index,"Identifier");
		parseTree.addNode(index2,n.getIdentifier());

		if (n.getTypeParameters() != null){
			index2 = parseTree.addNode(index,"TypeParameters");
			for (TypeParameter a : n.getTypeParameters()){
				a.accept(this,Integer.valueOf(index2));
			}
		}

		if (n.getScope() != null){
			index2 = parseTree.addNode(index,"Scope");
			n.getScope().accept(this,Integer.valueOf(index2));
		}
	}

	public void visit(TypeExpr n, Object arg){
        //?
		int index = parseTree.addNode(((Integer)arg).intValue(),"TypeExpr");
		if (n.getType() != null){
			n.getType().accept(this,Integer.valueOf(index));
		}
	}

	private void visitComment(Comment n, Object arg){
//System.out.println("Comment ");
		if (n != null){
//			n.accept(this,arg);
//			System.out.println(((Integer)arg).intValue() + " " +n.toString());
//System.out.println(n.toString());
//System.out.println(n.getContent());			

			String commentContent = n.getContent();

			try{
				//System.out.println(n.toString());
				JavaParser.parseBlock('{'+commentContent+";}");
				//System.out.println(commentContent);
				usefulCommentCount++;

			int index = parseTree.addNode(((Integer)arg).intValue(),"Comment");

			String comment = n.toString().substring(2);
			//comment = comment.subString(2,comment.length());
//System.out.println(comment);
			StringTokenizer st = new StringTokenizer(comment, ", !?.;:\"\'()\\$%\n");
			while(st.hasMoreElements()){
		//		System.out.print(st.nextElement().toString().toLowerCase()+ " ");
				String treeNode = st.nextElement().toString().toLowerCase();
//				System.out.print(treeNode+ " ");
				if (!treeNode.equals(" "))
					parseTree.addNode(index, treeNode);
			}
			}catch (Throwable e){
				;
			}
			commentCount++;
		}
//		else{
//			if (Bmcl.comment == 1)
//			System.out.println(Bmcl.comment + "no comment" );
//		}
	}

	private void getClassOfStmt(Statement stmt){
		if (stmt instanceof AssertStmt){
			visit((AssertStmt) stmt,null);
		}
		else if (stmt instanceof BlockStmt){
			visit((BlockStmt) stmt,null);
		}
		else if (stmt instanceof BreakStmt){
			visit((BreakStmt) stmt,null);
		}
/*		else if (stmt instanceof CatchClause){
			visit((CatchClause) stmt,null);
		}
*/		else if (stmt instanceof ContinueStmt){
			visit((ContinueStmt) stmt,null);
		}
		else if (stmt instanceof DoStmt){
			visit((DoStmt) stmt,null);
		}
		else if (stmt instanceof EmptyStmt){
			visit((EmptyStmt) stmt,null);
		}
		else if (stmt instanceof ExplicitConstructorInvocationStmt){
			visit((ExplicitConstructorInvocationStmt) stmt,null);
		}
		else if (stmt instanceof ExpressionStmt){
			visit((ExpressionStmt) stmt,null);
		}
		else if (stmt instanceof ForeachStmt){
			visit((ForeachStmt) stmt,null);
		}
		else if (stmt instanceof ForStmt){
			visit((ForStmt) stmt,null);
		}
		else if (stmt instanceof IfStmt){
			visit((IfStmt) stmt,null);
		}
		else if (stmt instanceof LabeledStmt){
			visit((LabeledStmt) stmt,null);
		}
		else if (stmt instanceof ReturnStmt){
			visit((ReturnStmt) stmt, null);
		}
		else if (stmt instanceof SwitchEntryStmt){
			visit((SwitchEntryStmt) stmt,null);
		}
		else if (stmt instanceof SwitchStmt){
			visit((SwitchStmt) stmt,null);
		}
		else if (stmt instanceof SynchronizedStmt){
			visit((SynchronizedStmt) stmt,null);
		}
		else if (stmt instanceof ThrowStmt){
			visit((ThrowStmt) stmt,null);
		}
		else if (stmt instanceof TryStmt){
			visit((TryStmt) stmt,null);
		}
		else if (stmt instanceof TypeDeclarationStmt){
			visit((TypeDeclarationStmt) stmt,null);
		}
		else if (stmt instanceof WhileStmt){
			visit((WhileStmt) stmt,null);
		}
	}

    static final int LOWER = 0;
    static final int UPPER = 1;
    static final int UNDER = 2;
    static final int NUMBER = 3;
    static final int OTHER = 4;
    static final int SYMBOL = 5;

    HashMap<String, List<String>> dict = new HashMap<String, List<String>>();
    public void findFullName (Type typeName, VariableDeclaratorId vid, Expression ex) {
        List<String> fullVersion = new ArrayList<String>();
        String type = typeName.toStringWithoutComments();
        String id = vid.getName();
        String expression;
        if (ex != null) expression = ex.toString();
        else expression = "";
        List<String> words = splitPhrase(id);
        List<List<String>> typeWords = split(type);
        List<List<String>> exprWords;
        if (ex != null) exprWords = split(expression);
        else exprWords = null;
        for (String word:words) {
            String full = "";
            boolean ifFind = false;
            if (ex!=null) {
                for (List<String> phrase:exprWords) {
                    full = isAbbr(word, phrase);
                    if (full == null) continue;
                    else {
                        ifFind = true; break;
                    }
                }
            }
            if (!ifFind) {
                for (List<String> phrase:typeWords) {
                    full = isAbbr(word, phrase);
                    if (full == null) continue;
                    else {
                        ifFind = true; break;
                    }
                }
            }
            if (ifFind && !word.equals(full) && word.length() != 1) {
                if (full.contains(",")) {
                    String[] words_ = full.split(",");
                    for (String s:words_) {
                        if (s.length()>=1) fullVersion.add(s);
                    }
                } else fullVersion.add(full);
            }else fullVersion.add(word);
        }
        dict.put(id, fullVersion);
    }

    public static String isAbbr (String id, List<String> words) {
        for (String word:words) {
            if (word.indexOf(id) == 0) return word;
        }
        char[] charId = id.toCharArray();
        int i, j;

        String firstLetters = "";
        for (String word:words) firstLetters+=word.charAt(0);
        int position = firstLetters.indexOf(id);
        //System.out.println(firstLetters+" | "+id);
        if (position >= 0) {
            //System.out.println(firstLetters+" | "+id);
            String fullName = "";
            for (int k=0; k<id.length(); ++k, ++position)
                fullName+=words.get(position)+",";
            //for (String word:words) System.out.println(word);
            return fullName;
        }

        for (String word:words) {
            i = j = 0;
            char[] charWord = word.toCharArray();
            while (i<charId.length && j<charWord.length) {
                while (j<charWord.length && charWord[j]!=charId[i]) ++j;
                if (j==charWord.length) break;
                ++j;
                ++i;
            }
            if (i==charId.length) return word;
        }
        return null;
    }

    public static int getCase (char ch) {
        if (ch>='A' && ch<='Z') return UPPER;
        else if (ch>='a' && ch<='z') return LOWER;
        else if (ch>'0' && ch<='9') return NUMBER;
        else if (ch == '_') return UNDER;
        else return OTHER;
    }

    public static List<List<String>> split (String string) {
        char[] charId = string.toCharArray();
        List<String> phrases = new ArrayList<String>();
        List<List<String>> words = new ArrayList<List<String>>();
        int i=0, j;
        while (i<charId.length && getCase(charId[i])==OTHER) ++i;
        for (; i<charId.length; ++i) {
            for (j=i+1; j<charId.length && getCase(charId[j])!=OTHER; ++j);
            phrases.add(string.substring(i, j));
            i=j;
            while (i<charId.length && getCase(charId[i])==OTHER) ++i;
            --i;
        }
        for (String ph:phrases) words.add(splitPhrase(ph));
        return words;
    }

    static final int LOW = 1;
    static final int HIGH = 2;

    public static List<String> splitPhrase (String string) {
        char[] str = string.toCharArray();
        List<String> words = new ArrayList<String>();
        int i=0, j, k, case_;
        int startCase = getCase(str[0]), state;
        while (i<str.length && getCase(str[i])==UNDER) ++i;
        /*if (startCase == LOWER) state = LOW;
        else if (startCase == UPPER) state = HIGH;
        else state = LOW;*/
        for (; i<str.length; ++i) {
            if (getCase(str[i])==LOWER) state = LOW;
            else state = HIGH;
            for (j=i+1; j<=str.length; ++j) {
                if (j==str.length) {
                    words.add(string.substring(i,j).toLowerCase());
                    break;
                }
                case_ = getCase(str[j]);
                if (case_ == LOWER) {
                    state = LOW;
                    continue;
                } else if (case_ == NUMBER) {
                    boolean ifEnd = false;
                    k = j + 1;
                    while (k < str.length && getCase(str[k]) == NUMBER) ++k;
                    if (k == str.length) ifEnd = true;
                    if (ifEnd) {
                        words.add(string.substring(i,j).toLowerCase());
                        break;
                    }
                } else if (case_ == UPPER) {
                    if (state == LOW || (j+1<str.length && getCase(str[j+1]) == LOWER && j>=1 && getCase(str[j-1]) == LOWER)) {
                        //end.
                        //have problems.
                        //System.out.println("^^^^^^^^^^^"+str[j+1]);448
                        //System.out.println(string);
                        words.add(string.substring(i, j).toLowerCase());
                        //System.out.println(string.substring(i,j).toLowerCase());
                        break;
                    }
                    state = HIGH;
                } else if (case_ == SYMBOL) {
                    state = HIGH;
                    continue;
                } else { //UNDER
                    words.add(string.substring(i,j).toLowerCase());
                    break;
                }
            }
            i=j;
            while (i<str.length && getCase(str[i]) > UPPER) ++i;
            --i;
        }
        //System.out.print(string+" : ");for (String w:words)System.out.print(w+", ");System.out.println();
        return words;
    }
}

