package methodEmbedding.Standing_Ovation.S.LYD454;

import java.util.*;

class A {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int numTests = sc.nextInt();
		for (int test = 1; test <= numTests; test++) {
			int maxShy = sc.nextInt();
			String input = sc.next();
			int ans = 0;
			int count = 0;
			for (int i = 0; i < input.length(); i++) {
				count += input.charAt(i) - '0' - 1;
				if (count == -1) {
					count = 0;
					++ans;
				}
			}
			System.out.printf("Case #%d: %d\n", test, ans);
		}
	}
}
