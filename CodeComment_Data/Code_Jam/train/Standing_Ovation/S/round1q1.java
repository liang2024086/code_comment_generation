package methodEmbedding.Standing_Ovation.S.LYD256;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Math.*;

public class round1q1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("/Users/Andrew/Dropbox/school/ncssm/fun programs/Competition/codeJam/src/codeJam/A-small-attempt0.in"));
		Scanner in = new Scanner(System.in);
		int numTrials = in.nextInt();
		//goes through each trial
		for(int i = 0; i <numTrials; i++) {
			int maxShiness = in.nextInt();
			int peopleClapping = 0; 
			int friendsInvited = 0;
			//goes through each person in the trial
			//j is the shiness level of the person,
			//if that level is greater than people clapping no clap
			String a = in.nextLine();
			for(int j = 0; j <=maxShiness; j++ ) {
				int shiness = Character.getNumericValue(a.charAt(j+1));
				if(j <= peopleClapping ) peopleClapping += shiness;
				else {
					while(j > peopleClapping) {
						friendsInvited++;
						peopleClapping++;
					}
					peopleClapping += shiness;
				}
			}
			System.out.format("Case #%d: %d\n", i+1, friendsInvited);
		}
	}
}
