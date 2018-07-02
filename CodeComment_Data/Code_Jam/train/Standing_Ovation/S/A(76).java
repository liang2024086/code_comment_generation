package methodEmbedding.Standing_Ovation.S.LYD346;

import java.util.*;

public class A {
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int cases = 0; cases < t; cases++) {
			int s_max = sc.nextInt();
			String s = sc.next();

			int acc = 0;
			int to_add = 0;
			for (int i = 0; i <= s_max; i++) {
				if (acc < i) {
					to_add += i - acc;
					acc += i - acc;
				}
				acc += Integer.parseInt("" + s.charAt(i));
				// System.out.println("i=" + i + ", acc=" + acc + ", to_add=" + to_add);
			}

			System.out.printf("Case #%d: %d\n", cases + 1, to_add);
		}
	}
}
