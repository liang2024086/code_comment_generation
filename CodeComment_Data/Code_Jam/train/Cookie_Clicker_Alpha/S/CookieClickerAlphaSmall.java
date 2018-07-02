package methodEmbedding.Cookie_Clicker_Alpha.S.LYD358;

import java.util.Scanner;

public class CookieClickerAlphaSmall {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int i, j, k;
		double C, F, X;
		double total, rateNow;
		int index;

		for (k = 0; k < T; k++) {
			C = scanner.nextDouble();
			F = scanner.nextDouble();
			X = scanner.nextDouble();

			total = 0;
			rateNow = 2;
			while (true) {
				if ((X - C) / rateNow <= (X) / (rateNow + F)) {
					total += (X) / rateNow;
					break;
				} else {
					total += (C / rateNow);
					rateNow += F;
				}
			}

			System.out.println("Case #" + (k + 1) + ": " + total);
		}
	}
}
