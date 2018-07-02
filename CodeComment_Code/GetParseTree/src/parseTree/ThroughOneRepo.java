package parseTree;

import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.List;
import java.util.Properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

import com.github.javaparser.TokenMgrError;
import com.github.javaparser.ast.body.VariableDeclaratorId;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ParseException;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.ImportDeclaration;


import org.dom4j.Element;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class ThroughOneRepo{

	private String repoFilePath;
	private PrintWriter pw;
	private PrintWriter commentMapPw;
	private int numOfComment = 0;
	private HashMap<String,Integer> classNameIndex = new HashMap<String,Integer>();
	private HashMap<String,MyFileRepresenter> classFileRep = new HashMap<String,MyFileRepresenter>();

	public ThroughOneRepo(String repoFilePath, PrintWriter pw){
		this.repoFilePath = repoFilePath;
		this.pw = pw;
	}

	public int extractComments(){

		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(repoFilePath)));
		String filePath = null;

		try{
			
//			System.out.print("Progress:");
			int count = 0;
			while((filePath = br.readLine()) != null){

				String ownPackage = "";
				String className = null;
				LinkedList<String> ownImport = new LinkedList<String>();
				HashMap<String,String> variableType = new HashMap<String,String>();

/*				count++;
			        System.out.print(count);
*/		          

				CompilationUnit cu;
				FileInputStream in = new FileInputStream(filePath);
				try{
					cu = JavaParser.parse(in);

					if (cu.getPackage() != null)
						ownPackage = cu.getPackage().getName().toString();
					if (cu.getImports() != null){
                       				for (ImportDeclaration n : cu.getImports()){
	               		         	        ownImport.add(n.getName().toString());
        		                	}
			                }


					if (cu.getTypes() != null){
						for (TypeDeclaration t : cu.getTypes()){
							if (t instanceof ClassOrInterfaceDeclaration){
								parse((ClassOrInterfaceDeclaration)t,className,ownPackage,ownImport,variableType);
							}
						}
					}

					if (className == null){
			                        int pos1 = filePath.lastIndexOf('/');
			                        int pos2 = filePath.lastIndexOf('.');
               				         className = ownPackage+"."+filePath.substring(pos1+1,pos2);
		               	 	}

					classFileRep.put(className,null);

				}catch (ParseException e){
					;
				}catch (NullPointerException e){
					e.printStackTrace();
				}catch (RuntimeException e){
					;
				}catch (TokenMgrError e){
					;
				}
				finally{
					in.close();
				}



/*			        for (int j = 0; j < String.valueOf(count).length(); j++) {
			            System.out.print("\b");
			        }
*/
			}

		}catch (IOException e){
			e.printStackTrace();
		}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}

		return numOfComment;
	}

	private void parse(ClassOrInterfaceDeclaration t,String className, String ownPackage,LinkedList<String> ownImport,HashMap<String,String> variableType){

		String extendsName = null;

                if (className == null)
                        className = ownPackage+"."+t.getName().toString();
                List<ClassOrInterfaceType> exts = t.getExtends();
                List<ClassOrInterfaceType> imps = t.getImplements();
                if (exts != null){
                        for (ClassOrInterfaceType p : exts) {
                                extendsName = getClassName(p.getName().toString(),ownPackage,ownImport);
                        }
                }

	
		for (Node nd:t.getChildrenNodes()){

			if (nd instanceof FieldDeclaration){
                                        String fullName = null;
                                        FieldDeclaration fd = (FieldDeclaration) nd;

                                        Type ft = fd.getType();
                                        if (ft != null){
                                                fullName = getClassFullName(eliminateSymbol(ft.toStringWithoutComments()),ownImport,ownPackage);
                                        }
                                        List<VariableDeclarator> vds = fd.getVariables();
                                        if (vds != null){
                                                for (VariableDeclarator vd : vds) {
                                                        VariableDeclaratorId vid = vd.getId();
                                                        if (vid != null){
                                                                if (fullName != null)
                                                                        variableType.put(eliminateSymbol(vid.getName()),fullName);
                                                        }
                                                }
                            }
                        }
			else if (nd instanceof MethodDeclaration){
				MethodDeclaration md = (MethodDeclaration) nd;
				if (md.getComment() != null){
					String nowComment = md.getComment().getContent();
					StringTokenizer st = new StringTokenizer(nowComment,"*");
					String uesfulComment = "";
					while (st.hasMoreElements()){
					        String comment = st.nextElement().toString().toLowerCase();
					        if (comment.length() > 8 && !comment.substring(0,2).equals(" @"))
					                uesfulComment += comment;

					        if (comment.length() > 2 && comment.substring(0,2).equals(" @"))
					                break;
					}
					if (uesfulComment.length()!=0){

						uesfulComment = wordFilter(uesfulComment);
	
						String checkComment = uesfulComment.replace(" ","");
						if (checkComment.length() > 15){
							Bmcl.methodCommentMap.put(className+"."+md.getName(),uesfulComment);
							pw.println(uesfulComment);
							numOfComment++;
						}						
					}
				}
				genParseTree(md,className,ownPackage,ownImport,extendsName,variableType);
				if (md.getBody() != null)
				    Bmcl.methodBodyMap.put(className+"."+md.getName(),md.getBody().toString());

			}
		}
	}

	private String wordFilter(String rawComment){

		String comments = rawComment;
		while (comments.indexOf("<") != -1){
			int index1 = comments.indexOf("<");
			int index2 = comments.indexOf(">");
//System.out.println("LIANGYUDING : "+comments.substring(index1,index2+1));
			if (index2 > index1)
				comments = comments.replace(comments.substring(index1,index2+1)," ");
			else
				comments = comments.replace(comments.substring(index1,index1+1)," ");
		}

		String [] filter = {"(",")","\n","@","#","{","}",".","$","=","/",">","<",";",":",",","'","\"","!","+","?","\\","_","|","[","]","`","-"};

		for (int i = 0; i < filter.length; ++i){
			comments = comments.replace(filter[i]," ");
		}
		return comments;
	}

	private void genParseTree(MethodDeclaration md,String className,String ownPackage,LinkedList<String> ownImport,String extendsName,HashMap<String,String> variableType){
		//生成parse tree
		List<List<String>> list = SplitTool.split(md.getName().toString());
		String tags = "";
		if (list.size() > 0){
			for (String str : list.get(0)){
		        	Bmcl.vocabulary.addLanguage(str);
		        	tags += str + " ";
			}
		}
		if (md.getBody() != null){
		        try{
		/*              String tmptmp = className + "." + md.getName().toString();
		                if (tmptmp.equals("com.badlogic.gdx.utils.LongMap.putResize")){
	                        Bmcl.comment = 1;
				System.out.println(md.getComment().toString());
	                }
	                else Bmcl.comment = 0;
		*/
                		GenParseTree a = new GenParseTree(md.getBody(),Bmcl.dim,className,variableType,ownImport,ownPackage,classNameIndex,extendsName,classFileRep,className+"."+md.getName().toString());
	        	        Bmcl.codeParseTrees.put(className+"."+md.getName().toString(),a);
        	        	Bmcl.functionTags.put(className+"."+md.getName().toString(),tags);
				/*if (a.getVocabulary() != null)
	        	        for (Entry<String,Integer> en : a.getVocabulary().getCodeWordToIndex().entrySet()){
					try{
        	        	        	Bmcl.vocabulary.addCode(en.getKey());
					}catch (Throwable e){
						e.printStackTrace();
					}
		                }*/
//				System.out.println("LENGTH: "+Bmcl.vocabulary.getCodeSize());
		        }catch(Exception e){
        		        e.printStackTrace();
		        }
		}
	}

	 private String getClassName(String type, String ownPackage, LinkedList<String> ownImport){

                if (type == null)
                        return null;

                int pos = judgeClass(type,ownImport);
                if (pos != -1)
                        return ownImport.get(pos);
                else return ownPackage+"."+type;
        }

	private int judgeClass(String type, LinkedList<String> ownImport){
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

        private String getClassFullName(String type,LinkedList<String> ownImport, String ownPackage){
                int pos = judgeClass(type,ownImport);
                if (pos != -1)
                        return ownImport.get(pos)+"."+type;
                else {
                        String classString = ownPackage+"."+type;
                        if (classNameIndex.containsKey(classString))
                                return classString;
                        else return null;
                }
        }

}
