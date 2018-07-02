package methodEmbedding.Magic_Trick.S.LYD1588;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author festradasolano
 * 
 */
public class MagicTrick {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter out = null;

		// SMALL
		String fileIn = "files/A-small.txt"; // input file
		String fileOut = "files/A-small-output.txt"; // output file

		String input = "";
		try {
			fr = new FileReader(fileIn);
			br = new BufferedReader(fr);
			String s;
			while ((s = br.readLine()) != null)
				input += s + "\n";
			br.close();

			fw = new FileWriter(fileOut);
			bw = new BufferedWriter(fw);
			out = new PrintWriter(bw);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int nCases = Integer.parseInt(input.substring(0, input.indexOf("\n"))
				.trim());
		int line = input.indexOf("\n", 0) + 1;

		for (int i = 0; i < nCases; i++) {
			System.out.println("Case #" + i);
			
			int answerOne = Integer.parseInt(input.substring(line, input.indexOf("\n", line)));
			line = input.indexOf("\n", line) + 1;
			
			int[][] arrangeOne = new int[4][4];
			
			for (int m = 0; m < 4; m++) {
				for (int n = 0; n < 3; n++) {
					arrangeOne[m][n] = Integer.parseInt(input.substring(line, input.indexOf(" ", line)));
					line = input.indexOf(" ", line) + 1;
				}
				arrangeOne[m][3] = Integer.parseInt(input.substring(line, input.indexOf("\n", line)));
				line = input.indexOf("\n", line) + 1;
			}
			
			int answerTwo = Integer.parseInt(input.substring(line, input.indexOf("\n", line)));
			line = input.indexOf("\n", line) + 1;
			
			int[][] arrangeTwo = new int[4][4];
			
			for (int m = 0; m < 4; m++) {
				for (int n = 0; n < 3; n++) {
					arrangeTwo[m][n] = Integer.parseInt(input.substring(line, input.indexOf(" ", line)));
					line = input.indexOf(" ", line) + 1;
				}
				arrangeTwo[m][3] = Integer.parseInt(input.substring(line, input.indexOf("\n", line)));
				line = input.indexOf("\n", line) + 1;
			}
			
			int matches = 0;
			int matchingCard = 0;
			for (int m = 0; m < 4; m++) {
				for (int n = 0; n < 4; n++) {
					if (arrangeOne[answerOne - 1][m] == arrangeTwo[answerTwo - 1][n]) {
						matches++;
						matchingCard =arrangeOne[answerOne - 1][m]; 
					}
				}
			}
			
			String magicTrick = "";
			if (matches == 1) {
				magicTrick = String.valueOf(matchingCard);
			} else if(matches > 1) {
				magicTrick = "Bad magician!";
			} else {
				magicTrick = "Volunteer cheated!";
			}

			String output = "Case #" + (i + 1) + ": " + magicTrick;
			out.println(output);
			out.flush();
		}
		out.close();
		System.out.println("PROCESS COMPLETE!!");
	}

}
