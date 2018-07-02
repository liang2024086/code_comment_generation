package methodEmbedding.Cookie_Clicker_Alpha.S.LYD128;

import java.util.*;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numCases = sc.nextInt();
		
		double C, F, X, R, T;
		
		for (int c = 1; c <= numCases; c++) {
			C = sc.nextDouble();
			F = sc.nextDouble();
			X = sc.nextDouble();
			
			R = 2.0;
			T = 0.0;
			while (R <= F * (X - C) / C) {
				T += C / R;
				R += F;
			}
			T += X / R;
			
			System.out.format("Case #%d: %.7f%n", c, T);
		}
	}
}
