package methodEmbedding.Cookie_Clicker_Alpha.S.LYD50;


import java.util.Scanner;

public class CookieClikerAlpha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();

		for (int cs = 1; cs <= cases; cs++) {
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();

			double rate = 2.0;
			double time = 0.0;

			while ((x - c)*(rate + f) > x * rate) {
				time += c/rate;
				rate += f;
			}
			
			time += x/rate;
			System.out.printf("Case #" + cs + ": %.7f\n",time);
		}
	}
}
