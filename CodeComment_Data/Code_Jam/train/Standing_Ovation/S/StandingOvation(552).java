package methodEmbedding.Standing_Ovation.S.LYD5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StandingOvation {

	private static final String INPUT_FILE_NAME = "resources/StandingOvation/A-small-attempt0.in";
	private static final String OUTPUT_FILE_NAME = "resources/StandingOvation/A-small-attempt0.out";

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME));
		BufferedWriter wr = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME));

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String[] line = br.readLine().split(" ");
			int Smax = Integer.parseInt(line[0]);
			int currPeople = 0;
			int extraPeople = 0;
			for (int j = 0; j < Smax+1; j++) {
				int currNum = Integer.parseInt(line[1].substring(j, j+1));
				if (currPeople >= j)
					currPeople += currNum;
				else {
					int currExtra = j - currPeople;
					extraPeople += currExtra;
					currPeople += currExtra + currNum;
				}
			}
			
			int caseNum = i+1;
			String output = "Case #" + caseNum + ":" + " " + extraPeople + "\n";
			System.out.print(output);
			wr.write(output);
		}

		br.close();
		wr.close();
	}
}
