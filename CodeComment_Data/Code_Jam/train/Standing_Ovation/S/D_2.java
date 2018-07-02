package methodEmbedding.Standing_Ovation.S.LYD247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			String line = br.readLine();
			String[] splitted = line.split(" ");
			int sMax = Integer.parseInt(splitted[0]);
			int noFriends = 0;
			long com[] = new long[sMax + 1];
			com[0] = splitted[1].charAt(0) - '0';
			for (int j = 1; j < splitted[1].length(); j++) {
				com[j] = com[j - 1] + (splitted[1].charAt(j) - '0') ;
				if(j > com[ j - 1]){
					noFriends += (j - com[j - 1]);
					com[j] += (j - com[j - 1]);
				}
			}
			System.out.println("Case #" + i + ": " + noFriends);
		}
	}
}
