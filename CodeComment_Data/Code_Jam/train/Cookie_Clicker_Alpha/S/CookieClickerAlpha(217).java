package methodEmbedding.Cookie_Clicker_Alpha.S.LYD258;

import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[] arguments) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double C;
		double F;
		double X;

		for (int i = 0; i < t; i++) {
			C = sc.nextDouble();
			F = sc.nextDouble();
			X = sc.nextDouble();

			double rate = 2.0;
			double timeWithoutFarm;
			double amountWithFarm;
			double totalTime = 0;

			do {
				totalTime += C / rate;
				timeWithoutFarm = (X - C) / rate;
				rate += F;
				amountWithFarm = (rate * timeWithoutFarm);
			} while (amountWithFarm > X);

			System.out.printf("Case #%d: %.7f\n", i + 1, totalTime + timeWithoutFarm);
		}
	}
}
/*
Say you have 100 cookies, need 500. Current rate is 2 per second

400 / 2 = 200 seconds

lets say we buy a farm

say farm is 100.

100 - 100 = 0 (amount left)
new rate = 6
6 * 200 = 1200 > 500

buy a farm.
totalTime = (100/2) + (400) / 14
			= (C/Rate1) + (C/rate2) + (X-C) / (newRate) */
