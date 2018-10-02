package methodEmbedding.Standing_Ovation.S.LYD2128;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("A-small-attempt2.in"));
		int cases;
		cases = Integer.parseInt(in.nextLine());
		int[] audience;
		boolean[] standing;
		for(int i=0; i<cases; i++){
			String[] line = in.nextLine().split(" ");
			int maxShy = Integer.parseInt(line[0]);
			audience = new int[maxShy+1];
			standing = new boolean[maxShy+1];
			for(int j=0; j <= maxShy; j++)
				audience[j] = line[1].toCharArray()[j]-'0';
			standing[0] = true;
			int peopleStanding = audience[0];
			int friendsNeeded = 0;
			int tFriends = 0;
			for(int j=1; j <= maxShy; j++){
				if(j <= peopleStanding)
					peopleStanding += audience[j];
				else if(audience[j] != 0){
					friendsNeeded = j - peopleStanding;
					tFriends += friendsNeeded;
					peopleStanding += friendsNeeded;
					j--;
					continue;
				}
			}
			System.out.print("Case #"+(i+1)+": "+tFriends+"\n");
		}
	}

}
