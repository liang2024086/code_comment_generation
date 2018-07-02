package methodEmbedding.Standing_Ovation.S.LYD2147;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("A.in"));
		PrintWriter out = new PrintWriter("A.out");
		int tc = in.nextInt();
		int cc = 1;
		while (tc-- > 0) {
			int n = in.nextInt();
			char[] str = in.next().toCharArray();
			int r = 0;
			int sum = str[0] - '0';
			for (int i = 1; i < str.length; i++) {
				r = Math.max(r, i - sum);
				sum += str[i] - '0';
			}
			System.out.printf("Case #%d: %d\n", cc, r);
			out.printf("Case #%d: %d\n", cc, r);
			cc++;
		}
		out.close();
	}
}
