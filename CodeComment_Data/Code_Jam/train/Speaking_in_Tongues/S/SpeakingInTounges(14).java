package methodEmbedding.Speaking_in_Tongues.S.LYD565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class SpeakingInTounges {

	public static void main(String[] args) throws NumberFormatException, IOException {
		HashMap<Character,Character> map = new HashMap<Character, Character>();
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
		
		String space = " ";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testCases; t++) {
			String in = br.readLine();
			StringBuilder sb = new StringBuilder();
			for (char c: in.toCharArray()) {
				if (c == ' ') {
					sb.append(space);
				} else {
					sb.append(map.get(c));
				}
			}
			System.out.println("Case #" + t + ": " + sb.toString());
		}
	}
}
