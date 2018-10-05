package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1201;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class probB {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("outB-s.txt"));
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			char[] S = sc.next().toCharArray();
			int ans = 0, start = 0, end;
			while (start < S.length) {
				for (end = start; end < S.length && S[start] == S[end]; end++);
				if (end != S.length) {
					ans++;
					start = end;
				} else {
					break;
				}
			}
			if (S[S.length - 1] == '-') {
				ans++;
			}
			out.printf("Case #%d: %d\n", i + 1, ans);
		}
		sc.close();
		out.close();
	}

}
