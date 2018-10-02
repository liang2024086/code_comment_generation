package methodEmbedding.Standing_Ovation.S.LYD944;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(new File("A-small-attempt2.in"));
		System.setOut(new PrintStream(new FileOutputStream(
				"A-small-attempt2.out")));
		int tests = Integer.parseInt(in.nextLine());
		String audience;
		int standing;
		int invitesTotal;
		int invites;
		
		// System.out.println("number of tests: " + tests);
		for (int i = 0; i < tests; i++) {
			String line = in.nextLine();
			audience = line.split(" ")[1];

			invitesTotal = 0;
			invites = 0;
			standing = 0;

			ArrayList<String> audienceArray = new ArrayList<String>();
			for (int j = 0; j < audience.length(); j++) {
				audienceArray.add(audience.substring(j, j + 1));
			}

			for (int k = 0; k < audienceArray.size(); k++) {

				if (standing >= k) {
					if (Integer.parseInt(audienceArray.get(k)) > 0) {
						standing += Integer.parseInt(audienceArray.get(k));
					}
				} else {
					invites = (k - standing);
					standing += invites + Integer.parseInt(audienceArray.get(k));
					invitesTotal += invites;
				}
			}

//			System.out.println("Case #" + (i + 1) + ": " + invitesTotal);
			System.out.printf("Case #%d: %d\n", (i + 1), invitesTotal);
		}

		in.close();

	}

}
