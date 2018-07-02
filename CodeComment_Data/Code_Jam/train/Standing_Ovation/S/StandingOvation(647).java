package methodEmbedding.Standing_Ovation.S.LYD1916;

import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		for (int t = 1; t <= cases; ++t) {
			int sMax = scan.nextInt() + 1;
			String str = scan.next();
			int[] persons = new int[sMax];
			int clapping = 0;
			int total = 0;

			for (int i = 0; i < sMax; i++) {
				persons[i] = str.charAt(i) - '0';
			}

			clapping = persons[0];

			for (int i = 1; i < sMax; i++) {
				while (clapping < i) {
					total++;
					clapping++;
				}

				clapping += persons[i];
			}

			System.out.println("Case #" + t + ": " + total);
		}

		scan.close();
	}
}
