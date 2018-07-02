package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1260;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q2
{
	public static void main(String[] args) throws IOException
	{
		File input = new File("CodeJamInput.in");
		File output = new File("CodeJamOutput.txt");
		FileWriter writer = new FileWriter(output);
		Scanner scan = new Scanner(input);
		
		
		int testCases = scan.nextInt();
		double farmCost;
		double farmReturn;
		double goal;
		double seconds;
		double cookieRate;
		boolean notDone;
		double secondsAsIs;
		double secondsUpgrade;
		for (int i = 1; i <= testCases; i++)
		{
			farmCost = scan.nextDouble();
			farmReturn = scan.nextDouble();
			goal = scan.nextDouble();
			seconds = 0;
			cookieRate = 2.0;
			notDone = true;
			
			//if (goal<=farmCost) seconds = goal/cookieRate;
			while (notDone)
			{
				secondsAsIs = goal/cookieRate;
				secondsUpgrade = (farmCost/cookieRate) + (goal/(cookieRate+farmReturn));
				if (secondsAsIs<secondsUpgrade)
				{
					seconds += secondsAsIs;
					notDone = false;
				}
				else
				{
					seconds += (farmCost/cookieRate);
					cookieRate += farmReturn;
				}
			}
			writer.write("Case #" + i + ": " + seconds + "\n");
		}
		
		
		scan.close();		
		writer.close();
		System.out.println("Done");
	}
}
