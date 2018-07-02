package methodEmbedding.Speaking_in_Tongues.S.LYD59;

import java.io.*;
import java.util.*;

public class A_SpeakinginTongues {
	static String name = "A-small-attempt0";

	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(name + ".in"));
		PrintWriter out = new PrintWriter(name + ".out");
		int t = Integer.parseInt(in.readLine()), caseN = 1;
		char[] arr = new char[300];
		char[] a = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv"
				.toCharArray();
		char[] b = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up"
				.toCharArray();
		arr['z'] = 'q';
		arr['q'] = 'z';
		for (int i = 0; i < a.length; i++) {
			arr[a[i]] = b[i];
		}
		arr[' '] = ' ';
		// for (int i = 'a'; i <= 'z'; i++)
		// System.out.println((char) i + " " + arr[i]);
		while (caseN <= t) {
			out.print("Case #");
			out.print(caseN++);
			out.print(": ");
			char[] line = in.readLine().toCharArray();
			for (int i = 0; i < line.length; i++)
				out.print(arr[line[i]]);
			out.println();
		}
		out.flush();

	}
}
