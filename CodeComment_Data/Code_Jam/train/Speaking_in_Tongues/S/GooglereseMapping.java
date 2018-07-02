package methodEmbedding.Speaking_in_Tongues.S.LYD159;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class GooglereseMapping {

	private static HashMap<Character, Character> language = new HashMap<Character, Character>();
	
	private static String filename = "A-small-attempt0.in";
	
	static {
		language.put('a', 'y');
		language.put('b', 'h');
		language.put('c', 'e');
		language.put('d', 's');
		language.put('e', 'o');
		language.put('f', 'c');
		language.put('g', 'v');
		language.put('h', 'x');
		language.put('i', 'd');
		language.put('j', 'u');
		language.put('k', 'i');
		language.put('l', 'g');
		language.put('m', 'l');
		language.put('n', 'b');
		language.put('o', 'k');
		language.put('p', 'r');
		language.put('q', 'z');
		language.put('r', 't');
		language.put('s', 'n');
		language.put('t', 'w');
		language.put('u', 'j');
		language.put('v', 'p');
		language.put('w', 'f');
		language.put('x', 'm');
		language.put('y', 'a');
		language.put('z', 'q');
		language.put(' ', ' ');
	}
	
	public static void main(String[] args) {;
		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));
			BufferedWriter out = new BufferedWriter(new FileWriter(filename + ".out"));
			
			String currentString = in.readLine();
			char[] chars;
			String newString = "";
			int testCases = Integer.parseInt(currentString);
			
			for (int i = 1; i <= testCases; i++) {
				currentString = in.readLine();
				chars = currentString.toCharArray();
				
				for (Character c : chars) {
					newString = newString + language.get(c);
				}
				out.write("Case #" + i + ": " + newString + '\n');
				newString = "";
			}
			
			out.close();
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
