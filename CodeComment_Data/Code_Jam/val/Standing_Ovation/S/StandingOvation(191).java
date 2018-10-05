package methodEmbedding.Standing_Ovation.S.LYD898;

import java.util.Scanner;
class StandingOvation {
	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] output = new String[t];
		
		for (int i = 1; i <= t; i++) {
			int Smax = in.nextInt();
			String temp = in.next();
			int levels = temp.length();
			int[] audience = new int[levels];
			for (int x = 0; x < levels; x++) {
				audience[x] = Character.getNumericValue(temp.charAt(x));
			}
			
			int peopleStanding = 0;
			int needed = 0;
			
			for (int l = 0; l < levels; l++) {
				peopleStanding += audience[l];
				while(peopleStanding < l + 1) {
					peopleStanding++;
					needed++;
				}
			}
			output[i - 1] = "Case #" + i + ": " + needed;
		}
		for (String s : output) {
			System.out.println(s);
		}
	}
	
}
