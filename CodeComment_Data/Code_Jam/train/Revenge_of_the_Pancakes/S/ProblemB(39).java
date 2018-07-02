package methodEmbedding.Revenge_of_the_Pancakes.S.LYD852;

import java.io.*;
import java.util.*;

public class ProblemB {

	public ProblemB() {
		Scanner in = new Scanner(System.in);
		int tests = Integer.parseInt(in.next());
		for (int t = 1; t <= tests; t++) {
			String toProcess = in.next();

			int result = 0;
			
			char operand = toProcess.charAt(0);
			if (operand == '-')
				result++;

			for (int i = 1; i < toProcess.length(); i++) {
				if (toProcess.charAt(i) == '-'
						&& toProcess.charAt(i - 1) == '+')
					result += 2;
			}

			System.out.printf("Case #%d: %d\n", t, result);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		// System.setIn(new FileInputStream(new File("large.in")));
		System.setIn(new FileInputStream(new File("small.in")));

		// System.setOut(new PrintStream(new File("large.out")));
		System.setOut(new PrintStream(new File("small.out")));
		new ProblemB();
	}
}
