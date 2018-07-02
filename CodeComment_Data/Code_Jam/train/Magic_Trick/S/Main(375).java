package methodEmbedding.Magic_Trick.S.LYD1356;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int[][] arrangement = new int[4][4];
			int answer = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					arrangement[j][k] = sc.nextInt();
				}
			}
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < 4; j++) {
				set.add(arrangement[answer - 1][j]);
			}
			answer = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					arrangement[j][k] = sc.nextInt();
				}
			}
			int count = 0;
			int number = -1;
			for (int j = 0; j < 4; j++) {
				if (set.contains(arrangement[answer - 1][j])) {
					count++;
					number = arrangement[answer - 1][j];
				}
			}
			if (count == 1) {
				System.out.println("Case #" + i + ": " + number);
			} else if (count == 0) {
				System.out.println("Case #" + i + ": Volunteer cheated!");
			} else {
				System.out.println("Case #" + i + ": Bad magician!");
			}
		}
		sc.close();
	}
}
