package methodEmbedding.Standing_Ovation.S.LYD1989;

import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int sMax = sc.nextInt();
			String data = sc.nextLine();
			int numFriends = 0;
			int totalStanding = 0;
			for (int j = 0; j < sMax + 1; j++) {
				if (totalStanding < j) {
					numFriends += j - totalStanding;
					totalStanding = j;
				}
				totalStanding += data.charAt(j + 1) - '0';
			}
			System.out.printf("Case #%d: %d\n", i + 1, numFriends);
		}
	}
}
