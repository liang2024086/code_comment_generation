package methodEmbedding.Magic_Trick.S.LYD1657;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("problem.in"));
		PrintStream out = new PrintStream(new File("problem.out"));

		int T = in.nextInt();
		for (int test = 1; test <= T; test++) {
			boolean[] f = new boolean[16];

			int row = in.nextInt();
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					int number = in.nextInt();
					if (i == row) {
						f[number - 1] = true;
					}
				}
			}

			int same = 0, res = 0;
			row = in.nextInt();
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					int number = in.nextInt();
					if (i == row && f[number - 1]) {
						same++;
						res = number;
					}
				}
			}
			out.print("Case #" + test + ": ");
			if (same == 0) {
				out.println("Volunteer cheated!");
			} else if (same == 1) {
				out.println(res);
			} else {
				out.println("Bad magician!");
			}
		}
	}
}
