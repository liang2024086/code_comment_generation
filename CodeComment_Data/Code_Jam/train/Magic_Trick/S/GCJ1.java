package methodEmbedding.Magic_Trick.S.LYD1998;

import java.util.*;

public class GCJ1 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int[] answer1 = new int[testCase];
		int[][][] card1 = new int[testCase][4][4];
		int[] answer2 = new int[testCase];
		int[][][] card2 = new int[testCase][4][4];

		// input
		for (int i = 0; i < testCase; i++) {
			answer1[i] = scanner.nextInt();
			for (int j = 0; j < card1[i].length; j++)
				for (int k = 0; k < card1[i][j].length; k++)
					card1[i][j][k] = scanner.nextInt();
			answer2[i] = scanner.nextInt();
			for (int j = 0; j < card2[i].length; j++)
				for (int k = 0; k < card2[i].length; k++)
					card2[i][j][k] = scanner.nextInt();
		}

		/*
		// debug
		System.out.println("testCase = " + testCase);
		for (int i = 0; i < testCase; i++) {
			System.out.println("answer1[" + i + "] = " + answer1[i]);
			for (int j = 0; j < card1[i].length; j++)
				System.out.println(Arrays.toString(card1[i][j]));
			System.out.println("answer2[" + i + "] = " + answer2[i]);
			for (int j = 0; j < card2[i].length; j++)
				System.out.println(Arrays.toString(card2[i][j]));
		}
		*/

		for (int i = 0; i < testCase; i++) {
			int answer = -1;
			int[] card1answer = card1[i][answer1[i] - 1];
			int[] card2answer = card2[i][answer2[i] - 1];
			for (int j = 0; j < card1answer.length; j++) {
				for (int k = 0; k < card2answer.length; k++) {
					if (card1answer[j] == card2answer[k]) {
						if (answer == -1) {
							answer = card1answer[j];
						} else {
							answer = -2;
						}
					}
				}
			}

			switch (answer) {
			case -1: System.out.println("Case #" + (i+1) + ": Volunteer cheated!"); break;
			case -2: System.out.println("Case #" + (i+1) + ": Bad magician!"); break;
			default: System.out.println("Case #" + (i+1) + ": " + answer); break;
			}
		}
	}
}
