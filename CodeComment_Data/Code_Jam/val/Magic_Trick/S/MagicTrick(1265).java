package methodEmbedding.Magic_Trick.S.LYD584;

import java.util.Arrays;
import java.util.Scanner;

public class MagicTrick {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int testNum = scan.nextInt();
		boolean[] array = new boolean[16];
		int res = 0;
		for (int test = 1; test <= testNum; test++) {
			Arrays.fill(array, false);
			scan.nextLine();
			int row = scan.nextInt();
			int count = 0;
			for (int i = 1; i <= 4; i++) {
				scan.nextLine();
				if (i == row) {
					for (int j = 0; j < 4; j++) {
						array[scan.nextInt() - 1] = true;
					}
				}
			}
			scan.nextLine();
			row = scan.nextInt();
			for (int i = 1; i <= 4; i++) {
				scan.nextLine();
				if (i == row) {
					for (int j = 0; j < 4; j++) {
						int tmp = scan.nextInt();
						if (array[tmp - 1]) {
							count++;
							res = tmp;
						}
					}
				}
			}
			if (count == 0) {
				System.out.println("Case #" + test + ": Volunteer cheated!");
			} else if (count == 1) {
				System.out.println("Case #" + test + ": " + res);
			} else {
				System.out.println("Case #" + test + ": Bad magician!");
			}
		}
	}

}
