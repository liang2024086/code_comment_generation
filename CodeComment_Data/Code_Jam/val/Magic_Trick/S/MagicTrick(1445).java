package methodEmbedding.Magic_Trick.S.LYD1387;

import java.util.Scanner;

public class MagicTrick {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int ca = 1; ca <= cases; ca++) {
			int[][] first = new int[4][4];
			int[][] second = new int[4][4];
			int firstRow = in.nextInt() - 1;
			for (int i = 0; i < first.length; i++) {
				for (int k = 0; k < first[i].length; k++) {
					first[i][k] = in.nextInt();
				}
			}
			int secondRow = in.nextInt() - 1;
			for (int i = 0; i < second.length; i++) {
				for (int k = 0; k < second[i].length; k++) {
					second[i][k] = in.nextInt();
				}
			}
			outer: for (int i = 0; i < 4; i++) {
				for (int k = 0; k < 4; k++) {
					if (second[secondRow][k] == first[firstRow][i])
						continue outer;
				}
				first[firstRow][i] = -1;
			}
			int found = 0;
			int cardNumber = -1;
			for (int i = 0; i < 4; i++) {
				if (first[firstRow][i] != -1) {
					found++;
					cardNumber = first[firstRow][i];
				}
			}
			if (found == 0) {
				System.out.printf("Case #%d: Volunteer cheated!%n", ca);
			} else if (found == 1) {
				System.out.printf("Case #%d: %d%n", ca, cardNumber);
			} else {
				System.out.printf("Case #%d: Bad magician!%n", ca);
			}
		}
	}
}
