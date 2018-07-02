package methodEmbedding.Speaking_in_Tongues.S.LYD599;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


public class Tongues {
	public static void main(String[] args) {
		
		HashMap<Character, Character> dict = new HashMap<Character, Character>();
		dict.put('a', 'y');
		dict.put('b', 'h');
		dict.put('c', 'e');
		dict.put('d', 's');
		dict.put('e', 'o');
		dict.put('f', 'c');
		dict.put('g', 'v');
		dict.put('h', 'x');
		dict.put('i', 'd');
		dict.put('j', 'u');
		dict.put('k', 'i');
		dict.put('l', 'g');
		dict.put('m', 'l');
		dict.put('n', 'b');
		dict.put('o', 'k');
		dict.put('p', 'r');
		dict.put('q', 'z'); // ? q
		dict.put('r', 't');
		dict.put('s', 'n');
		dict.put('t', 'w');
		dict.put('u', 'j');
		dict.put('v', 'p');
		dict.put('w', 'f');
		dict.put('x', 'm');
		dict.put('y', 'a');
		dict.put('z', 'q'); // ? z
		dict.put(' ', ' ');
		
		// q, z
				
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		String line = cin.nextLine();
		for(int idx = 1; idx < num+1; idx++)
		{
			System.out.print("Case #" + idx + ": ");
			line = cin.nextLine();
//			System.out.println(line);
			for(int i = 0; i < line.length(); i++)
			{
				char c = line.charAt(i);
				System.out.print(dict.get(c));				
			}
			System.out.println("");		
		}
	}
}
