package methodEmbedding.Speaking_in_Tongues.S.LYD1106;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Hashtable;


public class User {

	private static final String FILENAME = "A-small-attempt0.in";
	private static final String OUTFILENAME = "A-small-result.in";
	private static final String CODERING = "codering.txt";
	public static String newline = System.getProperty("line.separator");

	public static void main(String[] args) throws Exception {
		
		Hashtable<Character, Character> decoder = new Hashtable<Character, Character>();
		
		FileReader fr = null;
		try {
			fr = new FileReader(CODERING);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader input = new BufferedReader(fr);
		
		String cypherText;
		String plainText;
		while(input.ready()){
			cypherText = input.readLine();
			plainText = input.readLine();
			
			int place = 0;
			for (Character i: cypherText.toCharArray()){
				decoder.put(i, plainText.charAt(place));
				place++;
			}
		}
		
		input.close();
		fr.close();
		
	//	System.out.println(decoder.keySet());
	//	System.out.println(decoder.values());
		
		PrintWriter out = new PrintWriter(new FileWriter(OUTFILENAME));
	//	PrintStream out = System.out;
		

		fr = null;
		try {
			fr = new FileReader(FILENAME);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		input = new BufferedReader(fr);
		
		int T = Integer.parseInt(input.readLine());
		for (int i=0; i<T; i++){
			cypherText = input.readLine();
			
			out.print("Case #" + (i+1) + ": ");
			for (Character j : cypherText.toCharArray()){
				out.print(decoder.get(j));
				
			}
			out.print(newline);

		}
		out.close();
	}
}
