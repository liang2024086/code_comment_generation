package methodEmbedding.Magic_Trick.S.LYD508;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class prog1 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream("input.in")));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream("output.out")));

		int T = sc.nextInt();
		int x, y, i, j, k, c, val=0;
		int a[] = new int[4], b[] = new int[4];

		for (k=1;k<=T;k++) {

			x = sc.nextInt();
			for (i = 1; i <= 4; i++) {
				if (i == x) {
					for (j = 0; j < 4; j++) {
						a[j] = sc.nextInt();
					}
				}
				else{
					for (j = 0; j < 4; j++) {
						sc.nextInt();
					}
				}
			}

			y = sc.nextInt();
			for (i = 1; i <= 4; i++) {
				if (i == y) {
					for (j = 0; j < 4; j++) {
						b[j] = sc.nextInt();
					}
				}
				else{
					for (j = 0; j < 4; j++) {
						sc.nextInt();
					}
				}
			}
			c = 0;

			Arrays.sort(a);
			Arrays.sort(b);
			for (i = 0, j = 0; (i < 4) && (j < 4);) {
				if (a[i] == b[j]) {
					val = a[i];
					c++;
					i++;
					j++;
				} else if (a[i] > b[j]) {
					j++;
				} else {
					i++;
				}
			}
			//System.out.println(c);
			if (c == 1) {
				out.printf("Case #%d: %d\n",k, val);
			} else if (c > 1) {
				out.printf("Case #%d: Bad magician!\n",k);
			} else {
				out.printf("Case #%d: Volunteer cheated!\n",k);
			}
		}

		sc.close();
		out.close();
	}
}
