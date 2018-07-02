package methodEmbedding.Standing_Ovation.S.LYD1466;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int no = 1; no <= T; no++) {
			int Smax = in.nextInt();
			char[] str = in.next().toCharArray();
			int[] Sk = new int[Smax + 1];
			for (int i = 0; i < Smax + 1; i++) {
				Sk[i] = str[i] - '0';
			}

			int ans = 0;
			int prev = Sk[0];
			for (int i = 1; i <= Smax; i++) {
				if (Sk[i] != 0 && prev < i) {
					ans += (i - prev);
					prev = i;
				}
				prev += Sk[i];
			}
			System.out.printf("Case #%d: %d%n", no, ans);
		}
	}
}
