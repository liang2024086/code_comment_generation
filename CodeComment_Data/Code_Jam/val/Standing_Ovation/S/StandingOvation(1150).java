package methodEmbedding.Standing_Ovation.S.LYD212;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(
				"/home/srinivasu/Downloads/A-small-attempt7.in"));
		String line = br.readLine();
		Integer nooftests = Integer.parseInt(line);
		for (int i = 0; i < nooftests; i++) {
			String[] input = br.readLine().split(" ");
			Integer smax = Integer.parseInt(input[0]);
			String[] data = input[1].split("");
			int totalaudience = 0;
			int totalmyfriends = 0;
			for (int j = 0; j <= smax; j++) {
				if (j == 0) {
					totalaudience = totalaudience + Integer.parseInt(data[j]);
				} else {
					if (j > totalaudience) {
						totalmyfriends = totalmyfriends + (j - totalaudience);
						totalaudience = totalaudience + (j - totalaudience);

					}
					totalaudience = totalaudience + Integer.parseInt(data[j]);

				}
			}
			System.out.println("Case #" + (i + 1) + ": " + totalmyfriends);

		}
	}

}
