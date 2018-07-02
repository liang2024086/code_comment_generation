package methodEmbedding.Speaking_in_Tongues.S.LYD1667;


import java.util.*;

public class SpeakingInTongues {

	static HashMap<Character, Character> map;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		map = new HashMap<Character, Character>();
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
		
		map.put(' ', ' ');
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		in.nextLine();
		
		for (int k = 1; k <= T; k++) {
			
			char[] input = in.nextLine().toCharArray();
			
			char[] output = new char[input.length];
			
			for (int i = 0; i < input.length; i++) {
				Character t = map.get(input[i]);
				if (t == null) {
					System.err.println("Warning, not respected.");
					output[i] = '_';
				} else {
					output[i] = t;
				}
			}
			
			System.out.println("Case #" + k + ": " + new String(output));
			
		}
		
	}

}
