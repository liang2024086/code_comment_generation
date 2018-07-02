package methodEmbedding.Standing_Ovation.S.LYD567;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

class StandingOvation {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		PrintWriter out = new PrintWriter(args[1]);

		int numberOfCases = Integer.parseInt(in.readLine());
		for (int caseNumber = 1; caseNumber <= numberOfCases; caseNumber++) {
			String[] params = in.readLine().split(" ");
			int maxShyness = Integer.parseInt(params[0]);
			char[] audience = params[1].toCharArray();

			int numStanding = 0;
			int totalInviteesRequired = 0;
			for (int shynessLevel = 0; shynessLevel <= maxShyness; shynessLevel++) {
				if (numStanding < shynessLevel) {
					int additionalInviteesRequired = shynessLevel - numStanding;
					totalInviteesRequired += additionalInviteesRequired;
					numStanding += additionalInviteesRequired;
				}
				numStanding += Character.getNumericValue(audience[shynessLevel]);
			}

			out.println(String.format("Case #%d: %d", caseNumber, totalInviteesRequired));
		}

		in.close();
		out.close();
	}
}
