package methodEmbedding.Standing_Ovation.S.LYD1740;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		int numCases = stdin.nextInt();
		for(int i = 1; i <= numCases; i++) {

			int maxShyness = stdin.nextInt();
			String audience = stdin.next();
			
			int audienceCtr = 0, friendCtr = 0;
			for(int j = 0; j < audience.length(); j++) {

				int curr = Integer.parseInt(audience.charAt(j) + "");
				
				if(audienceCtr < j && curr > 0) {
					friendCtr += (j - audienceCtr);
					audienceCtr += curr + (j - audienceCtr);
				}
				else {
					audienceCtr += curr;
				}
			}
			
			System.out.printf("Case #%d: %d\n", i, friendCtr);
		}
		
		stdin.close();
	}
	
}
