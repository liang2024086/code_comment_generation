package methodEmbedding.Standing_Ovation.S.LYD774;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProblemAStandingOvation {

	public static void main(String[] args) throws IOException {

		// System.out.println(Arrays.toString("4 11111".split("")));

		File output = new File("A-small-attempt5.out");
		File input = new File("A-small-attempt5.in");
		// File output = new File("ProblemAStandingOvation.output.txt");
		// File input = new File("ProblemAStandingOvation.input.txt");

		StringBuilder builder = new StringBuilder();

		BufferedReader reader = new BufferedReader(new FileReader(input));
		try {
			String line = reader.readLine();

			/*
			 * T
			 */
			int numberOfTestCases = Integer.parseInt(line);
			for (int i = 0; i < numberOfTestCases; i++) {
				line = reader.readLine();
				String[] s = line.split("");
				int sMax = Integer.parseInt(s[1]);
				int audienceWithShynessLevel[] = new int[sMax + 1];
				for (int j = 0; j <= sMax; j++) {
					audienceWithShynessLevel[j] = Integer.parseInt(s[3 + j]);
				}

				/*
				 * solve the problem for a single test case
				 * 
				 * y, the minimum number of friends you must invite
				 */
				int invites = 0;
				int audience = audienceWithShynessLevel[0];
				for (int j = 1; j <= sMax; j++) {
					if (audienceWithShynessLevel[j] > 0
							&& audience + invites < j) {
						invites += j - audience - invites;
					}
					audience += audienceWithShynessLevel[j];
				}

				/*
				 * output
				 */
				if (i > 0) {
					builder.append("\n");
				}
				builder.append("Case #" + (i + 1) + ": " + invites);
			}
			FileWriter writer = new FileWriter(output);
			try {
				writer.write(builder.toString());
			} finally {
				writer.close();
			}
		} finally {
			reader.close();
		}

		return;
	}
}
