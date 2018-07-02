package methodEmbedding.Speaking_in_Tongues.S.LYD1428;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodeJam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Map<Character, Character> mapping = new HashMap<Character, Character>();
			mapping.put('a', 'y');
			mapping.put('b', 'h');
			mapping.put('c', 'e');
			mapping.put('d', 's');
			mapping.put('e', 'o');
			mapping.put('f', 'c');
			mapping.put('g', 'v');
			mapping.put('h', 'x');
			mapping.put('i', 'd');
			mapping.put('j', 'u');
			mapping.put('k', 'i');
			mapping.put('l', 'g');
			mapping.put('m', 'l');
			mapping.put('n', 'b');
			mapping.put('o', 'k');
			mapping.put('p', 'r');
			mapping.put('q', 'z');
			mapping.put('r', 't');
			mapping.put('s', 'n');
			mapping.put('t', 'w');
			mapping.put('u', 'j');
			mapping.put('v', 'p');
			mapping.put('w', 'f');
			mapping.put('x', 'm');
			mapping.put('y', 'a');
			mapping.put('z', 'q');

			int testCaseCount = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < testCaseCount; i++) {
				String input = scanner.nextLine();
				StringBuilder result = new StringBuilder();
				for (int j = 0; j < input.length(); j++) {
					char c = input.charAt(j);
					if (mapping.containsKey(c)) {
						result.append(mapping.get(c));
					} else {
						result.append(c);
					}
				}
				System.out.println(String.format("Case #%d: %s", i + 1, result));
			}
		} finally {
			scanner.close();
		}
	}
}
