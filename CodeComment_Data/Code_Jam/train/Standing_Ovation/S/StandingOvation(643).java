package methodEmbedding.Standing_Ovation.S.LYD954;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < n; i++) {
			String line = in.readLine();
			String[] lineAsArray = line.split(" ");
			
			int smax = Integer.parseInt(lineAsArray[0]);
			String audience = lineAsArray[1];
			
			int starter = Integer.parseInt("" + audience.charAt(0));
			int clappers = starter;
			int friends = 0;
			
			for (int j = 1; j < audience.length(); j++) {
				int diff = 0;
				if (clappers < j) {
					diff = j - clappers;
				}
				
				friends += diff;
				clappers += diff + Integer.parseInt("" + audience.charAt(j));
			}			
			
			System.out.println("Case #" + (i + 1) + ": " + friends);
		}
		

	}

}
