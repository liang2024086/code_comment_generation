package methodEmbedding.Speaking_in_Tongues.S.LYD593;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class A {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<Character, Character> t = new HashMap<Character, Character>();
		t.put('a', 'y');
		t.put('b', 'h');
		t.put('c', 'e');
		t.put('d', 's');
		t.put('e', 'o');
		t.put('f', 'c');
		t.put('g', 'v');
		t.put('h', 'x');
		t.put('i', 'd');
		t.put('j', 'u');
		t.put('k', 'i');
		t.put('l', 'g');
		t.put('m', 'l');
		t.put('n', 'b');
		t.put('o', 'k');
		t.put('p', 'r');
		t.put('q', 'z');
		t.put('r', 't');
		t.put('s', 'n');
		t.put('t', 'w');
		t.put('u', 'j');
		t.put('v', 'p');
		t.put('w', 'f');
		t.put('x', 'm');
		t.put('y', 'a');
		t.put('z', 'q');
		t.put(' ', ' ');
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			System.out.print("Case #" + i + ": ");
			for (char c : br.readLine().toCharArray())
				System.out.print(t.get(c));
			System.out.println();
		}
	}
}
