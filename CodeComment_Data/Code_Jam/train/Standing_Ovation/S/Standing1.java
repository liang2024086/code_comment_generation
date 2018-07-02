package methodEmbedding.Standing_Ovation.S.LYD1650;

import java.util.*;

public class Standing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int a[] = new int[T];
		for (int t = 0; t < T; t++) {
			int smax = in.nextInt();
			int b[] = new int[smax + 1];
			int ser = in.nextInt();
			int r = 0;
			int count = 0;
			int sum = 0;
			for (int i = 0; i < b.length; i++) {
				r = ser % 10;
				ser = ser / 10;
				b[b.length - i - 1] = r;
			}
			for (int i = 1; i < b.length; i++) {
				sum = 0;
				for (int j = 0; j < i; j++) {
					sum = sum + b[j];
				}
				if (sum + count < i) {
					count++;
				}
			}
			a[t] = count;
		}
		for (int i = 0; i < T; i++) {
			System.out.printf("Case #%d: %d", i + 1, a[i]);
			System.out.println();
		}
	}
}
