package methodEmbedding.Speaking_in_Tongues.S.LYD276;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class Language {

	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader(new FileReader(new File(
					"A-small-attempt1.in")));
			PrintWriter pw = new PrintWriter(new File("output.out"));
			
			HashMap<Character, Character> translate =  new HashMap<Character, Character>();
			translate.put('y', 'a');
			translate.put('n', 'b');
			translate.put('f', 'c');
			translate.put('i', 'd');
			translate.put('c', 'e');
			translate.put('w', 'f');
			translate.put('l', 'g');
			translate.put('b', 'h');
			translate.put('k', 'i');
			translate.put('u', 'j');
			translate.put('o', 'k');
			translate.put('m', 'l');
			translate.put('x', 'm');
			translate.put('s', 'n');
			translate.put('e', 'o');
			translate.put('v', 'p');
			translate.put('z', 'q');
			translate.put('p', 'r');
			translate.put('d', 's');
			translate.put('r', 't');
			translate.put('j', 'u');
			translate.put('g', 'v');
			translate.put('t', 'w');
			translate.put('h', 'x');
			translate.put('a', 'y');
			translate.put('q', 'z');
			translate.put(' ', ' ');
			
			int cases = Integer.parseInt(bf.readLine());

			for (int i = 0; i < cases; i++) {
				String nextCase = bf.readLine();
				char[] arrayCase = nextCase.toCharArray();
				
				for (int j = 0; j < arrayCase.length; j++) {
					
					arrayCase[j] = translate.get(arrayCase[j]);
				
				}
				
				String response = new String(arrayCase);
				pw.println("Case #" + (i+1) + ": " + response);
			}
			
			bf.close();
			pw.close();
		} catch (Exception e) {
			// Too bad.
		}
	}
	
	
	
}
