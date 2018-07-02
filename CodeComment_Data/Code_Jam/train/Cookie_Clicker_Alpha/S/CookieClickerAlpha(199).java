package methodEmbedding.Cookie_Clicker_Alpha.S.LYD624;

import java.util.Scanner;


public class CookieClickerAlpha {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int trials = s.nextInt();
		for (int i =1; i <= trials; i++){
			double c = s.nextDouble();
			double f = s.nextDouble();
			double x = s.nextDouble();
			double rate = 2;
			double seconds = 0;
			boolean profit = true;
			double	farmN = 0;
			double farmN1 = 0;
			if (x/rate < c/rate+x/(rate+f)){
				seconds = x/rate;
				}
			else {
				while (profit){
					seconds += c/rate;
					farmN = x/(rate+f) + seconds;
					seconds += c/(rate+f);
					farmN1 = x/(rate+2*f) +seconds;
					seconds -= c/(rate+f);
	
					if (farmN1 > farmN){
						profit = false;
					}
					else{
						rate +=f;
					}
	
				}
				seconds = farmN;
			}
			System.out.println("Case #"+i +": "+ seconds);

		}
	}
}
/*while ((int) (cookies) <= (int) (x)){ 
	if (((x-cookies)/rate) > ((x-cookies)/(rate+f)+c*rate)){
		seconds += c/rate;
		System.out.println("if seconds" + seconds);
		cookies = seconds*rate;
		System.out.println("if cookies" + cookies);
		rate+=f;
		cookies = 0;
	}
	else{
		seconds += (x-cookies)/rate;
		
	}
	cookies += rate*seconds;
	System.out.println("last cookies" + cookies);
	
}*/
