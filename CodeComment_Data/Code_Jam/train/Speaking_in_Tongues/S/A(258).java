package methodEmbedding.Speaking_in_Tongues.S.LYD98;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws FileNotFoundException {
		String[] original = { "our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up" };
		String[] coded = { "ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv" };

		char[] t = new char[26];
		for (int i = 0; i < 26; i++)
			t[i] = ' ';
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < original[i].length(); j++) {
				char o = original[i].charAt(j), c = coded[i].charAt(j);
				if (c != ' ')
					t[c - 'a'] = o;
			}

		t['q' - 'a'] = 'z';
		t['z' - 'a'] = 'q';

		Scanner in = new Scanner(new File("A.in"));
		PrintWriter out = new PrintWriter(new File("A.out"));
		int n = Integer.parseInt(in.nextLine());
		for (int i = 0; i < n; i++) {
			String s = in.nextLine();
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < s.length(); j++)
				if (s.charAt(j) == ' ')
					sb.append(' ');
				else
					sb.append(t[s.charAt(j) - 'a']);
			out.println("Case #" + (i + 1) + ": " + sb.toString());
		}
		in.close();
		out.close();
	}
}
