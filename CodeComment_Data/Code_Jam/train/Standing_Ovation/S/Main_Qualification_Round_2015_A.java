package methodEmbedding.Standing_Ovation.S.LYD1418;

import java.util.Scanner;


public class Main_Qualification_Round_2015_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int casei = 1; casei <= t; casei++) {
			int smax = sc.nextInt();
			char[] s = sc.next().toCharArray();

			int friends = 0;
			int sum = 0;
			for (int i = 0; i <= smax; i++) {
				int si = s[i] - '0';
				if (i == 0 && si == 0) {
					friends++;
					sum++;
				} else {
					if (sum < i) {
						friends += i - sum;
						sum += i - sum;
					}
					sum += si;
				}
			}

			System.out.printf("Case #%d: %d\n", casei, friends);
		}

		sc.close();
	}
}
