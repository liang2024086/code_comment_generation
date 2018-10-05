package methodEmbedding.Speaking_in_Tongues.S.LYD894;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;

public class Main {

	/**
	 * @author Candace Wong
	 */
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>(26);
		map.put("e", "o");
		map.put("j", "u");
		map.put("p", "r");
		map.put("m", "l");
		map.put("y", "a");
		map.put("s", "n");
		map.put("l", "g");
		map.put("c", "e");
		map.put("k", "i");
		map.put("d", "s");
		map.put("x", "m");
		map.put("v", "p");
		map.put("h", "x");
		map.put("w", "f");
		map.put("a", "y");
		map.put("i", "d");
		map.put("f", "c");
		map.put("g", "v");
		map.put("u", "j");
		map.put("b", "h");
		map.put("n", "b");
		map.put("o", "k");
		map.put("r", "t");
		map.put("t", "w");
		map.put("q", "z");
		map.put("z", "q");
		
		try {
			File file = new File("/Users/serengetisunset/Desktop/small.txt");
			File answer = new File("/Users/serengetisunset/Desktop/answer.txt");
			
			// Read input file
			Reader in = new FileReader(file);
		    BufferedReader reader = new BufferedReader(in);
		    String line = null;
		    
		    // Write out answer file
		    Writer out = new FileWriter(answer);
		    BufferedWriter writer = new BufferedWriter(out);
		    int caseNumber = 1;
		    reader.readLine();
		    while ((line = reader.readLine()) != null) {
		    	String translatedLine = "";
		    	for (int i = 0; i < line.length(); i++) {
		    		if (Character.toString(line.charAt(i)).equals(" ")) {
		    			translatedLine += " ";
		    			i++;
		    		}
		    		translatedLine += map.get(Character.toString(line.charAt(i)));
		    	}
		        writer.append("Case #" + caseNumber + ": " + translatedLine);
		        writer.newLine();
		        caseNumber++;
		    }
		    writer.close();
		} catch (IOException x) {
		    System.err.println(x);
		}
	}

}
