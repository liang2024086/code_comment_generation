package methodEmbedding.Revenge_of_the_Pancakes.S.LYD331;

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
		System.setIn(new FileInputStream("B-small-attempt0.in"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			String S = sc.next();
			char[] array = S.toCharArray();

			int count = 0;
			boolean isHappy = true;
			for (int j = array.length - 1; j >= 0; j--) {
				if (isHappy && array[j] == '-') {
					count++;
					isHappy = !isHappy;
				} else if (!isHappy && array[j] == '+') {
					count++;
					isHappy = !isHappy;
				}
			}

			System.out.println("Case #" + (i + 1) + ": " + count);
		}
	}
}
