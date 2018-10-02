package methodEmbedding.Standing_Ovation.S.LYD9;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;


public class ProblemA {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(
				//System.in
				new File("a-small.in")
				);
		
		PrintStream out =
				//System.out;
				new PrintStream(new File("a-small.out"));
		
		int N = in.nextInt();
		
		for (int caseNum = 1; caseNum <= N; caseNum++) {
			int max = in.nextInt();
			String str = in.next();
			
			int[] counts = new int[max+1];
			
			for (int i = 0; i <= max; i++) {
				counts[i] = str.charAt(i) - '0';
			}
			
			int add = 0;
			int total = 0;
			for (int i = 0; i <= max; i++) {
				if (counts[i] == 0) continue;
				if (total < i) {
					add += i - total;
					total = i;
				}
				total += counts[i];
			}
			
			out.printf("Case #%d: %d%n", caseNum, add);
		}
	}
}
