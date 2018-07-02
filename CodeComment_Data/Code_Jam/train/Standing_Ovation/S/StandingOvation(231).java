package methodEmbedding.Standing_Ovation.S.LYD801;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new File("A-small-attempt0.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (in == null) {
			return;
		}
		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			int numFriends = 0;
			
			int maxShy = in.nextInt();
			String audience = in.next();
			int numStanding = 0;
			
			for (int j = 0; j <= maxShy; j++) {
				int numPeople = Character.getNumericValue(audience.charAt(j));
				if (j > numStanding) {
					numFriends += j - numStanding;
					numStanding += numPeople + j - numStanding;
				} else {
					numStanding += numPeople;
				}
			}
			int caseNumber = i+1;
			System.out.println("Case #" + caseNumber + ": " + numFriends);
		}
		
	}

}
