package methodEmbedding.Magic_Trick.S.LYD1964;

import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] a = new int[4][4];
		int[][] b = new int[4][4];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					a[j][j2] = scanner.nextInt();
				}
			}
			int y = scanner.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					b[j][j2] = scanner.nextInt();
				}
			}
			int ans = 0, c = 0;
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					if (a[x - 1][j] == b[y - 1][j2]) {
						c++;
						ans = a[x - 1][j];
					}
				}
			}
			System.out.print("Case #" + (i + 1) + ": ");
			if (c == 0) System.out.println("Volunteer cheated!");
			if (c == 1) System.out.println(ans);
			if (c > 1) System.out.println("Bad magician!");
		}

	}

}
