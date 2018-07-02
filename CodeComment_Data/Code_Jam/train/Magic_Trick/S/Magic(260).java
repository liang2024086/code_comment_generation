package methodEmbedding.Magic_Trick.S.LYD1220;

import java.util.Scanner;

public class Magic {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int[] chosenLineOne = new int[4];
		int[] chosenLineTwo = new int[4];
		int answer = 0;
		int answerCount = 0;

		int tempInt = 0;
		int numberOfCases = input.nextInt();

		for (int k = 0; k < numberOfCases; k++) {

			int lineOne = input.nextInt();

			answerCount = 0;

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					tempInt = input.nextInt();

					if (i == lineOne - 1) {
						chosenLineOne[j] = tempInt;
					}
				}
			}

			int lineTwo = input.nextInt();

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					tempInt = input.nextInt();

					if (i == lineTwo - 1) {
						chosenLineTwo[j] = tempInt;
					}
				}
			}

			for (int m = 0; m < 4; m++) {
				for (int n = 0; n < 4; n++) {
					if (chosenLineOne[n] == chosenLineTwo[m]) {
						answer = chosenLineOne[n];
						answerCount++;
					}
				}
			}

			if (answerCount == 0) {
				System.out.println("Case #" + (k + 1) + ": Volunteer cheated!");
			}

			if (answerCount == 1) {
				System.out.println("Case #" + (k + 1) + ": " + answer);
			}

			if (answerCount > 1) {
				System.out.println("Case #" + (k + 1) + ": Bad magician!");
			}
		}

		input.close();
	}
}
