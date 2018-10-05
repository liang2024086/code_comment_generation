package methodEmbedding.Standing_Ovation.S.LYD1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			String shyness = br.readLine();
			int maxShyness = Integer.parseInt(shyness.split(" ")[0]);
			String shynessList = shyness.split(" ")[1];
			int invites = 0;
			int numStanding = 0;
			for (int j = 0; j <= maxShyness; j++) {
				
				if(j > numStanding){
					invites+=  j - numStanding;
					numStanding = j;
				}
				numStanding += shynessList.charAt(j) -48 ;
			}
			System.out.println("Case #" + i + ": " + invites);
		}
	}

}
