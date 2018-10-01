package adapt.codeMining.javaParser.callGraph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
public class CallGraphGenerator{
	public static int fileIndex=0; 
	public static Logger logger=Logger.getLogger(CallGraphGenerator.class.getName());
	public HashSet<String> getClassOrInterface(String filepath) throws ParseException, IOException{
        FileInputStream in = new FileInputStream(filepath);
	String importClass;
	String packageName;
	HashMap<String,String> classNameFull = new HashMap<String, String>();
	HashSet<String> result = new HashSet<String>();

        CompilationUnit cu;
        try {
            // parse the file
            cu = JavaParser.parse(in);

        } finally {
            in.close();
        }

	packageName = cu.getPackage().getName().toString();

        ClassOrInterfaceVisitor vis=new ClassOrInterfaceVisitor();
        vis.visit(cu, null);

        HashSet<String> types =  vis.getContainedTypes();
//System.out.println(packageName);
	if (cu.getImports() != null){
		importClass = "";
		for (ImportDeclaration im:cu.getImports()){
			importClass = im.getName().toString();
 			int pos1 = importClass.lastIndexOf('.');
			if (pos1 != -1){
				classNameFull.put(importClass.substring(pos1+1,importClass.length()),importClass);
			}
		}
	}
	else 
		importClass = null;
//	if (importClass != null)
//		System.out.println(classNameFull);

	for (String s:types){
		if (classNameFull.containsKey(s)){
			result.add(classNameFull.get(s));
		}
		else
			result.add(packageName+"."+s);
	}

//System.out.println(result);
	return result;
	}

	public static void plainTextClassOutput(String fileName, HashMap<String,Integer> mmap) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(new File(fileName));
		for (Entry<String, Integer> entry:mmap.entrySet()){
			String key = entry.getKey();
			int val = entry.getValue();
			pw.println(""+key+","+val);
		}
		pw.close();
	}

	public static void plainTextMapOutput(String fileName,HashMap<Integer,String> mmap) throws FileNotFoundException{
		PrintWriter pw=new PrintWriter(new File(fileName));
		for(Entry<Integer,String> entry:mmap.entrySet()){
			int key=entry.getKey();
			String val=entry.getValue();
			pw.println(""+key+","+val);
		}
		pw.close();
	}
	public static void plainTextOutput(String fileName,HashMap<Integer, HashSet<Integer> > callGraph) throws FileNotFoundException{
		PrintWriter pw=new PrintWriter(new File(fileName));
		for(Entry<Integer, HashSet<Integer> > entry:callGraph.entrySet()){
			int key=entry.getKey();
			HashSet<Integer> values=entry.getValue();
			StringBuilder sb=new StringBuilder();
			sb.append(""+key+",");
			for(Integer i:values){
				sb.append(""+i+" ");
			}
			String res=sb.substring(0, sb.length()-1);
			pw.println(res);
		}
		pw.close();
	}
	
	private static void initFileMap(String repoPath,HashMap<String, Integer> classFileMap,HashMap<Integer, String> callGraphMap) throws ParseException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(repoPath)));
		HashMap<String, String> classAndPathMap=new HashMap<String,String>();
//		HashSet<String> multipleClasses=new HashSet<String>();
		String classPath=null;
		String className=null;
		while((classPath=br.readLine())!=null){
			int pos1=classPath.lastIndexOf('/');
			int pos2=classPath.lastIndexOf('.');
//			className=classPath.substring(pos1+1,pos2);
//System.out.println(classPath);
			FileInputStream javaFile = new FileInputStream(classPath);
			CompilationUnit cu;
			try{
				cu = JavaParser.parse(javaFile);
			if (cu != null && cu.getPackage()!= null){	
			String packageNameOfClass = cu.getPackage().getName().toString();
//			System.out.println(packageNameOfClass+"sodf ");
//			int packagePos1 = packageNameOfClass.lastIndexOf(';');
//			int packagePos2 = packageNameOfClass.indexOf('e');
//			System.out.println(packageNameOfClass.substring(packagePos2+2,packagePos1));
			className = packageNameOfClass + "." +classPath.substring(pos1+1,pos2);
//			System.out.println(className);

			if(!classAndPathMap.containsKey(className)){
				classAndPathMap.put(className, classPath);
			}
/*			else{
				multipleClasses.add(className);
			}*/
			}
			}catch(Throwable e){
				;
			}
			 finally{
				javaFile.close();
			}
		}
//		System.out.println("TOTAL: "+classAndPathMap.size()+" DUPLICATE: "+multipleClasses.size());
		logger.info("TOTAL: "+classAndPathMap.size());//+" DUPLICATE: "+multipleClasses.size());
/*		for(String key:multipleClasses){
			classAndPathMap.remove(key);
		}
		logger.info("REMAIN FILE COUNT:"+classAndPathMap.size());*/
		logger.info("START INDEX:"+fileIndex);
		for(Entry<String,String> et:classAndPathMap.entrySet()){
			String cName=et.getKey();
			String cPath=et.getValue();
			classFileMap.put(cName, fileIndex);
			callGraphMap.put(fileIndex,cPath);
			fileIndex++;
		}
		logger.info("END INDEX:"+fileIndex);
		logger.info("classFileMap SIZE: "+classFileMap.size()+" callGraphMap SIZE: "+callGraphMap.size());
		br.close();
	}
	public static void main(String[] args) throws IOException, ParseException {
		//log configure
		PropertyConfigurator.configure("log4j2.properties");
		//
		//read params from properties file
		/*Properties props=new Properties();
		props.load(new FileInputStream("param.properties"));
		String nameString=props.getProperty("repoNames");
		
		String[] names=nameString.split(",");*/

		String[] names = args;
		String preFix="data/";
		String postFix="JavaFile.txt";
		String outputPostFix="CallGraph.txt";
		String mapOutputPostFix="CallGraphMap.txt";
		CallGraphGenerator gg=new CallGraphGenerator();
		
		fileIndex=0;
		for(String name:names){
			String repoPath=preFix+name+postFix;
			System.out.println("handle repo "+name);
			logger.info("handle repo "+name);
			HashMap<String, Integer> classFileMap=new HashMap<String, Integer>();
			
			HashMap<Integer,String> callGraphMap=new HashMap<Integer,String>();
			HashMap<Integer,HashSet<Integer> > callGraph=new HashMap<Integer,HashSet<Integer> >();
			//
			CallGraphGenerator.initFileMap(repoPath,classFileMap,callGraphMap);
			//logger.info("TOTAL CLASS COUNT:"+callGraphMap.size()+" "+"UNIQUE CLASS COUNT:"+classFileMap.size());
			
			Set<String> reserveClasses=classFileMap.keySet();
			int nodpCnt=0;
			for(String key:reserveClasses){
				Integer intKey=classFileMap.get(key);
				String filepath=callGraphMap.get(intKey);
				try {
					HashSet<String> res=gg.getClassOrInterface(filepath);
					res.retainAll(reserveClasses);
					if(res.size()>0){
						HashSet<Integer> intRes=new HashSet<Integer>();
						for(String s:res){
							Integer tmp=classFileMap.get(s);
							if(tmp.intValue()==intKey.intValue()){
								logger.info("SELF REFERENCE");
							}
							else{
								intRes.add(tmp);	
							}
						}
						callGraph.put(intKey, intRes);
						logger.info("DEPENDENCY COUNT:"+intRes.size()+" "+key);
					}
					else{
						HashSet<Integer> intRes=new HashSet<Integer>();
						callGraph.put(intKey,intRes);
						nodpCnt++;
						logger.info("NO DEPENDENCY: "+key);
					}
				} catch (Exception e) {
					System.out.println("ERROR: "+filepath+" "+e.getMessage()+" "+e.getClass().toString());
				}
			}
			//
			plainTextMapOutput("map/"+name+mapOutputPostFix,callGraphMap);
			plainTextOutput("map/"+name+outputPostFix,callGraph);
			plainTextClassOutput("map/"+name+"ClassMap.txt",classFileMap);
			System.out.println("finish handle repo "+name);
			logger.info("UNIQUE FILE COUNT:"+classFileMap.size()+" "+"NO DEPENDENCY COUNT:"+nodpCnt);
			logger.info("finish handle repo "+name);
		}//end for
		System.out.println("finished");
	}
}
