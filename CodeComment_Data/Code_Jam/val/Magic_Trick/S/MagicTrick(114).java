package methodEmbedding.Magic_Trick.S.LYD1972;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrick {

	
	public static void main(String[] args) {
		String out = "./output.txt";
		String in = "./A-small-attempt0.in";
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(out));
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
		}
		Scanner sc = null;
		try {
			sc = new Scanner(new File(in));
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
		}
		int numCases = sc.nextInt();
		for (int caseNum = 1; caseNum <= numCases; caseNum++) {
			int row1 = sc.nextInt();
			int[][] cards1 = new int[4][4];
			for (int index = 0; index < 4 * 4; index++) {
				cards1[index / 4][index % 4] = sc.nextInt();
			}
			int row2 = sc.nextInt();
			int[][] cards2 = new int[4][4];
			for (int index = 0; index < 4 * 4; index++) {
				cards2[index / 4][index % 4] = sc.nextInt();
			}
			int[] myRow1 = cards1[row1 - 1];
			int[] myRow2 = cards2[row2 - 1];
			int numMatches = 0;
			int lastMatch = -1;
			for (int i = 0; i < myRow1.length; i++) {
				for (int j = 0; j < myRow2.length; j++) {
					if (myRow1[i] == myRow2[j]) {
						numMatches++;
						lastMatch = myRow1[i];
					}
				}
			}
			String message = "Bad magician!";
			if (numMatches == 0) {
				message = "Volunteer cheated!";
			} else if (numMatches == 1) {
				message = "" + lastMatch;
			}
			pw.println("Case #" + caseNum + ": " + message);
		}
		pw.flush();
		pw.close();
		sc.close();
	}

}
