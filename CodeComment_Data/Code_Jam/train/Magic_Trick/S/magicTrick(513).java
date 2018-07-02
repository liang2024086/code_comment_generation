package methodEmbedding.Magic_Trick.S.LYD736;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class magicTrick {
	public static void main (String args[]){
		FileWriter fw = null;
		FileReader fr = null;		

		Scanner s = null;

		try {
			fw = new FileWriter("output.txt");
			fr = new FileReader("input.txt");

			s = new Scanner(fr);
		} catch(FileNotFoundException fnfe){
			System.err.println("input.txt not found!");
			fnfe.printStackTrace();
			System.exit(1);
		} catch(IOException ioe){
			System.err.println("error creating output file!");
			ioe.printStackTrace();
			System.exit(1);
		}

		String currLine;
		int cases = 0;
		int matchCounter = 0;
		int matchNumber = 0;

		int[] 		answer;
		int[][] 	inputArray;
		int[][] 	compareArray;
		int[] 		matchArray;
		String[] 	answerArray;

		// get test cases, init stuff
		cases = s.nextInt();
		System.out.println(cases + " cases");

		answerArray = new String[cases];

		// iterate through input
		for(int i = 0; i < cases; i++){
			// reset
			answer = new int[2];
			inputArray = new int[4][4];
			compareArray = new int[2][4];
			matchArray = new int[4];

			// read pertinent data
			for(int q = 0; q < 2; q++){
				answer[q] = s.nextInt();		// get number
				answer[q] -= 1;					// offset

				for(int j = 0; j < 4; j++){	// get input array
					for(int k = 0; k < 4; k++){
						inputArray[j][k] = s.nextInt();
					}
				}

				System.out.println("Input array1\n" + Arrays.deepToString(inputArray));

				for(int j = 0; j < 4; j++){
					compareArray[q][j] = inputArray[answer[q]][j];
				}

				System.out.println("Chosen row\n" + Arrays.toString(inputArray[answer[q]]));
			}

			// compare matches
			matchCounter = 0;
			matchNumber = 0;
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					if(compareArray[0][j] == compareArray[1][k]){
						matchArray[matchCounter] = compareArray[0][j];
						matchCounter += 1;
						break;
					}
				}
			}
				System.out.println("Match array\n" + Arrays.toString(matchArray));

			// check conditions - one match, multiple match, no match
				if(matchCounter == 1){
					for(int j = 0; j < 4; j++){
						if(matchArray[j] != 0){
							answerArray[i] = Integer.toString(matchArray[j]);
							break;
						}
					}
				} else if(matchCounter > 1){
					answerArray[i] = "Bad magician!";
				} else if(matchCounter == 0){
					answerArray[i] = "Volunteer cheated!";
				}

			try {
				fw.write("Case #" + (i+1) + ": " + answerArray[i] + "\n");
				fw.flush();
			} catch (Exception e){
				System.err.println("Failed writing to output.txt!");
				e.printStackTrace();
				System.exit(1);
			}
		}

	}
}
