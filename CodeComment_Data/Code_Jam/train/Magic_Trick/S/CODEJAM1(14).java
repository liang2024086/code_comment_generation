package methodEmbedding.Magic_Trick.S.LYD194;


import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class CODEJAM1 {
	public static void main(String[] args) throws java.lang.Exception {
		int a = 0, b = 0, t = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][][] x = new int[101][101][101];
		int[][][] y = new int[101][101][101];
		for (int i = 1; i <= n; i++) {
			a = sc.nextInt();
			for (int p = 1; p < 5; p++) {
				for (int q = 1; q < 5; q++) {
					x[i][p][q] = sc.nextInt();
				}
			}
			b = sc.nextInt();
			for (int k = 1; k < 5; k++) {
				for (int l = 1; l < 5; l++) {
					y[i][k][l] = sc.nextInt();
				}
			}

			for (int j = 1; j < 5; j++) {
				for (int s = 1; s < 5; s++) {
					if (x[i][a][j] == y[i][b][s]) {
						count++;
						t = y[i][b][s];
					}
				}
			}
			if (count == 1) {
				System.out.println("Case #"+i+": " + t);
				count = 0;
			} else if (count >= 2) {
				System.out.println("Case #"+i+": Bad magician!");
				count = 0;
			} else {
				System.out.println("Case #"+i+": Volunteer cheated!");
				count = 0;
			}

		}
	}
}
