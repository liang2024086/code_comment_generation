package methodEmbedding.Magic_Trick.S.LYD1489;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Author: eeroglu
 * Date: 12 Nis 2014 10:35:26
 * Package: 
 *
 */
public class MagicTrick {

	public static void main(String[] args) throws IOException {
		//final String inputFile = "resources/magictrick/input_test.txt";
		final String inputFile = "resources/magictrick/A-small-attempt0.in";		
		final String outputFile = "resources/magictrick/A-small-attempt0.out";
		
		Scanner reader = new Scanner(new File(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		
		int numberOfCases = reader.nextInt();
		for(int i = 0; i < numberOfCases; i++) {
			int firstGuess = reader.nextInt();
			int guessLines[] = null;
			
			int lines[] = new int[4];
			for(int j = 1; j <= 4; j++) {
				lines[0] = reader.nextInt();
				lines[1] = reader.nextInt();
				lines[2] = reader.nextInt();
				lines[3] = reader.nextInt();
				if(j == firstGuess) { guessLines = lines.clone(); } 
			}
			
			int secondGuess = reader.nextInt();
			int guessLines2[] = null;
			
			for(int j = 1; j <= 4; j++) {
				lines[0] = reader.nextInt();
				lines[1] = reader.nextInt();
				lines[2] = reader.nextInt();
				lines[3] = reader.nextInt();
				if(j == secondGuess) { guessLines2 = lines.clone(); } 
			}			
			
			List<Integer> results = new ArrayList<Integer>();
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(guessLines[j] == guessLines2[k]) {
						results.add(guessLines[j]);
					}
				}
			}
			
			if(results.isEmpty()) { writer.write("Case #" + (i + 1) + ": Volunteer cheated!"); }
			else if(results.size() == 1) { writer.write("Case #" + (i + 1) + ": " + results.get(0)); }
			else { writer.write("Case #" + (i + 1) + ": Bad magician!"); }	
			writer.write("\n");
		}
		
		reader.close();
		writer.close();
	}

}
