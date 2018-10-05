package methodEmbedding.Magic_Trick.S.LYD1832;


import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) {

		int[][] mat1 = new int[4][4];

		int[][] mat2 = new int[4][4];

		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();

		for (int cs = 1; cs <= cases; cs++) {

			int row1 = sc.nextInt() - 1;

			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					mat1[i][j] = sc.nextInt();

			int row2 = sc.nextInt() - 1;

			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					mat2[i][j] = sc.nextInt();

			int count = 0, ans = -1;

			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++) {
					if (mat1[row1][i] == mat2[row2][j]) {
						count++;
						ans = mat1[row1][i];
					}
				}
			
			if(count == 1) {
				System.out.println("Case #"+ cs + ": " + ans);
			} else if (count > 1) {
				System.out.println("Case #"+ cs + ": Bad magician!");
			} else {
				System.out.println("Case #"+ cs + ": Volunteer cheated!");
			}
		}
	}
}
