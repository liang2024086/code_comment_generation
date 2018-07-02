package methodEmbedding.Magic_Trick.S.LYD1335;

import java.util.Scanner;
import java.io.*;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		
		//start up the filereader from arguments
		Scanner in;
		try {
			in = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.out.println(args[0]);
			System.out.println("check for typos");
			return;
		}
		
		//start the filewriter
		FileWriter out = new FileWriter("output.txt");
		
		//T is the number of test cases
		int T = in.nextInt();
		
		//loop through the test cases
		for (int caseNum = 1; caseNum <= T; caseNum++) {
			int row1 = in.nextInt();									//volunteer selection
			int[] arrange1 = new int[4];
			for (int i = 0; i < row1 * 4 - 4; i++) in.nextInt();				//skip the lines before the relevant line
			for (int i = 0; i < 4; i++) arrange1[i] = in.nextInt();		//read the relevant line
			for (int i = row1 * 4; i < 16; i++) in.nextInt();				//skip the remaining lines
			
			int row2 = in.nextInt();
			int[] arrange2 = new int[4];
			for (int i = 0; i < row2 * 4 - 4; i++) in.nextInt();
			for (int i = 0; i < 4; i++) arrange2[i] = in.nextInt();
			for (int i = row2 * 4; i < 16; i++) in.nextInt();
			
			boolean screwup = false;
			int match = 0;
			for (int i: arrange1) {
				for (int j: arrange2) {									//iterate through the arrays
					if (i == j) {
						if (match != 0) screwup = true;					//if there was already a match...
						match = i;
					}
					
				}
				if (screwup) break;										//we're done here
			}
			
			if (screwup) out.write("Case #" + caseNum + ": Bad magician!\n");
			else if (match == 0) out.write("Case #" + caseNum + ": Volunteer cheated!\n");
			else out.write("Case #" + caseNum + ": " + match + "\n");
		}
		in.close();
		out.close();
	}

}
