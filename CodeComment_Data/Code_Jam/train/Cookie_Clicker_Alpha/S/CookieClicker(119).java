package methodEmbedding.Cookie_Clicker_Alpha.S.LYD512;

import java.util.Scanner;


public class CookieClicker {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int caseNum = 1; caseNum <= t; caseNum++) {
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			
			double curRate = 2;
			double time = 0;
			while (true) {
				double tCurrent = x / curRate;
				double tToFarm = c / curRate;
				double tFarm = tToFarm + x / (curRate + f);
				if (tCurrent > tFarm) {
					// Get a farm and loop.
					curRate += f;
					time += tToFarm;
				}
				else {
					// Go for the target.
					time += tCurrent;
					break;
				}
			}
			
			System.out.println(String.format("Case #%d: %.7f", caseNum, time));
		}
	}
}
