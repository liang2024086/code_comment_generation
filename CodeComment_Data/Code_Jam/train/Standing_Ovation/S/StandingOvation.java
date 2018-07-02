package methodEmbedding.Standing_Ovation.S.LYD937;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StandingOvation {

	private final static String FILE_NAME = "samples/A-small-attempt1.in";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

		String[] splittedLine = null;
		int testCases = 0;

		testCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCases; i++) {
			int maxShyness = 0;
			char[] audience = null;
			int friends = 0;
			int sumStandingPeople = 0;

			splittedLine = br.readLine().split(" ");
			maxShyness = Integer.parseInt(splittedLine[0]);
			audience = splittedLine[1].toCharArray();

			for (int j = 0; j <= maxShyness; j++) {
				int currentShyPeople = Integer.parseInt(audience[j] + "");
				if (sumStandingPeople < j && currentShyPeople > 0) {
					friends += j - sumStandingPeople;
					sumStandingPeople += friends;
				}
				sumStandingPeople += currentShyPeople;
			}
			System.out.println("Case #" + (i + 1) + ": " + friends);
		}
		br.close();
	}
}
