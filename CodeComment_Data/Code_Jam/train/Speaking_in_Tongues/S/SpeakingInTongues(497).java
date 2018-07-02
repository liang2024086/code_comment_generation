package methodEmbedding.Speaking_in_Tongues.S.LYD1625;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SpeakingInTongues {
	public static Map<Character, Character> mapping = new HashMap<Character, Character>();
	
	public static void main(String[] args) throws IOException {
		mapping.put('a', 'y');
		mapping.put('b', 'h');
		mapping.put('c', 'e');
		mapping.put('d', 's');
		mapping.put('e', 'o');
		mapping.put('f', 'c');
		mapping.put('g', 'v');
		mapping.put('h', 'x');
		mapping.put('i', 'd');
		mapping.put('j', 'u');
		mapping.put('k', 'i');
		mapping.put('l', 'g');
		mapping.put('m', 'l');
		mapping.put('n', 'b');
		mapping.put('o', 'k');
		mapping.put('p', 'r');
		mapping.put('q', 'z');
		mapping.put('r', 't');
		mapping.put('s', 'n');
		mapping.put('t', 'w');
		mapping.put('u', 'j');
		mapping.put('v', 'p');
		mapping.put('w', 'f');
		mapping.put('x', 'm');
		mapping.put('y', 'a');
		mapping.put('z', 'q');
		mapping.put(' ', ' ');
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(reader.readLine());
		for (int j=1; j<=i; j++) {
			String line = reader.readLine();
			StringBuilder builder = new StringBuilder(line.length());
			for (char ch : line.toCharArray()) {
				builder.append(mapping.get(ch));
			}
			System.out.printf("Case #%d: %s\n", j, builder.toString());
		}
	}

}
