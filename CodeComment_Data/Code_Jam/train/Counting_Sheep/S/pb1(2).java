package methodEmbedding.Counting_Sheep.S.LYD1603;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n;
		int init;
		int[] exist = new int[10];
		int res = 0, left = 10, tmp;
		for (int i = 1; i <= k; i++) {
			init = in.nextInt();
			n = 0;
			if (init == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			Arrays.fill(exist, 1);
			res = 0;
			left = 10;
			while (left > 0) {
				res++;
				n = res * init;
				while (n > 0) {
					tmp = n % 10;
					if (exist[tmp] != 0) {
						exist[tmp] = 0;
						left--;
					}
					n /= 10;
				}
			}
			System.out.println("Case #" + i + ": " + res * init);
		}
	}
}
