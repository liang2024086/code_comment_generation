package methodEmbedding.Cookie_Clicker_Alpha.S.LYD506;

import java.util.Locale;
import java.util.Scanner;


public class Cookies {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.UK);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			double c = sc.nextDouble(), f = sc.nextDouble(), x = sc.nextDouble(), r = 2.0;
			
			double totalTime = 0d;
			
			double tx = x/r;
			double tc = (c/r)+(x/(r+f));
			
			while (tx > tc) {
				totalTime += (c/r);
				r += f;
				tx = x/r;
				tc = (c/r)+(x/(r+f));
			} 
			totalTime += tx;
			
			System.out.println(String.format("Case #%d: %.7f", i, totalTime));
			
			
		}
	}

}
