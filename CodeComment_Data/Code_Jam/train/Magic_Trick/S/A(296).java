package methodEmbedding.Magic_Trick.S.LYD715;

import java.util.Scanner;
public class A {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int i = 1; i <= cases; i++) {
			int poss = 0;
			int ans = -1;
			
			int a = in.nextInt()-1;
			int[][] first = new int[4][4];
			int[][] second = new int[4][4];
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					first[j][k] = in.nextInt();
				}
			}
			int b = in.nextInt()-1;
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					second[j][k] = in.nextInt();
				}
			}
			
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(first[a][k] == second[b][j]) {
						ans = first[a][k];
						poss++;
					}
				}
			}
			
			if(poss >1) {
				System.out.printf("Case #%d: Bad magician!\n", i);
			}
			else if(poss == 1) {
				System.out.printf("Case #%d: %d\n", i, ans);
			} else {
				System.out.printf("Case #%d: Volunteer cheated!\n", i);
			}
		}
	}
}
