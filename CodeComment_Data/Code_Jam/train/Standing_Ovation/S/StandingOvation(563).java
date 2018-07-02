package methodEmbedding.Standing_Ovation.S.LYD1489;

import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int i = 0; i < T; i++) {
			int max = s.nextInt();
			int standUpCount = 0;
			int friendsAdded = 0;
			String digits = s.nextLine();
			digits = digits.trim();
			
			standUpCount += Integer.parseInt(digits.substring(0, 1));
			for (int c = 1; c < digits.length(); c++) {
				if (Integer.parseInt(digits.substring(c, c+1)) > 0) {
					if (standUpCount < c) {
						friendsAdded += c-standUpCount;
						standUpCount += c-standUpCount;
					}
					standUpCount += Integer.parseInt(digits.substring(c, c+1));
				}
			}
			
			System.out.println("Case #"+(i+1)+": "+friendsAdded);
		}
	}

}
