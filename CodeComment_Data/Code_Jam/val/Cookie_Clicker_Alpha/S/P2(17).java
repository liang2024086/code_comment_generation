package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1526;

import java.io.*;
import java.util.*;

public class P2 {
	public static void main (String[] args) throws FileNotFoundException {
//		Scanner sc = new Scanner (System.in);
//		PrintStream op = System.out;
		Scanner sc = new Scanner (new FileInputStream ("B-small-attempt0.in"));
		PrintStream op = new PrintStream ("output.txt");
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			double C = sc.nextDouble(), F = sc.nextDouble(), X = sc.nextDouble();
			double incr = 2.0;
			double time = 0.0;
			double min = time + X / incr;
			double pval = min, val = min;
			while (pval >= val) {
				pval = val;
				val = time + X / incr;
				min = Math.min(min, val);
				time += C / incr;
				incr += F;
			}
			op.println ("Case #" + test_case + ": " + String.format("%.7f", min));
		}
	}
}
