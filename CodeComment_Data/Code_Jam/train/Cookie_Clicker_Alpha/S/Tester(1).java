package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1317;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tester {

	public static void main(String[] args) {
		
		/*
		 *  After getting enough cookies to buy another farm,
		 *  it's a decision problem -- either you buy another farm or your don't.
		 *  Calculate how much time you would need to get to the target in both situations.
		 *  Go with whichever one is better (Greedy).
		 *  
		 *  If at any point, the better decision is to not buy another farm, then tack on the remaining time
		 *  
		 *  If it is a better decision to buy another farm, you would always do it as soon as possible
		 *  
		 */
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
 
			String inputFileName = "B-small-attempt0.in";
			
			/*
			 * Set up the output file
			 */
			File file = new File(inputFileName + "-results.out");
			 
			// If file doesn't exist, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			
			String sCurrentLine;
			br = new BufferedReader(new FileReader(inputFileName) );
			
			/*
			 * Read in the first initial parameters
			 */
			// Number of cases
			int numCases = Integer.parseInt( br.readLine() );
			
			/*
			 * Read input in a loop based on initial parameters
			 */
			for (int i = 0; i < numCases; i++) {
				
				int caseNum = i + 1;
				//System.out.println(caseNum);
				
				// Read in the case parameters
				sCurrentLine = br.readLine();
				String[] params = sCurrentLine.split("\\s+");
				double C = Double.parseDouble(params[0]);
				double F = Double.parseDouble(params[1]);
				double X = Double.parseDouble(params[2]);
				
				double totalTime = 0;
				double totalCookies = 0;
				boolean farmsStillWorthIt = true;
				double baseRate = 2;
				
				// While you still have more cookies to earn
				while (totalCookies != X) {
					
					//System.out.println("=====New round====");
					
					if (X-totalCookies <= C) {
						// You don't have enough space to get enough cookies to get another farm
						totalTime += (X - totalCookies) / baseRate;
						totalCookies = X;
						//System.out.println("You don't have enough space to get enough cookies to get another farm.");
					} else if (!farmsStillWorthIt) {
						// Farms aren't worth it anymore
						totalTime += (X - totalCookies) / baseRate;
						totalCookies = X;
						//System.out.println("Farms aren't worth it anymore");
					} else {
						// You have enough space to get cookies for another farm
						// and farms might still be worth it
						
						// Add the time until you get you need to make your decision
						totalTime += C / baseRate;
						totalCookies += C;
						//System.out.println("Decision: " + totalCookies);
						
						double timeToCompleteWithFarm = (X - totalCookies + C) / (baseRate + F); 
						double timeToCompleteNoFarm = (X - totalCookies) / baseRate;
						
						//System.out.println("totalTime: " + totalTime);
						//System.out.println("totalCookies: " + totalCookies);
						//System.out.println("Should you get a farm? Farm: " + timeToCompleteWithFarm + ", No Farm: " + timeToCompleteNoFarm);
						
						if (timeToCompleteNoFarm < timeToCompleteWithFarm) {
							//System.out.println("Don't get a farm");
							farmsStillWorthIt = false;
						} else {
							//System.out.println("Got a farm!");
							totalCookies -= C;
							baseRate += F;
							//System.out.println("totalTime: " + totalTime);
							//System.out.println("totalCookies: " + totalCookies);
							//System.out.println("new base rate: " + baseRate);
						}
					}
					
				}
				double roundedTotalTime = (double) Math.round(totalTime * 10000000) / 10000000;
				
				bw.write("Case #" + caseNum + ": " + roundedTotalTime);
				bw.write("\n");
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (bw != null) bw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}


	}
	
}
