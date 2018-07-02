package methodEmbedding.Revenge_of_the_Pancakes.S.LYD36;

import java.util.Scanner;

public class Sheep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int T = Integer.parseInt(sc.nextLine());
		for (int caseNo = 1; caseNo <= T; caseNo++) {
			final String S = sc.nextLine();
			int flipCount = 0;
			boolean previousCakeIsHappy = (S.charAt(0) == '+');
			for (int i = 1; i < S.length(); i++) {
				boolean thisCakeIsHappy = (S.charAt(i) == '+');
				if (previousCakeIsHappy != thisCakeIsHappy) {
					flipCount++;
				}
				previousCakeIsHappy = thisCakeIsHappy;
			}
			if (!previousCakeIsHappy) {
				flipCount++;
			}
			System.out.println("Case #" + caseNo + ": " + flipCount);
		}
	}
}
