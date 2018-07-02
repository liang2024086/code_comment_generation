package methodEmbedding.Magic_Trick.S.LYD119;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class MagicTrickNew {
	public static void main(String[] args) throws FileNotFoundException,
			UnsupportedEncodingException {

		// Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(new File("input.txt"));
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

		int cases = sc.nextInt();

		int pos1, pos2;
		int[][] grid1, grid2;
		String message = "";

		for (int c = 1; c <= cases; c++) {

			pos1 = sc.nextInt() - 1;
			grid1 = new int[4][4];
			message = "";

			for (int i = 0; i < grid1.length; i++) {
				for (int j = 0; j < grid1.length; j++) {
					grid1[i][j] = sc.nextInt();
				}
			}

			pos2 = sc.nextInt() - 1;
			grid2 = new int[4][4];

			for (int i = 0; i < grid2.length; i++) {
				for (int j = 0; j < grid2.length; j++) {
					grid2[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < grid1[pos1].length; i++) {
				for (int j = 0; j < grid2[pos2].length; j++) {
					if (grid1[pos1][i] == grid2[pos2][j]) {
						if (!message.equals("")) {
							message = "Bad magician!";
						} else {
							message = "" + grid1[pos1][i];
						}
					}
				}
			}

			if (message.equals("")) {
				message = "Volunteer cheated!";
			}

			writer.println("Case #" + c + ": " + message);
		}

		writer.close();
	}
}
