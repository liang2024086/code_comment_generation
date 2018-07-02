package methodEmbedding.Magic_Trick.S.LYD1350;

import java.io.File;
import java.util.*;

public class A {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("A.in"));
		int n = sc.nextInt();
		for (int csnum = 1; csnum <= n; csnum++) {
			int a1 = sc.nextInt()-1;
			int[][] b1 = new int[4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					b1[i][j] = sc.nextInt();
				}
			}
			int a2 = sc.nextInt()-1;
			int[][] b2 = new int[4][4];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					b2[i][j] = sc.nextInt();
				}
			}
			int count = 0;
			int num = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (b1[a1][i] == b2[a2][j]) {
						count++;
						num = b1[a1][i];
					}
				}
			}
			if (count == 0) {
				System.out.println("Case #" + csnum + ": " + "Volunteer cheated!");
			} else if (count == 1) {
				System.out.println("Case #" + csnum + ": " + num);
			} else {
				System.out.println("Case #" + csnum + ": " + "Bad magician!");
			}
		}
	}
}
