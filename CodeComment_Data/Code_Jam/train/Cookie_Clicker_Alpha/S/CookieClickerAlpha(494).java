package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1237;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;


public class CookieClickerAlpha {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		StringTokenizer sz = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(sz.nextToken());
		for(int caseNum = 1; caseNum <= t; caseNum++) {
			sz = new StringTokenizer(br.readLine());
			double C = Double.parseDouble(sz.nextToken());
			double F = Double.parseDouble(sz.nextToken());
			double X = Double.parseDouble(sz.nextToken());
			double totalTimeTaken = 0;
			double currRate = 2;
			
			double bestTimeToX = X / currRate; // time taken without buying any farm
			
			while(true) {
				totalTimeTaken += C / currRate; // buy a farm
				currRate += F; // increment the currRate
				
				double nextBestTimeToX = totalTimeTaken + (X / currRate);
				
				if(nextBestTimeToX < bestTimeToX) { // check if its worthwhile to buy a farm
					// update the bestTime and check if we can further improve the time
					// by continuing the while loop
					bestTimeToX = nextBestTimeToX;
				}
				else { // there is no point in buying a farm
					// answer is the best Time to X
					break;
				}
				
			}
			
			result.append(String.format("Case #%d: %.7f\n", caseNum, bestTimeToX));
		}
		System.out.print(result);
	}
}
