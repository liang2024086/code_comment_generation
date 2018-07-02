package methodEmbedding.Cookie_Clicker_Alpha.S.LYD833;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			double C = sc.nextDouble(), F = sc.nextDouble(), X = sc
					.nextDouble();
			double min = Integer.MAX_VALUE;
			for (int j = 0;; j++) {
				double sum = X / (2 + j * F);
				for (int k = 0; k < j; k++) {
					sum += C / (2 + k * F);
				}
				if (sum < min) {
					min = sum;
				} else {
					break;
				}
			}
			System.out.printf("Case #%d: %.7f\n", i, min);
		}
		sc.close();
	}
}
