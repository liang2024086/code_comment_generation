package methodEmbedding.Cookie_Clicker_Alpha.S.LYD187;

import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.io.FileOutputStream;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(new FileReader("input.txt"));
			PrintStream outFile = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(outFile);
			int numTestCases = inFile.nextInt();

			for (int k = 1; k < numTestCases + 1; k++) {
				double costOfFarm = inFile.nextDouble();
				double farmProduction = inFile.nextDouble();
				double cookiesToWin = inFile.nextDouble();

				double currentCookieProduction = 2.0;
				double timeElapsed = 0;

				double timeToWinWithoutFarm = cookiesToWin/currentCookieProduction;
				double timeToWinWithFarm = costOfFarm/currentCookieProduction + cookiesToWin/(currentCookieProduction + farmProduction);

				while (timeToWinWithFarm <= timeToWinWithoutFarm) {
					timeElapsed += costOfFarm/currentCookieProduction;
					currentCookieProduction += farmProduction;
					timeToWinWithoutFarm = cookiesToWin/currentCookieProduction;
					timeToWinWithFarm = costOfFarm/currentCookieProduction + cookiesToWin/(currentCookieProduction + farmProduction);
				}

				timeElapsed += timeToWinWithoutFarm;
		
				System.out.println ("Case #" + k + ": " + timeElapsed);

			}//end outerloop
		} catch (Exception e) {

		}

	}//end main
}//end class
