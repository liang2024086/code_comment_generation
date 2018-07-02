package methodEmbedding.Magic_Trick.S.LYD628;


import java.util.*;
import java.io.*;

public class A {

	public static void main(String args[]) throws Exception {

		Scanner in = new Scanner(new File("a.in"));
		String line;
		int numCases = in.nextInt();

		for (int i = 0; i < numCases; i++) {
			int answer = in.nextInt();
			int[] firstRow = new int[4];

			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (j + 1 == answer) {
						firstRow[k] = in.nextInt();
					}
					else {
						in.nextInt();
					}
				}
			}

			answer = in.nextInt();
			int[] secondRow = new int[4];

			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (j + 1 == answer) {
						secondRow[k] = in.nextInt();
					}
					else {
						in.nextInt();
					}
				}
			}

			answer = 0;

			for (int m : firstRow) {
				for (int n : secondRow) {
					if (m == n) {
						if (answer != 0) {
							answer = -1; // more than one match
						}
						else {
							answer = m;
						}
					}
				}
			}

			System.out.printf("Case #%d: ", i + 1);
			if (answer == 0) {
				System.out.println("Volunteer cheated!");
			}
			else if (answer == -1) {
				System.out.println("Bad magician!");
			}
			else {
				System.out.println(answer);
			}

		}

	}
}
