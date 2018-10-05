package methodEmbedding.Magic_Trick.S.LYD1586;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("in.txt"));
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("out.txt")));

		int t = s.nextInt();
		
		for (int i = 0; i < t; i++){
			int firstAnswer = s.nextInt();
			int[][] firstArrangement = new int[4][4];
			for (int j = 0; j < 4; j++){
				for (int k = 0; k < 4; k++){
					firstArrangement[j][k] = s.nextInt();
				}
			}
			
			int secondAnswer = s.nextInt();
			int[][] secondArrangement = new int[4][4];
			for (int j = 0; j < 4; j++){
				for (int k = 0; k < 4; k++){
					secondArrangement[j][k] = s.nextInt();
				}
			}
			
			writer.write("Case #" + (i + 1) + ": ");
			
			int duplicate = -1;
			boolean success = true;
			
			outer: for (int j = 0; j < 4; j++){
				int firstInt = firstArrangement[firstAnswer - 1][j];
				
				for (int k = 0; k < 4 ; k++){
					int secondInt = secondArrangement[secondAnswer - 1][k];
					
					if (firstInt == secondInt){
						if (duplicate != -1){
							// already found duplicate, bad magician!
							writer.write("Bad magician!");
							success = false;
							break outer;
						}else{
							duplicate = firstInt;
						}
					}
				}
			}
			
			if (success){
				if (duplicate == -1){
					// can't find duplicate, cheat player
					writer.write("Volunteer cheated!");
				}else{
					writer.write(duplicate + "");
				}
			}
			
			writer.write("\n");
		}
		
		writer.close();
	}

}
