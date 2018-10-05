package methodEmbedding.Cookie_Clicker_Alpha.S.LYD588;

import java.util.Scanner;

/**
 * 
 * @author Adedayo Ominiyi
 */
public class ProgB {

	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int numberOfInputs = Integer.parseInt(sc.nextLine());
			
			for (int i = 0; i < numberOfInputs; i++) {
				String lineString = sc.nextLine();
				String[] lineStringArray = lineString.split(" ");
				double buyingCookieAmount = Double.valueOf(lineStringArray[0]);
				double incrementCookieRateAmount = Double.valueOf(lineStringArray[1]);
				double winningCookieAmount = Double.valueOf(lineStringArray[2]);
				
				double currentCookieRate = 2.0;
				double shortestTime = 0.0;
				
				while (true) {
					double straightToGoalTime = winningCookieAmount / currentCookieRate;
					double buyingCookieFarmTime = buyingCookieAmount / currentCookieRate;
					
					double nextLevelTime = winningCookieAmount / (currentCookieRate + incrementCookieRateAmount);
					if ((nextLevelTime + buyingCookieFarmTime) < straightToGoalTime) {
						shortestTime = shortestTime + buyingCookieFarmTime;
						currentCookieRate = currentCookieRate + incrementCookieRateAmount;
					} else {
						shortestTime = shortestTime + straightToGoalTime;
						break;
					}
				}
				
				System.out.println(String.format("Case #%d: %.7f", (i + 1), shortestTime));
			}
		}
	}
}
