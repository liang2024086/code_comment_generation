package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1400;


import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			double c = scan.nextDouble();
			double f = scan.nextDouble();
			double x = scan.nextDouble();
			double inc = 2.0;
			double base = 0.0;
			double ret = x/inc;
			
			while (true) {
				base += c/inc;
				inc += f;
				double newRet = base + x/inc; 
				if ( newRet  > ret) {
					break;
				} else {
					ret = newRet;
				}
			}
			System.out.printf("Case #%d: %.7f\n", (i+1), ret);
		}
		
		scan.close();
	}

}
