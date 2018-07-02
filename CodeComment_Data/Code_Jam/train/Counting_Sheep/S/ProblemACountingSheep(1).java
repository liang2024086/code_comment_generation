package methodEmbedding.Counting_Sheep.S.LYD1274;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ProblemACountingSheep {

	public static void main(String[] args) throws IOException {
		
		final BufferedReader reader = new BufferedReader(new FileReader("files/com/google/code/codejam2016/qual/A-small-attempt0.in"));
		final BufferedWriter writer = new BufferedWriter(new FileWriter("files/com/google/code/codejam2016/qual/A-small-attempt0.out"));

		final int T = Integer.parseInt(reader.readLine());
		for (int t = 0; t < T; t++) {

			String result = "INSOMNIA";
			long N = Long.parseLong(reader.readLine());

			if (N > 0) {
				final Set<Long> longs = new HashSet<>();

				long resIdx = 1;
				for (long i = 1; longs.size() < 10; i++) {

					resIdx = i;
					long cur = N * i;
					do {
						longs.add(cur % 10);
						cur /= 10;
					} while (cur > 0);
				}
				result = String.valueOf(N * resIdx);
			}

			System.out.print("Case #" + (t + 1) + ": " + result + "\n");
			writer.write("Case #" + (t + 1) + ": " + result + "\n");
		}
		
		reader.close();
		writer.close();
	}
}
