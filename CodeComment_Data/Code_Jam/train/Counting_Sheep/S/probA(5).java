package methodEmbedding.Counting_Sheep.S.LYD609;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class probA {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("outA-s.txt"));
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			Set<Character> set = new HashSet<Character>();
			long N = sc.nextLong();
			if (N > 0) {
				int j;
				for (j = 1; set.size() < 10; j++) {
					char[] str = String.valueOf(N * j).toCharArray();
					for (char ch: str) {
						set.add(ch);
					}
					//System.out.println(j);
				}
				out.printf("Case #%d: %d\n", i + 1, N * (j - 1));
			} else {
				out.printf("Case #%d: INSOMNIA\n", i + 1);
			}
		}
		sc.close();
		out.close();
	}
}
