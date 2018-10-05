package methodEmbedding.Standing_Ovation.S.LYD406;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {
	
	public static String INPUT_FILENAME = "D:\\googlecodejam\\in.txt";
	public static String OUTPUT_FILENAME = "D:\\googlecodejam\\out.txt";

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader(INPUT_FILENAME));
		PrintWriter outFile = new PrintWriter(OUTPUT_FILENAME);
		
		int totalTestCases = Integer.parseInt(inFile.next());
		int currentCase = 0;
		int maxShyness;
		int currentShyness;
		int membersOfCurrentShyness;
		int standing;
		int friends;
		
		//Begin working cases
		while (currentCase < totalTestCases) {
			currentCase++;
			inFile.nextLine();
			maxShyness = inFile.nextInt();
			currentShyness = 0;
			standing = 0;
			friends = 0;
			inFile.useDelimiter(""); //Start going character by character, and skip over space to get to data
			inFile.next();
			//Start working problem
			while (currentShyness <= maxShyness) {
				membersOfCurrentShyness = Integer.parseInt(inFile.next());
				if (membersOfCurrentShyness > 0) {
					while (standing < currentShyness){
						friends++; //not enough to continue, add a friend
						standing++;
					}
				}
				standing = standing + membersOfCurrentShyness;
				currentShyness++;
			}
			
			outFile.println("Case #" + currentCase + ": " + friends + "\n");
			inFile.useDelimiter("\\p{javaWhitespace}+"); //Reset reader to normal delimiter for longer numbers.
		}
		
		
		inFile.close();
		outFile.close();
	}

}
