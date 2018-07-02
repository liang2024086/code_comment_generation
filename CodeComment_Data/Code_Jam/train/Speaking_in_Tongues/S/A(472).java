package methodEmbedding.Speaking_in_Tongues.S.LYD70;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws Exception {

		System.setOut(new PrintStream("zz"));

		Scanner s = new Scanner(System.in);
		Map<Character, Character> map = new HashMap<Character, Character>();
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

		map.put(' ', ' ');

		int T = s.nextInt();
		s.nextLine();
		for (int t = 1; t <= T; t++) {
			String line = s.nextLine();

			System.out.print("Case #" + t + ": ");

			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);

				if (!map.containsKey(c))
					throw new RuntimeException("" + c);
				System.out.print(map.get(c));
			}
			System.out.println();

		}

	}
}
