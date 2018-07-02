package methodEmbedding.Magic_Trick.S.LYD126;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Author: Patrick Colowick-Harbour Date: 4/12/14
 */
public class QualA {
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc = new Scanner(new File("A-test.in"));
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		//Scanner sc = new Scanner(new File("A-large.in"));

		int numTests = sc.nextInt();

		for (int testNum = 1; testNum <= numTests; testNum++) {
			int c1 = sc.nextInt();
			int[][] arr1 = new int[4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arr1[i][j] = sc.nextInt();
				}
			}

			int c2 = sc.nextInt();
			int[][] arr2 = new int[4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arr2[i][j] = sc.nextInt();
				}
			}

			int found = 0;
			int foundNum = -1;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (arr1[c1-1][i] == arr2[c2-1][j]) {
						found++;
						foundNum = arr1[c1-1][i];
					}
				}
			}

			if (found > 1) {
				System.out.println(String.format("Case #%d: Bad magician!", testNum));
			} else if (found < 1) {
				System.out.println(String.format("Case #%d: Volunteer cheated!", testNum));
			} else {
				System.out.println(String.format("Case #%d: %d", testNum, foundNum));
			}

		} // end all tests
		sc.close();
	}
}
