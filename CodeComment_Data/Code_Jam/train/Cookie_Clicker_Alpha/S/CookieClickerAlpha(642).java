package methodEmbedding.Cookie_Clicker_Alpha.S.LYD354;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

 class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0;
		double c, f, x, rate, t1, t2, a1, a2;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			c = Double.parseDouble(temp.nextToken());
			f = Double.parseDouble(temp.nextToken());
			x = Double.parseDouble(temp.nextToken());

			rate = 2;
			t1 = t2 = 0;

			a1 = c / rate;
			t1 = x / rate;
			t2 = a1 + x / (rate + f);
			while (true) {

				if (t1 <= t2)
					break;
				else {
					rate += f;
					t1 = t2;
					a1 = c / rate;
					t2 = t2 - x / rate + a1 + x / (rate + f);
				}
			}
			pw.println("Case #" + (i + 1) + ": " + t1);
		}
		pw.flush();
	}
}
