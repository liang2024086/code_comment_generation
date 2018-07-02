package methodEmbedding.Standing_Ovation.S.LYD906;

import java.io.*;
public class StandingOvation {

	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("//Users//AdamMcNeilly//Downloads//A-small-attempt1.in");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("//Users//AdamMcNeilly//Desktop//StandingOvationSmallInput.txt");
			BufferedWriter bw = new BufferedWriter(fw);	
			
			// Get test cases
			int numTestCases = Integer.valueOf(br.readLine());
			
			String line;
			int sMax;
			for(int i = 1; i <= numTestCases; i++){
				//Get values
				line = br.readLine();
				String[] lineSplit = line.split("\\s+");
				
				// First one is max shyness
				sMax = Integer.valueOf(lineSplit[0]);
				
				// Loop through everyone. Get the number of people clapping
				int numClapping = 0;
				int numNeeded = 0;
				for(int j = 0; j < lineSplit[1].length(); j++){
					// If the number of people clapping is LESS than
					// the index that we are at, we need to add people.
					// Once we have that, add the number who are now clapping
					if(numClapping < j){
						// Create a temp int for
						// the number of people needed at this level.
						int numNeededNow = (j - numClapping);
						numNeeded += numNeededNow;
						numClapping += numNeededNow;
					}
					
					int numWithShynessJ = Character.getNumericValue(lineSplit[1].charAt(j));
					numClapping += Integer.valueOf(numWithShynessJ);
				}
				
				// Print the case
				bw.write("Case #" + i + ": " + numNeeded);
				bw.newLine();
			}
			
			bw.close();
			br.close();
			
		} catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

}
