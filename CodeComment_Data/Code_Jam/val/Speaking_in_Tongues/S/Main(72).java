package methodEmbedding.Speaking_in_Tongues.S.LYD1413;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		Map<Character, Character> cripto = new HashMap<Character, Character>();
		cripto.put('y', 'a');
		cripto.put('n', 'b');
		cripto.put('f', 'c');
		cripto.put('i', 'd');
		cripto.put('c', 'e');
		cripto.put('w', 'f');
		cripto.put('l', 'g');
		cripto.put('b', 'h');
		cripto.put('k', 'i');
		cripto.put('u', 'j');
		cripto.put('o', 'k');
		cripto.put('m', 'l');
		cripto.put('x', 'm');
		cripto.put('s', 'n');
		cripto.put('e', 'o');
		cripto.put('v', 'p');
		cripto.put('z', 'q');
		cripto.put('p', 'r');
		cripto.put('d', 's');
		cripto.put('r', 't');
		cripto.put('j', 'u');
		cripto.put('g', 'v');
		cripto.put('t', 'w');
		cripto.put('h', 'x');
		cripto.put('a', 'y');
		cripto.put('q', 'z');
		cripto.put(' ', ' ');

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(reader.readLine());
		for (int i = 0; i < lines; i++) {
			System.out.print("Case #" + (i + 1) + ": ");
			for (char c : reader.readLine().toCharArray()) {
				System.out.print(cripto.get(c));
			}
			System.out.println();
		}
	}

}
