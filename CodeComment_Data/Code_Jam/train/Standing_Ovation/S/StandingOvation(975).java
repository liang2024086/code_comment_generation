package methodEmbedding.Standing_Ovation.S.LYD660;

import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StandingOvation {
	static FileOutputStream output;
	
	public static void main(String[] args) {
		Scanner input;
		
		try {
			input = new Scanner(new File("./A-small-attempt0.in"));
			output = new FileOutputStream(new File("./StandingOvation-output.txt"));
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("Unable to locate file.");
			fnfe.printStackTrace();
			return;
		}
		catch (Exception e) {
			System.out.println("Unable to open input file.");
			e.printStackTrace();
			return;
		}
		
		int numCases = Integer.parseInt(input.nextLine());
		
		for (int curCase = 1; curCase <= numCases; curCase++) {
			
			int numLevels = input.nextInt();
			
			int friendsNeeded = 0;
			int numStanding = 0;
			
			String numShy = input.next();
			
			for (int i = 0; i <= numLevels; i++) {
				int numAvailable = Integer.parseInt(numShy.substring(i, i+1));
				
				if (numStanding < i && numAvailable > 0) {
					friendsNeeded += (i - numStanding);
					numStanding += (i - numStanding);
				}
				numStanding += numAvailable;
				
				if (numStanding >= numLevels) {
					break;
				}
			}
			
			try {
				output.write(String.format("Case #%d: %d%n", curCase, friendsNeeded).getBytes());
			}
			catch (IOException ioe) {
				System.out.println("Error writing file output.");
				ioe.printStackTrace();
				return;
			}
			catch (Exception e) {
				System.out.println("Error writing file output.");
				e.printStackTrace();
				return;
			}
			
		}
		
		try {
			input.close();
			output.close();
		}
		catch (Exception e) {
			System.out.println("Error closing streams.");
			e.printStackTrace();
			return;
		}
	}
}
