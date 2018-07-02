package methodEmbedding.Cookie_Clicker_Alpha.S.LYD732;

import java.util.*;

class CookieClicker{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int caseno=1; caseno <= T;caseno++){
			double C = sc.nextFloat();
			double F = sc.nextFloat();
			double X = sc.nextFloat();

			double rCurProd = 2.0;
			double sCurCookies = 0.0;
			double sTotalTime = 0.0;

			while (true){
				//decide the time u can buy next farm
				double tNextFarm = (C-sCurCookies)/rCurProd;
				
				double tCurNoBuy = (X-sCurCookies)/rCurProd;

				if (tNextFarm > 0 && tNextFarm > tCurNoBuy){
					sTotalTime += tCurNoBuy;
					//System.out.println("tCurNoBuy: " + tCurNoBuy);
					break;
				}

				if (tNextFarm < 0){
					tNextFarm = 0;
				}
				
				//decide if u should really buy it
				//first get total cookie count when u buy the farm
				//then get the rate if u buy the farm at all
				double sFarmCookies = sCurCookies + (tNextFarm * rCurProd);
				double rFarmProd = rCurProd + F;
				//calculate time taken to have X cookies when farm not bought
				double tNoBuy = (X - sFarmCookies)/rCurProd;
				//calculate time taken to have X cookies when farm is bought
				double tBuy = (X+C-sFarmCookies)/rFarmProd;

				if (tBuy > tNoBuy){
					sTotalTime += tNoBuy + tNextFarm;
					break;	
				}
				else {
					//now u have bought the farm
					//update total time, current cookies count and rate
					sTotalTime += tNextFarm;
					sCurCookies = sFarmCookies - C;
					rCurProd = rFarmProd;
					//System.out.println("sTotalTime: " + sTotalTime + "sCurCookies: " + sCurCookies + "rCurProd: " + rCurProd);
				}
			}

			double roundOffAns = (double) Math.round(sTotalTime * 10000000)/10000000;
			System.out.printf("Case #"+caseno+": %.7f\n", roundOffAns);


		}
	}
}
