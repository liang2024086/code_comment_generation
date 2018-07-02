package methodEmbedding.Magic_Trick.S.LYD1951;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicTrick {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcases = scanner.nextInt();

		for (int i = 1; i <= testcases; i++) {
			List<Integer> list = new ArrayList<>();
			int answer = scanner.nextInt();
			// int[][] boar = new int[5][5];
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					int num = scanner.nextInt();
					if (answer == j) {
						list.add(num);
					}
				}
			}

			answer = scanner.nextInt();
			// String present = "false";
			int count = 0;
			int ans = 0;
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					int value = scanner.nextInt();
					if (answer == j) {
						if (list.contains(value)) {
							ans = value;
							count++;
						}
					}
				}
			}

			if (count == 0) {
				System.out.println("Case #" + i + ": Volunteer cheated!");
			} else if (count > 1) {
				System.out.println("Case #" + i + ": Bad magician!");
			} else {
				System.out.println("Case #" + i + ": " + ans);
			}
		}
		scanner.close();
	}

}
