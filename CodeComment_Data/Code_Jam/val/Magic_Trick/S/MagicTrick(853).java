package methodEmbedding.Magic_Trick.S.LYD505;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException {

		int numOfCases, choice1, choice2, number = 0, count = 0;

		int[][] inputArr1 = new int[4][4];
		int[][] inputArr2 = new int[4][4];

		String[] choices;

		Scanner sc = new Scanner(new File(
				"D:\\codejam\\A-small-attempt0.in"));

		numOfCases = sc.nextInt();

		for (int i = 1; i <= numOfCases; i++) {
			
			choice1 = sc.nextInt() - 1;

			for (int k = 0; k < 4; k++) {
				for (int l = 0; l < 4; l++)
					inputArr1[k][l] = Integer.parseInt(sc.next());
			}

			choice2 = sc.nextInt() - 1;

			for (int k = 0; k < 4; k++) {
				for (int l = 0; l < 4; l++)
					inputArr2[k][l] = Integer.parseInt(sc.next());
			}

			for (int m = 0; m < 4; m++) {
				for (int n = 0; n < 4; n++) {
					if (inputArr1[choice1][m] == inputArr2[choice2][n]) {
						count++;
						number = inputArr1[choice1][m];
					}
				}
			}
			
			if (count == 1) {
				System.out.println("Case #" + i + ": " + number);
			} else if (count > 1) {
				System.out.println("Case #" + i + ": Bad magician!");
			} else {
				System.out.println("Case #" + i + ": Volunteer cheated!");
			}

			count = 0;

		}

	}
}
