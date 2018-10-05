package methodEmbedding.Cookie_Clicker_Alpha.S.LYD781;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ProblemB {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("B-small-attempt0.in"));
			int numCases = scan.nextInt();
			for (int caseId = 1; caseId <= numCases; caseId++) {
			
				double cookieFarmCost = (double)scan.nextDouble();
				double farmProduction = (double)scan.nextDouble();
				double xTarget = (double)scan.nextDouble();
				
				double cookiesPerSec = 2;
				double seconds = 0;
				
				boolean continueFarmPurchases = true;
				while (continueFarmPurchases) {
					double timeToTargetNoPurch = (xTarget / cookiesPerSec);
					double timeToNextFarm = cookieFarmCost / cookiesPerSec;
					double timeToTargetPurch = (xTarget / (cookiesPerSec + farmProduction) + timeToNextFarm);
					if (timeToTargetPurch < timeToTargetNoPurch) {
						cookiesPerSec += farmProduction;
						seconds += timeToNextFarm;
					} else {
						double totalTime = (seconds + timeToTargetNoPurch);
						System.out.print("Case #" + caseId + 	": ");
						System.out.format("%.7f%n", totalTime);
						continueFarmPurchases = false;
					}
				}
				
				
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
		}
	}
}

