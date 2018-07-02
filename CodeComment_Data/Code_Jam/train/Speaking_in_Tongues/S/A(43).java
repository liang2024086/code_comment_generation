package methodEmbedding.Speaking_in_Tongues.S.LYD606;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;

public class A {	
	private PrintWriter out;
	
	private final String file = "A";
	
	private static final HashMap<Character, Character> map = new HashMap<Character, Character>(27);
	
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
	
	public A() throws IOException {
		try {
			System.setIn(new FileInputStream("io/q/" + file));
			System.setOut(new PrintStream(new FileOutputStream("io/q/" + file + ".out")));
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		BufferedReader buf = 
			new BufferedReader(new InputStreamReader(System.in));
		
		out = new PrintWriter(System.out);
		
		// for case
		int T = Integer.valueOf(buf.readLine());
		int c, t = 1;
		
		while (T-- > 0) {
			out.printf("Case #%d: ", t++);
			
			do {
				c = buf.read();
				
				if (13 == c) {
					buf.read();
				} else if (-1 == c) {
					break;
				} else {
					out.print(map.get((char) c));
				}				
			} while (c != 13);
			out.printf("%n");
		}
		buf.close();
		out.flush();
		out.close();
	}
	
	public static void main(String[] args) throws IOException {
		new A();
	}
}
