package methodEmbedding.Speaking_in_Tongues.S.LYD1495;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class A {
	private static Map<Character, Character> translation = new HashMap<Character, Character>();
	
	
	static {
		//translations from sample text of the problem description
		//z --> q the only possible remaining mapping
		translation.put('a', 'y');
		translation.put('b', 'h');
		translation.put('c', 'e');
		translation.put('d', 's');
		translation.put('e', 'o');
		translation.put('f', 'c');
		translation.put('g', 'v');
		translation.put('h', 'x');
		translation.put('i', 'd');
		translation.put('j', 'u');
		translation.put('k', 'i');
		translation.put('l', 'g');
		translation.put('m', 'l');
		translation.put('n', 'b');
		translation.put('o', 'k');
		translation.put('p', 'r');
		translation.put('q', 'z');
		translation.put('r', 't');
		translation.put('s', 'n');
		translation.put('t', 'w');
		translation.put('u', 'j');
		translation.put('v', 'p');
		translation.put('w', 'f');
		translation.put('x', 'm');
		translation.put('y', 'a');
		translation.put('z', 'q');
		translation.put(' ', ' ');
		
	}
	public static void main(String[] args) {
		try {
			// so eclipse can read file from system in
			System.setIn(new FileInputStream(new File("small.in")));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0 ; i < T; i++) {
			String g = scanner.nextLine();
			StringBuffer trans = new StringBuffer();
			for (int j = 0;  j < g.length(); j++) {
				trans.append(translation.get(g.charAt(j)));
			}
			System.out.printf("Case #%d: %s%n", i + 1, trans.toString());
			
		}

	}

}
