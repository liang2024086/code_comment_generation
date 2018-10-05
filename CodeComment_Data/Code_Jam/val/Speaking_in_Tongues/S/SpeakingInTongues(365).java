package methodEmbedding.Speaking_in_Tongues.S.LYD323;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpeakingInTongues {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Character, Character> map = new HashMap<>(26);
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
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= T; i++) {
			String G = in.nextLine();
			StringBuilder S = new StringBuilder();
			for (int j = 0; j < G.length(); j++) {
				Character gChar = G.charAt(j);
				Character sChar = map.get(G.charAt(j));
				S.append(sChar == null ? gChar : sChar);
			}
			System.out.println("Case #" + i + ": " + S);
		}
	}
}
