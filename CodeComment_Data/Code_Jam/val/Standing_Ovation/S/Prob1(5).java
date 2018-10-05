package methodEmbedding.Standing_Ovation.S.LYD1733;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author kishor
 *
 */
public class Prob1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		File f = new File("/tmp/input.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
		String strLine = reader.readLine();
		String tokens[];
		int total = Integer.parseInt(strLine);
		int max, counts[];
		int nextRound = 0;
		int friends;
		String countTokens[];
		for(int i = 0; i < total; i++) {
			strLine = reader.readLine();
			tokens = strLine.split(" ");
			max = Integer.parseInt(tokens[0]);
			countTokens = tokens[1].split("(?!^)");
			counts = new int[countTokens.length];
			for(int j = 0; j < countTokens.length; j++) {
				counts[j] = Integer.parseInt(countTokens[j]);
			}
			friends = 0;
			for(int j = 0; j < counts.length; j++) {
				if(j == 0)
					nextRound = counts[j];
				else {
					if(nextRound < j) {
						friends += (j - nextRound);	
						nextRound += (j-nextRound);
					}
					nextRound += counts[j];
				}
			}
			System.out.println("Case #" + (i+1) + ": " + friends);
		}
	}

}
