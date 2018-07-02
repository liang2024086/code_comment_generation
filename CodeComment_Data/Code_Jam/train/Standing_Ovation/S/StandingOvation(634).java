package methodEmbedding.Standing_Ovation.S.LYD58;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StandingOvation {
	private static final String BASE_FILE_NAME = "small";
	private static final String BASE_FILE_PATH = "D:\\";
	private static final String INPUT_FILE_PATH = BASE_FILE_PATH + BASE_FILE_NAME + ".in";
	private static final String OUTPUT_FILE_PATH = BASE_FILE_PATH + BASE_FILE_NAME + ".out";

	public static void main(String[] args) throws IOException {
		StringBuffer answer = new StringBuffer();
		Scanner in = new Scanner(new File(INPUT_FILE_PATH));
		int testCount = in.nextInt();
		for (int testCase = 1; testCase <= testCount; testCase++) {
			int personCount = in.nextInt();
			char[] minStandingPersonList = in.next().toCharArray();
			int standingPersonCount = 0;
			int additionalPersonCount = 0;

			for (int minStandingPerson = 0; minStandingPerson < minStandingPersonList.length; minStandingPerson++) {
				int currentShynessPersonCount = Character.getNumericValue(minStandingPersonList[minStandingPerson]);
				if (standingPersonCount < minStandingPerson) {
					additionalPersonCount += (minStandingPerson - standingPersonCount);
					standingPersonCount = minStandingPerson;
				}
				
				standingPersonCount += currentShynessPersonCount;
			}
			
			answer.append("Case #" + testCase + ":" + " " + additionalPersonCount);
			answer.append("\n");
		}

		File file = new File(OUTPUT_FILE_PATH);
		BufferedWriter output = new BufferedWriter(new FileWriter(file));
		output.write(answer.toString());
		in.close();
		output.close();
	}
}
