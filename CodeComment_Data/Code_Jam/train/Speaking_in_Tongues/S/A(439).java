package methodEmbedding.Speaking_in_Tongues.S.LYD1187;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class A {

	private static Map<Character, Character> map = new HashMap<Character, Character>();
	
	static {
		map.put('a', 'y');
		map.put('b', 'h');
		map.put('c', 'e');
		map.put('d', 's');
		map.put('e', 'o');
		map.put('f', 'c');
		map.put('g', 'v');
		map.put('h', 'x');
		map.put('i', 'd');
		map.put('j', 'u');
		map.put('k', 'i');
		map.put('l', 'g');
		map.put('m', 'l');
		map.put('n', 'b');
		map.put('o', 'k');
		map.put('p', 'r');
		
		map.put('q', 'z');
		
		map.put('r', 't');
		map.put('s', 'n');
		map.put('t', 'w');
		map.put('u', 'j');
		map.put('v', 'p');
		map.put('w', 'f');
		map.put('x', 'm');
		map.put('y', 'a');
		
		map.put('z', 'q');
		
		map.put(' ', ' ');
	}
	
	public static void main(String[] args) {
		
		try {
			System.setIn(new FileInputStream("a.in"));
			System.setOut(new PrintStream("a.out"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Scanner s = new Scanner(System.in);
		
		int n = Integer.valueOf(s.nextLine());
		
		String input[] = new String[n];
		
		for( int i = 0 ; i < n ; ++i ) {
			input[i] = s.nextLine();
		}
		
		for( int i = 0 ; i < n ; ++i ) {
			StringBuilder buffer = new StringBuilder();
			
			for( int j = 0 ; j < input[i].length() ; ++j ) {
				char in = input[i].charAt(j);
				buffer.append(map.get(in));
			}
			System.out.println(String.format("Case #%d: %s", i+1, buffer.toString()));
		}
	}
}
