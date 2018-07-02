package methodEmbedding.Standing_Ovation.S.LYD2059;

import java.io.*;

public class StandingOvation {

	
	@SuppressWarnings("unused")
	public static void main(String args[]) throws Exception{
		String filename = args[0];
		FileReader reader = new FileReader(filename);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String firstLine = bufferedReader.readLine();
		int numTestCases = Integer.valueOf(firstLine).intValue();
		
		for(int i = 0; i < numTestCases; i++){
			String[] line = bufferedReader.readLine().split(" ");
			int maxShyness = Integer.valueOf(line[0]).intValue();
			int[] audience = new int[line[1].length()];
			int needToAdd = 0;
			int sum = 0;
			for(int x = 0; x < maxShyness+1; x++){	
				audience[x] = Integer.valueOf(line[1].substring(x, x+1)).intValue();
				if(audience[x] == 0 && sum <= (x+audience[x])){
					needToAdd++;
					sum++;
				}
				sum += audience[x];
			}
			System.out.println("Case #" + (i+1) + ": " + needToAdd);
		}
		
		
		bufferedReader.close();
		
	}
}
