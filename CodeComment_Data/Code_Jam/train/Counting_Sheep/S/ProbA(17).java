package methodEmbedding.Counting_Sheep.S.LYD371;


import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ProbA {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("A-small.in"));
		PrintStream out = new PrintStream(new File("A-small.out"));
		
		int T = in.nextInt();
		
		for (int caseNum = 1; caseNum <= T; caseNum++) {
				int N = in.nextInt();
				if (N == 0) {
					out.printf("Case #%d: INSOMNIA%n", caseNum);
					continue;
				}
				int seen = 0;
				int cur = N;
				while (seen != ((1 << 10) - 1)) {
					int num = cur;
					while (num > 0) {
						int digit = num % 10;
						num /= 10;
						seen |= (1 << digit);
					}
					cur += N;
				}
				out.printf("Case #%d: %d%n", caseNum, cur - N);
		}
	}
}
