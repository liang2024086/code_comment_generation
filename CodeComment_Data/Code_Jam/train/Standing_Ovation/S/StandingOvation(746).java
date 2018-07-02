package methodEmbedding.Standing_Ovation.S.LYD80;

import java.io.*;
import java.util.Arrays;

public class StandingOvation {
	static BufferedReader br = null;
	static BufferedWriter bw = null;
	static int numTestCases = 0;

	public StandingOvation() {
	}

	public static void main(String [] args) {
		String testCase;
		String[] input;
		int maxShyness;
		int[] audience = new int[1001];

		Arrays.fill(audience, -1); // initialize no. of ppl with each shyness level to -1
		
		try {
			br = new BufferedReader(new FileReader("A-small-attempt5.in")); // attempt to open the file
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: File not found.\n");
		}
		
		try {
			numTestCases = Integer.parseInt(br.readLine()); // get no. of test cases
			bw = new BufferedWriter(new FileWriter("output.txt"));

			for (int i = 0; i < numTestCases; i++) {
				testCase = br.readLine(); // read in each test case as a string
				input = testCase.split(" "); // split maxShyness and audience numbers
				int minFriends = 0;

				maxShyness = Integer.parseInt(input[0]);
				if (maxShyness == 0) {
					System.out.printf("Case #%d: %d\n", i+1, minFriends);
					/*bw.write("Case #%d: %d\n", i+1, minFriends);
					bw.newLine();*/
					continue;
				}
				
				for (int j = 0; j < maxShyness + 1; j++) {
					audience[j] = input[1].charAt(j) - 48; // copy audience numbers into int array
					// System.out.printf("audience[%d] = %d\n", j, audience[j]);
				}
				
				int currentSum = audience[0]; // shyness level 0, so will automatically stand up
				for (int k = 1; k < input[1].length(); k++) {
					if (audience[k] == -1) break;
					if (currentSum >= maxShyness) break;
					
					// if shyness level is k, need at least k members to stand up first
					if (k > currentSum + minFriends && audience[k] !=0) {
						minFriends = k - currentSum; 
					}

					currentSum += audience[k];
					// System.out.printf("MinFriends = %d\n", minFriends);
				}

				System.out.printf("Case #%d: %d\n", i+1, minFriends);
				/*bw.write("Case #%d: %d\n", i+1, minFriends);
				bw.newLine();*/
			}

		} catch (Exception e) {
			System.out.println("Error reading input.\n");
		}
	}
}
