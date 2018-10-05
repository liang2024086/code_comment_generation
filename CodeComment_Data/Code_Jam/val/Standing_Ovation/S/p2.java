package methodEmbedding.Standing_Ovation.S.LYD1196;

import java.io.*;
import java.util.Arrays;

public class p2 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("test.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ovation.out")));
		
		int T = Integer.parseInt(f.readLine());
		
		for (int i = 0; i < T; i++) {
			int numFriends = 0;
			String shyness = f.readLine();
			int sMax = Integer.parseInt(shyness.split(" ")[0]);
			char[] sChars = shyness.split(" ")[1].toCharArray();
			int[] sArray = new int[sChars.length];
			
			for (int j = 0; j < sChars.length; j++) {
				sArray[j] = Character.getNumericValue((sChars[j]));
			}
			
			/*System.out.printf("Case #%d:",i+1);
			for (int j : sArray) {
				System.out.printf(" %d", j);
			} */
			//System.out.println();
			int numStanding = sArray[0];
			for (int j = 1; j < sArray.length; j++) {
				if (numStanding < j) {
					numFriends += j-numStanding;
					numStanding += j-numStanding;
				}
				numStanding += sArray[j];
			}
			
			
			out.printf("Case #%d: %d\n",i+1,numFriends);
				
			
		}
		
		
		out.close();
		f.close();
		System.exit(0);
	}
}
