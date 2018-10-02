package methodEmbedding.Speaking_in_Tongues.S.LYD87;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static final char[] backmapping;

	static {
		char[] mapping = new char[26];
		backmapping = new char[26];
		mapping['a' - 'a'] = 'y';
		mapping['b' - 'a'] = 'n';
		mapping['c' - 'a'] = 'f';
		mapping['d' - 'a'] = 'i';
		mapping['e' - 'a'] = 'c';
		mapping['f' - 'a'] = 'w';
		mapping['g' - 'a'] = 'l';
		mapping['h' - 'a'] = 'b';
		mapping['i' - 'a'] = 'k';
		mapping['j' - 'a'] = 'u';
		mapping['k' - 'a'] = 'o';
		mapping['l' - 'a'] = 'm';
		mapping['m' - 'a'] = 'x';
		mapping['n' - 'a'] = 's';
		mapping['o' - 'a'] = 'e';
		mapping['p' - 'a'] = 'v';
		mapping['q' - 'a'] = 'z';
		mapping['r' - 'a'] = 'p';
		mapping['s' - 'a'] = 'd';
		mapping['t' - 'a'] = 'r';
		mapping['u' - 'a'] = 'j';
		mapping['v' - 'a'] = 'g';
		mapping['w' - 'a'] = 't';
		mapping['x' - 'a'] = 'h';
		mapping['y' - 'a'] = 'a';
		mapping['z' - 'a'] = 'q';

		for (int i = 0; i < 26; i++) {
			backmapping[(char) (mapping[i] - 'a')] = (char) ('a' + i);
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(new File("input"));
		BufferedWriter w = new BufferedWriter(new FileWriter(new File("output")));
		int cases = s.nextInt();
		s.nextLine();

		for (int i = 0; i < cases; i++) {
			w.write("Case #");
			w.write(String.valueOf(i + 1));
			w.write(": ");

			char[] n = s.nextLine().toCharArray();
			for (char c : n) {
				if (c != ' ') {
					w.write(backmapping[c - 'a']);
				} else {
					w.write(' ');
				}
			}
			w.write("\n");
		}
		w.close();
	}

}
