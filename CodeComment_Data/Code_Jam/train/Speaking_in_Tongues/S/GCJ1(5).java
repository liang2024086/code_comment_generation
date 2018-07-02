package methodEmbedding.Speaking_in_Tongues.S.LYD1630;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class GCJ1 {
	
	char[][] data;
	ArrayList<String> data1 = new ArrayList<String>();
	ArrayList<String> data2 = new ArrayList<String>();
	
	ArrayList<Character> dataMissing = new ArrayList<Character>();
	HashMap<Character,Character> dictionary = new HashMap<Character,Character>();
	Long size;

	public static void main(String args[]) {
		GCJ1 g = new GCJ1();
		
		g.data1.add("ejp mysljylc kd kxveddknmc re jsicpdrysi");
		g.data1.add("rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd");
		g.data1.add("de kr kd eoya kw aej tysr re ujdr lkgc jv");
		
		g.data2.add("our language is impossible to understand");
		g.data2.add("there are twenty six factorial possibilities");
		g.data2.add("so it is okay if you want to just give up");
		
		g.dictionary.put('a', 'y');
		g.dictionary.put('o', 'e');
		g.dictionary.put('z', 'q');
		
		for (int i = 0; i<g.data1.size();i++){
			for (int p = 0; p < g.data1.get(i).length();p++){
				g.dictionary.put(g.data1.get(i).charAt(p), g.data2.get(i).charAt(p));
			}
		}
		
		try {
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream("C:/PROG/java/work/tc/src/gcj1.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File Line By Line
			g.size = Long.valueOf(br.readLine());
			
			int lineNum =1;
			
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				System.out.print("Case #"+lineNum+": ");
				
				for (Character c:strLine.toCharArray()){
				
					if (g.dictionary.get(c) != null){
						System.out.print(g.dictionary.get(c));
					}else {
						g.dataMissing.add(c);
						System.out.print("_");
					}
					
					
				}
				
				System.out.println();
				
//				System.out.println(strLine.charAt(0));
				lineNum++;
			}
			// Close the input stream
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		
//		System.out.println(g.size);
	}

}
