package methodEmbedding.Speaking_in_Tongues.S.LYD1048;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class A {
	
	static Map<Character, Character> map = new HashMap<Character, Character>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		map.put('y', 'a');
		map.put('n', 'b');
		map.put('f', 'c');
		map.put('i', 'd');
		map.put('c', 'e');
		map.put('w', 'f');
		map.put('l', 'g');
		map.put('b', 'h');
		map.put('k', 'i');
		map.put('u', 'j');
		map.put('o', 'k');
		map.put('m', 'l');
		map.put('x', 'm');
		map.put('s', 'n');
		map.put('e', 'o');
		map.put('v', 'p');
		map.put('z', 'q');
		map.put('p', 'r');
		map.put('d', 's');
		map.put('r', 't');
		map.put('j', 'u');
		map.put('g', 'v');
		map.put('t', 'w');
		map.put('h', 'x');
		map.put('a', 'y');
		map.put('q', 'z');
		
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < T; i++) {
			String G = sc.nextLine();
			char[] chars = G.toCharArray();
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < chars.length; j++) {
				if (chars[j] != ' ') {
					sb.append(map.get(chars[j]));
					
				} else {
					sb.append(chars[j]);
				}
				
			}
			System.out.printf("Case #%d: %s\n", i + 1, sb);
			
		}
	}

}

