package methodEmbedding.Magic_Trick.S.LYD607;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new File("outA"));
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			int r1 = sc.nextInt()-1;
			int B1[][] = new int[4][4];
			for(int r = 0; r < 4; r++)
				for(int c = 0; c < 4; c++)
					B1[r][c] = sc.nextInt();
			int r2 = sc.nextInt()-1;
			int B2[][] = new int[4][4];
			for(int r = 0; r < 4; r++)
				for(int c = 0; c < 4; c++)
					B2[r][c] = sc.nextInt();
			
			int cnt = 0;
			int val = -1;
			for(int c = 0; c < 4; c++) {
				int num = B1[r1][c];
				for(int d = 0; d < 4; d++) {
					if(num == B2[r2][d]) {
						cnt++;
						val = num;
					}
				}
			}
			
			if(cnt == 1) {
				pw.println("Case #"+t+": "+val);
			} else if(cnt == 0) {
				pw.println("Case #"+t+": Volunteer cheated!");
			} else {
				pw.println("Case #"+t+": Bad magician!");
			}
		}
		pw.close();
	}
}
