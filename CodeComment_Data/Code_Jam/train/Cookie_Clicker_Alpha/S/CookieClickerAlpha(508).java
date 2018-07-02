package methodEmbedding.Cookie_Clicker_Alpha.S.LYD978;


import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int tt = 1; tt <= T; tt++) {
			double c = scan.nextDouble();
			double f = scan.nextDouble();
			double x = scan.nextDouble();
			double time = 0;
			double cookies = 0;
			int farms = 0;
			if(c >= x) {
				time  = x/2;
				cookies = x;
			}
			else {
				time = c/2;
				cookies = c;
			}
			
			while(cookies != x) {
				double _time  = (x-cookies)/(2 + farms * f);
				double _newFarm = ( x - cookies + c)/(2 + (farms +1) *f);
				if( _time > _newFarm) {
					 farms++;
					 cookies -= c;
				}
				double left = Math.min(x - cookies, c);
				cookies += left;
				time += (left / (2 + farms *f));
			}
			System.out.println("Case #"+tt+": "+time);
		}
		scan.close();
	}

}
