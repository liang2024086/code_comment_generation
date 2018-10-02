package methodEmbedding.Speaking_in_Tongues.S.LYD1416;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SpeakingInTongues {

	public static void main(String[] args) throws IOException {
//		ejp mysljylc kd kxveddknmc re jsicpdrysi
//		rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
//		de kr kd eoya kw aej tysr re ujdr lkgc jv
//		
//		our language is impossible to understand
//		there are twenty six factorial possibilities
//		so it is okay if you want to just give up
//		
//		Case #1: our language is impossible to understand
//		Case #2: there are twenty six factorial possibilities
//		Case #3: so it is okay if you want to just give up
		
		//Init dictionary with mapping taken from examples
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("a", "y");
		dictionary.put("b", "h");
		dictionary.put("c", "e");
		dictionary.put("d", "s");
		dictionary.put("e", "o");
		dictionary.put("f", "c");
		dictionary.put("g", "v");
		dictionary.put("h", "x");
		dictionary.put("i", "d");
		dictionary.put("j", "u");
		dictionary.put("k", "i");
		dictionary.put("l", "g");
		dictionary.put("m", "l");
		dictionary.put("n", "b");
		dictionary.put("o", "k");
		dictionary.put("p", "r");
		dictionary.put("q", "z");
		dictionary.put("r", "t");
		dictionary.put("s", "n");
		dictionary.put("t", "w");
		dictionary.put("u", "j");
		dictionary.put("v", "p");
		dictionary.put("w", "f");
		dictionary.put("x", "m");
		dictionary.put("y", "a");
		dictionary.put("z", "q");
		dictionary.put(" ", " ");
		
//		Collection<String> values = dictionary.values();
//		String[] arr = values.toArray(new String[] {});
//		Arrays.sort(arr);
//		System.out.println(Arrays.asList(arr));
		
		BufferedReader r = new BufferedReader(new FileReader("A-small-attempt0.in"));
		int n = Integer.parseInt(r.readLine());
	
		StringBuilder output = new StringBuilder();
		for(int i=0; i<n; i++) {
			String line = "Case #" + (i+1) + ": ";
			
			String googlerese = r.readLine();
			for(int j=0; j<googlerese.length(); j++) {
				line += dictionary.get(Character.toString(googlerese.charAt(j))); 
			}
			
			line += "\n";
			output.append(line);
		}
		
		r.close();
		
		FileWriter fw = new FileWriter("output_speaking.txt");
		fw.write(output.toString());
		fw.flush();
		fw.close();
	}
	
}

