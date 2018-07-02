package methodEmbedding.Magic_Trick.S.LYD1287;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


class Main {
	
	public static void main(String[] args) throws IOException {
		
		int testCaseNum;
		int result1;
		int result2;
		int outputCaseNum;
		String line = "";
		BufferedReader br = null;
		int[][] case_result_1;
		int[][] case_result_2;
		int[] temp_array1;
		int[] temp_array2;
		
		
		
		
		br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		line = br.readLine();

		
		testCaseNum = Integer.parseInt(line);
		
		for (int i = 0; i < testCaseNum; i++) {
			
			String output = "";
			boolean onlyResult = false;
			
			// read test cases
			case_result_1 = new int[4][4];
			case_result_2 = new int[4][4];

			
			// read result 1
			line = br.readLine();
			result1 = Integer.parseInt(line);
			
			for (int j = 0; j < 4; j++) {	
				line = br.readLine();
				int count = 0;
				String[] tempString = new String[4];
				
				for (int k = 0; k < line.length(); k++) {
					if (line.charAt(k) != ' ') {
						if (tempString[count] == null)
							tempString[count] = ""; 
						tempString[count] += line.charAt(k);
					} else {
						count++;
					}
				}
				
				for (int n = 0; n < 4; n++) {
					case_result_1[j][n] = Integer.parseInt(tempString[n]);
				}
			}
			
			// read result 2
			line = br.readLine();
			result2 = Integer.parseInt(line);
			
			for (int j = 0; j < 4; j++) {	
				line = br.readLine();
				int count = 0;
				String[] tempString = new String[4];
				
				for (int k = 0; k < line.length(); k++) {
					if (line.charAt(k) != ' ') {
						if (tempString[count] == null)
							tempString[count] = ""; 
						tempString[count] += line.charAt(k);
					} else {
						count++;
					}
				}
				
				for (int n = 0; n < 4; n++) {
					case_result_2[j][n] = Integer.parseInt(tempString[n]);
				}
			}
			
			// judge
			temp_array1 = case_result_1[result1 - 1];
			temp_array2 = case_result_2[result2 - 1];
			
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (temp_array1[j] == temp_array2[k]) {
						if (onlyResult) {
							output = "Bad magician!";
						} else {
							output += temp_array1[j];
							onlyResult = true;
						}
						break;
					}
						
				}
			}
			
			if (output == "")
				output = "Volunteer cheated!";
			
			outputCaseNum = i + 1;
			System.out.println("Case #" + outputCaseNum + ": " + output);
			
		}		
	}
}
