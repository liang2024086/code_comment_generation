package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1626;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class CookieClickerAlpha {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("src/in.txt"));
		PrintWriter out = new PrintWriter("out.txt");

		int t = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= t; tc++) {
			String[] split = in.readLine().split(" ");

			double c = Double.parseDouble(split[0]);
			double f = Double.parseDouble(split[1]);
			double x = Double.parseDouble(split[2]);

			double cookies = 0;
			double r = 2.0;

			double minSec = 0.0;
			while (cookies < x) {
				// seconds to finish game without a new factory
				double secTillEnd = (x - cookies) / r;

				// seconds to wait until we can afford a new factory
				double secToBuyFactory = (c - cookies) / r;
				// seconds to finish game after buying new factory
				double secWithFactoryTillEnd = x / (r + f);

				if (Double.compare(secToBuyFactory + secWithFactoryTillEnd, secTillEnd) < 0) {
					minSec += secToBuyFactory;
					r = r + f;
				} else {
					minSec += secTillEnd;
					cookies = x;
				}
			}

			DecimalFormat df = new DecimalFormat("0.0000000");
			out.println("Case #" + tc + ": " + df.format(minSec));
		}

		in.close();
		out.close();
	}
}
