package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1329;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class prog2 {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream(
				"input.in")));
		// Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedOutputStream(
				new FileOutputStream("output.out")));

		int T,  k;
		T = sc.nextInt();
		double pre, cur, fpre;
		double C, F, X, Y;
		for (k = 1; k <= T; k++) {
			C = sc.nextDouble();
			F = sc.nextDouble();
			X = sc.nextDouble();
			fpre = 0;
			pre = X / 2;
			Y = 2;
			for (;;) {
				fpre += (C / Y);
				Y += F;
				cur = fpre + (X / Y);
				//System.out.println(cur);
				if (cur > pre)
					break;
				pre = cur;
			}
			out.printf("Case #%d: %.7f\n", k, pre);

		}

		sc.close();
		out.close();
	}
}
