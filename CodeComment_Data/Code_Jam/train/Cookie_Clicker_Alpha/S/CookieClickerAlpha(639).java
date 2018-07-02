package methodEmbedding.Cookie_Clicker_Alpha.S.LYD633;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class CookieClickerAlpha {
	public static void main(String[]args) throws Exception {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new FileWriter("CookieClicker.out"));
		
		int t = in.nextInt();
		
		for(int i = 0; i < t; i++) {
			double min = Double.MAX_VALUE;
			double cookieCost = in.nextDouble();
			double addCookies = in.nextDouble();
			double totalCost = in.nextDouble();
			
			for(int j = 0; ;j++) {
				double curPerSec = 2.0;
				double time = 0;
				
				for(int k = 0; k < j; k++) {
					time += cookieCost / curPerSec;
					curPerSec += addCookies;
				}
				
				time += totalCost / curPerSec;
				
				if(time < min)
					min = time;
				else
					break;
			}
			
			out.printf("Case #%d: %.7f\n", (i+1), min);
		}
		
		in.close();
		out.close();
	}
}
