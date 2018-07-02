package methodEmbedding.Counting_Sheep.S.LYD18;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for (int t = 0; t < T; t ++) {
			long N = sc.nextInt();
			if (N == 0) {
				System.out.println("Case #" + (t + 1) + ": INSOMNIA");
				continue;
			}
			set.clear();
			long oldn = N;
			long n = N;
			int i = 1;
			while (set.size() < 10) {
				oldn = n;
				while (n > 0) {
					set.add((int)(n % 10));
					n = n /10;
				}
				n = N * i;
				i ++;
			}
			System.out.println("Case #" + (t + 1) + ": " + oldn);
		}
	}
}
