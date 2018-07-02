package methodEmbedding.Magic_Trick.S.LYD1254;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		boolean found = true;
		Scanner s = null;
		do {
			try {
				s = new Scanner(new File("input.txt"));
			} catch (FileNotFoundException e) {
				found = false;
			}
		} while (!found);

		int testCases = s.nextInt();

		for (int i = 0; i < testCases; i++) {

			System.out.print("Case #" + (i + 1) + ": ");

			int firstAnswer = s.nextInt() - 1;

			int[][] firstArrangement = new int[4][4];

			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					firstArrangement[j][j2] = s.nextInt();
				}
			}

			int secondAnswer = s.nextInt() - 1;

			int[][] secondArrangement = new int[4][4];

			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					secondArrangement[j][j2] = s.nextInt();
				}
			}

			ArrayList<Integer> results = new ArrayList<Integer>();

			int[] at = firstArrangement[firstAnswer];
			int[] bt = secondArrangement[secondAnswer];
//			for (int k = 0; k < bt.length; k++) {
//				System.out.print(at[k]+ " ");
//			}
//			System.out.println("");
//			for (int l = 0; l < bt.length; l++) {
//				System.out.print(bt[l]+" ");
//			}
//			System.out.println("");
			
			for (int j = 0; j < 4; j++) {
				int a = at[j];
				for (int k = 0; k < 4; k++) {
					if (a == bt[k])
						results.add(a);
				}
			}

			int t = results.size();

			switch (t) {
			case 0:
				System.out.println("Volunteer cheated!");
				break;

			case 1:
				System.out.println(results.get(0));
				break;

			default:
				System.out.println("Bad magician!");
				break;
			}
		}

	}

}
