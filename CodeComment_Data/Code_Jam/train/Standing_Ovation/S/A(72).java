package methodEmbedding.Standing_Ovation.S.LYD400;

import java.util.*;

class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			int max = in.nextInt();
			String s = in.next();
			int numNeeded = 0;
			int currentAmount = 0;
			for (int j = 0; j < s.length(); j++) {
				int num = Integer.parseInt(s.substring(j, j+1));
				if (currentAmount + num < j + 1) {
					numNeeded += j - (currentAmount + num) + 1;
					currentAmount += j - (currentAmount + num) + 1;
				}
				currentAmount += num;
			}
			System.out.printf("Case #%d: %d\n", i, numNeeded);
		}
	}
}
