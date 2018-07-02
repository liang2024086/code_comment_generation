package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1568;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class CookieClicker {

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length == 0) {
			System.out.println("No input file provided.");
			System.exit(1);
		}
		
		Scanner scanner = new Scanner(new File(args[0]));
		PrintWriter outputWriter = new PrintWriter(new File("output"));
		
		int t = scanner.nextInt();
		
		for (int i=1; i<=t; i++) {
			double farmCost = scanner.nextDouble();
			double farmProductionRate = scanner.nextDouble();
			double cookieGoal = scanner.nextDouble();
			
			double currentProductionRate = 2;
			double totalTime = 0;
			
			
			boolean mightNeedMoreFarms = true;
			
			while (mightNeedMoreFarms) {
				double timeToGoalWithCurrentFarms = cookieGoal / currentProductionRate;
				double timeCostToBuildAnotherFarm = farmCost / currentProductionRate;
				double productionSpeedWithAnotherFarm = currentProductionRate + farmProductionRate;
				
				double timeToGoalWithAnotherFarm = timeCostToBuildAnotherFarm + cookieGoal / productionSpeedWithAnotherFarm;
				
				if ( timeToGoalWithAnotherFarm < timeToGoalWithCurrentFarms ) {
					totalTime += timeCostToBuildAnotherFarm;
					currentProductionRate += farmProductionRate;
				}
				else {
					totalTime += timeToGoalWithCurrentFarms;
					mightNeedMoreFarms = false;
				}
			}
			
			outputWriter.println("Case #" + i + ": " + totalTime);
		}
		
		outputWriter.close();
	}

}
