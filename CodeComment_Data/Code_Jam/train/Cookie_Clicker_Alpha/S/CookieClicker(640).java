package methodEmbedding.Cookie_Clicker_Alpha.S.LYD246;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Henry Bullingham
 * @version 11 April 2014
 */
public class CookieClicker
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner keyboard = new Scanner(System.in);
		PrintWriter outFile = new PrintWriter(new File("cookieclicker.out"));

		int numberOfTestCases = keyboard.nextInt();

		for (int testCase = 1; testCase <= numberOfTestCases; testCase++)
		{
			double farmCost = keyboard.nextDouble();
			double cookiesPerSecondPerFarm = keyboard.nextDouble();
			double cookiesNeededToWin = keyboard.nextDouble();
			double cookiesPerSecond = 2;

			double maxTimeToWin = cookiesNeededToWin / cookiesPerSecond;

			double timeUsed = 0;
			double timeNeeded = 0;
			double timeToNextFarm = farmCost / cookiesPerSecond;
			double currentTimeToWin = maxTimeToWin;

			do
			{
				timeUsed += timeToNextFarm;
				cookiesPerSecond += cookiesPerSecondPerFarm;
				timeNeeded = cookiesNeededToWin / cookiesPerSecond;
				currentTimeToWin = timeUsed + timeNeeded;
				if (currentTimeToWin < maxTimeToWin)
					maxTimeToWin = currentTimeToWin;
				timeToNextFarm = farmCost / cookiesPerSecond;
			}
			while (currentTimeToWin <= maxTimeToWin);

			outFile.println("Case #" + testCase + ": " + maxTimeToWin);
		}

		keyboard.close();
		outFile.close();
	}

}
