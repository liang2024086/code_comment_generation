package methodEmbedding.Magic_Trick.S.LYD895;

import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int card[][] = new int[4][4];
		int reArrangedCard[][] = new int[4][4];
		int choosedCard[] = new int[100];
		int index1, index2;
		int T = 0, a1 = 0, a2 = 0, match = 0;
		int result[] = new int[100];
		int testCase;
		boolean incorrectInputT = true;
		boolean incorrectInputa1 = true;
		boolean incorrectInputa2 = true;
		
		// T - the number of test cases
		// The loop WHILE is introduced to make sure the T variable gets the allowed value
		while (incorrectInputT == true){
			T = input.nextInt();
			if ((T >= 1 ) & (T <= 100)){
				incorrectInputT = false;
			}//if
		}//while
		
		// Test cases
		for (testCase = 0; testCase < T; testCase++){

			// a1 - the row which the card chosen by a volunteer is in.
			// The loop WHILE is introduced to make sure the a1 variable gets the allowed value
			while (incorrectInputa1 == true){
				a1 = input.nextInt();
				if ((a1 >= 1) & (a1 <= 4)){
					incorrectInputa1 = false;
				}//if
			}//while
			incorrectInputa1 = true;
			
			// The magician starts by arranging 16 cards in a square grid
			for (index1 = 0; index1 < 4; index1++){
				for (index2 = 0; index2 < 4; index2++){
					card[index1][index2] = input.nextInt();
				}//for
			}//for
		
			// a2 - the row which the card chosen by a volunteer is in after the rearrangement
			// The loop WHILE is introduced to make sure the a2 variable gets the allowed value
			while (incorrectInputa2 == true){
				a2 = input.nextInt();
				if ((a2 >= 1) & (a2 <= 4)){
					incorrectInputa2 = false;
				}//if
			}//while
			incorrectInputa2 = true;
			
			// The magician arranges the 16 cards in a square grid again
			for (index1 = 0; index1 < 4; index1++){
				for (index2 = 0; index2 < 4; index2++){
					reArrangedCard[index1][index2] = input.nextInt();
				}//for
			}//for
		
			// Comparing a1 row of the first arrangement and
			// a2 row of the second arrangement
			for (index1 = 0; index1 < 4; index1++){
				for (index2 = 0; index2 < 4; index2++){
					if (card[a1-1][index1] == reArrangedCard[a2-1][index2]){
						match ++;
						choosedCard [testCase] = card[a1-1][index1];
					}//if
				}//for
			}//for
			result[testCase] = match;
			match = 0;
		}//for

		// Displaying the results
		for (int index = 0; index < testCase; index++){
			System.out.print("Case #" + (index + 1) + ": ");
			switch (result[index]) {
				case 0 :	System.out.print("Volunteer cheated!");
							break;
				case 1 : 	System.out.print(choosedCard[index]);
							break;
				default: 	System.out.print("Bad magician!");
							break;
			}//switch
			System.out.println();
		}//for
		
		match = 0;
		
	}//main
}//class
