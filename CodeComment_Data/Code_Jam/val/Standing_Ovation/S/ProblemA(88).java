package methodEmbedding.Standing_Ovation.S.LYD1426;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class ProblemA {	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A-small-attempt2.in"));
//		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int maxS = sc.nextInt();
			int numAdded = 0;
			int numStanding = 0;
			
			String shy = sc.next();
						
			for (int j = 0; j < shy.length(); j++) {
				int numPeople = Integer.valueOf(shy.substring(j, j + 1));
				if (numStanding >= j) {
					numStanding += numPeople;
				} else {
					numAdded += (j - numStanding);
					numStanding += (j - numStanding);
					numStanding += numPeople;
				}
			}
			
			System.out.println("Case #" + i  + ": "  + numAdded);
		}
		
		sc.close();
	}
}
