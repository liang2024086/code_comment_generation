package methodEmbedding.Magic_Trick.S.LYD1275;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		boolean[] isCardInUserRow = new boolean[16];
		int[] indicesUsed = new int[4];
		for (int i = 0; i < 16; i++) {
			if (i < 4)
				indicesUsed[i] = -1;
			isCardInUserRow[i] = false;
		}
		for (int i = 1; i <= testCases; i++) {
			int userRow = scanner.nextInt();
			int currRow = 0;
			//System.out.println("userRow = " + userRow);
			while (currRow < userRow) {
				scanner.nextLine();
				currRow++;
			}
			for (int j = 1; j <= 4; j++) {
				indicesUsed[j - 1] = scanner.nextInt() - 1;
			//	System.out.println("Cards = " + indicesUsed[j - 1]);

				isCardInUserRow[indicesUsed[j - 1]] = true;
			}
			while (currRow <= 4) {
				scanner.nextLine();
				currRow++;
			}
			int newUserRow = scanner.nextInt();
			//System.out.println("newUserRow = " + newUserRow);

			currRow = 0;
			while (currRow < newUserRow) {
				scanner.nextLine();
				currRow++;
			}
			int count = 0;
			int chosenCard = 0;
			int temp;
			for (int j = 1; j <= 4; j++) {
				temp = scanner.nextInt() - 1;
				if (isCardInUserRow[temp]) {
					chosenCard = temp;
					count++;
				}
			}
			if (count == 0)
				System.out.println("Case #" + Integer.toString(i)
						+ ": Volunteer cheated!");
			else if (count > 1)
				System.out.println("Case #" + Integer.toString(i)
						+ ": Bad magician!");
			else
				System.out.println("Case #" + Integer.toString(i) + ": "
						+ Integer.toString(chosenCard+1));
			while (currRow <= 4) {
				scanner.nextLine();
				currRow++;
			}
			for (int j = 0; j < 4; j++) {
				isCardInUserRow[indicesUsed[j]] = false;
			}

		}
	}
}
