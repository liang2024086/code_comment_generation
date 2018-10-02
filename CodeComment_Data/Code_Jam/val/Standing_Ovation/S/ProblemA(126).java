package methodEmbedding.Standing_Ovation.S.LYD1522;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class ProblemA {
	public static void main(String[] args) throws IOException {
		new ProblemA();
	}

	private final int numOfTest;
	private static final int ATTEMPT_NO = 0;
	private static final int SOLVE_HARD = 0;

	int smax;
	int[] levels;

	public ProblemA() throws IOException {
//		 Scanner input = new Scanner(new File("input.txt"));
		Scanner input = new Scanner(new File("A-small-attempt" + ATTEMPT_NO + ".in"));
		Writer output = new FileWriter("A-small-attempt" + ATTEMPT_NO + ".out");
		if (SOLVE_HARD != 0) {
			input = new Scanner(new File("A-large.in"));
			output = new FileWriter("A-large.out");
		}
//		output = new BufferedWriter(new OutputStreamWriter(System.out));

		numOfTest = input.nextInt();
		for (int test = 1; test <= numOfTest; test++) {
			// read from input
			smax = input.nextInt();
			String s = input.next();
			int ans = 0;
			int standup = 0;
			for (int j = 0; j <= smax; j++) {
				int level = s.charAt(j) - '0';
				if (standup < j) {
					int need = j - standup;
					ans += need;
					standup += need;
				}
				standup += level;
			}
			output.write("Case #" + test + ": " + ans + "\n");
			output.flush();
		}

		input.close();
		output.flush();
		output.close();
	}
}
