package methodEmbedding.Speaking_in_Tongues.S.LYD1110;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	private static Map<Character, Character> map = new HashMap<Character, Character>();
	static {
		map.put('y', 'a');
		map.put('n', 'b');
		map.put('f', 'c');
		map.put('i', 'd');
		map.put('c', 'e');
		map.put('w', 'f');
		map.put('l', 'g');
		map.put('b', 'h');
		map.put('k', 'i');
		map.put('u', 'j');
		map.put('o', 'k');
		map.put('m', 'l');
		map.put('x', 'm');
		map.put('s', 'n');
		map.put('e', 'o');
		map.put('v', 'p');
		map.put('q', 'z'); //z
		map.put('p', 'r');
		map.put('d', 's');
		map.put('r', 't');
		map.put('j', 'u');
		map.put('g', 'v');
		map.put('t', 'w');
		map.put('h', 'x');
		map.put('a', 'y');
		map.put('z', 'q'); //q
	}
	
	public static void main(String[] args) {
		File inputFile = new File("input.txt");
		BufferedReader br = null;
		FileOutputStream out = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
			String line;
			line = br.readLine();
			if (line == null) {
				throw new IllegalStateException("Empty input file!!!");
			}
			
			
			StringBuilder result = new StringBuilder();
			
			int length = Integer.parseInt(line), i = 1;
			while (i <= length) {
				result.append("Case #").append(i).append(": ");
///////////////////////////////////////////////////////////////////////////////////////////////////

				char[] data = br.readLine().toCharArray();
				for (int j = 0; j < data.length; j++) {
					char c = data[j];
					if (map.containsKey(c)) {
						c = map.get(c);
					}
					result.append(c);
				}
				
///////////////////////////////////////////////////////////////////////////////////////////////////
				result.append("\n");
				i++;
			}
			
			File outputFile = new File("output.txt");
			outputFile.delete();
			outputFile.createNewFile();
			
			out = new FileOutputStream(outputFile);
			out.write(result.toString().getBytes());
	} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
