package methodEmbedding.Speaking_in_Tongues.S.LYD1069;

import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GCJA {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("A-small-attempt2.in");
		Scanner scan = new Scanner(file);
		HashMap<Character, Character> letterMap = new HashMap<Character, Character>();
		int numLines = Integer.parseInt(scan.nextLine());
		String output;
		
		letterMap.put('a', 'y');
		letterMap.put('b', 'h');
		letterMap.put('c', 'e');
		letterMap.put('d', 's');
		letterMap.put('e', 'o');
		letterMap.put('f', 'c');
		letterMap.put('g', 'v');
		letterMap.put('h', 'x');
		letterMap.put('i', 'd');
		letterMap.put('j', 'u');
		letterMap.put('k', 'i');
		letterMap.put('l', 'g');
		letterMap.put('m', 'l');
		letterMap.put('n', 'b');
		letterMap.put('o', 'k');
		letterMap.put('p', 'r');
		letterMap.put('q', 'z');
		letterMap.put('r', 't');
		letterMap.put('s', 'n');
		letterMap.put('t', 'w');
		letterMap.put('u', 'j');
		letterMap.put('v', 'p');
		letterMap.put('w', 'f');
		letterMap.put('x', 'm');
		letterMap.put('y', 'a');
		letterMap.put('z', 'q');
		letterMap.put(' ', ' ');

		for (int i = 0; i < numLines; i++) {
			String input = scan.nextLine();
			int len = input.length();
			char[] out = new char[len];
			char cur;
			System.out.print("Case #" + (i+1) + ": ");
			for (int j = 0; j < len; j++) {
				cur = input.charAt(j);
				out[j] = letterMap.get(cur);
				System.out.print(out[j]);
			}
			output = out.toString();
			System.out.println("");
		}
		
	}
}
