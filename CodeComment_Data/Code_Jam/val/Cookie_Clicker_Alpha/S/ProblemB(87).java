package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1247;


import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numCases = sc.nextInt();
		
		final double pi = Math.PI;
		
		for (int i = 0; i < numCases; i++)
		{
			double farmCost = sc.nextDouble();
			double cookieRateIncrease = sc.nextDouble();
			double winAmount = sc.nextDouble();
			boolean calculated = false;
			double timeTaken = 0.0;
			double cookieRate = 2.0;
			
			while (!calculated)
			{
				double timeToNextFarm = farmCost/cookieRate;
				double intialTimeToFinish = timeTaken + (winAmount/cookieRate);
				double timeToFinishWithFarm = timeTaken + (timeToNextFarm + (winAmount/(cookieRate + cookieRateIncrease)));
				if (timeToFinishWithFarm < intialTimeToFinish)
				{
					timeTaken += timeToNextFarm;
					cookieRate += cookieRateIncrease;
				}
				else
				{
					calculated = true;
					timeTaken = intialTimeToFinish;
				}
			}
			
			DecimalFormat df = new DecimalFormat(".0000000");
			
			System.out.println("Case #" + (i + 1) + ": " + df.format(timeTaken));
		}

	}

}
