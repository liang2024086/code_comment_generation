package methodEmbedding.Standing_Ovation.S.LYD1582;

import java.io.File;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		int T = 0;
		try {
			Scanner scan = new Scanner(new File("A-small-attempt1.in"));
			T = scan.nextInt();
			scan.nextLine();
			
			for(int i = 0; i < T; i++) {
				int SMax = 0;
				SMax = scan.nextInt();
				int numberOfShyness = SMax + 1;
				int []shynessRatings = new int[numberOfShyness];
				String shynessInput = scan.next();
				int totalNumAudience = 0;
				
				
				for(int j = 0; j < numberOfShyness; j++) {
					
					shynessRatings[j] = shynessInput.charAt(j) - '0';
										
					totalNumAudience += shynessRatings[j];
				}
			
				
				int numPeopleLaughing = 0;
				int numPeopleToBeAdded = 0;
				/*
				
				for(int j = 1; j < numberOfShyness; j++) {
					if(numPeopleLaughing >= j) {
						numPeopleLaughing += shynessRatings[j];
					}
					else {
						// add people
						numPeopleToBeAdded += (j - numPeopleLaughing);
						numPeopleLaughing += numPeopleToBeAdded;
					}
				}
				*/
				
				int totalNumPeopleToBeAdded = 0;
				for(int j = 0; j < numberOfShyness; j++) {
					if(numPeopleLaughing >= j) {
						numPeopleLaughing += shynessRatings[j];
					}
					else {
						numPeopleToBeAdded = j - numPeopleLaughing;
						totalNumPeopleToBeAdded += numPeopleToBeAdded;
						numPeopleLaughing += numPeopleToBeAdded;
						numPeopleLaughing += shynessRatings[j];
					}
				}
				
				
				
				
				System.out.println("Case #" + (i+1) + ": " + totalNumPeopleToBeAdded);
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
