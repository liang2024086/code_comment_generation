package methodEmbedding.Magic_Trick.S.LYD1871;

import java.util.Scanner;

public class AMagicTrick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int[][] cards = new int[2][4];
		for (int t = 0; t < T; t++) {
			for (int i = 0; i < 2; i++) {
				int choice = sc.nextInt();
				for (int j = 1; j <= 4; j++) {
					for (int k = 0; k < 4; k++) {
						int val = sc.nextInt();
						if (j == choice) {
							cards[i][k] = val;
						}
					}
				}
			}
			int comCount = 0;
			int firstCom = 0;
			for (int i = 0; i < 4; i ++) {
				for (int j = 0; j < 4; j ++) {
					if (cards[0][i] == cards[1][j]) {
						comCount ++;
						firstCom = cards[0][i];
					}
				}
			}
			String answer = "Case #" + (t + 1) + ": ";
			if (comCount == 1) {
				answer += firstCom;
			} else if (comCount == 0) {
				answer += "Volunteer cheated!";
			} else {
				answer += "Bad magician!";
			}
			System.out.println(answer);
		}
	}
}
