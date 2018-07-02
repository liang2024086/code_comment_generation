package methodEmbedding.Standing_Ovation.S.LYD555;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int numberOfTestCases = in.nextInt();
		in.nextLine();
		
		for(int testCase = 1; testCase <= numberOfTestCases; testCase++){
			
			long numberOfStanding = 0;
			int totalFriendsNeeded = 0;

			int maxShynessLevel = in.nextInt();
			char[] audience = in.next().toCharArray();
			in.nextLine();
			
			for(int kth = 0; kth < audience.length; kth++){
				
				if(numberOfStanding >= kth){
					numberOfStanding += Character.getNumericValue(audience[kth]);
				} else {
					int peopleNeeded = (int) (kth - numberOfStanding);
					totalFriendsNeeded += peopleNeeded;
					numberOfStanding += peopleNeeded + Character.getNumericValue(audience[kth]);
				}
			}
			
			System.out.println("Case #" + testCase + ": " + totalFriendsNeeded);
		}
	}
}
