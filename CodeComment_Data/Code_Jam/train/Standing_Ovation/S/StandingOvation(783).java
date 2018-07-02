package methodEmbedding.Standing_Ovation.S.LYD185;

import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numTestCases = input.nextInt();
		
		for (int i = 0; i < numTestCases; i++) {
			int shynessLevels = input.nextInt() + 1;
			String levels = input.next();
			
			int standing = 0;
			int added = 0;
			
			for (int level = 0; level < shynessLevels; level++) {
				int audiencePart = Integer.parseInt(levels.substring(level, level + 1));
				
				int diff = level - standing;
				
				if (diff > 0) {
					added += diff;
					standing += diff + audiencePart;
				} else {
					standing += audiencePart;
				}
			}
			
			System.out.println("Case #" + (i+1) + ": " + added);
			
		}
		
		input.close();
	}

}
