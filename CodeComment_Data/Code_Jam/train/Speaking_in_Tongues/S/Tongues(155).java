package methodEmbedding.Speaking_in_Tongues.S.LYD962;

import java.util.*;
import java.io.*;


public class Tongues {
	public static void main(String args[]) throws Exception
	{
		TreeMap<Character, Character> tr = new TreeMap<Character, Character>();
		tr.put('a', 'y');
		tr.put('b', 'h');
		tr.put('c', 'e');
		tr.put('d', 's');
		tr.put('e', 'o');
		tr.put('f', 'c');
		tr.put('g', 'v');
		tr.put('h', 'x');
		tr.put('i', 'd');
		tr.put('j', 'u');
		tr.put('k', 'i');
		tr.put('l', 'g');
		tr.put('m', 'l');
		tr.put('n', 'b');
		tr.put('o', 'k');
		tr.put('p', 'r');
		tr.put('q', 'z');
		tr.put('r', 't');
		tr.put('s', 'n');
		tr.put('t', 'w');
		tr.put('u', 'j');
		tr.put('v', 'p');
		tr.put('w', 'f');
		tr.put('x', 'm');
		tr.put('y', 'a');
		tr.put('z', 'q');
		tr.put(' ', ' ');
		
		BufferedReader in = new BufferedReader(new FileReader(new File("src/A-small-attempt2.in")));
		FileWriter out = new FileWriter(new File("bin/tongues.out"));
		
		int n = Integer.parseInt(in.readLine());
		for (int i = 1; i <= n; i++) {
			String s = in.readLine();
			char[] a = s.toCharArray();
			for (int j = 0; j < a.length; j++)
			{
				a[j] = tr.get(new Character(a[j]));
			}
			s = new String(a);
			out.write("Case #" + i + ": " + s);
			if (i != n) out.write("\n");
		}
		in.close();
		out.close();
		
	}
}
