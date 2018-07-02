package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1156;


import java.io.*;
import java.util.*;

public class CookieClickerAlpha {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("D:\\workspace\\Topcoder\\src\\CookieClickerAlpha\\A-small.in"));  
		FileWriter out = new FileWriter("D:\\workspace\\Topcoder\\src\\CookieClickerAlpha\\A-small.out");  
//		Scanner in = new Scanner(new File("D:\\workspace\\Topcoder\\src\\CookieClickerAlpha\\A-large-practice.in"));  
//		FileWriter out = new FileWriter("D:\\workspace\\Topcoder\\src\\CookieClickerAlpha\\A-large-practice.out");
		
		int T = in.nextInt();
		
		for (int cases = 1; cases <= T; cases++) {
			//read file
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			// solve
			double result = 0;
			double rate = 2;
			
			while (true) {
				double secondsIfStopBuyFarm = X / rate;
				double secondsForBuyThisFarm = (C / rate);
				double secondsIfBuyThisFarmThenStop = secondsForBuyThisFarm + (X / (rate + F));
				
				if (secondsIfStopBuyFarm < secondsIfBuyThisFarmThenStop) {
					result += secondsIfStopBuyFarm;
					break;
				}
				else {
					result += secondsForBuyThisFarm;
					rate += F;
				}
			}
			
			out.write("Case #" + cases + ": " + result + "\n");
		}
		in.close();
        out.flush();
        out.close();
	}
}
