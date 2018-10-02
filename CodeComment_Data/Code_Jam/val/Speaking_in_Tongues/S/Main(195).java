package methodEmbedding.Speaking_in_Tongues.S.LYD897;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		Map<Character, String> map = new HashMap<Character, String>();
		map.put('a', "y");
		map.put('b', "h");
		map.put('c', "e");
		map.put('d', "s");
		map.put('e', "o");
		map.put('f', "c");
		map.put('g', "v");
		map.put('h', "x");
		map.put('i', "d");
		map.put('j', "u");
		map.put('k', "i");
		map.put('l', "g");
		map.put('m', "l");
		map.put('n', "b");
		map.put('o', "k");
		map.put('p', "r");
		map.put('q', "z");
		map.put('r', "t");
		map.put('s', "n");
		map.put('t', "w");
		map.put('u', "j");
		map.put('v', "p");
		map.put('w', "f");
		map.put('x', "m");
		map.put('y', "a");
		map.put('z', "q");
		map.put(' ', " ");
		for (int i = 1; i <= testCase; i++) {
			char[] cs = br.readLine().toCharArray();
			String text = "";
			for (int j = 0; j < cs.length; j++) {
				text += map.get(cs[j]);
			}
			System.out.println("Case #" + i + ": " + text);
		}
	}
}
