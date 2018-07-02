package methodEmbedding.Standing_Ovation.S.LYD1287;

import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int j = 1; j <= t; j++) {
			int n = s.nextInt() + 1;
			String x = s.next();

			int invite = 0, a[] = new int[n];
			int p = 0;
			for (int i = 0; i < n; i++) {
				a[i] = x.charAt(i) - 48;
				if (a[i] == 0)
					continue;
				if (i > p) {
					invite += i - p;
					p += invite;
				}
				p += a[i];
				// System.out.println(p);
			}
			System.out.println("Case #" + j + ": " + invite);
		}

	}

}
