package methodEmbedding.Speaking_in_Tongues.S.LYD661;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String... args) throws Exception {
		int t, T;
		//Scanner in = new Scanner(System.in);
		//PrintStream out = System.out;
		Scanner in = new Scanner(new File("speaking.in"));
		PrintStream out = new PrintStream(new File("speajing.out"));
		String encoded = "z y qee ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";
		String decoded = "q a zoo our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up";
		T = Integer.parseInt(in.nextLine());
		for (t = 1; t <= T; t++) {
			String s = in.nextLine();
			StringBuffer dec = new StringBuffer(s);
			for (int i = 0; i < s.length(); i++) {
				if (encoded.indexOf(s.charAt(i)) < 0) {
					System.out.println("missing char:" + s.charAt(i));
				} else {
					dec.setCharAt(i, decoded.charAt(encoded.indexOf(s.charAt(i))));
				}
			}
			out.println("Case #" + t + ": " + dec.toString());
		}
	}
}
