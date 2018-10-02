package methodEmbedding.Magic_Trick.S.LYD1633;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MagicTrick {

	public static void main(final String[] args) throws IOException {
		File inputFile = new File(
				"F:\\FINAL_YEAR_PROJECTS\\GoogleCodeJam\\Puzzles\\MagicTrick\\A-small-attempt1.in");
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
				"F:\\FINAL_YEAR_PROJECTS\\GoogleCodeJam\\Puzzles\\MagicTrick\\"
						+ inputFile.getName() + ".out")));

		int numberOfTestCases = Integer.parseInt(reader.readLine());

		int testCaseCounter = 1;
		while (testCaseCounter <= numberOfTestCases) {
			int firstRow = Integer.parseInt(reader.readLine());
			firstRow = firstRow - 1;
			int[][] firstBoard = new int[4][4];
			for (int i = 0; i < 4; i++) {
				String row = reader.readLine();
				String spilt[] = row.split(" ");
				for (int j = 0; j < 4; j++) {
					firstBoard[i][j] = Integer.parseInt(spilt[j]);
				}
			}
			int secRow = Integer.parseInt(reader.readLine());
			secRow = secRow - 1;
			int[][] secBoard = new int[4][4];
			for (int i = 0; i < 4; i++) {
				String row = reader.readLine();
				String spilt[] = row.split(" ");
				for (int j = 0; j < 4; j++) {
					secBoard[i][j] = Integer.parseInt(spilt[j]);
				}
			}

			int matches = 0;
			int matchElement = 0;
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < 4; j++) {
				list.add(secBoard[secRow][j]);
			}
			for (int j = 0; j < 4; j++) {

				if (list.contains(firstBoard[firstRow][j])) {
					matches++;
					matchElement = firstBoard[firstRow][j];
				}
			}
			if (matches == 1) {
				writer.write("Case #" + testCaseCounter + ": " + matchElement);
				writer.newLine();
			} else if (matches == 0) {
				writer.write("Case #" + testCaseCounter + ": "
						+ "Volunteer cheated!");
				writer.newLine();
			} else {
				writer.write("Case #" + testCaseCounter + ": "
						+ "Bad magician!");
				writer.newLine();
			}
			testCaseCounter++;
		}
		reader.close();
		writer.close();
	}
}
