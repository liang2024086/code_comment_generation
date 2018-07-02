package methodEmbedding.Standing_Ovation.S.LYD1474;

import java.util.*;

public class A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int TC = sc.nextInt();
			for (int i = 1; i <= TC; ++i) {
				int max_shy = sc.nextInt();
				String s = sc.next();
				int[] shy = new int[max_shy+1];
				for (int j = 0; j <= max_shy; ++j) {
					shy[j] = Character.getNumericValue(s.charAt(j));
				}

				int total = 0;
				int needed = 0;

				for (int j = 0; j <= max_shy; ++j) {
					if (j > total) {
						needed += j - total;
						total += j - total;
					}
					total += shy[j];
					// System.out.println(shy[j]);
				}

				System.out.printf("Case #%d: %d\n", i, needed);
			}
		}
	}
}
