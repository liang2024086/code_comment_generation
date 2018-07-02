package methodEmbedding.Speaking_in_Tongues.S.LYD839;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("input.in"));
		HashMap<Character, Character> map = new HashMap<Character, Character>();
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

		int n = in.nextInt();
		String line = in.nextLine();
		for (int tc = 1; tc <= n; tc++) {
			line = in.nextLine();
			char[] array = line.toCharArray();
			for (int i = 0; i < array.length; i++) {
				if (array[i] != ' ')
					array[i] = map.get(array[i]);
			}
			line = new String(array);
			System.out.printf("Case #%d: %s\n", tc, line);

		}

	}

}
