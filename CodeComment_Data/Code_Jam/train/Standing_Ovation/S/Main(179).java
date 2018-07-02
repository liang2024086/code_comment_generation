package methodEmbedding.Standing_Ovation.S.LYD852;

/*
 * 
 * Howie Andersen
 * hva5040@psu.edu
 * Google Code Jam
 * April 11, 2015
 * 
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		
		Scanner inputReader = null;			//Will be used to read input data
		
		int numberOfTestCases;			//Will contain the number of test cases
		int maxShynessLevel;			//Will contain the highest individual shyness level in the original audience
		int[] shynessLevels;			//Will contain the shyness levels of people in the original audience
										//e.g shynessLevels[0] will hold the # of people with shyness level 0

		int numberOfPeopleCurrentlyStanding;	//Will keep track of how many people are standing so far
		int numberOfExtraPeopleNeeded;			//Will keep track of how many extra people are needed so far
		
		/*******************************************************************************************************/
		
		//Open our input.txt file with our Scanner
		try {
			inputReader = new Scanner(new File("input.txt"));
		}
		
		catch (IOException e) {
			System.out.println(e);
		}
		
		//Get number of test cases
		numberOfTestCases = inputReader.nextInt();		
		
		//This loop repeats once for each test case
		for (int x = 0; x < numberOfTestCases; x++) {	
			
			//Get highest shyness level in the original audience for this test case
			maxShynessLevel = inputReader.nextInt();
			
			//Initialize array to hold amount of people with shyness levels between 0 and the given max value
			shynessLevels = new int[maxShynessLevel + 1];		
			
			//Get the list of shyness levels and store it in a String
			String listOfShynessLevelsInStringForm = inputReader.next();
			
			//This loop convert the list of audience's shyness levels from a String to an integer array
			for (int y = 0; y < shynessLevels.length; y++) {
				char tempChar = listOfShynessLevelsInStringForm.charAt(y);
				shynessLevels[y] = Character.getNumericValue(tempChar);
			}

			numberOfPeopleCurrentlyStanding = 0;
			numberOfExtraPeopleNeeded = 0;
			
			//This loop checks the amount of additional people needed
			for (int y = 0; y < shynessLevels.length; y++) {
				
				if (numberOfPeopleCurrentlyStanding >= y) {
					numberOfPeopleCurrentlyStanding += shynessLevels[y];
				}
				else {
					numberOfExtraPeopleNeeded++;
					numberOfPeopleCurrentlyStanding++;
					numberOfPeopleCurrentlyStanding += shynessLevels[y];
				}
					
			}
			System.out.println("Case #" + (x + 1) + ": " + numberOfExtraPeopleNeeded);
		}
		
		
		
		inputReader.close();
	}
}
