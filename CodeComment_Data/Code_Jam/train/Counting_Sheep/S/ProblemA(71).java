package methodEmbedding.Counting_Sheep.S.LYD562;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProblemA {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String input = "C:\\Users\\weekien\\Desktop\\A-small-attempt0.in";
		String output = "C:\\Users\\weekien\\Desktop\\A-small-attempt0.out";
		Scanner sc = new Scanner(new File(input));
		FileWriter fw = new FileWriter(new File(output));
		PrintWriter pw = new PrintWriter(fw);

		int cases = sc.nextInt();

		for (int i = 1; i <= cases; i++) {
			int N = sc.nextInt();
			int N2 = N, N3 = N;
			String result = null;
			if (N == 0) {
				result = "INSOMNIA";
			} else {
				int all = 1111111111;
				do {
					int S = N % 10;
					int digit =0;
					while (N >= 10) {
						digit = (int) Math.pow(10, S);
						if (S == 0) {
							all = all % 10 != 0 ? all - 1 : all;
						} else if ((all % ((int) Math.pow(10, S + 1))) >= digit) {
							all = all - digit;
						}
						N /= 10;
						S = N % 10;
					}
					
					digit = (int) Math.pow(10, S);
					if (S == 0) {
						all = all % 10 != 0 ? all - 1 : all;
					} else if ((all % ((int) Math.pow(10, S + 1))) >= digit) {
						all = all - digit;
					}
					
					result = Integer.toString(N3);
					N3 = N3 + N2;
					N = N3;

				} while (all != 0);

			}

			pw.format("Case #%d: %s\n", i, result);

		}

		pw.close();
	}

}
