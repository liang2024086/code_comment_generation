package methodEmbedding.Standing_Ovation.S.LYD1721;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for (int c = 0; c < cases; c++) {
			int smax = input.nextInt();
			char[] digits = input.next().toCharArray();
			input.nextLine();
			int[] s = new int[smax + 1];
			for (int i = 0; i <= smax; i++) {
				s[i] = digits[i] - '0';
			}
			int claps = 0;
			int min = 0;
			for (int i = 0; i <= smax; i++) {
				if (claps < i) {
					int d = i - claps;
					claps += d;
					min += d;
				}
				claps += s[i];
			}
			System.out.println(String.format("Case #%d: %d", c+1, min));
		}
	}
}
