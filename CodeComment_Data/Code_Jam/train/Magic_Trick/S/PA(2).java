package methodEmbedding.Magic_Trick.S.LYD395;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PA {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("outA.txt"));
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int firstAns = sc.nextInt();
			int[][] firstArr = new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					firstArr[j][k] = sc.nextInt();
				}
			}
			int secondAns = sc.nextInt();
			int[][] secondArr = new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					secondArr[j][k] = sc.nextInt();
				}
			}
			int ans = 0;
			boolean bad = false;
			for (int j = 0; j < 4 && !bad; j++) {
				for (int k = 0; k < 4 && !bad; k++) {
					if (firstArr[firstAns - 1][j] == secondArr[secondAns - 1][k]) {
						if (ans == 0) {
							ans = firstArr[firstAns - 1][j];
						} else {
							out.printf("Case #%d: Bad magician!\n", i + 1);
							bad = true;
						}
					}
				}
			}
			if (ans != 0 && !bad) {
				out.printf("Case #%d: %d\n", i + 1, ans);
			} else if (!bad) {
				out.printf("Case #%d: Volunteer cheated!\n", i + 1);
			}
		}
		sc.close();
		out.close();
	}

}
