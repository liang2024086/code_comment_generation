package methodEmbedding.Cookie_Clicker_Alpha.S.LYD492;

import java.util.*;
import java.text.*;

public class CookieClickerAlpha{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for(int i = 1; i <= t; i++){
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			
			double v = 2;
			double result = 0;
			
			while(true){
				double r1 = x / v;
				double rTemp = c / v;
				
				v += f;
				double r2 = rTemp + x / v;
				
				if(r1 < r2){
					result += r1;
					break;
				}
				else{
					result += rTemp;
				}
			}
			
			DecimalFormat df = new DecimalFormat("#.0000000");
			System.out.println("Case #" + i + ": " + df.format(result));
		}
	}
}
