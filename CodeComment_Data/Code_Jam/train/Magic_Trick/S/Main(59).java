package methodEmbedding.Magic_Trick.S.LYD117;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int[][] rgGrid1 = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
				{ 0, 0, 0, 0 } };
		int[][] rgGrid2 = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
				{ 0, 0, 0, 0 } };
		int[] rgCount = new int[16];

		int T = 0;
		File fin = new File("A-small-attempt1.in");
		Scanner in = new Scanner(fin);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"A-small.out")));

		T = in.nextInt();

		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 4; j++) {
				Arrays.fill(rgGrid1[j], 0);
				Arrays.fill(rgGrid2[j], 0);
			}
			Arrays.fill(rgCount, 0);

			int first = in.nextInt();

			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					rgGrid1[j][k] = in.nextInt();
					if (j == first - 1) {
						rgCount[rgGrid1[j][k] - 1]++;
					}
				}
			}

			int second = in.nextInt();

			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					rgGrid2[j][k] = in.nextInt();
					if (j == second - 1) {
						rgCount[rgGrid2[j][k] - 1]++;
					}
				}
			}

			boolean bad = false;
			int card = -1;

			for (int j = 0; j < 16; j++) {
				if (rgCount[j] >= 2) {
					if (card < 0) {
						card = j;
					} else {
						bad = true;
					}
				}
			}

			if (bad) {
				out.printf("Case #%d: Bad magician!%n", i + 1);
			} else if (card >= 0) {
				out.printf("Case #%d: %d%n", i + 1, card + 1);
			} else if (card == -1) {
				out.printf("Case #%d: Volunteer cheated!%n", i + 1);
			} else {
				break;
			}
		}

		in.close();
		out.close();
	}
}
