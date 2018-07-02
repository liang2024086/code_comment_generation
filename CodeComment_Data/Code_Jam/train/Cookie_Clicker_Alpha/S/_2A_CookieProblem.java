package methodEmbedding.Cookie_Clicker_Alpha.S.LYD291;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _2A_CookieProblem {

	private final static String CASE_STRING = "Case #%s: %s";
	private final static double COOKIES_PER_SECOND = 2;
	
	private static int testCaseNo = 0;
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Test Cases
		int noTestCases = Integer.parseInt(br.readLine());
		String[] results = new String[noTestCases];
		while (noTestCases > 0 && testCaseNo++ < noTestCases) {
			double noOfCookies = 0;
			double cookiesPerSecond = COOKIES_PER_SECOND;
			double time = 0;
			
			String[] cfx = br.readLine().trim().split(" ");
			double C = Double.parseDouble(cfx[0]);
			double F = Double.parseDouble(cfx[1]);
			double X = Double.parseDouble(cfx[2]);
			if (X <= C) {
				// Gain cookies to win
				noOfCookies += X;
				time += X / cookiesPerSecond;
			}
			else {
				while (noOfCookies < X) {
//					double cookiesToWin = X - noOfCookies;
					double toWinSeconds = X / cookiesPerSecond; //cookiesToWin / cookiesPerSecond;
					// IF farm bought
					// double cookiesIfFarmBought = 0; //noOfCookies - C;
					// double cookiesToWinIfFarmBought = X; //X - cookiesIfFarmBought;
					double cookiesPerSecondIfFarmBought = cookiesPerSecond + F;
					double toWinSecondsIfFarmBought = X / cookiesPerSecondIfFarmBought; //cookiesToWinIfFarmBought / cookiesPerSecondIfFarmBought;
					double toBuyFarmSeconds = C / cookiesPerSecond;
					if (toWinSeconds < (toBuyFarmSeconds + toWinSecondsIfFarmBought)) {
						// Wait till win
						noOfCookies = X;
						time += toWinSeconds;
					}
					else {
						// Wait to gain cookies
						//						noOfCookies += C;
						time += C / cookiesPerSecond;
						//						noOfCookies -= C;
						// Buy Farm
						cookiesPerSecond = cookiesPerSecondIfFarmBought;
					}
				}
			}
			String result = String.valueOf(time);
			results[testCaseNo - 1] = String.format(CASE_STRING, testCaseNo, result);
		}
		// Results
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}
	
	
}
