package methodEmbedding.Standing_Ovation.S.LYD1714;

import java.io.*;

public class StandingOvation {

	public static void main (String argv[]) {
		String inputFilename = argv[0];
		String outputFilename = argv[1];
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader(inputFilename));
			bw = new BufferedWriter(new FileWriter(outputFilename));
			int numOfCases = Integer.parseInt(br.readLine());
			for (int i=0; i<numOfCases; i++) {
				int numOfStanding = 0;
				int numOfFriends = 0;
				int maxShyness = Character.getNumericValue(br.read());
				br.read();	// skip ' '
				int shynessCount;
				for (int n=0; n<=maxShyness; n++) {
					shynessCount = Character.getNumericValue(br.read());
					if (shynessCount < 1)
						continue;
					if (numOfStanding<n) {
						numOfFriends += (n - numOfStanding);
						numOfStanding = n;
					}
					numOfStanding += shynessCount;
				}
				br.read();	// skip newline
				bw.write("Case #" + (i+1) + ": " + numOfFriends);
				bw.newLine();
			}
			br.close();
			bw.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
