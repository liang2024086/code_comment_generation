package methodEmbedding.Speaking_in_Tongues.S.LYD1658;

import java.io.*;
import java.util.*;

public class SpeakingInTongues {

	public static void main(String[] args) {
		Scanner fin = null;
		TreeMap<Character, Character> map = new TreeMap<Character, Character>();
		
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
		
		try {
			fin = new Scanner(new File("A-small-attempt0.in"));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		int numTestCases = fin.nextInt();
		fin.nextLine();
		for (int i = 1; i <= numTestCases; i++) {
			String encoded = fin.nextLine();
			System.out.printf("Case #%d: ", i);
			for (int j = 0; j < encoded.length(); j++) {
				System.out.print(map.get(encoded.charAt(j)));
			}
			System.out.println();
		}
	}
	
}
