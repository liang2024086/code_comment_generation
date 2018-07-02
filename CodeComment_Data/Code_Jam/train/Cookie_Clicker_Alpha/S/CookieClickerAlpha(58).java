package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1437;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CookieClickerAlpha {
	
	private static final String SMALL_IN_FILE_NAME = "B-small-attempt0.in";
	private static final String SMALL_OUT_FILE_NAME = "B-small-attempt0.out";
	private static final String LARGE_IN_FILE_NAME = "B-large-practice.in";
	private static final String LARGE_OUT_FILE_NAME = "B-large-output.out";
	private static final Charset ENCODING = StandardCharsets.ISO_8859_1;
	
	private static final double baseProduction = 2.0;
	private static final double floatCorrection = 1e-20;

	public static void main(String[] args) {
		Scanner inScan = null;
		PrintWriter writer = null;
		int numTestCases;
		double cost;
		double farmProduction;
		double goal;
		double production;
		double totalProduced;
		double time;
		double timeToGoalNoFarm;
		double timeToGoalWithFarm;
		boolean moreFarms;

		
		// Set up the input and output:
		java.io.File unRead = new java.io.File(SMALL_IN_FILE_NAME);
		try {
			inScan = new Scanner(unRead);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			writer = new PrintWriter(SMALL_OUT_FILE_NAME);
		} catch (FileNotFoundException fnfExc) {
			fnfExc.printStackTrace();
		}
		
		// Read the input:
		numTestCases = inScan.nextInt();
	
		for (int i = 0; i < numTestCases; ++i) {
			totalProduced = 0.0;
			time = 0.0;
			production = baseProduction;
			
			inScan.nextLine();
			cost = inScan.nextDouble();
			farmProduction = inScan.nextDouble();
			goal = inScan.nextDouble();
			
			moreFarms = true;
			while (moreFarms) {
				// Decide if it's right to buy a farm. If so then wait for
				// enough cookies, and increase your production.
				timeToGoalNoFarm = goal / production;
				timeToGoalWithFarm = (cost / production)
						             + (goal / (production + farmProduction));
				
				if (timeToGoalWithFarm < timeToGoalNoFarm) {
					time += cost / production;
					production += farmProduction;
				} else {
					moreFarms = false;
				}
			}
			
			time += goal / production;
			
			writer.println("Case #" + (i + 1) + ": " + time);
		}
		
		writer.close();

	}

}
