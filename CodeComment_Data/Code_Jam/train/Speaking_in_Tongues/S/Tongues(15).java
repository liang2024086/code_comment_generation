package methodEmbedding.Speaking_in_Tongues.S.LYD1044;

import java.io.*;
import java.util.*;

public class Tongues {

	private static HashMap<Character, String> map = new HashMap<Character, String>();
	
	public static void main(String[] args) throws IOException {
		map.put('y', "a");
		map.put('n', "b");
		map.put('f', "c");
		map.put('i', "d");
		map.put('c', "e");
		map.put('w', "f");
		map.put('l', "g");
		map.put('b', "h");
		map.put('k', "i");
		map.put('u', "j");
		map.put('o', "k");
		map.put('m', "l");
		map.put('x', "m");
		map.put('s', "n");
		map.put('e', "o");
		map.put('v', "p");
		map.put('z', "q");
		map.put('p', "r");
		map.put('d', "s");
		map.put('r', "t");
		map.put('j', "u");
		map.put('g', "v");
		map.put('t', "w");
		map.put('h', "x");
		map.put('a', "y");
		map.put('q', "z");
		
		BufferedReader br = new BufferedReader(new FileReader(new File("/Users/atai/Play/Codejam/input.txt")));
		PrintWriter prn = new PrintWriter(new FileWriter("output.txt"));
		
		int numTests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < numTests; i++) {
			String s = br.readLine().trim();
			String returned = new String();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ' ') {
					returned += " ";
					continue;
				}
				else {
					returned+= map.get(s.charAt(j));
				}
			}
			prn.printf("Case #%d: %s\n", i+1, returned);
		}
		
		prn.close();
	}
}
