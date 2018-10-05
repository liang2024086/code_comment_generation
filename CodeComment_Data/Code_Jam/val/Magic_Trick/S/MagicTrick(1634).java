package methodEmbedding.Magic_Trick.S.LYD1666;

import java.util.*;

public class MagicTrick {
	
	/* Input should be with a \n after each line so scanner picks it up */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Integer testcases = Integer.parseInt(s.nextLine()); //the number of test cases; each test case contains two arrangements
		
		for (int i = 0; i < testcases; i++) { //loop through each test case
			String[][][] arrangements = new String[2][4][4];
			Integer[] rowChoices = new Integer[2];
			
			for (int j = 0; j < 2; j++) {
				Integer rowChoice = Integer.parseInt(s.nextLine());
				
				rowChoices[j] = rowChoice;
				
				String[][] arrangement = new String[4][4]; //4x4 grid for the arrangement of the cards
				
				for (int k = 0; k < 4; k++) { //loop through the 4 lines which are the arrangement of the cards
					arrangement[k] = s.nextLine().split(" "); //gets the arrangement of cards on each line
				}
				
				arrangements[j] = arrangement;
			}
			
			String[] testOne = arrangements[0][rowChoices[0]-1]; //gets the first row that the volunteer selected
			String[] testTwo = arrangements[1][rowChoices[1]-1]; //gets the second row that the volunteer selected
			
			String[] answers = new String[4];
			Integer answerCount = 0;
			
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (testOne[j].equals(testTwo[k])) {
						answers[answerCount++] = testOne[j]; //answer added to a String array; just in case more than one exists (bad magician). answerCount is *post* (after it is used) incremented
					}
				}
			}
			
			if (answerCount == 0) {
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			} else if (answerCount == 1) {
				System.out.println("Case #" + (i+1) + ": " + answers[0]);
			} else{
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}
			
		}
		
		s.close();
	}
	
	
}
