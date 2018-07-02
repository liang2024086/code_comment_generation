package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1623;

import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = Integer.valueOf(in.nextLine());

		for (int cazz = 1; cazz <= T; cazz++) {
			String newLine = in.nextLine();

			String[] values = newLine.split(" ");

			double c = Double.valueOf(values[0]);
			double f = Double.valueOf(values[1]);
			double x = Double.valueOf(values[2]);

			double answer = x / 2;
			int farm = 0;

			boolean lower = true;

			while (lower) {

				double t1 = 0;

				double r1 = 2L;
				for (int i = 0; i < farm; i++) {
					t1 += c / r1;
					r1 += f;
				}
				double tt1 = t1;
				t1 += x / r1;

				double t2 = tt1 + c / r1 + x / (r1 + f);

				if (t1 < t2) {
					lower = false;
					answer = t1;
				} else {
					farm++;
				}
			}

			System.out.println("Case #" + cazz + ": " + answer);

		}
	}
}
