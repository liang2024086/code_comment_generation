package methodEmbedding.Speaking_in_Tongues.S.LYD731;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 *
 * @author Jeric Bryle Sy Dy
 */
public class GJamA {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Jeric Bryle Sy Dy/Downloads/A-small-attempt0.in"));
		PrintWriter out = new PrintWriter("C:/Users/Jeric Bryle Sy Dy/Desktop/gjam/a.out");

		HashMap<Character, Character> mappings = new HashMap<Character, Character>();
		mappings.put('a', 'y');
		mappings.put('b', 'n');
		mappings.put('c', 'f');
		mappings.put('d', 'i');
		mappings.put('e', 'c');
		mappings.put('f', 'w');
		mappings.put('g', 'l');
		mappings.put('h', 'b');
		mappings.put('i', 'k');
		mappings.put('j', 'u');
		mappings.put('k', 'o');
		mappings.put('l', 'm');
		mappings.put('m', 'x');
		mappings.put('n', 's');
		mappings.put('o', 'e');
		mappings.put('p', 'v');
		mappings.put('q', 'z');
		mappings.put('r', 'p');
		mappings.put('s', 'd');
		mappings.put('t', 'r');
		mappings.put('u', 'j');
		mappings.put('v', 'g');
		mappings.put('w', 't');
		mappings.put('x', 'h');
		mappings.put('y', 'a');
		mappings.put('z', 'q');

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; ++i) {
			String str = br.readLine();
			char[] arr = str.toCharArray();
			char[] res = str.toCharArray();
			
			for (Character c : mappings.keySet()) {
				char from = mappings.get(c);
				char to = c;
				
				for (int j=0; j<arr.length; ++j) {
					if (arr[j] == from) {
						res[j] = to;
					}
				}
			}

			out.println("Case #" + (i + 1) + ": " + new String(res));
		}

		br.close();
		out.close();
	}
}
