package methodEmbedding.Speaking_in_Tongues.S.LYD233;

import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws IOException {
               	//variable initialization
                String inFile = "a-practice.in";
		String inFileTranslated = inFile.split("\\.")[0] + "-translate.in";
		String realFile = args[0];
		String outFile = realFile.split("\\.")[0] + ".out";

                int T; //test case number

                //file reading...
                BufferedReader reader = new BufferedReader(new FileReader(inFile));
                BufferedReader readerTranslated = new BufferedReader(new FileReader(inFileTranslated));
                BufferedReader readerReal = new BufferedReader(new FileReader(realFile));
                PrintWriter writer = new PrintWriter(new FileWriter(outFile));

		//get input data
		T = Integer.valueOf(reader.readLine());
		String[] lines = new String[T];
		String[] translations = new String[T];

		Map<Character, Character> dict = new TreeMap();
		for (int i = 0; i < T; i++) {
			lines[i] = reader.readLine();
			translations[i] = readerTranslated.readLine();
			for (int j = 0; j < lines[i].length(); j++) {
				dict.put(lines[i].charAt(j), translations[i].charAt(j));
			}
			dict.remove(' ');
			dict.put('z', 'q');
			dict.put('q', 'z');
		}
		// System.out.println(dict);
		// System.out.println(dict.size());
		reader.close();
		readerTranslated.close();

		// // get two other cases
		// Set<Character> all = new HashSet();
		// char c = 'a';
		// while (c++ < 'z') {
		// 	all.add(c);
		// }
		// 
		// Set<Character> orig = new HashSet<Character>(all);
		// orig.removeAll(new HashSet(dict.values()));
		// Set<Character> trans = new HashSet<Character>(all);
		// trans.removeAll(dict.keySet());
		// System.out.println(orig);
		// System.out.println(trans);
		
		T = Integer.valueOf(readerReal.readLine());
		for (int i = 0; i < T; i++) {
			writer.write("Case #" + (i+1) + ": ");
			char[] line = readerReal.readLine().toCharArray();
			for (char c : line) {
				if (dict.containsKey(c)) {
					writer.write(dict.get(c));
				} else {
					writer.write(c);
				}
			}
			writer.write('\n');

		}
		writer.close();		
	}
}
