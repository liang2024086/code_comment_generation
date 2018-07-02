package methodEmbedding.Speaking_in_Tongues.S.LYD1336;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Language {
	static final Map<Character, Character> p = new HashMap<Character, Character>(); 
	static {
		p.put('y','a');
		p.put('n','b');
		p.put('f','c');
		p.put('i','d');
		p.put('c','e');
		p.put('w','f');
		p.put('l','g');
		p.put('z','q');
		p.put('k','i');
		p.put('u','j');
		p.put('o','k');
		p.put('m','l');
		p.put('x','m');
		p.put('s','n');
		p.put('e','o');
		p.put('v','p');
		p.put('b','h');
		p.put('p','r');
		p.put('d','s');
		p.put('r','t');
		p.put('j','u');
		p.put('g','v');
		p.put('t','w');
		p.put('h','x');
		p.put('a','y');
		p.put('q','z');
		p.put(' ', ' ');
	}
	
	public static void main(String args[]) throws IOException {
		Scanner s = new Scanner(new File("D:\\workspace\\GC12\\src\\input2.txt"));
		FileWriter fo = new FileWriter(new File("D:\\workspace\\GC12\\src\\output2.txt"));
		int nuber = s.nextInt();
		s.nextLine();
		for(int i = 1; i<= nuber; i++) {
			String line = s.nextLine();
			fo.write("Case #" + i + ": ");
			for(char ch : line.toCharArray()) {
				fo.write(p.get(ch));
			}
			fo.write("\n");
		}
			fo.close();
			s.close();
	}
}
