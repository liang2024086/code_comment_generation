package methodEmbedding.Standing_Ovation.S.LYD2115;

import java.io.*;
import java.util.*;

public class P1 {
	public static void main (String[] args) throws FileNotFoundException {
//		Scanner sc = new Scanner (System.in);
//		PrintStream op = System.out;
		Scanner sc = new Scanner (new FileInputStream ("D:\\Internet\\A-small-attempt0.in"));
		PrintStream op = new PrintStream ("D:\\Internet\\output.txt");
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			String inp = sc.next();
			int s = 0, n = 0;
			for (int j = 0; j <= N; j++) {
				int v = inp.charAt(j) - '0';
				if (s < j) {
					n += j - s;
					s = j;
				}
				s += v;
			}
			op.println("Case #" + i + ": " + n);
			sc.nextLine();
		}
		sc.close();
		op.close();
	}
}
