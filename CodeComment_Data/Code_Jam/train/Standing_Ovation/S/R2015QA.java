package methodEmbedding.Standing_Ovation.S.LYD840;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class R2015QA {

	public final static String IN_FILE = "test/R2015QA.in";
	public final static String OUT_FILE = "test/R2015QA.out";

	private static Scanner IN;

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream(IN_FILE);
		PrintWriter out = new PrintWriter(new FileWriter(OUT_FILE));
		IN = new Scanner(in);

		int T = IN.nextInt();
		IN.nextLine();
		for (int t = 1; t <= T; t++) {
			int s = IN.nextInt();
			char[] S = IN.next().toCharArray();

			int m = 0;
			int tm = S[0] - '0';
			for (int i = 1; i <= s; i++) {
				int mm = S[i] - '0';
				if (tm < i) {
					m += i - tm;
					tm += i - tm;
				}
				tm += mm;
			}

			out.println("Case #" + t + ": " + m);
		}

		out.flush();
		out.close();
	}

}
