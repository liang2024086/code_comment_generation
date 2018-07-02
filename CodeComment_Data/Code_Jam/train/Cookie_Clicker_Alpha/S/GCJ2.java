package methodEmbedding.Cookie_Clicker_Alpha.S.LYD646;

import java.util.*;

public class GCJ2 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		double[] c = new double[testCase];
		double[] f = new double[testCase];
		double[] x = new double[testCase];
		// input
		for (int i = 0; i < testCase; i++) {
			c[i] = scanner.nextDouble();
			f[i] = scanner.nextDouble();
			x[i] = scanner.nextDouble();
		}

		/*
		// debug
		System.out.println("testCase = " + testCase);
		for (int i = 0; i < testCase; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
			System.out.println("f[" + i + "] = " + f[i]);
			System.out.println("x[" + i + "] = " + x[i]);
		}
		*/

		for (int i = 0; i < testCase; i++) {
			double time = 0.0;
			

			if (x[i] < c[i]) {
				time = x[i] / 2;
			} else {
				for (int j = 0; j <= (x[i] / c[i]) * 2; j++) {
					double _time = 0;
					double _inc = 2;
					for (int k = 0; k < j; k++) {
						_time += c[i] / _inc;
						_inc += f[i];
					}

					_time += x[i] / _inc;

					time = time == 0 ? _time : Math.min(time, _time);
				}
			}

			System.out.printf("Case #%d: %.7f\n", (i + 1), time);
		}
	}
}
