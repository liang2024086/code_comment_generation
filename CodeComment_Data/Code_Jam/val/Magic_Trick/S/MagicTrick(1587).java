package methodEmbedding.Magic_Trick.S.LYD476;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.util.*;

class MagicTrick {
	private static final String PROB_NAME = "magictrick";

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(PROB_NAME + ".in"));
		BufferedWriter out = new BufferedWriter(new FileWriter(PROB_NAME + ".out"));

		int numTestCases = Integer.parseInt(in.readLine());
		for (int caseNumber = 1; caseNumber <= numTestCases; caseNumber++) {
			out.write("Case #" + caseNumber + ": ");

			// SOLUTION HERE
			int firstRow = Integer.parseInt(in.readLine()) - 1;
			int[][] firstCard = new int[4][4];
			for (int i = 0; i < 4; i++) {
				String[] row = in.readLine().split(" ");
				for (int j = 0; j < 4; j++) {
					firstCard[i][j] = Integer.parseInt(row[j]);
				}
			}

			int secondRow = Integer.parseInt(in.readLine()) - 1;
			int[][] secondCard = new int[4][4];
			for (int i = 0; i < 4; i++) {
				String[] row = in.readLine().split(" ");
				for (int j = 0; j < 4; j++) {
					secondCard[i][j] = Integer.parseInt(row[j]);
				}
			}

			int card = -1;
			boolean cheat = false;
			outer:
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (firstCard[firstRow][i] == secondCard[secondRow][j]) {
						if (card == -1) {
							card = firstCard[firstRow][i];
						} else {
							cheat = true;
							break outer;
						}
					}
				}
			}
			if (!cheat) {
				out.write(card > -1 ? "" + card : "Volunteer cheated!");
			} else {
				out.write("Bad magician!");
			}

			out.write('\n');
		}

		out.close();
	}
}
