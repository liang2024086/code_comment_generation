package methodEmbedding.Counting_Sheep.S.LYD154;

import java.io.*;
import java.util.*;

public class ProblemA {

	public ProblemA() {
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		for (int t = 1; t <= tests; t++) {
			HashSet<Character> hs = new HashSet<Character>();

			long n = in.nextInt();
			if (n == 0) {
				System.out.printf("Case #%d: %s\n", t, "INSOMNIA");
			} else {
				String str = "INSOMNIA";
				int cnt = 1;
				long tmp = n;

				while (hs.size() < 10) {
					str = tmp + "";
					for (int i = 0; i < str.length(); i++) {
						hs.add(str.charAt(i));
					}
					tmp = n * cnt++;
				}
				System.out.printf("Case #%d: %s\n", t, str);
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		// System.setIn(new FileInputStream(new File("large.in")));
		System.setIn(new FileInputStream(new File("small.in")));

		// System.setOut(new PrintStream(new File("large.out")));
		System.setOut(new PrintStream(new File("small.out")));
		new ProblemA();
	}
}
