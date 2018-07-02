package methodEmbedding.Cookie_Clicker_Alpha.S.LYD356;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		
		// Start I/O
				Scanner inputFile = null;
				String inputFilename = args[0];
				PrintWriter outputFile = null;
				String outputFilename = "output.txt";
				try {
					// Read the total number of test cases.
					inputFile = new Scanner(new File(inputFilename));
					outputFile = new PrintWriter(new BufferedWriter(new FileWriter(
							outputFilename)));

					byte numCases = inputFile.nextByte();
					
					// For each test case...
					for (int i = 1; i <= numCases; i++) {
						double r = 2.0; // default cookies per second.
						double totalTime = 0;
						double c = inputFile.nextDouble();
						double f = inputFile.nextDouble();
						double x = inputFile.nextDouble();
						boolean done = false;
						while(!done){
							double waitTime = x/r; // time to wait instead of building farm.
							double buildTime = c/r; // time to build a farm
							double newWaitTime = x/(r+f); // time to wait if new farm is built.
							if((buildTime + newWaitTime) < waitTime){
								totalTime += buildTime;
								r += f;
							}
							else{
								totalTime += waitTime;
								done = true;
							}
						}
						outputFile.printf("Case #%d: %.7f", i, totalTime);
						if(i < numCases)
							outputFile.print("\n");
					}
					System.out.println("Data processed successfully.");
					// End I/O
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (inputFile != null)
						inputFile.close();
					if (outputFile != null)
						outputFile.close();
				}

	}

}
