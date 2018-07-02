package methodEmbedding.Magic_Trick.S.LYD1393;

import java.util.Scanner;

public class CardMagic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[][] = new int[4][4];
		int a2[][] = new int[4][4];
		int r1, r2, t,c;
		int i, j, k;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		String re [] = new String[t];
		for (k = 0; k < t; ++k) {
			r1 = in.nextInt();
			for (i = 0; i < 4; ++i)
				for (j = 0; j < 4; ++j)
					a1[i][j] = in.nextInt();
			r2 = in.nextInt();
			for (i = 0; i < 4; ++i)
				for (j = 0; j < 4; ++j)
					a2[i][j] = in.nextInt();
			c = 0;
			for (i = 0; i < 4; ++i)
				for (j = 0; j < 4; ++j) {
					if (a1[r1 - 1][i] == a2[r2 - 1][j]) {
						++c;
						re[k] = String.valueOf(a2[r2 - 1][j]);
					}
				}
			if (c > 1)
				re[k] = "Bad magician!";
			if (c == 0)
				re[k] = "Volunteer cheated!";
		}
		for(i=0;i<t;++i)
			System.out.println("Case #"+(i+1)+": " + re[i]);
		in.close();
	}
}

