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

import org.dom4j.Element;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Main{

	public static String[] names = null; //{"cocos2d"};//zxing
	public static String repoName = null;

	private static int num = 0;

	public static void main(String args[]) throws IOException{

		/*Properties props = new Properties();
		props.load(new FileInputStream("param.properties"));
		String param1 = props.getProperty("repoNames");
		names = param1.split(",");
		*/
		names = args;
		
		Bmcl.vocabulary = new Vocabulary(Bmcl.dim);
		Bmcl.codeFW = new FileWriter("./output/parseTree.txt");
		Bmcl.codePW = new PrintWriter(Bmcl.codeFW);

System.out.println("Arg comment: " + Bmcl.comment);

		try{

			Bmcl.getMethodCallGraph();

		}catch (Exception e){
			e.printStackTrace();
		}

		try{
			FileWriter fw = new FileWriter("./output/comments.txt");
			PrintWriter pw = new PrintWriter(fw);

			for (int i = 0; i < names.length; ++i){
		System.out.println("handle " + names[i]);
				String repoFile = "./data/"+names[i]+"JavaFile.txt";
				ThroughOneRepo throughOneRepo = new ThroughOneRepo(repoFile,pw);
				num += throughOneRepo.extractComments();
		System.out.println("");
			}

			pw.close();
		}catch (Exception e){
			e.printStackTrace();
		}

		System.out.println("number of comments:" + num);

// generate functionIndexToName and functionNameToIndex
		Bmcl.indexFunction();
//		System.out.println("size: " + Bmcl.functionIndexToName.size());

		System.out.println("number of methods: " + Bmcl.functionIndexToName.size());

//--------------------------------Vocabulary------------------------------------------------------------

		
		for (Entry<String,GenParseTree> en : Bmcl.codeParseTrees.entrySet()){
		    if (en.getValue().getParseTree() != null)
			en.getValue().getParseTree().addWord();
		}

		Bmcl.vocabulary.codeWordFilter();

		System.out.println("begin to write vocabulary");
		HashMap<Integer, String> codeIndexToWord = Bmcl.vocabulary.getCodeIndexToWord();
		HashMap<Integer, Integer> codeWordNums = Bmcl.vocabulary.getCodeWordNums();
		FileWriter vocabFW = new FileWriter("./output/vocabularyMap.txt");
		PrintWriter vocabPW = new PrintWriter(vocabFW);

		for (Entry<Integer, String> en : codeIndexToWord.entrySet()){
//			    vocabPW.println(en.getKey() + "," + en.getValue()+ "," + codeWordNums.get(en.getKey()));
			    vocabPW.println(en.getKey() + "," + en.getValue()+ "," + codeWordNums.get(en.getKey()));
		}

		vocabPW.close();
		System.out.println("size of vocabulary: " + Bmcl.vocabulary.getCodeWordToIndex().size());

//---------------------------------inter node---------------------------------
		System.out.println("begin to write internode map");
		HashMap<Integer,String> interNodeToName = Bmcl.vocabulary.getInterNodeToName();
		FileWriter interFW = new FileWriter("./output/interMap.txt");
		PrintWriter interPW = new PrintWriter(interFW);

		for (Entry<Integer, String> en : interNodeToName.entrySet()){
		    interPW.println(en.getKey() + " , " + en.getValue());
		}
		interPW.close();

		System.out.println("size of inter node type: " + interNodeToName.size());

//--------------------------------Method Map------------------------------------------------------------
		System.out.println("begin to write method map");
		
		FileWriter parseFW = new FileWriter("./output/methodMap.txt");
		PrintWriter parsePW = new PrintWriter(parseFW);

		for (Entry<Integer,String> en : Bmcl.functionIndexToName.entrySet()){
			parsePW.println(en.getKey() + " , " + en.getValue());
		}
		
		parsePW.close();

//--------------------------------Parse Tree------------------------------------------------------------

		System.out.println("begin to write parse tree");
//		System.out.print("progress: ");
		int count = 0;
		int numOfMethod = 0;
		for (Entry<String,GenParseTree> en : Bmcl.codeParseTrees.entrySet()){
			
			if (Bmcl.functionNameToIndex.containsKey(en.getKey())){
				numOfMethod++;
			}

		}

		Bmcl.codePW.println(Bmcl.vocabulary.getCodeSize() + " " + numOfMethod);

		for (Entry<String,GenParseTree> en : Bmcl.codeParseTrees.entrySet()){
/*			count++;
			System.out.print(count);
			for (int j = 0; j < String.valueOf(count).length(); j++) {
                                    System.out.print("\b");
                                }
		*/
			if (Bmcl.functionNameToIndex.containsKey(en.getKey())){
				Bmcl.OwnMethodName = en.getKey();
				Bmcl.codePW.println("#"+Bmcl.functionNameToIndex.get(en.getKey()));
//			if (!Bmcl.functionNameToIndex.containsKey(en.getKey())){
//System.out.println(en.getKey());
//			}
			    if (en.getValue().getParseTree() != null)
				en.getValue().getParseTree().DFS();
			}
		}
//		System.out.println("");
			Bmcl.codePW.close();

//-------------------------------Method Comment Map-----------------------------------------------------

		System.out.println("begin to write method comment map");
		
		FileWriter mcFW = new FileWriter("./output/methodCommentMap.txt");
		PrintWriter mcPW = new PrintWriter(mcFW);

		for (Entry<String,String> en : Bmcl.methodCommentMap.entrySet()){
			if (Bmcl.functionNameToIndex.containsKey(en.getKey())){
				if (Bmcl.codeParseTrees.get(en.getKey()).getParseTree() != null && Bmcl.codeParseTrees.get(en.getKey()).getParseTree().length() > 1)
					mcPW.println( Bmcl.functionNameToIndex.get(en.getKey()) + " , " + en.getValue());
			}
		}
		
		mcPW.close();

//--------------------------------------End-------------------------------------------------------------

		System.out.println(" true " + Bmcl.abc1);
		System.out.println(" false " + Bmcl.abc2);
		System.out.println(" equal " + Bmcl.abc3);

		getMethodsBody();
	}

	static void getMethodsBody(){
	    try{
	    FileWriter mbFW = new FileWriter("./output/methodBodyMap.txt");
	    PrintWriter mbPW = new PrintWriter(mbFW);

	    for (Entry<String,String> en : Bmcl.methodBodyMap.entrySet()){
		String body = en.getValue().replace("{"," ").replace("\n"," ").replace("\""," ").replace("}"," ").replace("("," ").replace(")"," ").replace(";"," ").replace("."," ").replace(","," ").replace("\'"," ").replace("\\"," ").replace("|"," ").replace("!"," ").replace("&"," ").replace("\t"," ").replace("["," ").replace("]"," ").replace("<"," ").replace("="," ").replace(">"," ").replace(":"," ").replace("?", " ").replace("/"," ").replace("%"," ").replace("+"," ").replace("_"," ").replace("-"," ").replace("*"," ").replace("#"," ").replace("@"," ").replace("^"," ");
		String [] bodyVocabulary = body.split(" ");

//		System.out.println(Bmcl.functionNameToIndex.get(en.getKey())+"====================");	
		String oneBodyWords = "";

		List<String> oneBodyVocabulary = new LinkedList<String>();
		for (String a : bodyVocabulary){
		    if (!a.equals("")){
			if (MyVisit.split(a).size() > 0){
			    List<String> splitWords = MyVisit.split(a).get(0);
//			    System.out.println(splitWords.toString());
			    for (String b : splitWords){
				oneBodyVocabulary.add(b);
				oneBodyWords += " " + b;
			    }
			}
		    }
		}
//		System.out.println(oneBodyVocabulary.toString());
//		System.out.println(oneBodyWords);
//		if (!oneBodyWords.equals("")){
		    if (Bmcl.functionNameToIndex.containsKey(en.getKey())){
			mbPW.println(Bmcl.functionNameToIndex.get(en.getKey())+" ,"+oneBodyWords);
		    }
//		}
	    }
	    System.out.println(Bmcl.methodBodyMap.size());

	    mbPW.close();
	    }catch(Exception e){
		e.printStackTrace();
	    }

	}

}
