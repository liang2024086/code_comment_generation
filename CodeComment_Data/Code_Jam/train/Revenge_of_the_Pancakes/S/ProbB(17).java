package methodEmbedding.Revenge_of_the_Pancakes.S.LYD69;


import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ProbB {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("B-small.in"));
		PrintStream out = new PrintStream(new File("B-small.out"));
		
		int T = in.nextInt();
		
		for (int caseNum = 1; caseNum <= T; caseNum++) {
			char[] cs = in.next().toCharArray();
			
			char cur = cs[0];
			int count = 0;
			for (int i = 1; i < cs.length; i++) {
				if (cur != cs[i]) {
					count++;
				}
				cur = cs[i];
			}
			if (cur == '-') {
				count++;
			}
			out.printf("Case #%d: %d%n", caseNum, count);
		}
	}
}
