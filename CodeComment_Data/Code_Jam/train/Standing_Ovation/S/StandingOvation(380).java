package methodEmbedding.Standing_Ovation.S.LYD2058;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {
	public static void main(String[] args) {
		String inputPath = "C:\\Users\\Nando\\Downloads\\A-small-attempt0.in";
		String outputPath = "C:\\Users\\Nando\\Downloads\\output.txt";
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(outputPath);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			fileReader = new FileReader(inputPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader reader = new BufferedReader(fileReader);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		try {
			// Get the number of Test Cases
			int numberOfTestCases = Integer.valueOf(reader.readLine()); 
			StringBuilder sbr = new StringBuilder();
			for(int i=1;i<=numberOfTestCases;i++) {
				// Append the Case Number 
				sbr.append("Case #"+i+": ");
				// Get the inputs for this test case
				String[] values = reader.readLine().split(" ");
				int maxShyness = Integer.valueOf(values[0]);
				int[] shyLevel = new int[maxShyness+1];
				// For this array, the index would be the shyness level and the value would be the number of People with that level of shyness
				for(int j=0;j<=maxShyness;j++) {
					shyLevel[j] = (values[1].charAt(j)) - '0';
				}
				int minFriends = 0;
				int currentStandingSize = 0;
				// Now iterate the array to find the minimum number of friends required
				for(int k=0;k<=maxShyness;k++) {
					// If the number of people in this level is 0, there is no need to unlock this level at all
					if(shyLevel[k]==0) {
						continue;
					}
					if(k<=currentStandingSize) {
						currentStandingSize = currentStandingSize + shyLevel[k];
					} else {
						int temp = (k-currentStandingSize);
						minFriends = minFriends + temp;
						currentStandingSize = currentStandingSize + shyLevel[k] + temp;
					}
				}
				sbr.append(minFriends);
				sbr.append('\n');
			}
			writer.write(sbr.toString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
