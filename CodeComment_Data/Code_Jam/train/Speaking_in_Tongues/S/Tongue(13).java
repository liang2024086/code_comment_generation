package methodEmbedding.Speaking_in_Tongues.S.LYD56;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;


public class Tongue {
	static TreeMap<Character, Character> d = new TreeMap<Character, Character>();
	
	public static void main(String[] args) {
		d.put('a', 'y');
		d.put('b', 'h');
		d.put('c', 'e');
		d.put('d', 's');
		d.put('e', 'o');
		d.put('f', 'c');
		d.put('g', 'v');
		d.put('h', 'x');
		d.put('i', 'd');
		d.put('j', 'u');
		d.put('k', 'i');
		d.put('l', 'g');
		d.put('m', 'l');
		d.put('n', 'b');
		d.put('o', 'k');
		d.put('p', 'r');
		d.put('q', 'z');
		d.put('r', 't');
		d.put('s', 'n');
		d.put('t', 'w');
		d.put('u', 'j');
		d.put('v', 'p');
		d.put('w', 'f');
		d.put('x', 'm');
		d.put('y', 'a');
		d.put('z', 'q');
		
		
		Scanner in = null;
		PrintWriter out = null;
		
		try {
			in = new Scanner( 
				new FileInputStream("Tongue.in")
			);
			
			out = new PrintWriter(
				new FileOutputStream(".\\Tongue.out")
			);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
				
		int cases = in.nextInt();
		in.nextLine();
		
		for(int i=1; i<=cases; i++) {
			char[] sentence = in.nextLine().toCharArray();
			StringBuilder string = new StringBuilder();
			
			for(char c : sentence) {
				if(c == ' ') {
					string.append(c);
					continue;
				}
									
				string.append(d.get(c));
			}
			
			System.out.printf("Case #%d: %s\n", i, string.toString());
		}
		
		in.close();
		
		out.flush();
		out.close();
	}
}
