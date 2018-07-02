package methodEmbedding.Revenge_of_the_Pancakes.S.LYD407;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class RevengePancakes {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);

		Scanner in = new Scanner(new File("problem.in"));
		PrintStream out = new PrintStream(new File("problem.out"));

		int T = in.nextInt();

		for (int test = 1; test <= T; test++) {
			String s = in.next();


			char cur = s.charAt(0);
			int count = 1;
			for (int i=1; i<s.length(); i++) {
				char c = s.charAt(i);

				if (c != cur) {
					count++;
					cur = c;
				}
			}

			if (cur == '+') {
				count--;
			}

			out.printf("Case #%d: %d\n", test, count);
		}

	}
}
