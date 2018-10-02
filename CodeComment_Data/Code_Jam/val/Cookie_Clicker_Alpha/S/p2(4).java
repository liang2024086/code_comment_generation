package methodEmbedding.Cookie_Clicker_Alpha.S.LYD478;

import java.io.*;
import java.util.Scanner;

public class p2 {
	public static void main(String [] args) {
		try {
			Scanner sc = new Scanner(new File("p2.in"));
			PrintWriter writer = new PrintWriter("p2.out", "UTF-8");
			int tests = sc.nextInt();
			double winCookies, farmCost, farmRate, timeToFarm, cookieRate, timeToWin, timeWithFarm, timeNow;
			for (int testnum = 0; testnum < tests; testnum++) {
				timeNow = 0;
				cookieRate = 2.0;
				farmCost = sc.nextDouble();
				farmRate = sc.nextDouble();
				winCookies = sc.nextDouble();
				timeToFarm = farmCost / cookieRate;
				timeToWin = winCookies / cookieRate;
				timeWithFarm = timeToFarm + (winCookies / (cookieRate + farmRate));
				while (timeToWin > timeWithFarm) {
					timeNow += timeToFarm;
					cookieRate += farmRate;
					timeToFarm = farmCost / cookieRate;
					timeToWin = winCookies / cookieRate;
					timeWithFarm = timeToFarm + (winCookies / (cookieRate + farmRate));
				}
				System.out.printf("Case #%d: %f\n", testnum + 1, timeNow + timeToWin);
				writer.printf("Case #%d: %f\n", testnum + 1, timeNow + timeToWin);
				
				
			}
			
			writer.close();
			sc.close();
		} catch (IOException e) {
			System.err.println("File error!\n");
		}
	}
}
