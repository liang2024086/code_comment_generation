package methodEmbedding.Counting_Sheep.S.LYD1407;

import java.util.Scanner;


public class CountingSheep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int x = 1; x <= T; ++x) {
			int N = sc.nextInt();
			if (N == 0) {
				System.out.println("Case #" + x + ": INSOMNIA");
			} else {
				boolean[] digits = new boolean[10];
				int left = 10;
				int i;
				loop:
				for (i = N; true; i += N) {
					int j = i;
					while (j > 0) {
						int digit = j % 10;
						if (!digits[digit]) {
							digits[digit] = true;
							--left;
							if (left == 0)
								break loop;
						}
						j /= 10;
					}
				}
				System.out.println("Case #" + x + ": " + i);
			}
		}
		sc.close();
	}

}
/*
5
0
1
2
11
1692
*/
