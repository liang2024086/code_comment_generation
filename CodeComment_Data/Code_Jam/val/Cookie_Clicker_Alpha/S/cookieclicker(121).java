package methodEmbedding.Cookie_Clicker_Alpha.S.LYD357;

import java.io.File;
import java.util.Scanner;


public class cookieclicker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new cookieclicker();

	}
	
	cookieclicker(){
		Scanner in = new Scanner(System.in);
		
		int loops = in.nextInt();
		for(int i = 0; i < loops; i ++){
			double C, F, X;
			C = in.nextDouble();
			F = in.nextDouble();
			X = in.nextDouble();
			
			double fCost = C, fRate = F, goal = X;
			
			double time = 0,
				   rate = 2,
				   cookies = 0,
				   cookies2goal = goal - cookies, 
				   time2goal = cookies2goal/rate;
			//int count = 0;
			while(cookies < goal){
//				count++;
//				if(count < 100)
//					System.out.println((i+1) + ": cookies = "+cookies +", goal = "+goal +", rate = "+rate);
				
				// if you will reach your goal before you can 
				// buy another factory just go for the gold
				cookies2goal = goal - cookies;
				double cookiesTillBuy = fCost - cookies;
				if(cookies2goal <= cookiesTillBuy){
					cookies += cookies2goal;
					double timeDiff = cookies2goal/rate;
					time += timeDiff;
					break;
				}
					
				// if you'll be able to buy a factory before you
				// reach your goal, determine if you should buy a factory.
				double time2ffBy = cookiesTillBuy/rate;
				time += time2ffBy;
				cookies += cookiesTillBuy;
				if(cookies >= goal){
					break;
				}
				
				// decide whether or not to buy a factory
				cookies2goal = goal - cookies;
				time2goal = cookies2goal/rate;
				
				double futureRate = rate + fRate;
				double futureCookies = cookies - fCost;
				double futureCookies2goal = goal - futureCookies; 
				double futureTime2goal = futureCookies2goal/futureRate;
				
				if(futureTime2goal < time2goal){
					//System.out.printf("Buying factory cookies = %f, rate = %f\n", cookies, rate);
					//buy
					cookies -= fCost;
					rate += fRate;
					//System.out.printf("Bought factory cookies = %f, rate = %f\n\n", cookies, rate);
				} else {
					cookies += cookies2goal;
					time += time2goal;
					break;
				}
					
				
			}
			System.out.printf("Case #%d: %f\n", (i+1), time);
			
		}
	}

}
