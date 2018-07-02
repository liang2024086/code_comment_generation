package methodEmbedding.Speaking_in_Tongues.S.LYD1309;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Tongues {

	private static Map<Character, Character> mapping = new HashMap<Character, Character>() {
		{
			put('a', 'y');
			put('b', 'h');
			put('c', 'e');
			put('d', 's');
			put('e', 'o');
			put('f', 'c');
			put('g', 'v');
			put('h', 'x');
			put('i', 'd');
			put('j', 'u');
			put('k', 'i');
			put('l', 'g');
			put('m', 'l');
			put('n', 'b');
			put('o', 'k');
			put('p', 'r');
			put('q', 'z');
			put('r', 't');
			put('s', 'n');
			put('t', 'w');
			put('u', 'j');
			put('v', 'p');
			put('w', 'f');
			put('x', 'm');
			put('y', 'a');
			put('z', 'q');
		}
	};
	
	public static void main(String[] args) throws IOException {
		Path input = Paths.get("/Users/mdymczyk/google-codejam/Tongues/src/input.in");
		List<String> lines = Files.readAllLines(input, Charset.forName("UTF-8"));
		lines.remove(0);
		int i = 1;
		for(String line : lines) {
			StringBuilder sb = new StringBuilder();
			sb.append("Case #"+i+": ");
			for(char c : line.toCharArray()) {
				if(c == ' ') {
					sb.append(c);
				} else {
					sb.append(mapping.get(c));
				}
			}
			System.out.println(sb);
			i++;
		}
	}
	
}
