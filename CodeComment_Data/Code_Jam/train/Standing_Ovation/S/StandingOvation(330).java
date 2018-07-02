package methodEmbedding.Standing_Ovation.S.LYD871;

import java.util.*;

public class StandingOvation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t=1; t<=T; t++) {
			int result = 0;
			int maxShyness = sc.nextInt();
			String shyness = sc.next();

			int[] clappers = new int[maxShyness+1];
			clappers[0] = 0;

			for (int i=0; i<=maxShyness; i++) {
				if (i > 0) {
					clappers[i] += clappers[i-1];
				}

				if (clappers[i] < i) {
					result += 1;
					clappers[i] += 1;
				}
				clappers[i] += Integer.parseInt((shyness.charAt(i)+""));
			}
			System.out.println("Case #" + t + ": " + result);
		}
	}
}
