package methodEmbedding.Magic_Trick.S.LYD1812;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AMagicTrick {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("a.in"));
		PrintWriter output = new PrintWriter("a.out");
		int cases = scan.nextInt();
		for (int k = 0; k < cases; k++) {
			int answer1 = scan.nextInt();
			int[][] first = new int[4][4];
			for (int i = 0; i < first.length; i++) {
				for (int j = 0; j < first[i].length; j++) {
					first[i][j] = scan.nextInt();
				}
			}
			int answer2 = scan.nextInt();
			int[][] second = new int[4][4];
			for (int i = 0; i < second.length; i++) {
				for (int j = 0; j < second[i].length; j++) {
					second[i][j] = scan.nextInt();
				}
			}
			int intersection = 0;
			int index = -1;
			for (int i = 0; i < first[answer1 - 1].length; i++) {
				for (int j = 0; j < second[answer2 - 1].length; j++) {
					if (first[answer1 - 1][i] == second[answer2 - 1][j]) {
						intersection++;
						index = i;
					}
				}
			}
			output.print("Case #" + (k + 1) + ": ");
			if (intersection == 0) {
				output.print("Volunteer cheated!");
			} else if (intersection == 1) {
				output.print(first[answer1 - 1][index]);
			} else {
				output.print("Bad magician!");
			}
			output.print("\n");
		}
		output.close();
	}
}
