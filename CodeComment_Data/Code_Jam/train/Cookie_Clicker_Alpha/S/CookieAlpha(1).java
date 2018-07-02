package methodEmbedding.Cookie_Clicker_Alpha.S.LYD630;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CookieAlpha {
	static String fileIn = "cookie.txt";
	static String fileOut = "cookieOut.txt";

	public static void main(String[] args) throws IOException{

		if (args.length >= 1) fileIn = args[0];
		
		Scanner inFile = new Scanner(new FileReader(fileIn));
		Scanner line;
		
		FileWriter outFile = new FileWriter(fileOut);
		
		String topLine = inFile.nextLine(); //Ignore Top Line
		int numCases = Integer.parseInt(topLine);
		
		for (int caseNo=1; caseNo-1 < numCases; caseNo++) {
			
			line = new Scanner(inFile.nextLine());
			
			/** Cost of a farm */
			double CostOfFarm = line.nextDouble();
			/** Production Rate of a Farm */
			double FarmProductionRate = line.nextDouble();
			/** Max Cookies Required */
			double XTarget = line.nextDouble();
			
			double startCookieRate = 2;
			double timeElapsed = 0;
			
			if(XTarget < CostOfFarm){
				timeElapsed = XTarget/startCookieRate;
				System.out.println("Easy case!");
				System.out.println();
			} else{
				
				// Predict the number of purchases in O(1)
				long numPurchases =
						(long) Math.floor((FarmProductionRate*(XTarget-CostOfFarm) - startCookieRate*CostOfFarm)
						/ (FarmProductionRate * CostOfFarm)) -1; // Minus 1 for off by 1 error.... 
				

				
				double currentCookieRate = startCookieRate + numPurchases*FarmProductionRate;
				
//				System.out.println("#"+caseNo+": ("+CostOfFarm+","+FarmProductionRate+","+XTarget+")");
//				System.out.println("NumPur Predicted: "+numPurchases);
//				System.out.println("We will be at rate :"+thatRate);
//				System.out.println("Time without purchase  = "+ (XTarget/currentCookieRate));
//				System.out.println("Time with purchase     = "+ (CostOfFarm/currentCookieRate + XTarget/(currentCookieRate+FarmProductionRate)) );
//				System.out.println("Time without 2 purchase= "+ (XTarget/(currentCookieRate+FarmProductionRate)));
//				System.out.println("Time with 2 purchase   = "+ (CostOfFarm/(currentCookieRate+FarmProductionRate) + XTarget/(currentCookieRate+2*FarmProductionRate)) );
//				System.out.println();
				
				// Debug out
				numPurchases =0;
				currentCookieRate = startCookieRate + numPurchases*FarmProductionRate;
				
				while( (XTarget/currentCookieRate) > (CostOfFarm/currentCookieRate + XTarget/(currentCookieRate+FarmProductionRate)) ){
					numPurchases ++;
					currentCookieRate = startCookieRate + numPurchases*FarmProductionRate;
				}
				
				
				// Calculate time to purchase all and then wait it out
				
				double purchaseTime = 0;
				
				
				//Silly check method
				for (int p=0; p<numPurchases; p++){
					purchaseTime += 1/(startCookieRate + p*FarmProductionRate);
				}
				purchaseTime *= CostOfFarm;
				
				timeElapsed = XTarget/currentCookieRate + purchaseTime;
				
			}
			
			
			
		

		outFile.write("Case #"+caseNo+": "+timeElapsed+'\n');
		
		}
		
		outFile.close();
		inFile.close();
		System.out.println("Done!");
	}
	
}
