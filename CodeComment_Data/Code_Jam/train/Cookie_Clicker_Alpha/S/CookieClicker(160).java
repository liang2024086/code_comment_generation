package methodEmbedding.Cookie_Clicker_Alpha.S.LYD919;

import java.util.Scanner;

public class CookieClicker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numCases = scanner.nextInt();
		for (int i = 0; i < numCases; i++) {
			String prefix = "Case #" + (i + 1) + ": ";
			double c = scanner.nextDouble();
			double f = scanner.nextDouble();
			double x = scanner.nextDouble();

			boolean gotWorse = false;
			double curBest = x / 2;
			int j = 1;
			while (!gotWorse) {
				double jTime = 0;
				for (int k = 0; k < j; k++)
					jTime += 1.0 / (2 + k * f);
				jTime = c * jTime + x / (2 + j * f);
				if (jTime <= curBest) {
					curBest = jTime;
					j++;
				} else
					gotWorse = true;
			}

			System.out.println(prefix + curBest);
		}
	}
}
