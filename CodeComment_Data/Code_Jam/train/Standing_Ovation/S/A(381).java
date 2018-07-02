package methodEmbedding.Standing_Ovation.S.LYD2092;

import java.util.Scanner;


public class A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int smax = sc.nextInt();
			int s = 0;
			int up = 0;
			long f = 0;
			for (char c : sc.next().toCharArray()) {
				int cnt = c - '0';
				if (cnt != 0) { 
					if (up < s) {
						f += s - up;
						up += (s - up);
					}
					up += cnt;
				}
				s++;
			}
			System.out.printf("Case #%d: %d\n", t, f);
		}
	}

}
