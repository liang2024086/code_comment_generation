package methodEmbedding.Cookie_Clicker_Alpha.S.LYD549;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		double c, f, x = 1;
		double t, tNext, sn;
		int a = 2, n;
		int numTestCase;
		DecimalFormat format = new DecimalFormat("0.0000000");
	
		Scanner s = new Scanner(System.in);			
		numTestCase = s.nextInt();
		
		for (int tc = 0; tc < numTestCase; tc++){
			c = s.nextDouble();
			f = s.nextDouble();
			x = s.nextDouble();

			t = x / a;
			tNext = x / (a + f) + c / a;
			n = 1;
			sn = c / a;
			while (t > tNext){
				t = tNext;
				n++;
				sn += c / (a + f * (n - 1));
				tNext = x / (a + f * n) + sn;	
			}
			
			System.out.println("Case #" + (tc + 1) + ": " + 
					           format.format(t));
						
		
		
		} // end of each test case
		
	}

}
