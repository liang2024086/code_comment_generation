package methodEmbedding.Standing_Ovation.S.LYD192;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProblemAStandingOvation {

	public static void main(String[] args) throws IOException {
		
		final BufferedReader reader = new BufferedReader(new FileReader("files/com/google/code/codejam2015/qual/A-small-attempt0.in"));
		final BufferedWriter writer = new BufferedWriter(new FileWriter("files/com/google/code/codejam2015/qual/A-small-attempt0.out"));

		final int T = Integer.parseInt(reader.readLine());
		for (int t = 0; t < T; t++) {

			final String[] line = reader.readLine().split(" ");
			final int Smax = Integer.parseInt(line[0]);
			final char[] S = line[1].toCharArray();

			int totalStand = 0;
			int needToInvite = 0;

			for (int i = 0; i <= Smax; i++) {

				if (i > totalStand) {
					needToInvite += i - totalStand;
					totalStand += i - totalStand;
				}

				totalStand += Character.getNumericValue(S[i]);
			}

			writer.write("Case #" + (t + 1) + ": " + needToInvite + "\n");
		}
		
		reader.close();
		writer.close();
	}

}
