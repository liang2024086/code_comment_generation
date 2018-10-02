package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1027;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class p2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int tc = sc.nextInt();
		for (int it = 1; it <= tc; it++) {
			double c = sc.nextDouble(), f = sc.nextDouble(), x = sc
					.nextDouble();
			double[] sum = new double[1000000];

			sum[0] = 0;
			sum[1] = c / 2;
			for (int i = 2; i < sum.length; i++) {
				sum[i] = sum[i - 1] + c / (2 + (i - 1) * f);
			}

			double min = Long.MAX_VALUE;
			for (int i = 0; i < sum.length; i++) {
				double v = x / (2 + i * f);
				min = Math.min(min, sum[i] + v);
			}
			System.out.printf("Case #%d: %.6f\n", it, min);
		}
		sc.close();
	}
}
