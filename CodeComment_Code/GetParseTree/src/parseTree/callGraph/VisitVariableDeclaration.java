package parseTree.callGraph;

import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

import parseTree.MyFileRepresenter;

import org.dom4j.Element;

import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;

public class VisitVariableDeclaration extends VoidVisitorAdapter<Object>{

	private HashMap<String,String> variableType = new HashMap<String,String>();
	private HashMap<String,String> classVariableType = new HashMap<String,String>();
	private LinkedList<String> ownImport = new LinkedList<String>();
	private String ownPackage;
	private HashMap<String,Integer> classNameIndex = new HashMap<String,Integer>();
	private LinkedList<String> codes = new LinkedList<String>();
	private HashMap<String,MyFileRepresenter> classFileRep = new HashMap<String,MyFileRepresenter>();
	private LinkedList<String> methodCallGraph = new LinkedList<String>();
	private Element oneMethod;
	private String className;
	private String extendsName;

	public VisitVariableDeclaration(String ownPackage, LinkedList<String> ownImport, HashMap<String, Integer> classNameIndex,HashMap<String,String> classVariableType,HashMap<String,MyFileRepresenter> classFileRep,Element oneMethod,String className,String extendsName) {
		this.ownPackage = ownPackage;
		this.ownImport = ownImport;
		this.classNameIndex = classNameIndex;
		this.classVariableType = classVariableType;
		this.classFileRep = classFileRep;
		this.oneMethod = oneMethod;
		this.className = className;
		this.extendsName = extendsName;
	}

	public Element getOneMethod(){
		return this.oneMethod;
	}

	public LinkedList<String> getMethodCallGraph(){
		return methodCallGraph;
	}
	
	public LinkedList<String> getCodes(){
		return codes;
	}
	public HashMap<String,String> getVariableType() {
		return variableType;
	}

	public void visit (MethodCallExpr n, Object arg){
		Expression exp = n.getScope();
		if(exp != null){
			codes.add(exp.toStringWithoutComments());
		String name = exp.toStringWithoutComments();
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
		else 
			System.out.println(n.getName());
		
		if (type != null){
			String methodFullName = type+"."+method;
			if (classFileRep.containsKey(type)){
//System.out.println(type+"  "+className);
				HashMap<String,LinkedList<String>> methodCodes = classFileRep.get(type).methodCodes;
//System.out.println("METHOD NAME: " + methodFullName);
				if (methodCodes.containsKey(methodFullName)){
					oneMethod.addElement("oneMethod").addText(methodFullName);
					methodCallGraph.add(methodFullName);
					for (int i = 0;i < methodCodes.get(methodFullName).size();++i)
					{
						codes.add(methodCodes.get(methodFullName).get(i));
//System.out.println(methodCodes.get(methodFullName).get(i));
					}
				}
			} 
		}
		}
		else{
//System.out.println("ASDFJIO  "+n.getName());
//			if (!methodCallGraph.contains(n.getName().toString()))
//			{	
//				System.out.println("SODIJFOSJD  "+n.getName().toString());
//System.out.println(methodCallGraph);
			if (extendsName != null){
				if (classFileRep.containsKey(extendsName)){
					HashMap<String,LinkedList<String>> methodCodes = classFileRep.get(extendsName).methodCodes;
					if(methodCodes.containsKey(extendsName+"."+n.getName().toString())){
						oneMethod.addElement("oneMethod").addText(extendsName+"."+n.getName().toString());
//						oneMethod.addElement("oneMethod").addText(className+"."+n.getName().toString());
						methodCallGraph.add(extendsName+"."+n.getName().toString());
					}
					else{
						oneMethod.addElement("oneMethod").addText(className+"."+n.getName().toString());
                                		methodCallGraph.add(className+"."+n.getName().toString());
					}
				}
				else{
					oneMethod.addElement("oneMethod").addText(className+"."+n.getName().toString());
                                	methodCallGraph.add(className+"."+n.getName().toString());
				}
			}
			else{
				oneMethod.addElement("oneMethod").addText(className+"."+n.getName().toString());
				methodCallGraph.add(className+"."+n.getName().toString());
			}
			
			
		}
		codes.add(n.getName());
//		System.out.println("method " + n.getName()+" " );
//		System.out.println(" variableName:" +eliminateSymbol(n.getScope().toString()));
	}

	public void visit(FieldAccessExpr n, Object arg){
		Expression exp = n.getScope();
		if (exp != null)
			codes.add(exp.toStringWithoutComments());
		codes.add(n.getField());
	}

	public void visit(VariableDeclarator n, Object arg) { 
		if (n.getParentNode() instanceof VariableDeclarationExpr){
		String nameType = (eliminateSymbol(((VariableDeclarationExpr)n.getParentNode()).getType().toString()));
		String fullName = getClassFullName(nameType);
		if (fullName != null){
			variableType.put(eliminateSymbol(n.getId().getName().toString()),fullName);
//			codes.add(nameType);
//			codes.add(eliminateSymbol(n.getId().getName().toString()));
		}
		codes.add(((VariableDeclarationExpr)n.getParentNode()).getType().toString());
		codes.add(n.getId().getName().toString());
		}
//		System.out.println("variable: " + n.getId().getName()+ "\n type: " + ((VariableDeclarationExpr)n.getParentNode()).getType());
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
	
	private String eliminateSymbol(String name){
		int pos = name.indexOf('[');
		if (pos == -1)
			return name;
		else return name.substring(0,pos);
	}
}
