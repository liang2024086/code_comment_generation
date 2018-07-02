package methodEmbedding.Magic_Trick.S.LYD35;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int runs = scan.nextInt();

		for(int z = 1; z <= runs; z++) {
			int a = scan.nextInt() - 1;
			int[][] grid = new int[4][4];
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					grid[i][j] = scan.nextInt();
				}
			}

			int b = scan.nextInt() - 1;
			int[][] grid2 = new int[4][4];
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					grid2[i][j] = scan.nextInt();
				}
			}

			int count = 0, num = -1;

			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					if(grid[a][i] == grid2[b][j]) {
						num = grid[a][i];
						count++;
					}
				}
			}

			System.out.printf("Case #%d: %s\n", z, count == 0 ? "Volunteer cheated!" : count == 1 ? num : "Bad magician!");
		}
	}
}
