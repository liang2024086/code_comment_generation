package methodEmbedding.Cookie_Clicker_Alpha.S.LYD215;


import java.util.Scanner;

public class CookieClickerAlpha {
	
	public static void main(String[] args) {
		int tests;
		double farmCost, farmRevenue, desiredCookies;
		double cookiesPerSecond;
		double solution, tempSolution;
		double secondsForNextFarm;
		double timeElapsed;

		// Read test case
		Scanner scanner = new Scanner(System.in);
	
		tests = scanner.nextInt();
		for (int cases = 1; cases <= tests; cases++) {
			farmCost = scanner.nextDouble();
			farmRevenue = scanner.nextDouble();
			desiredCookies = scanner.nextDouble();
			
			cookiesPerSecond = 2f;
			tempSolution = desiredCookies / cookiesPerSecond;
			timeElapsed = 0;
			
			do {
				solution = tempSolution;
				
				secondsForNextFarm = farmCost / cookiesPerSecond;
				timeElapsed += secondsForNextFarm;
				cookiesPerSecond += farmRevenue;
				tempSolution = timeElapsed + desiredCookies / cookiesPerSecond;
			} while (tempSolution < solution);
			
			
			System.out.println(String.format("Case #%d: %.7f", cases, solution));
		}
	}
}
