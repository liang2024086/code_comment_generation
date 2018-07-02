package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1550;

import java.util.Locale;
import java.util.Scanner;

public class CookieClicker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int test_cases;
		double c, f, x;
		Scanner sc = new Scanner(System.in);
		test_cases = sc.nextInt();
		for (int i = 1; i <= test_cases; i++) {
			c = sc.nextDouble();
			f = sc.nextDouble();
			x = sc.nextDouble();
			int n_farms = 0;
			double time = 0;
			while((x/(2+f*n_farms)-c/(2+f*n_farms)-x/(2+f*(n_farms+1)))>0){
				time += c/(2+f*n_farms);
				n_farms++;
			}
			time += x/(2+f*n_farms);
			//double t_rnd = Math.round(time*10000000)/10000000.0;
			System.out.printf("Case #%d: %.7f\n", i, time);
		}
	}
}
