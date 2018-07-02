package methodEmbedding.Magic_Trick.S.LYD96;

/* Google Code Jam 2014
 * Problem 1 - 6 points
 * Author: linh
*/

import java.util.Scanner;

public class MagicTrick {

	final static int BAD_MAGICIAN = -1;
	final static int CHEAT = 0;

	public static void main(String args[]) {		
		Scanner sc = new Scanner(System.in);
		int totalCase = Integer.valueOf(sc.nextInt());
		//System.out.println("test case num =" + totalCase);
		
		int firstGuess, secondGuess;
		int[][] firstArrangement = new int[4][4];
		int[][] secondArrangement = new int[4][4];
				
		for (int caseNum = 1; caseNum <= totalCase; ++caseNum) {
			// first guess
			firstGuess = Integer.valueOf(sc.nextInt());
			//System.out.println("first guess = " + firstGuess);	
			--firstGuess;					
			// first arrangement
			for (int j = 0; j <4; ++j) {
				for (int k = 0; k < 4; ++k) {
					firstArrangement[j][k] = Integer.valueOf(sc.nextInt());
					//System.out.print(firstArrangement[j][k] + " " );
				}
				//System.out.println();			
			}			
			
			// second guess
			secondGuess = Integer.valueOf(sc.nextInt());
			//System.out.println("second guess = " + secondGuess);		
			--secondGuess;
			// second arrangement
			for (int j = 0; j <4; ++j) {			
				for (int k = 0; k < 4; ++k) {
					secondArrangement[j][k] = Integer.valueOf(sc.nextInt());
					//System.out.print(secondArrangement[j][k] + " " );
				}
				//System.out.println();			
			}	

			// Analyze
			int result = CHEAT;
			for (int first = 0; first < 4; ++first) {
				for (int second = 0; second < 4; ++second)  {
					//System.out.println(firstArrangement[firstGuess][first]  + " vs "  
					//				+ secondArrangement[secondGuess][second]);
					if (firstArrangement[firstGuess][first] == secondArrangement[secondGuess][second]) {
						if (result == CHEAT) {
							// first matching number found
							result = firstArrangement[firstGuess][first];
							//System.out.println("case 1, valid");	
						} else {
							// multiple matching number found - Bad magician
							result = BAD_MAGICIAN; 
							//System.out.println("case 2, bad");	
							break;
						}						
					}				
				}
			}

			// Print result
			if (result == CHEAT) {
				System.out.println("Case #" + caseNum + ": Volunteer cheated!");
			} else if (result == BAD_MAGICIAN) {
				System.out.println("Case #" + caseNum + ": Bad magician!");
			} else {
				System.out.println("Case #" + caseNum + ": " + result);
			}
		}		
	}
	

}
