package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1529;

import java.io.*;
import java.util.*;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;
		double C, F, X;
		T = Integer.parseInt(scan.nextLine());
		String[] res = new String[T];

		for (int ti = 0; ti < T; ti++) {
			C = scan.nextDouble();
			F = scan.nextDouble();
			X = scan.nextDouble();

			double totTime = 0d;
			double eps = 2d;

			while (true) {
				double cost0 = X / eps;
				double cost1 = (C / eps) + (X / (eps + F));

				if (cost0 <= cost1) {
					totTime += cost0;
					break;
				}
				double cost2 = (C / eps); 
				totTime += cost2;
				eps += F;
			}
			res[ti] = ("Case #" + (ti + 1) + ": " + totTime);
		}
		for (String item : res) System.out.println(item);
	}
}
