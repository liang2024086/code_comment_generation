package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1282;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		while (sc.hasNext()) {
			int t = sc.nextInt();
			sc.nextLine();
			for (int i = 1; i <= t; i++) {
				double c = sc.nextDouble(),f = sc.nextDouble(),x = sc.nextDouble(),res = 0.0000000,count = 0.0000000,rate=2.0;
				sc.nextLine();
				while(true){
					if(x<c){
						res = x/rate;
						break;
					}
					else{
						if((x/rate)<(c/rate+x/(rate+f))){
							res = res+x/rate;
							break;
						}
						else{
							
							res  = res + c/rate;
							rate = rate + f;
						}
						}
				}
				res = Math.round(res * 10000000)/10000000.0;
				System.out.println("Case #"+i+": "+res);
			}
			
		}
	}
}
