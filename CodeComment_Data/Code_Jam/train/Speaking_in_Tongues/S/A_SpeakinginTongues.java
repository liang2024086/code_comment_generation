package methodEmbedding.Speaking_in_Tongues.S.LYD13;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import java.io.*;
import java.math.*;
import java.util.*;

@SuppressWarnings("unused")
public class A_SpeakinginTongues {
	public static void main(String[] args) throws Exception {
		// Scanner in = new Scanner(System.in);
		// PrintStream out = System.out;
		Scanner in = new Scanner(new File("A-small.in"));
		PrintStream out = new PrintStream("A-small.out");
		String[] a = { "ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv" };
		String[] b = { "our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up" };
		TreeMap<Character, Character> map = new TreeMap<Character, Character>();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < a[i].length(); j++) {
				map.put(a[i].charAt(j), b[i].charAt(j));
			}
		}
		map.put('y', 'a');
		map.put('e', 'o');
		map.put('q', 'z');
		map.put('z', 'q');
		int T = Integer.parseInt(in.nextLine());
		for (int i = 1; i <= T; i++) {
			String s = in.nextLine();
			StringBuffer sb = new StringBuffer();
			for (char c : s.toCharArray()) {
				sb.append(map.get(c));
			}
			out.println("Case #" + i + ": " + sb);
		}
	}
}
