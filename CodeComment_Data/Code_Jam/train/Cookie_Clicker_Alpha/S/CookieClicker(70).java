package methodEmbedding.Cookie_Clicker_Alpha.S.LYD88;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class CookieClicker {
	private static final boolean DEBUG = false;
	private static final String FILENAME = "cookie_clicker";

	public static void main(String[] args) throws IOException {
		long startTime = System.nanoTime();

		if(DEBUG) {
			System.setIn(new BufferedInputStream(new FileInputStream(FILENAME + "_example.in")));
		} else {
			System.setIn(new BufferedInputStream(new FileInputStream(FILENAME + ".in")));
			System.setOut(new PrintStream(FILENAME + ".out"));
		}

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int numTestCases = sc.nextInt();
		for(int caseNum = 1; caseNum <= numTestCases; caseNum++) {
			double farmCost = sc.nextDouble();
			double farmRate = sc.nextDouble();
			double goal = sc.nextDouble();
			
			double currentRate = 2;
			double currentCookies = 0;
			double timePassed = 0;
			
			while(currentCookies < goal) {
				double timeToGoal = (goal - currentCookies) / currentRate;
				double timeToGoalWithFarm = (farmCost - currentCookies) / currentRate;
				timeToGoalWithFarm += goal / (currentRate + farmRate);
				
				if(timeToGoalWithFarm < timeToGoal) {
					currentCookies = 0;
					timePassed += (farmCost - currentCookies) / currentRate;
					currentRate += farmRate;
				} else {
					timePassed += (goal - currentCookies) / currentRate;
					break;
				}
			}

			System.out.println("Case #" + caseNum + ": " + timePassed);
		}

		if(DEBUG) System.out.println("Total time: " + ((System.nanoTime() - startTime) / 1000.0 / 1000.0 / 1000.0) + "s");
	}
}
