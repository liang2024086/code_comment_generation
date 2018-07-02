package methodEmbedding.Speaking_in_Tongues.S.LYD239;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TonguesSolution {

	public static void main(String[] args) {
		Map<Character, Character> transliterator = new HashMap<Character, Character>();
		transliterator.put(' ', ' ');
		transliterator.put('a', 'y');
		transliterator.put('b', 'h');
		transliterator.put('c', 'e');
		transliterator.put('d', 's');
		transliterator.put('e', 'o');
		transliterator.put('f', 'c');
		transliterator.put('g', 'v');
		transliterator.put('h', 'x');
		transliterator.put('i', 'd');
		transliterator.put('j', 'u');
		transliterator.put('k', 'i');
		transliterator.put('l', 'g');
		transliterator.put('m', 'l');
		transliterator.put('n', 'b');
		transliterator.put('o', 'k');
		transliterator.put('p', 'r');
		transliterator.put('q', 'z');
		transliterator.put('r', 't');
		transliterator.put('s', 'n');
		transliterator.put('t', 'w');
		transliterator.put('u', 'j');
		transliterator.put('v', 'p');
		transliterator.put('w', 'f');
		transliterator.put('x', 'm');
		transliterator.put('y', 'a');
		transliterator.put('z', 'q');
		try {
			Scanner sc = new Scanner(new File("A-small-attempt0.in"));
			int lines = Integer.parseInt(sc.nextLine());
			for (int i = 1; i <= lines; i++) {
				String input = sc.nextLine().trim();
				System.out.print("Case #" + i + ": ");
				for (int j = 0; j < input.length(); j++) {
					System.out.print("" + transliterator.get(input.charAt(j)));
				}
				System.out.println();
			}
			sc.close();
		} catch (Exception ex) {
		}
	}

}
