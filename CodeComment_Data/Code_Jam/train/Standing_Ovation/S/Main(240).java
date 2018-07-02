package methodEmbedding.Standing_Ovation.S.LYD2221;

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int caseNumber = 1;
		int numberOfCases = Integer.parseInt(br.readLine());
		while(numberOfCases-- > 0){
			line = br.readLine();
			String [] arguments = line.split(" ");
			int sMax = Integer.parseInt(arguments[0]);
			String audience = arguments[1];
			int peopleStanding = 0;
			int friendsNeeded = 0;
			for(int k = 0; k < audience.length(); k++){
				int levelValue = Character.getNumericValue(audience.charAt(k));
				if(k == 0){ //people at 0 stand automatically
					peopleStanding += levelValue;
				}else{
					if(levelValue == 0) continue;
					while(peopleStanding < k){
						friendsNeeded++;
						peopleStanding ++;
					}

					peopleStanding += levelValue;
				}

			}

			System.out.println("Case #" + caseNumber + ": " + friendsNeeded);
			caseNumber++;
		}
	}
}
