package methodEmbedding.Speaking_in_Tongues.S.LYD582;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Map<Character, Character> m = new HashMap<Character, Character>();
		
		m.put(' ', ' ');
		m.put('a', 'y');
		m.put('b', 'h');
		m.put('c', 'e');
		m.put('d', 's');
		m.put('e', 'o');
		m.put('f', 'c');
		m.put('g', 'v'); //
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
		m.put('z', 'q'); //
		
		Scanner s = new Scanner(Main.class.getResourceAsStream("A-small-attempt1.in"));
		
		int n = s.nextInt();
		s.nextLine();
		
		int nt = 1;
		while (n-- > 0) {
			String nextLine = s.nextLine();
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < nextLine.length(); i++) {
				char c = nextLine.charAt(i);
				sb.append(m.get(c));
			}
			System.out.println("Case #" + nt + ": " + sb.toString());
			
			nt++;
		}
		
		
		
		

		
	}

}
