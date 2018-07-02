package methodEmbedding.Speaking_in_Tongues.S.LYD1359;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;

public class Tongues {
	static HashMap<Character, Character> map = new HashMap<Character, Character>();
	static {
		map.put('a', 'y');
		map.put('b', 'h');
		map.put('c', 'e');
		map.put('d', 's');
		map.put('e', 'o');
		map.put('f', 'c');
		map.put('g', 'v');
		map.put('h', 'x');
		map.put('i', 'd');
		map.put('j', 'u');
		map.put('k', 'i');
		map.put('l', 'g');
		map.put('m', 'l');
		map.put('n', 'b');
		map.put('o', 'k');
		map.put('p', 'r');
		map.put('q', 'z');
		map.put('r', 't');
		map.put('s', 'n');
		map.put('t', 'w');
		map.put('u', 'j');
		map.put('v', 'p');
		map.put('w', 'f');
		map.put('x', 'm');
		map.put('y', 'a');
		map.put('z', 'q');
	}
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A.in"));
		PrintStream out = new PrintStream(new File("A.out"));
		int tc = Integer.parseInt(in.readLine());
		
		for(int c=1; c<=tc; c++) {
			out.printf("Case #%d: ", c);
			char[] s = in.readLine().toCharArray();
			for(int i=0; i<s.length; i++) {
				if(map.containsKey(s[i]))
					out.print(map.get(s[i]));
				else
					out.print(s[i]);
			}
			out.println();
		}
	}
}
