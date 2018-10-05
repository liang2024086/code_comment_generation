package methodEmbedding.Counting_Sheep.S.LYD1141;

import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = 1;

		boolean[] check;

		// test cases
		int T = in.nextInt();
		if (1 > T || T > 100)
			return;

		while (T > 0) {
			T--;

			check = new boolean[10];

			// number chosen
			int N = in.nextInt();

			if (0 > N || N > 200) {
				return;
			}

			/*
			 * if (0 > N || N > Math.pow(10, 6)) { return; }
			 */

			if (N == 0) {
				// starting with n add one till met and asleep
				System.out.println("Case #" + x + ": INSOMNIA");
				x++;
			} else {

				// if N = 1692

				// put into char array
				char[] chars = new String("" + N).toCharArray();
				int[] digits = new int[chars.length];
				for (int i = 0; i < chars.length; i++) {
					digits[i] = Integer.parseInt("" + chars[i]);
				}

				for (int i = 0; i < digits.length; i++) {
					check[digits[i]] = true;
				}

				int y = 0;
				int m = 2;

				int temp = 0;
				boolean solved = false;
				while (!solved) {
					temp = m * N;

					// put into char array
					chars = new String("" + temp).toCharArray();
					digits = new int[chars.length];
					for (int i = 0; i < chars.length; i++) {
						digits[i] = Integer.parseInt("" + chars[i]);
					}

					for (int i = 0; i < digits.length; i++) {
						check[digits[i]] = true;
					}

					solved = true;
					for (int i = 0; i < check.length; i++) {
						if (check[i] == false) {
							solved = false;
							break;
						}
					}
					m++;
				}

				y = temp;

				// starting with n add one till met and asleep
				System.out.println("Case #" + x + ": " + y);
				x++;
			}
		}

		in.close();
	}
}
