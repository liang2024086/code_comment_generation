package methodEmbedding.Standing_Ovation.S.LYD151;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		int numberOfTestCases = in.nextInt();
		for(int i = 0; i < numberOfTestCases; i++) {
			int added = 0;
			int mIdx = in.nextInt();
			int standing = 0;
			String nums = in.next();
			int[] audience = new int[nums.length()];
			for(int j = 0; j < nums.length(); j++) {
				audience[j] = Character.digit(nums.charAt(j), 10);
			}
			for(int j = 0; j <= mIdx; j++) {
				int needed = Math.max(0, j - standing);
				added += needed;
				standing += audience[j] + needed;
			}
			System.out.println("Case #" + (i + 1) + ": " + added);
		}
		
	}

}
