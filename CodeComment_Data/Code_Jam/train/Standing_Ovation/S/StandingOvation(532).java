package methodEmbedding.Standing_Ovation.S.LYD1564;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Google Code Jam 2013
 */
public class StandingOvation {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String fileIn = args[0];
		String fileOut = args[1];
		
		BufferedReader reader = new BufferedReader(new FileReader(fileIn));
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));
		
		// Get the # of test cases from the first line
		String line = reader.readLine();
		int numCases = Integer.parseInt(line);
		boolean isFirstLine = true;		
		
		for(int a1=0; a1<numCases; a1++) {		
			String outputStr = "Case #" + (a1+1) + ": ";
			
			// Process each test case here
			line = reader.readLine();
			String[] tokens = line.split(" ");
			int sMax = Integer.parseInt(tokens[0]);	// max shyness lvl of shyest person
			int[] shynessCounts = new int[sMax + 1];
			String shynessStr = tokens[1];
			for(int i1=0; i1<sMax + 1; i1++) {
				int val = Integer.parseInt("" + shynessStr.charAt(i1));
				shynessCounts[i1] = val;
			}
			
			int friendAddedCounter = 0;
			int standingUpCounter = 0;
			for(int i1=0; i1<=sMax; i1++) {
				int sNeeded = i1;
				int peopleInSlot = shynessCounts[i1];
				if(standingUpCounter < sNeeded) {
					int addMe = sNeeded - standingUpCounter;
					friendAddedCounter += addMe;
					standingUpCounter += addMe;
				}
				standingUpCounter += peopleInSlot;
			}
			outputStr = outputStr + friendAddedCounter;
			
			// Write the test case results to the output file
			if(isFirstLine) {
				writer.write(outputStr);
				isFirstLine = false;
			} else {
				writer.write("\n" + outputStr);
			}
		}
		
		if(reader != null) {
			reader.close();
		}
		
		if(writer != null) {
			writer.close();
		}
	}
}
