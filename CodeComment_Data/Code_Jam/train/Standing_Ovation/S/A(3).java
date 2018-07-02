package methodEmbedding.Standing_Ovation.S.LYD574;


import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		for (int t = 1; t <= T; t++) {
			String[] s = in.nextLine().split("\\s+");
			int N = Integer.parseInt(s[0]);
			char[] c = s[1].toCharArray();
			int sum = 0, ned = 0;
			for (int i = 0; i < N + 1; i++) {
				int val = c[i] - '0';
				if (val == 0) continue;
				if (i > sum) {
					int def = i - sum;
					ned += def;
					sum += def;
				}
				sum += val;
			}
			System.out.println("Case #" + t + ": " + ned);
		}

		in.close();
	}
}
