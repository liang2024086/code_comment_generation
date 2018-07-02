package methodEmbedding.Speaking_in_Tongues.S.LYD910;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;


public class A {
	static HashMap<Character, Character> mp = new HashMap<Character, Character>();
	static{
		mp.put('a', 'y');
		mp.put('b', 'h');
		mp.put('c', 'e');
		mp.put('d', 's');
		mp.put('e', 'o');
		mp.put('f', 'c');
		mp.put('g', 'v');
		mp.put('h', 'x');
		mp.put('i', 'd');
		mp.put('j', 'u');
		mp.put('k', 'i');
		mp.put('l', 'g');
		mp.put('m', 'l');
		mp.put('n', 'b');
		mp.put('o', 'k');
		mp.put('p', 'r');
		mp.put('r', 't');
		mp.put('s', 'n');
		mp.put('t', 'w');
		mp.put('u', 'j');
		mp.put('v', 'p');
		mp.put('w', 'f');
		mp.put('x', 'm');
		mp.put('y', 'a');

		
		mp.put('q', 'z');
		mp.put('z', 'q');		
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new FileInputStream("A-small-attempt.in"));
		System.setOut(new PrintStream("A.out"));
		
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n;i++){
			String stIn = in.nextLine();
			StringBuilder sb = new StringBuilder(stIn.length());
			for(int j = 0; j < stIn.length(); j++){
				Character b = mp.get(stIn.charAt(j));
				if(b == null)
					sb.append(stIn.charAt(j));
				else
					sb.append(b);
			}
			System.out.println("Case #"+ (i + 1) + ": " + sb);
		}
		
	}

}
