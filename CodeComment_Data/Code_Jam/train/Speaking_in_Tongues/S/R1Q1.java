package methodEmbedding.Speaking_in_Tongues.S.LYD373;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;


public class R1Q1 {
	public static HashMap<String, String> wordMap;
	static{
		wordMap= new HashMap<String, String>();
		wordMap.put("a", "y");
		wordMap.put("b", "h");
		wordMap.put("c", "e");
		wordMap.put("d", "s");
		wordMap.put("e", "o");
		wordMap.put("f", "c");
		wordMap.put("g", "v");
		wordMap.put("h", "x");
		wordMap.put("i", "d");
		wordMap.put("j", "u");
		wordMap.put("k", "i");
		wordMap.put("l", "g");
		wordMap.put("m", "l");
		wordMap.put("n", "b");
		wordMap.put("o", "k");
		wordMap.put("p", "r");
		wordMap.put("q", "z");
		wordMap.put("r", "t");
		wordMap.put("s", "n");
		wordMap.put("t", "w");
		wordMap.put("u", "j");
		wordMap.put("v", "p");
		wordMap.put("w", "f");
		wordMap.put("x", "m");
		wordMap.put("y", "a");
		wordMap.put("z", "q");
	}
	
	public static void main(String []args) throws NumberFormatException, IOException{
		BufferedReader bf = new BufferedReader(new FileReader(new File("input")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output")));
		int num = Integer.parseInt(bf.readLine());
		for (int i = 1 ; i<=num; i++){
			String ca = bf.readLine();
			Iterator<String> it = wordMap.keySet().iterator();
			while (it.hasNext()) {
				String string = (String) it.next();
//				char a = string.charAt(0);
//				System.out.println(a);
				ca = ca.replace(string.charAt(0), (char)(wordMap.get(string).charAt(0)-50));
			}
			it = wordMap.keySet().iterator();
			while (it.hasNext()) {
				String string = (String) it.next();
				ca = ca.replace((char)(string.charAt(0)-50),string.charAt(0));
			}
			bw.write("Case #"+i+": "+ca+"\n");
		}
		bf.close();
		bw.close();
	}
}
