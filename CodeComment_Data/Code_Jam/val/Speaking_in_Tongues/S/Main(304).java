package methodEmbedding.Speaking_in_Tongues.S.LYD944;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('y', 'a');
		map.put('n', 'b');
		map.put('f', 'c');
		map.put('i', 'd');
		map.put('c', 'e');
		map.put('w', 'f');
		map.put('l', 'g');
		map.put('b', 'h');
		map.put('k', 'i');
		map.put('u', 'j');
		map.put('o', 'k');
		map.put('m', 'l');
		map.put('x', 'm');
		map.put('s', 'n');
		map.put('e', 'o');
		map.put('v', 'p');
		map.put('z', 'q');
		map.put('p', 'r');
		map.put('d', 's');
		map.put('r', 't');
		map.put('j', 'u');
		map.put('g', 'v');
		map.put('t', 'w');
		map.put('h', 'x');
		map.put('a', 'y');
		map.put('q', 'z');

		File file = new File("C:\\eclipse\\eclipse\\A-small-attempt0.in");
	    BufferedReader br = new BufferedReader(new FileReader(file));
		String str = br.readLine();
		int tc = Integer.parseInt(str);
		for (int i = 0; i < tc; i++) {
			str = br.readLine();
			char[] string = str.toCharArray();
			int len = string.length;
			for (int j = 0; j < len; j++) {
				char ch = string[j];
				if (ch >= 'a' && ch <= 'z') {
					string[j] = map.get(ch);
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + String.copyValueOf(string));
		}
	}
}
