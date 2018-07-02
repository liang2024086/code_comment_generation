package methodEmbedding.Standing_Ovation.S.LYD1781;

import java.util.*;
import java.io.*;

public class Test {
	
	public static void main (String args[]) {

		int caseNum = 0;
		int totalFriends;
		int numClapping;	
		String outputString = "Case #%d: %d";
		Scanner kbr = new Scanner(System.in);
		int numTests = kbr.nextInt();
		
		for( int i = 0; i < numTests; i++ ) {

			caseNum++;	
			totalFriends = 0;
			numClapping = 0;
			int maxShyness = kbr.nextInt();
			String audience = kbr.next();

			for(int shyness = 0; shyness <= maxShyness; shyness++) {

				int temp = Character.getNumericValue(audience.charAt(shyness));
				if(temp > 0 && numClapping < shyness) {

					totalFriends += shyness - numClapping;
					numClapping += shyness - numClapping;

				}

				numClapping += temp;

			}

			System.out.printf(outputString + '\n', caseNum, totalFriends);

		}

	}

} 			
				
