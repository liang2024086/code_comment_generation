package methodEmbedding.Magic_Trick.S.LYD1050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Magic_Trick {
	static int T, N1, N2, count, fl; // T:-number of Testcases, N1:-first
										// answer, N2:-second answer
	static String[] Output; // to store the output strings
	static int[] item;
	static int[] row1 = new int[4];
	static int[] row2 = new int[4];
	static int[][] arrangement1 = new int[4][4]; // to store the arrangements
	static int[][] arrangement2 = new int[4][4];
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	public static void main(String args[]) throws IOException {
		System.out
				.print("\nEnter the number of testcases(1 = T = 100)\n\t T :- ");
		T = Integer.parseInt(br.readLine());
		Output = new String[T];
		item = new int[T];
		for (int i = 0; i < T; i++) {
			System.out
					.print("\nAnswer the first question(1 = answer = 4)of testcase"
							+ (i + 1) + " ");
			N1 = Integer.parseInt(br.readLine());
			System.out.print("\nEnter the first arrangement of testcase"
					+ (i + 1) + ": ");
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					arrangement1[j][k] = Integer.parseInt(br.readLine());
				}
			}
			System.out
					.print("\nAnswer the second question(1 = answer = 4)of testcase"
							+ (i + 1) + ": ");
			N2 = Integer.parseInt(br.readLine());
			System.out.print("\nEnter the second arrangement of testcase"
					+ (i + 1) + ": ");
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					arrangement2[j][k] = Integer.parseInt(br.readLine());
				}
			}
			for (int t = 0; t < 4; t++) {
				row1[t] = arrangement1[N1 - 1][t]; // considering the rows
													// selected
				row2[t] = arrangement2[N2 - 1][t];
			}
			count = 0;
			for (int p = 0; p < 4; p++) { // search for the card selected
				for (int q = 0; q < 4; q++) {
					if (row1[p] == row2[q]) {
						count++;
						item[i] = row1[p];
					}
				}
			}
			fl = i + 1;
			if (count == 1) {
				Output[i] = "Case #" + fl + ": " + item[i]; // valid only when
															// there is only one
															// match
			} else if (count >= 2) {
				Output[i] = "Case #" + fl + ": Bad magician!"; // not valid for
																// 2 or more
																// matching
																// cards
			} else if (count == 0) {
				Output[i] = "Case #" + fl + "Volunteer cheated!"; // not valid
																	// for 0
																	// match
			}
		}
		for (int i = 0; i < T; i++) {
			System.out.println(Output[i]); // print the output
		}
	}
}
