package methodEmbedding.Magic_Trick.S.LYD2128;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MagicTrick {    
    
    public static void main(String[] args) {
		try {
			Scanner fileReader = new Scanner(new File("A-small-attempt0.in"));

			String line = fileReader.nextLine();
			int t = Integer.parseInt(line);
			FileWriter writer = new FileWriter("Output.out");

			// This loops through all the Test Cases
			for(int i = 0; i < t; i++) {
				int firstAnswer = Integer.parseInt(fileReader.nextLine());

				for(int j = 1; j < firstAnswer; j++) line = fileReader.nextLine();

				line = fileReader.nextLine();


				String[] firstRow = line.split(" ");

				for(int j = firstAnswer; j < 4;j++) line = fileReader.nextLine();

				int secondAnswer = Integer.parseInt(fileReader.nextLine());

				for(int j = 1; j < secondAnswer; j++) line = fileReader.nextLine();

				line = fileReader.nextLine();

				String[] secondRow = line.split(" ");

				for(int j = secondAnswer; j < 4;j++) line = fileReader.nextLine();

				
				
				int possibleCards = 0;
				String answer = "X";
				for(int j= 0; j < 4; j++) {
					for(int k = 0; k < 4; k++) {
						if(firstRow[j].equals(secondRow[k])) {
							possibleCards++;
							answer = firstRow[j];
						}
					}					
				}


				if(answer == "X") writer.write("Case #" + (i+1) + ": Volunteer cheated!\n");
				else if(possibleCards > 1) writer.write("Case #" + (i+1) + ": Bad magician!\n");
				else writer.write("Case #" + (i+1) + ": " + answer +"\n");
			}
			writer.close();

		} catch(FileNotFoundException fnfe) {
			System.out.println("File not found!");
		} catch(IOException ioe) {

		}
		
	}
}
