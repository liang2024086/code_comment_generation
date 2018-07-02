package methodEmbedding.Counting_Sheep.S.LYD110;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sheep {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new File("out.txt"));
		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
			out.print("Case #" + (t + 1) + ": ");
			int N = in.nextInt(), M = 0;
			if (N == 0) {
				out.println("INSOMNIA");
				continue;
			}
			int[] D = new int[10];
			outer: while (true) {
				M += N;
				int P = (int) Math.pow(10, (int) Math.log10(M));
				for (int L = M; P > 0; L %= P, P /= 10) {
					D[L / P]++;
				}
				for (int d : D) {
					if (d == 0) {
						continue outer;
					}
				}
				break;
			}
			out.println(M);
		}
		in.close();
		out.close();
	}
}
