package methodEmbedding.Standing_Ovation.S.LYD100;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int cases = keyboard.nextInt();
		
		for (int testCase = 1; testCase <= cases; testCase++) {
			int audSize = keyboard.nextInt();
			int[] audience = new int[audSize +1];
			String audData = keyboard.next();
			for (int pos = 0; pos < audData.length(); pos++) {
				audience[pos] = audData.charAt(pos) - '0';
			}
			
			int invite = 0;
			int standing = 0;
			for (int shyness = 0; shyness < audience.length; shyness++) {
				while (standing < shyness) {
					invite++;
					standing++;
				}
				standing += audience[shyness];
			}
			
			System.out.println("Case #" + testCase + ": " + invite);
		}
		keyboard.close();
	}

}
