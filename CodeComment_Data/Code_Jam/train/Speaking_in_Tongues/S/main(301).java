package methodEmbedding.Speaking_in_Tongues.S.LYD375;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Map<Character, Character> m = new HashMap<>(26);
		m.put('a', 'y');
		m.put('b', 'h');
		m.put('c', 'e');
		m.put('d', 's');
		m.put('e', 'o');
		m.put('f', 'c');
		m.put('g', 'v');
		m.put('h', 'x');
		m.put('i', 'd');
		m.put('j', 'u');
		m.put('k', 'i');
		m.put('l', 'g');
		m.put('m', 'l');
		m.put('n', 'b');
		m.put('o', 'k');
		m.put('p', 'r');
		m.put('q', 'z');
		m.put('r', 't');
		m.put('s', 'n');
		m.put('t', 'w');
		m.put('u', 'j');
		m.put('v', 'p');
		m.put('w', 'f');
		m.put('x', 'm');
		m.put('y', 'a');
		m.put('z', 'q');
		m.put(' ', ' ');
		
		try {
			System.setOut(new PrintStream(new File("A-small-attempt0.out")));
			
			Scanner sc = new Scanner(new File("A-small-attempt0.in"));
			
			int T = sc.nextInt();
			sc.nextLine();
			
			for (int t = 1; t<=T; t++) {
				String G = sc.nextLine(); 
				StringBuilder S = new StringBuilder(G.length());
				for (int i = 0; i < G.length(); i++) {
					S.append(m.get(G.charAt(i)));
				}
				
				System.out.format("Case #%d: %s%n", t, S.toString());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}

}
