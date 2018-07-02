package methodEmbedding.Magic_Trick.S.LYD1166;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int j = 1; j <= cases; j++) {
			int ans1 = in.nextInt();
			in.nextLine();
			int[] possibleChoices = new int[4];
			int[] possibleChoices2 = new int[4];

			for (int i = 1; i <= 4; i++) {
				if (i == ans1) {
					String[] items = in.nextLine().split(" ");
					for (int k = 0; k < 4; k++) {
						possibleChoices[k] = Integer.parseInt(items[k]);
					}
				} else {
					in.nextLine();
//					String[] items = in.nextLine().split(" ");
//					for (int k = 0; k < 4; k++) {
//						possibleChoices2[k] = Integer.parseInt(items[k]);
//					}
				}
			}

			int ans2 = in.nextInt();
			in.nextLine();
			for (int i = 1; i <= 4; i++) {
				if (i == ans2) {
					String[] items = in.nextLine().split(" ");
					for (int k = 0; k < 4; k++) {
						possibleChoices2[k] = Integer.parseInt(items[k]);
					}
				} else {
					in.nextLine();
				}
			}

			int result[] = new int[4];
			int resultCounter = 0;
			for (int i = 0; i < 4; i++) {
				for (int k = 0; k < 4; k++) {
					int possibleChoice = possibleChoices[i];
					if (possibleChoice == possibleChoices2[k]) {
						result[resultCounter++] = possibleChoice;
					}
				}
			}

			if (resultCounter == 0) {
				System.out.println("Case #" + j + ": Volunteer cheated!");
			} else if (resultCounter == 1) {
				System.out.println("Case #" + j + ": " + result[0]);
			} else {
				System.out.println("Case #" + j + ": Bad magician!");
			}
		}
	}
}
