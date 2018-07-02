package methodEmbedding.Revenge_of_the_Pancakes.S.LYD195;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class R2016QB {

	public final static String IN_FILE = "test/R2016QB.in";
	public final static String OUT_FILE = "test/R2016QB.out";

	private static Scanner IN;

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream(IN_FILE);
		PrintWriter out = new PrintWriter(new FileWriter(OUT_FILE));
		IN = new Scanner(in);

		int T = IN.nextInt();
		IN.nextLine();
		for (int t = 1; t <= T; t++) {
			String s = IN.next();
			s = "-" + s + "+";

			int tt = 0;
			char[] c = s.toCharArray();
			for (int i = 1; i < c.length; i++) {
				if (c[i] == '-') {
					if (c[i - 1] == '+') {
						tt++;
					}
					if (c[i + 1] == '+') {
						tt++;
					}
				}
			}

			out.println("Case #" + t + ": " + tt);
		}

		out.flush();
		out.close();
	}

}
