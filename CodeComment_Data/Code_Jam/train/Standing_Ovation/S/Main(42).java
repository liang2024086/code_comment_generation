package methodEmbedding.Standing_Ovation.S.LYD952;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int s = 0;
			int sm = sc.nextInt();
			int sd = sc.nextInt();
			int ans = 0;
			for (int j = 0; j <= sm; j++) {
				int p = (sd / (int)Math.pow(10, sm - j)) % 10;
				if (s < j) {
					ans += j - s;
					p += j - s;
				}
				s += p;
			}
			System.out.println("Case #" + i + ": " + ans);			
		}
		sc.close();
	}
}
