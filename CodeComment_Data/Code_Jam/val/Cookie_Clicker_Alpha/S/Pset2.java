package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1561;

/**
 * Google Code Jam
 * pset2.java
 */

import java.io.*;
import java.util.Scanner;

public class Pset2 {
	public static void main(String[] args) throws Exception {
		File file = new File("B-small-attempt5.in");
		File outFile = new File("Output.txt");
		Scanner input = new Scanner(file);
		PrintWriter pw = new PrintWriter(outFile);
		
		int tests; // between 1 and 100
		double C, F, X; //cookies per farm, cookie farm gain, max score
		double time = 0.0; //time to achieve X
		double cookieRate = 2.0; //rate of cookie multiply
		double timeForFarm = 0.0; 
		double timeForX = 0.0;
		double timeForXAfterFarm = 0.0 ;
		
		//read number of tests
		tests = input.nextInt();
		if(tests<1 || tests>100) {
			return;
		}
		
		//iterate over the file for tests times
		for (int i=0;i<tests;i++) { 
			//read C, F and X
			C = input.nextDouble();
			F = input.nextDouble();
			X = input.nextDouble();
			
			do {
				//calculate time to achieve X with current cookieRate
				timeForX = (double) X/cookieRate;
				//calculate time to achieve C with current cookieRate
				timeForFarm = (double) C/cookieRate;
				timeForXAfterFarm = timeForFarm + X/(cookieRate+F);
				
				if (timeForXAfterFarm < timeForX) { //buys a farm
					cookieRate += F;
					
					time += timeForFarm;
					if (timeForFarm * cookieRate > X) {
						time += X/cookieRate; 
					
						break;
					}
				}
				else {
					
					time += timeForX; 
					break;
				}
			} while(timeForX > timeForXAfterFarm);
			
			//print into file
			pw.println(String.format("Case #%d: %.7f",i+1,time));
			
			//reset variables
			time = 0.0;
			timeForFarm = 0.0;
			timeForX = 0.0;
			timeForXAfterFarm = 0.0;
			cookieRate = 2.0;	
			
		}
		
		input.close();
		pw.close();
		
	}
}
