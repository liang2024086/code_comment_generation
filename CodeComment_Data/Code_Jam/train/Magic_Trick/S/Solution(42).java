package methodEmbedding.Magic_Trick.S.LYD480;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		File file = new File("A-small-attempt1.in");
		int[] array1 = new int[4];
		int[] array2 = new int[4];
		int ans1, ans2, card, repeated = 0, chosen = 0;
		try {

			Scanner sc = new Scanner(file);
			int t = sc.nextInt();

			for (int i = 0; i < t; i++) {
				
				repeated = 0; chosen = 0;
				ans1 = sc.nextInt();
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						card = sc.nextInt();
						if (j == ans1 - 1) {
							array1[k] = card;

						}

					}

				}
				ans2 = sc.nextInt();
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						card = sc.nextInt();
						if (j == ans2 - 1) {
							array2[k] = card;

						}

					}

				}

				// compare the two arrays

				for (int j = 0; j < array1.length; j++) {
					for (int j2 = 0; j2 < array2.length; j2++) {

						if (array1[j] == array2[j2]) {
							repeated++;
							chosen = array1[j];
						}

					}

				}

				switch (repeated) {
				case 1:
					System.out.println("Case #" + (i + 1) + ": " + chosen);
					break;
				case 0:
					System.out.println("Case #" + (i + 1)
							+ ": Volunteer cheated!");
					break;

				default:
					System.out.println("Case #" + (i + 1) + ": Bad magician!");
					break;
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
