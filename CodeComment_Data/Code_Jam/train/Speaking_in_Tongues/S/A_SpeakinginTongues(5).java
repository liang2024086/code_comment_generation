package methodEmbedding.Speaking_in_Tongues.S.LYD4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class A_SpeakinginTongues {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// BufferedReader buf = new BufferedReader(
		// new InputStreamReader(System.in));

		BufferedReader buf = new BufferedReader(new FileReader("file.in"));
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		PrintWriter writer = new PrintWriter(new File("file.out"));

		map.put(' ', ' ');
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
		int t = Integer.parseInt(buf.readLine());
		for (int i = 1; i <= t; i++) {
			char[] c = buf.readLine().toCharArray();
			String out = "";
			for (int j = 0; j < c.length; j++) {
				out += map.get(c[j]) + "";
			}
			writer.println("Case #" + i + ": " + out);
		}
		writer.close();

	}
}
