package methodEmbedding.Counting_Sheep.S.LYD1477;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class R2016QA {

	public final static String IN_FILE = "test/R2016QA.in";
	public final static String OUT_FILE = "test/R2016QA.out";

	private static Scanner IN;

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream(IN_FILE);
		PrintWriter out = new PrintWriter(new FileWriter(OUT_FILE));
		IN = new Scanner(in);

		int T = IN.nextInt();
		IN.nextLine();
		for (int t = 1; t <= T; t++) {
			long s = IN.nextLong();

			if (s == 0) {
				out.println("Case #" + t + ": " + "INSOMNIA");
				continue;
			}

			int pp = 0;
			int[] p = new int[10];
			Arrays.fill(p, 0);

			int c = 1;
			while (true) {
				long ss = s * c;

				while (ss > 0) {
					int m = (int) (ss % 10l);
					if (p[m] == 0) {
						p[m] = 1;
						pp++;
					}

					ss /= 10;
				}

				if (pp >= 10)
					break;

				c++;
			}

			out.println("Case #" + t + ": " + (s * c));
		}

		out.flush();
		out.close();
	}

}
