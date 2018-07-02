package parseTree;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import parseTree.parseTree.*;

public class GenParseTree{

	private String filePath = null;
	private ParseTree parseTree = null;
	private Vocabulary vocabulary = null;
	private int dim ;
	private String className = null;

	public BlockStmt code;

	public GenParseTree(BlockStmt code,int dim, String className,HashMap<String,String> variableType, LinkedList<String> ownImport, String ownPackage, HashMap<String,Integer> classNameIndex, String extendsName, HashMap<String,MyFileRepresenter> classFileRep,String methodFullName) throws ParseException, IOException{
//		this.filePath = filePath;

/*		FileInputStream in = new FileInputStream(filePath);
		CompilationUnit cu;
		File file = new File(filePath);
*/
		this.dim = dim;
		this.className = className;
		this.code = code;

		BlockStmt bs;
		try{
	//		cu = JavaParser.parse(in);
		//	System.out.println(cu.getTypes());
		//	VisitFile visit = new VisitFile();
//		String aa = readToString(file);
//		aa = '{' + aa + '}';

			//bs = JavaParser.parseBlock('{' + code +'}');
//System.out.println(code);
//			bs = JavaParser.parseBlock(code);

			MyVisit visit = new MyVisit(dim,className,variableType,ownImport,ownPackage,classNameIndex,extendsName,classFileRep);
	//		visit.visit(bs,Integer.valueOf(0));
			visit.visit(code,Integer.valueOf(0));
//System.out.println("AAAA "+visit.getCommentNum()+" " + visit.getUsefulCommentCount());
			Bmcl.commentNum += visit.getCommentNum();
			Bmcl.usefulCommentNum += visit.getUsefulCommentCount();
			parseTree = visit.getParseTree();
//			Bmcl.codePW.println("#"+methodFullName);
//			parseTree.addWord();
//			vocabulary = parseTree.getVocabulary();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
//			in.close();
		}
		
	}

	public Vocabulary getVocabulary(){
		return this.vocabulary;
	}

	public ParseTree getParseTree(){
		return parseTree;
	}

	public static String readToString(File file) {
                Long filelength = file.length();     //获取文件长度
                byte[] filecontent = new byte[filelength.intValue()];
                try {
                    FileInputStream in = new FileInputStream(file);
                    in.read(filecontent);
                    in.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return new String(filecontent);//返回文件内容,默认编码
        }	
}
