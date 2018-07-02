package methodEmbedding.Magic_Trick.S.LYD1542;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Magicks {

	/**
	 * Google Code Jam 2014 - Magic Trick problem
	 * Annelies Odermann
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner file = new Scanner(new File("magician.txt"));
			int maxCases = Integer.parseInt(file.nextLine().trim());
			int cases = 0;
			
			PrintWriter stuff = new PrintWriter(new File("results.txt"));
			
			//run once per case
			while (cases < maxCases){
				cases ++;
				int choiceOne = Integer.parseInt(file.nextLine().trim());
				String[] rowsOne = new String[4];
				for (int i = 0; i < 4; i ++){
					rowsOne[i] = file.nextLine().trim();
				}
				int choiceTwo = Integer.parseInt(file.nextLine().trim());
				String[] rowsTwo = new String[4];
				for (int i = 0; i < 4; i ++){
					rowsTwo[i] = file.nextLine().trim();
				}
				EvaluateMagician aCase = new EvaluateMagician(rowsOne[choiceOne - 1].split(" "), rowsTwo[choiceTwo - 1].split(" "));
				int results = aCase.checkMagic();
				if (results == 0){
					System.out.println("Case #" + cases + ": Bad magician!");
					stuff.println("Case #" + cases + ": Bad magician!");
				}
				else if (results == 17){
					System.out.println("Case #" + cases + ": Volunteer cheated!");
					stuff.println("Case #" + cases + ": Volunteer cheated!");
				}
				else{
					System.out.println("Case #" + cases + ": " + results);
					stuff.println("Case #" + cases + ": " + results);
				}
			}
			
			file.close();
			stuff.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File could not be read.");
		}
		
	}

}
