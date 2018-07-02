package methodEmbedding.Magic_Trick.S.LYD2167;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int kk=1; kk<=cases; kk++) {
			int[][] arr1 = new int[4][4];
			int[][] arr2 = new int[4][4];
			boolean[] num = new boolean[16];
			Arrays.fill(num, false);
			int row1 = sc.nextInt();
			for (int i=0; i<4; i++) {
				for (int j=0; j<4; j++) {
					arr1[i][j] = sc.nextInt();
					if(row1 == i+1)
						num[arr1[i][j]-1] = true;
				}
			}
			int row2 = sc.nextInt();
			int count = 0;
			int picked = 0;
			for (int i=0; i<4; i++) {
				for (int j=0; j<4; j++) {
					arr2[i][j] = sc.nextInt();
					if (row2 == i+1) {
						if(num[arr2[i][j]-1] == true)
						{
							picked = arr2[i][j];
							count++;
						}
					}
				}
			}
			if (count == 0) {
				System.out.printf("Case #%d: Volunteer cheated!\n",kk);
			} else if (count == 1) {
				System.out.printf("Case #%d: %d\n",kk,picked);
			} else {
				System.out.printf("Case #%d: Bad magician!\n",kk);
			}
		}
	}
}
