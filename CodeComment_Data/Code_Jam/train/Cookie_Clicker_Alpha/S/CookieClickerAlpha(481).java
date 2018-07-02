package methodEmbedding.Cookie_Clicker_Alpha.S.LYD502;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(
				"B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"B-small-attempt0.out")));

		int t = Integer.parseInt(in.readLine());
		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			double c = Double.parseDouble(st.nextToken());
			double f = Double.parseDouble(st.nextToken());
			double x = Double.parseDouble(st.nextToken());
			double r = 2.0;

			double time = 0.0;
			while (true) {
				double t1 = x / r;
				double t2 = c / r + x / (r + f);

				if (t1 < t2) {
					time += t1;
					break;
				}
				time += c / r;
				r += f;
			}

			out.printf("Case #" + i + ": %.7f%n", time);
		}
		
		in.close();
		out.close();
		System.exit(0);
	}

}
