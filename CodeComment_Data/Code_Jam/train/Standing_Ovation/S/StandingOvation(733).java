package methodEmbedding.Standing_Ovation.S.LYD2132;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		try {
			new StandingOvation();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	int[] amount;

	public StandingOvation() throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter w = new BufferedWriter(new FileWriter("output"));

		int t = Integer.parseInt(sc.nextLine());
		int sMax, personsNeeded = 0;
		String[] line;
		for (int i = 0; i < t; i++) {
			personsNeeded = 0;
			line = sc.nextLine().split(" ");
			sMax = Integer.parseInt(line[0]);
			amount = new int[sMax + 1];

			for (int j = 0; j <= sMax; j++) {
				amount[j] = Integer.parseInt(line[1].substring(j, j + 1));
			}

			int personsStanding = 0;
			for (int k = 0; k <= sMax; k++) {
				if (k > personsStanding) {
					personsNeeded += k - personsStanding;
					personsStanding = k;
				}
				personsStanding += amount[k];

			}

			// PRINT OUTPUT
			w.write("Case #" + Integer.toString(i + 1) + ": "
					+ Integer.toString(personsNeeded) + "\n");
			System.out.println("Case #" + Integer.toString(i + 1) + ": "
					+ Integer.toString(personsNeeded));
		}

		sc.close();
		w.close();
	}
}
