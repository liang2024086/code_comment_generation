package methodEmbedding.Standing_Ovation.S.LYD1927;

import java.util.*;

public class StandingOvasion{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for(int i = 0; i < t; i++){
			int max = in.nextInt();
			String temp = in.next();

			int size = temp.length();
			int totalStandingAudience = 0;
			int numberOfFriends = 0;

			for(int j = 0; j < size; j++){
				int currentAudience = temp.charAt(j) - '0';

				int audienceNeeded = j - totalStandingAudience;
				if(audienceNeeded > 0){
					totalStandingAudience += audienceNeeded;
					numberOfFriends += audienceNeeded;
				}

				totalStandingAudience += currentAudience;
			}

			System.out.println("Case #" + (i+1) + ": " + numberOfFriends);
		}		
	}
}
