package methodEmbedding.Magic_Trick.S.LYD1914;

import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) {
		int test_cases, answer1, answer2;
		int cards1[][], cards2[][];
		Scanner sc = new Scanner(System.in);
		test_cases = sc.nextInt();
		for (int i = 1; i <= test_cases; i++) {
			cards1 = new int[4][4];
			cards2 = new int[4][4];
			answer1 = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					cards1[j][k] = sc.nextInt();
				}
			}
			answer2 = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					cards2[j][k] = sc.nextInt();
				}
			}
			int card = 0;
			for (int j = 0; j < 4 && card >= 0; j++) {
				int c1, c2;
				c1 = cards1[answer1 - 1][j];
				for (int k = 0; k < 4 && card >= 0; k++) {
					c2 = cards2[answer2 - 1][k];
					if (c1 == c2 && card == 0) {
						card = c1;
					} else if (c1 == c2 && card > 0) {
						card = -1;
					}
				}
			}
			if (card > 0) {
				System.out.println("Case #" + i + ": " + card);
			} else if (card == 0) {
				System.out.println("Case #" + i + ": Volunteer cheated!");
			} else { // card == -1
				System.out.println("Case #" + i + ": Bad magician!");
			}
		}
	}

}
