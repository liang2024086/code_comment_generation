package parseTree;

import parseTree.callGraph.*;

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

import org.dom4j.Element;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Bmcl{

	public static int abc1 = 0;
	public static int abc2 = 0;
	public static int abc3 = 0;
	public static String OwnMethodName ="";

	public static HashMap<String,String> methodCommentMap = new HashMap<String,String>();
	public static HashMap<String,String> methodBodyMap = new HashMap<String,String>();

	public static Vocabulary vocabulary = null;
//	public static PCFG pcfg = new PCFG();
	public static double[][][] contextMartix;
	//public static HashMap<String,HashMap<LinkedList<String>, MyDouble>> bias = new HashMap<String,HashMap<LinkedList<String>,MyDouble> >();
	//public static HashMap<String,HashMap<LinkedList<String>, MyDouble[]>> r = new HashMap<String,HashMap<LinkedList<String>,MyDouble[]>>();
	public static HashMap<String,GenParseTree> codeParseTrees = new HashMap<String, GenParseTree>();

	public static HashMap<String,LinkedList<String> > methodCallGraph = new HashMap<String,LinkedList<String> >();
	public static LinkedList<String> methodTopoSort = new LinkedList<String>();
	public static HashMap<String,String> functionTags = new HashMap<String,String>();
	public static HashMap<String,Integer> functionNameToIndex = new HashMap<String,Integer>();
	public static HashMap<Integer,String> functionIndexToName = new HashMap<Integer,String>();
	public static HashMap<String, String> pairs = new HashMap<String,String>();
	public static LinkedList<Integer> trainSort = new LinkedList<Integer>();

	public static HashMap<String,String> functionPath = new HashMap<String,String>();

	public static int dim = 0;
	public static int featureNum = 0;
	public static int iterNum = 0;
	public static int comment = 0;

	public static int commentNum = 0;
	public static int usefulCommentNum = 0;

	public static String[] names = null; //{"cocos2d"};//zxing
	public static String repoName = null;

	public static FileWriter codeFW;// = new FileWriter("parseTree.txt");
        public static PrintWriter codePW;// = new PrintWriter(codeFW);

	public static void main(String args[]) throws IOException{

		String repoPath = "./data/rmmJavaFile.txt";
		String filePath = null;
/*		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(repoPath)));
			while((filePath = br.readLine()) != null){
				System.out.println(filePath);
				GenParseTree a = new GenParseTree(filePath);
				a.getParseTree().BFS();				
			}
		} catch (Exception e){
			e.printStackTrace();
		}
*/

		Properties props = new Properties();
		props.load(new FileInputStream("param.properties"));
		String param1 = props.getProperty("repoNames");
		names = param1.split(",");
		for (String a : names)
			System.out.println(a);

		dim = Integer.valueOf(props.getProperty("dim")).intValue();
		featureNum = Integer.valueOf(props.getProperty("featureNum")).intValue();
		iterNum = Integer.valueOf(props.getProperty("iterNum")).intValue();
		comment = Integer.valueOf(props.getProperty("comment")).intValue();
		repoName = names[0];
System.out.println("PARAM " + dim + " " + featureNum + " " + iterNum + " " + comment+" " + repoName);
		vocabulary = new Vocabulary(dim);

		try{

			getMethodCallGraph();

		}catch (Exception e){
			e.printStackTrace();
		}

		List<List<String>> list = SplitTool.split("VeryGood");
		System.out.println(list.get(0));

		indexFunction();
System.out.println(methodTopoSort.size()+ " " + codeParseTrees.size() + " " + trainSort.size());
System.out.println("method num " + functionNameToIndex.size());
System.out.println("Comment " + commentNum + " " + usefulCommentNum);
//		HashMap<String,String> pairs = GenData.getPairs();

//		System.out.println(functionNameToIndex.get("com.badlogic.gdx.utils.LongMap.put"));

//		outputCallMap();
//		outputCallGraph();

//		genTestData();

		//Learn learn = new Learn(dim,vocabulary,pcfg,codeParseTrees,functionTags,trainSort,functionNameToIndex,functionIndexToName);

/*		for (Entry<Integer,String> aaaaa : functionIndexToName.entrySet()){
                        System.out.println(aaaaa.getKey().intValue() + " " + aaaaa.getValue());
                }
*/

/*		double [] a = new double[3];
		double [] b = new double[3];
		double [] c = new double[3];
		double d = 1.23;
		a[0] = 2; a[1] = 3; a[2] = 4;
		b[0] = 5; b[1] = 6; b[2] = 7;
		c[0] = 8; c[1] = 9; c[2] = 10;
		System.out.println(Train.calScore(a,b,c,d,3));
*/
	}

	public static void indexFunction(){

		int index = 1;
//		for (int i = methodTopoSort.size()-1; i >= 0; --i){
		for (int i = 0; i < methodTopoSort.size(); ++i){
			String name = methodTopoSort.get(i);
			if (codeParseTrees.containsKey(name)){
				functionNameToIndex.put(name,Integer.valueOf(index));
				functionIndexToName.put(Integer.valueOf(index),name);
				trainSort.add(Integer.valueOf(index));
				index++;
				String [] names = name.split("\\.");
				List<String> new_names = MyVisit.split(names[names.length-1]).get(0);
				for (int name_index = 0; name_index < new_names.size(); ++ name_index){
				    Bmcl.vocabulary.addCode(new_names.get(name_index));
				}
			}
		}

	}

	public static void getMethodCallGraph() throws FileNotFoundException, IOException{

		String preFix = "../GenClassCallGraph/map/";
		String postFix = "CallGraphMap.txt";
		String outputPostFix = "FunctionWords.txt";

		Properties props = new Properties();
		props.load(new FileInputStream("param.properties"));
		String param1 = props.getProperty("repoNames");
		names = param1.split(",");
		//XML
                Document doc = DocumentHelper.createDocument();
                Element methods = doc.addElement("methods");

                for (String name:names){

			HashMap<String,MyFileRepresenter> classFileRep = new HashMap<String,MyFileRepresenter>();

			CallGraph callGraph = new CallGraph();
                        callGraph.buildGraph(name);
                        List<Integer> topologySort = callGraph.getTopology();

			String repoPath = preFix + name +postFix;
                        System.out.println("handle repo "+name);
                        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(repoPath)));

        		HashMap<Integer,String> indexPath = new HashMap<Integer,String>();
                        String fileIndexAndPath = null;
			int index = 0;
                        while ((fileIndexAndPath = br.readLine()) != null){


                                try{
					String[] fileIndexPath = fileIndexAndPath.split(",");
                                        Integer tmp = Integer.valueOf(fileIndexPath[0]);
                                        indexPath.put(tmp,fileIndexPath[1]);

//                                        String[] fileIndexPath = fileIndexAndPath.split(",");
//                                        Integer tmp = Integer.valueOf(index);
//                                        indexPath.put(tmp,fileIndexAndPath);
//					index++;
                                } catch (Exception e){
                                        System.err.println("ERROR1: " + fileIndexAndPath +" " + e.getMessage());
                                }
                        }

                        br.close();


			 BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(preFix+name+"ClassMap.txt")));
                        HashMap<String,Integer> classNameIndex= new HashMap<String,Integer>();
                        String className;
                        while((className = br1.readLine()) != null){
                                try{
                                        String[] className_index = className.split(",");
                                        Integer tmp = Integer.valueOf(className_index[1]);
                                        classNameIndex.put(className_index[0],tmp);
                                } catch (Exception e){
                                        System.err.println("ERROR3: " + e.getMessage());
                                }

                        }
                        br1.close();


			String filePath = null;
int count = 0;
//			System.out.println("Progress: ");
			int thisCount = 0;
			int topologySize = topologySort.size();
			for (int i = 0; i < topologySort.size(); ++i){

/*				System.out.print(i+"/"+topologySize);
				for (int tj = 0; tj < String.valueOf(i+"/"+topologySize).length(); tj++)
					System.out.print("\b");
*/
                                filePath = indexPath.get(topologySort.get(i));

//				filePath = entry.getValue();
//System.out.println("file: " + filePath);
                                try{
                                        GenMethodCallGraph ext = new GenMethodCallGraph(filePath,classNameIndex,classFileRep,methods);
                                        methods = ext.getMethods();
                                        classFileRep.put(ext.getClassName(),new MyFileRepresenter(filePath,ext.getCodes(),ext.getComments(),ext.getMethodCodes(),ext.getMethodComments()));

//--------------------------------------------------------------------------------------------------

					HashMap<String,String> tmpPairs = ext.getPairs();
					for (Entry<String,String> pairEntry : tmpPairs.entrySet()){
						pairs.put(pairEntry.getKey(),pairEntry.getValue());
					}

//--------------------------------------------------------------------------------------------------



					HashMap<String,LinkedList<String>> tmpMethodCallGraph = ext.getMethodCallGraph();
					for (Entry<String,LinkedList<String>> entry : tmpMethodCallGraph.entrySet()){
						if (methodCallGraph.containsKey(entry.getKey())){
//count += entry.getValue().size();
							for (String str : entry.getValue()){
								if (!methodCallGraph.get(entry.getKey()).contains(str))
									methodCallGraph.get(entry.getKey()).add(str);
							}
						}
						else{
							methodCallGraph.put(entry.getKey(),entry.getValue());
//count += entry.getValue().size();
						}
						if (!functionPath.containsKey(entry.getKey())){
							functionPath.put(entry.getKey(),filePath);
						}
					}
                                } catch (Exception e){
					e.printStackTrace();
                                        System.err.println("ERROR2: " + filePath + " " + e.getMessage()+"  " + e.getClass().toString());
                                }

                        }

//			System.out.println("");

			outputXml(preFix+name+"MethodCallGraph.xml",doc);
//System.out.println("size：" + methodCallGraph.size()+ " " + count);
//count = 0;
//			for (Entry<String,LinkedList<String>> entry : methodCallGraph.entrySet()){
//	count += entry.getValue().size();	
//System.out.println(entry.getValue()+entry.getKey());			}
//System.out.println(count);

			methodTopoSort = GenMethodCallGraph.getTopology(methodCallGraph);
//System.out.println(methodTopoSort.toString());
		}

	}

	public static void outputXml(String outputPath,Document document) throws IOException {
                OutputFormat format = OutputFormat.createPrettyPrint();
                XMLWriter writer = new XMLWriter(new FileWriter(outputPath),format);
                writer.write(document);
                writer.close();
        }

	public static void outputCallMap() throws IOException{

		PrintWriter pw = new PrintWriter(new File("./topicModel/"+repoName+"CallGraphMap.txt"));
		for (Entry<Integer,String> entry : functionIndexToName.entrySet()){
			pw.println(entry.getKey().intValue()+","+entry.getValue());
		}
		pw.close();
	}

	public static void outputCallGraph() throws IOException{

		PrintWriter pw = new PrintWriter(new File("./topicModel/"+repoName+"CallGraph.txt"));

		for (Entry<Integer,String> entry : functionIndexToName.entrySet()){
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			pw.print(entry.getKey().intValue());
			
			int count = 0;
			for (String str : methodCallGraph.get(functionIndexToName.get(entry.getKey()))){
			if (str != null && functionNameToIndex.get(str) != null ){
				if (!tmp.contains(functionNameToIndex.get(str))){
					tmp.add(functionNameToIndex.get(str));
					if (count == 0){
						pw.print(","+functionNameToIndex.get(str).intValue());
						count = 1;
					}
					else
						pw.print(" " + functionNameToIndex.get(str).intValue());
				}
			}
		}
				pw.println("");

		}
		pw.close();
	}

	public static void genTestData() throws IOException{

		int evalSize = 100;
		File file = new File("data/"+repoName+"Eval.txt");
                BufferedReader reader = null;
                String [] evalIndexes = new String [evalSize];

                try{
                        reader = new BufferedReader(new FileReader(file));
                        String tmpEval = reader.readLine();
                        evalIndexes = tmpEval.split(",");
                } catch(IOException e){
                        e.printStackTrace();
                }

		Document document = DocumentHelper.createDocument();
		Element repos = document.addElement("repositories");
		Element repo = repos.addElement("repository").addAttribute("name",repoName);

		for (int i = 0; i < 100; ++i){
//			System.out.println(functionIndexToName.get(Integer.valueOf(evalIndexes[i])));

			String funcName = functionIndexToName.get(Integer.valueOf(evalIndexes[i]));
			StringTokenizer st = new StringTokenizer(functionTags.get(funcName)," ");

			Element repoFile = repo.addElement("file").addAttribute("path",funcName);
                        while(st.hasMoreElements()){
                             	String tmp = st.nextElement().toString().toLowerCase();
				repoFile.addElement("tag").addAttribute("name",tmp);
//				System.out.println(tmp);
                        }
		}
		
		outputXml("./testData/"+repoName+"test.xml",document);
	}

}
