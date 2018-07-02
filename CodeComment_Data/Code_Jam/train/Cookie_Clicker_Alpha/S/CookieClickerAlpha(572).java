package methodEmbedding.Cookie_Clicker_Alpha.S.LYD567;

import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int ca = 1; ca <= cases; ca++) {
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			double rate = 2.0;
			double timeSpent = 0;
			while ((C / rate) + (X / (rate + F)) < (X / rate)) {
				timeSpent += C / rate;
				rate += F;
			}
			System.out.printf("Case #%d: %.7f%n", ca, timeSpent + (X / rate));
		}
	}
}
