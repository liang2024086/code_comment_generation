package methodEmbedding.Standing_Ovation.S.LYD1311;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		String[] input = new String[] { "ovation.example","ovation.small" };
		for (String f : input) {
			Scanner scanner = new Scanner(new FileInputStream(f));
			FileWriter out = new FileWriter(f + ".out");
			int cases = scanner.nextInt();
			for (int i = 0; i < cases; i++) {
				int maxShy = scanner.nextInt() + 1;
				String attendees = scanner.nextLine().trim();
				int[] shyCounts = new int[maxShy];
				for (int j = 0; j < attendees.length(); j++) {
					shyCounts[j] = attendees.charAt(j) - '0';
				}

				System.out.println(Arrays.toString(shyCounts));

				int totalStanding = shyCounts[0];
				int added = 0;
				for (int j = 1; j < shyCounts.length; j++) {
					int requiredToStand = j - totalStanding;
					if (requiredToStand > 0 && shyCounts[j] != 0) {
						System.out.println("Adding " + requiredToStand
								+ " to allow s[" + j + "] to stand [standing="
								+ totalStanding + "]");
						added += requiredToStand;
						totalStanding += requiredToStand;
					}
					totalStanding += shyCounts[j];
				}

				out.write("Case #" + (i + 1) + ": " + added + "\n");
			}

			scanner.close();
			out.close();
		}

	}

}
