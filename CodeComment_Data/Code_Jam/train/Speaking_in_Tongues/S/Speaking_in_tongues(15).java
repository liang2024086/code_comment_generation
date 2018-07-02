package methodEmbedding.Speaking_in_Tongues.S.LYD1662;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Speaking_in_tongues {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("input.in"));
		// BufferedReader in = new BufferedReader(new
		// InputStreamReader(System.in));
		FileWriter fw = new FileWriter("output.txt");
		int t = Integer.parseInt(in.readLine());
		int num = 1;
		boolean[] vis = new boolean[26];
		while (t-- > 0) {
			HashMap<Character, Character> map = new HashMap<Character, Character>();
			map.put('e', 'o');
			map.put('j', 'u');
			map.put('p', 'r');
			map.put('m', 'l');
			map.put('y', 'a');
			map.put('s', 'n');
			map.put('l', 'g');
			map.put('c', 'e');
			map.put('k', 'i');
			map.put('d', 's');
			map.put('x', 'm');
			map.put('v', 'p');
			map.put('n', 'b');
			map.put('r', 't');
			map.put('i', 'd');
			map.put('b', 'h');
			map.put('t', 'w');
			map.put('a', 'y');
			map.put('h', 'x');
			map.put('w', 'f');
			map.put('f', 'c');
			map.put('o', 'k');
			map.put('u', 'j');
			map.put('g', 'v');
			map.put('q', 'z');
			map.put('z', 'q');
			map.put(' ', ' ');
			String s = in.readLine();
			char[] out = new char[s.length()];
			for (int i = 0; i < out.length; i++) {
				out[i] = map.get(s.charAt(i));
			}
			fw.write("Case #" + num++ + ": " + new String(out) + "\n");
		}
		fw.flush();
		fw.close();

	}

}
