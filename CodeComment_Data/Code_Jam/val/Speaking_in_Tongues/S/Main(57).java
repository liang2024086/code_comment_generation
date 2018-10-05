package methodEmbedding.Speaking_in_Tongues.S.LYD548;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Hashtable;


public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String[] files = {
				"Data/A-small-attempt0"
				};

		Hashtable<String, String> mapping = new Hashtable <String, String>() ;
		mapping.put("y", "a");
		mapping.put("n", "b");
		mapping.put("f", "c");
		mapping.put("i", "d");
		mapping.put("c", "e");
		mapping.put("w", "f");
		mapping.put("l", "g");
		mapping.put("b", "h");
		mapping.put("k", "i");
		mapping.put("u", "j");
		mapping.put("o", "k");
		mapping.put("m", "l");
		mapping.put("x", "m");
		mapping.put("s", "n");
		mapping.put("e", "o");
		mapping.put("v", "p");
		mapping.put("z", "q");
		mapping.put("p", "r");
		mapping.put("d", "s");
		mapping.put("r", "t");
		mapping.put("j", "u");
		mapping.put("g", "v");
		mapping.put("t", "w");
		mapping.put("h", "x");
		mapping.put("a", "y");
		mapping.put("q", "z");
		mapping.put(" ", " ");


		for (int f = 0; f < files.length; f++) {
			BufferedReader in = new BufferedReader(new FileReader(files[f] + ".in"));
			BufferedWriter out = new BufferedWriter(new FileWriter(files[f] + ".out"));

			int N = Integer.parseInt(in.readLine()); // number of test cases

			for (int i = 1; i <= N; i++) {
				String input = in.readLine(); // prices
				String output = "";
				for (int j = 0; j < input.length(); j++)
					output += mapping.get(input.substring(j, j+1));
				
				out.write(String.format("Case #%d: %s\n", i, output));
			}

			out.close();
			in.close();

		}
		
	}

}
