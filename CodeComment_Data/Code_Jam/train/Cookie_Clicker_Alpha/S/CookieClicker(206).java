package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1484;

import java.util.*;
import java.io.*;

public class CookieClicker{
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "B-small-attempt0"; //"B-small-attempt0";
		@SuppressWarnings("resource")
		Scanner input = new Scanner(new File(filename + ".in"));
		@SuppressWarnings("resource")
		PrintStream out = new PrintStream(new File(filename + "Out.txt"));
		
		String firstLine = input.nextLine();
		int numCases = Integer.parseInt(firstLine);
				
		for (int i = 1; i <= numCases; i++) {	
			@SuppressWarnings("resource")
			Scanner line = new Scanner(input.nextLine());
			double cost = line.nextDouble();
			double boost = line.nextDouble();
			double needed = line.nextDouble();
			
			double rate = 2.0;
			double totalTime = 0.0;
			
			double timeWithout = (needed - cost) / rate;
			double timeWith = needed / (rate + boost);
			
			// keep buying farms until better to forgo
			while (timeWith < timeWithout) {
				totalTime += cost / rate;	// add in time it took to get to farm
				rate += boost;
				
				timeWithout = (needed - cost) / rate;
				timeWith = needed / (rate + boost);												
			}
			totalTime += needed / rate;		// we've settled on the highest rate
			
			String printMe = "Case #" + i + ": %.7f\n";
			System.out.printf(printMe, totalTime);
			out.printf(printMe, totalTime);
		}
	}	
}
