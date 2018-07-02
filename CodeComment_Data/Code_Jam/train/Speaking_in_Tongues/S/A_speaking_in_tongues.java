package methodEmbedding.Speaking_in_Tongues.S.LYD281;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class A_speaking_in_tongues {

	private static Map<Character, Character> mapping = new HashMap<Character, Character>() {
		{

			put('y', 'a');
			put('n', 'b');
			put('f', 'c');
			put('i', 'd');
			put('c', 'e');
			put('w', 'f');
			put('l', 'g');
			put('b', 'h');
			put('k', 'i');
			put('u', 'j');
			put('o', 'k');
			put('m', 'l');
			put('x', 'm');
			put('s', 'n');
			put('e', 'o');
			put('v', 'p');
			put('z', 'q');
			put('p', 'r');
			put('d', 's');
			put('r', 't');
			put('j', 'u');
			put('g', 'v');
			put('t', 'w');
			put('h', 'x');
			put('a', 'y');
			put('q', 'z');
			put(' ', ' ');
		}
	};

	public static void main(String[] args) throws IOException {

		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader("./input"));
			writer = new BufferedWriter(new FileWriter("output"));
			int numberOfCases = Integer.valueOf(reader.readLine());
			for (int i = 1; i <= numberOfCases; i++) {
				String line = reader.readLine();
				StringBuilder sb = new StringBuilder("Case #" + i + ": ");
				for (int j = 0; j < line.length(); j++) {
					char encodedChar = line.charAt(j);
					sb.append(mapping.get(encodedChar));
				}
				sb.append("\n");
				writer.write(sb.toString());
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
			if(writer!=null) {
				writer.flush();
				writer.close();
			}
		}
	}

}
