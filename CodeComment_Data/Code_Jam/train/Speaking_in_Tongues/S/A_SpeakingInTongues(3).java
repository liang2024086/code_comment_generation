package methodEmbedding.Speaking_in_Tongues.S.LYD428;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class A_SpeakingInTongues {
	
	//static String inputFile = "A_Sample.in";	
	static String inputFile = "A-small-attempt0.in";	

	public static void main(String[] args) {
		List<String> input = null;
		List<String> output = new ArrayList<String>();
		
		String outputFile = inputFile.split("\\.")[0]+".out";
				
		try {
			input = Files.readAllLines(Paths.get("Input\\"+inputFile), Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int cases = Integer.parseInt(input.get(0));
		
		HashMap<String,String> mapping = new HashMap<String,String>();
		mapping.put(" ", " ");
		mapping.put("y","a");
		mapping.put("n","b");
		mapping.put("f","c");
		mapping.put("i","d");
		mapping.put("c","e");
		mapping.put("w","f");
		mapping.put("l","g");
		mapping.put("b","h");
		mapping.put("k","i");
		mapping.put("u","j");
		mapping.put("o","k");
		mapping.put("m","l");
		mapping.put("x","m");
		mapping.put("s","n");
		mapping.put("e","o");
		mapping.put("v","p");
		mapping.put("z","q");
		mapping.put("p","r");
		mapping.put("d","s");
		mapping.put("r","t");
		mapping.put("j","u");
		mapping.put("g","v");
		mapping.put("t","w");
		mapping.put("h","x");
		mapping.put("a","y");
		mapping.put("q","z");

		for(int currentCase = 1;currentCase<cases+1;currentCase++) {
			String line = input.get(currentCase);
			String outputLine = "Case #" + currentCase + ": ";
			
			for(int i=0;i<line.length();i++) {
				outputLine+=mapping.get(""+line.charAt(i));
			}
			
			System.out.println(outputLine);			
			output.add(outputLine);	
		}
		
		try {
			Files.write(Paths.get("Output\\"+outputFile), output, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
