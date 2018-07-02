package methodEmbedding.Speaking_in_Tongues.S.LYD433;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class SpeakinginTongues {

	public static void main(String[] args) throws IOException {
		Hashtable<Character, Character> c = new Hashtable<Character, Character>();
		c.put('a', 'y');
		c.put('b', 'h');
		c.put('c', 'e');
		c.put('d', 's');
		c.put('e', 'o');
		c.put('f', 'c');
		c.put('g', 'v');
		c.put('h', 'x');
		c.put('i', 'd');
		c.put('j', 'u');
		c.put('k', 'i');
		c.put('l', 'g');
		c.put('m', 'l');
		c.put('n', 'b');
		c.put('o', 'k');
		c.put('p', 'r');
		c.put('q', 'z');
		c.put('r', 't');
		c.put('s', 'n');
		c.put('t', 'w');
		c.put('u', 'j');
		c.put('v', 'p');
		c.put('w', 'f');
		c.put('x', 'm');
		c.put('y', 'a');
		c.put('z', 'q');
		c.put(' ', ' ');

		InputStreamReader dis = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(dis);
		int t = Integer.parseInt(in.readLine());

		for (byte i = 1; i <= t; i++) {
			char[] cs = in.readLine().toCharArray();
			byte len = (byte) cs.length;
			System.out.print("Case #" + i + ": ");
			for (byte j = 0; j < len; j++)
				System.out.print(c.get(cs[j]));
			System.out.println();
		}
		in.close();
	}
}
