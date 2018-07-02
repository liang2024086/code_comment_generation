package methodEmbedding.Magic_Trick.S.LYD496;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int iter = input.nextInt();
		for (int i = 0; i < iter; i++) {
			int row1 = input.nextInt();
			int[][] square = new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					square[j][k] = input.nextInt();
				}
			}
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < 4; j++) {
				row.add(square[row1-1][j]);
			}
			int row2 = input.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					square[j][k] = input.nextInt();
				}
			}
			ArrayList<Integer> ans = new ArrayList<Integer>();
			for (int j = 0;j < 4; j++) {
				if (row.contains(square[row2-1][j])) {
					ans.add(square[row2-1][j]);
				}
			}
			if (ans.size() == 0) {
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			}else if (ans.size() == 1) {
				System.out.println("Case #" + (i+1) + ": " + ans.get(0));
			}else {
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}
		}
	}
}
