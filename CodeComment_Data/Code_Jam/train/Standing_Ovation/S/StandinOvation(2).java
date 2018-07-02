package methodEmbedding.Standing_Ovation.S.LYD475;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class StandinOvation {
	public static void main(String args[]) {

		BufferedReader br;
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("out.txt");
			br = new BufferedReader(new FileReader(new File("input.txt")));
			// br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			final int numberOfTestCases = Integer.parseInt(line);
			for (int i = 0; i < numberOfTestCases; i++) {
				line = br.readLine();
				String ss[] = line.split(" ");
				final int sMax = Integer.parseInt(ss[0]);
				int shynessLevel[] = new int[sMax + 1];

				for (int k = 0; k <= sMax; k++) {
					shynessLevel[k] = Character
							.getNumericValue(ss[1].charAt(k));
				}

				int numbOfPeopleStanding = shynessLevel[0];
				int numberOfFriendsRequired = 0;

				for (int k = 1; k <= sMax; k++) {
					if ((shynessLevel[k] != 0) && (k > numbOfPeopleStanding)) {
						int friendsToInvite = k - numbOfPeopleStanding;
						numberOfFriendsRequired += friendsToInvite;
						numbOfPeopleStanding += numberOfFriendsRequired;
					}
					numbOfPeopleStanding += shynessLevel[k];
				}

				String outPut = "Case #" + (i + 1) + ": "
						+ numberOfFriendsRequired;
				// System.out.println(outPut);
				writer.println(outPut);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null)
				writer.close();
		}

	}
}
