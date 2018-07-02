package methodEmbedding.Standing_Ovation.S.LYD190;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MainA {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.in"));
		String line = br.readLine();
		int noTestCases = Integer.valueOf(line);
		
		StringBuilder log = new StringBuilder();
		
		int counter, extra, dif;
		
		for (int i = 0; i < noTestCases; i++) {
			line = br.readLine();
			counter = 0;
			extra = 0;
			for (int j = 2; j < line.length(); j++) {
				if(j-2 > counter){
					dif = j-2 - counter;
					extra += dif;
					counter += dif;
				}
				counter += Character.getNumericValue(line.charAt(j));
			}
			
			System.out.println("Case #" + (i+1) + ": " + extra);
		}
		br.close();
		
		System.out.println(log.toString());
	}
	
}
