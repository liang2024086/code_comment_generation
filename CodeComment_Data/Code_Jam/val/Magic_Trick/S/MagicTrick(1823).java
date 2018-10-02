package methodEmbedding.Magic_Trick.S.LYD268;

import java.io.BufferedInputStream;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) {
		
		//read in input
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			// read in first row
			int row1 = scanner.nextInt();
			int[] grid1 = new int[4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (j == row1 - 1) {
						grid1[k] = scanner.nextInt();
					}
					else {
						scanner.nextInt();
					}
				}
			}
			
			// read in second row
			int row2 = scanner.nextInt();
			int [] grid2 = new int[4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (j == row2 - 1) {
						grid2[k] = scanner.nextInt();
					}
					else {
						scanner.nextInt();
					}
				}
			}
			
			// calculate potential answers.
			int count = 0;
			int num = 0;
			
			for (int k = 0; k < 4; k++) {
				for (int j = 0; j <4; j++) {
					if (grid1[k] == grid2[j]) {
						count++;
						num = grid1[k];
					}
				}
			}
			
			// output answer.
			if (count == 0) {
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			}
			else if (count == 1) {
				System.out.println("Case #" + (i+1) + ": " + num);
			}
			else {
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}
		}
	}
}
