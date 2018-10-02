package methodEmbedding.Magic_Trick.S.LYD6;

import java.util.*;

public class MagicTrick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] n1 = new int[4][4];
		int[][] n2 = new int[4][4];
		boolean[] check = new boolean[17];
		
		int numCases = sc.nextInt();
		for (int c = 1; c <= numCases; c++) {
			for (int i = 1; i <= 16; i++)
				check[i] = false;
			
			int row1 = sc.nextInt() - 1;
			for (int i = 0; i < 4; i++) 
				for (int j = 0; j < 4; j++) {
					n1[i][j] = sc.nextInt();
					if (i == row1) 
						check[n1[i][j]] = true;
				}

			boolean found = false;
			boolean bad = false;
			int value = -1;
			int row2 = sc.nextInt() - 1;
			for (int i = 0; i < 4; i++) 
				for (int j = 0; j < 4; j++) {
					n2[i][j] = sc.nextInt();
					if (i == row2) {
						if (check[n2[i][j]]) {
							if (!found) {
								found = true;
								value = n2[i][j];
							} 
							else {
								bad = true;
							}
						}
					}
				}
			
			System.out.print("Case #" + c + ": ");
			if (bad) 
				System.out.println("Bad magician!");
			else if (!found)
				System.out.println("Volunteer cheated!");
			else
				System.out.println(value);
		}
	}
}
