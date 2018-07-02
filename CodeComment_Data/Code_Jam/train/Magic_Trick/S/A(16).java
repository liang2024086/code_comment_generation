package methodEmbedding.Magic_Trick.S.LYD339;

import java.util.*;

public class A{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int x = 1; x <= T; x++) {
			int row = in.nextInt() - 1;
			int[] grid1 = new int[4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i != row) {
						int a = in.nextInt();
					}
					else grid1[j] = in.nextInt();
				}
			}
			int col = in.nextInt() - 1;
			int[] grid2 = new int[4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i != col) {
						int a = in.nextInt();
					}
					else grid2[j] = in.nextInt();
				}
			}
			int count = 0;
			int num = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (grid2[j] == grid1[i]) {
						count++;
						num = grid1[i];
					}
				}
			}
			if (count == 0) System.out.println("Case #" + x + ": " + "Volunteer cheated!");
			else if (count == 1) System.out.println("Case #" + x + ": " + num);
			else System.out.println("Case #" + x + ": " + "Bad magician!");
		}
	}
}
