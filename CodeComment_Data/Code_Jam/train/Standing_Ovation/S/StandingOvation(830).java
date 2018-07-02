package methodEmbedding.Standing_Ovation.S.LYD85;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader reader = null;

		try {
			File file = new File("resources/StandingOvationSmall");
			reader = new BufferedReader(new FileReader(file));

			int numberOfTestCases = Integer.parseInt(reader.readLine());

			for (int i = 1; i < (numberOfTestCases + 1); i++) {

				String[] values = reader.readLine().split(" ");
				int sMax = Integer.parseInt(values[0]);
				
				int totalAvailablePeopleNow = 0;
				int totalPeopleNeededAndAdded = 0; 
				
				for (int j = 0; j <= sMax; j++) {
					
					if (totalAvailablePeopleNow < j) {
						int numberOfPeopleNeeded = j - totalAvailablePeopleNow;
						
						totalAvailablePeopleNow += numberOfPeopleNeeded;
						totalPeopleNeededAndAdded += numberOfPeopleNeeded;
					}
					
					int numberOfPeopleAtThisShynessLevel = Character.getNumericValue(values[1].charAt(j));
					totalAvailablePeopleNow += numberOfPeopleAtThisShynessLevel;
				}
				System.out.println("Case #" + i + ": " + totalPeopleNeededAndAdded);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
