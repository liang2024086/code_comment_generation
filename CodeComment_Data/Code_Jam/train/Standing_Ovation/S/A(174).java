package methodEmbedding.Standing_Ovation.S.LYD2080;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws Exception {
		String fileName = "A-small-attempt0";
		PrintWriter pw = new PrintWriter(fileName + ".out");
		Scanner sc = new Scanner(new File(fileName + ".in"));

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int friendsRequired = 0;

			int shyMax = sc.nextInt();

			String str = sc.next();

			int standed = 0;

			for (int i = 0; i <= shyMax; i++) {
				int count = Character.getNumericValue(str.charAt(i));
				if (standed >= i) {
					standed = standed + count;
				} else {
					int diff = i - standed;
					standed = standed + diff + count;
					friendsRequired = friendsRequired + diff;
				}
			}

			pw.println("Case #" + t + ": " + friendsRequired);
		}

		sc.close();
		pw.close();
	}
}
