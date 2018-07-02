package methodEmbedding.Speaking_in_Tongues.S.LYD771;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class SpeakingInTongues {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		
		BufferedReader in = null;
		PrintWriter out = null;
		
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
		
		try {
			
			String test;
			StringBuilder builder = new StringBuilder(100);
			
			out = new PrintWriter(new FileWriter(args[1]));
			in = new BufferedReader(new FileReader(args[0]), 1024);
			
			// count
			in.readLine();
			
			for (int i=1; (test=in.readLine())!=null; i++) {
				builder.delete(0, builder.length());
				for (int j=0, length=test.length(); j<length; j++) {
					if (test.charAt(j)==' ')
						builder.append(' ');
					else
						builder.append(map.get(test.charAt(j)));
				}
				out.printf("Case #%d: %s%n", i, builder.toString());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			if (in!=null)
				in.close();
			if (out!=null)
				out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
