package methodEmbedding.Standing_Ovation.S.LYD2027;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class StandingOvation 
{
	public static void main(String [] args) 
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));

			String firstLine = br.readLine();
			int numCases = Integer.parseInt(firstLine);

			PrintWriter writer = new PrintWriter("StantingOvation-out.txt", "UTF-8");

			for (int i=0; i<numCases; i++) {
				String caseDesc = br.readLine();

				int maxShyness = Integer.parseInt(caseDesc.substring(0, 1));

				int audienceSum = 0;
				int numToAdd = 0;
				for (int j=0; j<=maxShyness; j++) {
					if (j > audienceSum) {
						int difference = j - audienceSum;
						if (difference > numToAdd) {
							numToAdd = difference;
						}
					}
					int audienceForShyness = Integer.parseInt(caseDesc.substring(j+2, j+3));
					audienceSum += audienceForShyness;
				}

				writer.println("Case #" + (i+1) + ": " + numToAdd);
			}

			br.close();
			writer.close();
		} catch (Exception e) {
			System.out.println("Error!");
		}
	}
}
