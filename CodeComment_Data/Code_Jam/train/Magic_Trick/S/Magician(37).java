package methodEmbedding.Magic_Trick.S.LYD2032;

import java.util.*;

class Magician {
	public static void main(String[] arr) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int  t = 1; t <= T; ++t) {
			int n1 = sc.nextInt() - 1;
			
			int[][] a1 = new int[4][];
			for(int i = 0; i < 4; ++i) {
				a1[i] = new int[4];
				for(int j = 0; j < 4; ++j) {
					a1[i][j] = sc.nextInt();
				}
			}
			
			int n2 = sc.nextInt() - 1;
			
			int[][] a2 = new int[4][];
			for(int i = 0; i < 4; ++i) {
				a2[i] = new int[4];
				for(int j = 0; j < 4; ++j) {
					a2[i][j] = sc.nextInt();
				}
			}
			
			int count = 0;
			int index = -1;
			
			for (int i = 0; i < 4; ++i) {
				for (int j = 0; j < 4; ++j) {
					if (a1[n1][i] == a2[n2][j]) {
						++count;
						index = i;
					}
				}
			}
			
			if (count == 0) {
				System.out.println("Case #" + t + ": Volunteer cheated!");
			}
			else if (count == 1) {
				System.out.println("Case #" + t + ": " + a1[n1][index]);
			}
			else {
				System.out.println("Case #" + t + ": Bad magician!");
			}
		}
	}
}
