package methodEmbedding.Counting_Sheep.S.LYD633;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * You are strictly prohibited to copy, disclose, distribute, modify, or use
 * this program in part or as a whole without the prior written consent of
 * Samsung SDS Co., Ltd. Samsung SDS Co., Ltd., owns the intellectual
 * property rights in and to this program.
 *
 * (Copyright ??? 2016 Samsung SDS Co., Ltd. All Rights Reserved| Confidential)
 */

/**
 * @author kh325.kim
 * @since 2016. 4. 9.
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("A-small-attempt1.in"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();

			int[] numbers = new int[10];

			if (N == 0) {
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			}
			for (int j = 1; j <= 100; j++) {
				int current = N * j;

				int nanum = 1;

				do {
					nanum *= 10;
					numbers[(current % nanum) / (nanum / 10)] = 1;
				} while (current >= nanum);

				int sum = 0;
				for (int num : numbers) {
					sum += num;
				}
				if (sum == 10) {
					System.out.println("Case #" + (i + 1) + ": " + current);
					break;
				}
			}
		}
	}
}
