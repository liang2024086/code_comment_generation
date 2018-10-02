package methodEmbedding.Speaking_in_Tongues.S.LYD80;

import java.util.HashMap;
import java.util.Scanner;


public class SpeakingInTongues {
	
	public static void main(String[] args) {
		HashMap<Character, Character> mapping = new HashMap<>();
		mapping.put('a','y');
		mapping.put('b','h');
		mapping.put('c','e');
		mapping.put('d','s');
		mapping.put('e','o');
		mapping.put('f','c');
		mapping.put('g','v');
		mapping.put('h','x');
		mapping.put('i','d');
		mapping.put('j','u');
		mapping.put('k','i');
		mapping.put('l','g');
		mapping.put('m','l');
		mapping.put('n','b');
		mapping.put('o','k');
		mapping.put('p','r');
		mapping.put('q','z');
		mapping.put('r','t');
		mapping.put('s','n');
		mapping.put('t','w');
		mapping.put('u','j');
		mapping.put('v','p');
		mapping.put('w','f');
		mapping.put('x','m');
		mapping.put('y','a');
		mapping.put('z','q');
		Scanner s = new Scanner(System.in);
		int numCases = s.nextInt();
		s.nextLine();
		for (int i = 0; i < numCases; i++){
			String line = s.nextLine();
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < line.length(); j++) {
				char c = line.charAt(j);
				sb.append(mapping.get(c) != null ? mapping.get(c) : c);
			}
			System.out.println("Case #" + (i+1) + ": " + sb.toString());
		}
	}

}
