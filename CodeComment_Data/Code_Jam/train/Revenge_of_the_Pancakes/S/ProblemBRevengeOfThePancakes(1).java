package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1162;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProblemBRevengeOfThePancakes {

	public static void main(String[] args) throws IOException {
		
		final BufferedReader reader = new BufferedReader(new FileReader("files/com/google/code/codejam2016/qual/B-small-attempt0.in"));
		final BufferedWriter writer = new BufferedWriter(new FileWriter("files/com/google/code/codejam2016/qual/B-small-attempt0.out"));

		final int T = Integer.parseInt(reader.readLine());
		for (int t = 0; t < T; t++) {

			char[] S = reader.readLine().toCharArray();
			int flips = 0;

			for (int i = 0; i < S.length - 1; i++) {
				if (S[i] != S[i + 1]) {
					flips++;
				}
			}

			if (S[S.length - 1] == '-') {
				flips++;
			}

//			System.out.print("Case #" + (t + 1) + ": " + flips + "\n");
			writer.write("Case #" + (t + 1) + ": " + flips + "\n");
		}
		
		reader.close();
		writer.close();
	}
}
