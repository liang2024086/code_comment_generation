package methodEmbedding.Standing_Ovation.S.LYD386;

import java.util.*;

public class A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int caze = 1; caze <= T; caze++) {
			int max = sc.nextInt();
			int[] ppl = new int[max+1];
			String str = sc.next();
			for (int i = 0; i <= max; i++) {
				ppl[i] = (int) (str.charAt(i)-'0');
			}

			int amt = 0;

			int sum = 0;

			for (int i = 0; i <= max; i++) {
				if (sum >= i) {

				} else {
					int need = Math.abs(sum-i);
					sum += need;
					amt += need;
				}
				sum += ppl[i];
			}

			System.out.printf("Case #%d: %d\n", caze, amt);
		}
	}
}
