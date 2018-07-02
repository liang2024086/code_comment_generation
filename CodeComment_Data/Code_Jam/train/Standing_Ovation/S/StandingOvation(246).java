package methodEmbedding.Standing_Ovation.S.LYD565;

import java.io.*;

public class StandingOvation{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		for(int i = 1; i <= cases; i++){
			String inp[] = br.readLine().trim().split(" +");
			char levelsChar[] = inp[1].toCharArray();
			int levels[] = new int[levelsChar.length];
			for(int j=0; j<levels.length; j++)
				levels[j] = Character.getNumericValue(levelsChar[j]);
			int toInvite = 0;
			int totalStanding = levels[0];
			int temp;
			for(int j=1; j<levels.length; j++){
				if(j>totalStanding){
					temp= j - totalStanding;
					toInvite+= temp;
					totalStanding+=temp;
				}
				totalStanding += levels[j];
			}
			System.out.println("Case #"+i+": "+toInvite);
		}
	}
}
