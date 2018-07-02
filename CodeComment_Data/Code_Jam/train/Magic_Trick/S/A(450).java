package methodEmbedding.Magic_Trick.S.LYD398;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {
			int n = sc.nextInt() - 1;
			int a[] = new int[17];
			for (int i = 0; i < 4; i++) {
				if (i == n) {
					for (int j = 0; j < 4; j++) {
						a[sc.nextInt()]++;
					}
				} else {
					for (int j = 0; j < 4; j++) {
						sc.nextInt();
					}
				}

			}
			int m = sc.nextInt() - 1;
			for (int i = 0; i < 4; i++) {
				if (i == m) {
					for (int j = 0; j < 4; j++) {
						a[sc.nextInt()]++;
					}
				} else {
					for (int j = 0; j < 4; j++) {
						sc.nextInt();
					}
				}
			}
			int cnt = 0;
			int ans = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 2) {
					cnt++;
					ans = i;
				}
			}
			if (cnt == 1) {
				System.out.println("Case #" + t + ": " + ans);
			}
			
			cnt = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 2) {
					cnt++;
					ans = i;
				}
			}
			if (cnt > 1) {
				System.out.println("Case #" + t + ": Bad magician!");
			}
			cnt = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 1) {
					cnt++;
				}
			}
			if (cnt == 8) {
				System.out.println("Case #" + t + ": Volunteer cheated!");
			}
		}
	}
}
