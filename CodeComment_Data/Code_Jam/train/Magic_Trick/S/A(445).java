package methodEmbedding.Magic_Trick.S.LYD839;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int caseNo = 1; caseNo <= T; caseNo++) {
			int row1 = in.nextInt();
			int[][] arrange1 = new int[4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arrange1[i][j] = in.nextInt();
				}
			}
			int row2 = in.nextInt();
			int[][] arrange2 = new int[4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arrange2[i][j] = in.nextInt();
				}
			}

			int count = 0;
			int num = -1;
			for (int t = 1; t <= 16; t++) {
				int r1 = -1;
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 4; j++)
						if (arrange1[i][j] == t)
							r1 = i + 1;
				int r2 = -1;
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 4; j++)
						if (arrange2[i][j] == t)
							r2 = i + 1;
				// System.out.println("r1:" + r1 + ", r2:" + r2);
				if (r1 == row1 && r2 == row2) {
					num = t;
					count++;
				}
			}
			if (count == 1)
				System.out.format("Case #%d: %d\n", caseNo, num);
			else if (count > 1)
				System.out.format("Case #%d: Bad magician!\n", caseNo);
			else
				System.out.format("Case #%d: Volunteer cheated!\n", caseNo);
		}
	}
}
