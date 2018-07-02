package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1115;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.text.*;

public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int T = sc.nextInt();
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("########0.0000000", dfs);
		double C, F, X, totsec, cursec, nextsec, curprod, futprod;
		
		for (int t = 1; t <= T; t++) {
			C = sc.nextDouble();
			F = sc.nextDouble();
			X = sc.nextDouble();
			totsec = 0;
			curprod = 2;
			cursec = X / curprod;
			nextsec = (C / curprod) + (X / (curprod + F));

			while (cursec > nextsec) {
				totsec += C / curprod;
				curprod = curprod + F;
				cursec = X / curprod;				
				nextsec = (C / curprod) + (X / (curprod + F));
			}
			
			totsec += X / curprod;
			
			System.out.println("Case #" + t + ": " + df.format(totsec));;
		}
	}

}
