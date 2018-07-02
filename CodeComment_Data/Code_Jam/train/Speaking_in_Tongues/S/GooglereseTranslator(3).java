package methodEmbedding.Speaking_in_Tongues.S.LYD1627;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GooglereseTranslator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File in = new File("D:/Feng/Workspace/googlecodejam2012/problemA/in/A-small-attempt0.in");
		
		
		Map<String, String> translator = new HashMap<String, String>();
		translator.put("y", "a");
		translator.put("n", "b");
		translator.put("f", "c");
		translator.put("i", "d");
		translator.put("c", "e");
		translator.put("w", "f");
		translator.put("l", "g");
		translator.put("b", "h");
		translator.put("k", "i");
		translator.put("u", "j");
		translator.put("o", "k");
		translator.put("m", "l");
		translator.put("x", "m");
		translator.put("s", "n");
		translator.put("e", "o");
		translator.put("v", "p");
		translator.put("z", "q");
		translator.put("p", "r");
		translator.put("d", "s");
		translator.put("r", "t");
		translator.put("j", "u");
		translator.put("g", "v");
		translator.put("t", "w");
		translator.put("h", "x");
		translator.put("a", "y");
		translator.put("q", "z");

		

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("D:/Feng/Workspace/googlecodejam2012/problemA/out/out.txt"));
			String line = "";
			StringBuilder plaintext;
			char[] lineChars;
			int count = 1;
			Scanner scanner = new Scanner(in);
			// Ignore the first line showing total count
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				plaintext = new StringBuilder("Case #");
				plaintext.append(count);
				plaintext.append(": ");
				
				line = scanner.nextLine();
				lineChars = line.toCharArray();
				for (char c : lineChars) {
					String key = String.valueOf(c);
					if (translator.containsKey(key)) {
						plaintext.append(translator.get(key));
					}
					else {
						plaintext.append(String.valueOf(c));
					}
				}
				
				
				//System.out.println(line);
				System.out.println(plaintext);
				out.write(plaintext.toString());
				out.newLine();
				
				count++;
			}
			scanner.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
