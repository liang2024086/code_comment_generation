package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1183;

import java.util.Scanner;
import java.io.*;

public class QB {
	public static void main(String[] args) {
		String filename = "inputfile";
		String line = null;

		try {
			Scanner input = new Scanner(new File(filename));
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

			int totalCases = Integer.parseInt(input.nextLine());

			for(int i=0; i<totalCases; i++) {
				int numFlips = 0;

				String currentLine = input.nextLine();
				char currentChar = currentLine.charAt(0);

				for(char c : currentLine.toCharArray()) {
					if(c != currentChar) {
						currentChar = c;
						numFlips++;
					}
				}

				if(currentChar == '-') numFlips++;

				writer.println("Case #" + (i+1) + ": " + numFlips);

			}

			writer.close();
		} catch(Exception ex) {
			// lol error handling
		}
	}
}
