package methodEmbedding.Magic_Trick.S.LYD2152;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicTrick {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("input.txt");
		File output = new File("output.txt");
		Scanner scanner = new Scanner(file);
		PrintWriter printer = new PrintWriter(output);
		int T = scanner.nextInt();
		int row1, row2;
		int[][] arr1 = new int[4][4], arr2 = new int[4][4];
		Set<Integer> set;
		int matches, ans = 0;

		for (int t = 0; t < T; t++) {
			matches = 0;
			set = new HashSet<Integer>();
			row1 = scanner.nextInt();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arr1[i][j] = scanner.nextInt();
					if (i == row1 - 1)
						set.add(arr1[i][j]);
				}
			}

			row2 = scanner.nextInt();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arr2[i][j] = scanner.nextInt();
					if (i == row2 - 1 && set.contains(arr2[i][j])) {
						matches++;
						ans = arr2[i][j];
					}
				}
			}

			if (matches == 1) {
				printer.write("Case #" + (t + 1) + ": " + ans);
			} else if (matches > 1) {
				printer.write("Case #" + (t + 1) + ": " + "Bad magician!");
			} else if (matches == 0) {
				printer.write("Case #" + (t + 1) + ": " + "Volunteer cheated!");
			}
			printer.write("\n");
		}
		printer.flush();
	}

}
