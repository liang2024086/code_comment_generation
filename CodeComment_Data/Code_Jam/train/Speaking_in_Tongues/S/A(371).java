package methodEmbedding.Speaking_in_Tongues.S.LYD1463;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class A {
	public static void main(String [] args) throws Exception{
		HashMap<Character, Character> letters = new HashMap<Character, Character>();
		letters.put('a', 'y');
		letters.put('b', 'h');
		letters.put('c', 'e');
		letters.put('d', 's');
		letters.put('e', 'o');
		letters.put('f', 'c');
		letters.put('g', 'v');
		letters.put('h', 'x');
		letters.put('i', 'd');
		letters.put('j', 'u');
		letters.put('k', 'i');
		letters.put('l', 'g');
		letters.put('m', 'l');
		letters.put('n', 'b');
		letters.put('o', 'k');
		letters.put('p', 'r');
		letters.put('q', 'z');
		letters.put('r', 't');
		letters.put('s', 'n');
		letters.put('t', 'w');
		letters.put('u', 'j');
		letters.put('v', 'p');
		letters.put('w', 'f');
		letters.put('x', 'm');
		letters.put('y', 'a');
		letters.put('z', 'q');
		letters.put(' ', ' ');


		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i = 0; i < n; i++){
			System.out.print("Case #" + (i + 1) + ": ");
			String line = in.readLine();
			for(char c : line.toCharArray()){
				System.out.print(letters.get(c));
			}
			System.out.println();
		}

	}
}
