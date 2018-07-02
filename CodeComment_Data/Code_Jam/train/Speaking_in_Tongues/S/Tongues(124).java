package methodEmbedding.Speaking_in_Tongues.S.LYD243;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Tongues {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
			String line;
			int numCases = Integer.parseInt(in.readLine());
			Map<Character, Character> lookup = new HashMap<Character, Character>();
			lookup.put(new Character('a'), new Character('y'));
			lookup.put(new Character('b'), new Character('h'));
			lookup.put(new Character('c'), new Character('e'));
			lookup.put(new Character('d'), new Character('s'));
			lookup.put(new Character('e'), new Character('o'));
			lookup.put(new Character('f'), new Character('c'));
			lookup.put(new Character('g'), new Character('v'));
			lookup.put(new Character('h'), new Character('x'));
			lookup.put(new Character('i'), new Character('d'));
			lookup.put(new Character('j'), new Character('u'));
			lookup.put(new Character('k'), new Character('i'));
			lookup.put(new Character('l'), new Character('g'));
			lookup.put(new Character('m'), new Character('l'));
			lookup.put(new Character('n'), new Character('b'));
			lookup.put(new Character('o'), new Character('k'));
			lookup.put(new Character('p'), new Character('r'));
			lookup.put(new Character('q'), new Character('z'));
			lookup.put(new Character('r'), new Character('t'));
			lookup.put(new Character('s'), new Character('n'));
			lookup.put(new Character('t'), new Character('w'));
			lookup.put(new Character('u'), new Character('j'));
			lookup.put(new Character('v'), new Character('p'));
			lookup.put(new Character('w'), new Character('f'));
			lookup.put(new Character('x'), new Character('m'));
			lookup.put(new Character('y'), new Character('a'));
			lookup.put(new Character('z'), new Character('q'));
			for (int i=0; i<numCases; i++) {
				line = in.readLine();
				System.out.print("Case #" + (i+1) + ": ");
				for (Character c : line.toCharArray()) {
					if (lookup.containsKey(c)) {
						System.out.print(lookup.get(c));
					} else {
						System.out.print(c);
					}
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
