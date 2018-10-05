package methodEmbedding.Standing_Ovation.S.LYD969;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ProblemA {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(args[1])));

		int numCases = Integer.parseInt(reader.readLine());

		for (int caseNumber = 0; caseNumber < numCases; caseNumber ++) {
			char[] levels = reader.readLine().split(" ")[1].toCharArray();
			int friendsNeeded = 0;

			int level = 0;
			int audienceSum = 0;
			for (char levelChar : levels) {
				
				int deficent = level - audienceSum;
				
				if (deficent > 0)
				{
					friendsNeeded += deficent;
					audienceSum += deficent;
				}
				
				level ++;
				
				int levelNum = Integer.parseInt(levelChar + "");
				audienceSum += levelNum;
			}
			
			writer.write("Case #" + (caseNumber+1) + ": " + friendsNeeded + "\n");
		}
		
		reader.close();
		writer.close();
	}
}
