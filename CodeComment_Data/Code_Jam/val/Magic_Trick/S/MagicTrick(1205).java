package methodEmbedding.Magic_Trick.S.LYD1448;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {
	static String fileIn = "magic.txt";
	static String fileOut = "magicOut.txt";

	public static void main(String[] args) throws IOException{

		if (args.length >= 1) fileIn = args[0];
		
		Scanner inFile = new Scanner(new FileReader(fileIn));
		Scanner line;
		
		FileWriter outFile = new FileWriter(fileOut);
		
		String topLine = inFile.nextLine(); //Ignore Top Line
		int numCases = Integer.parseInt(topLine);
		
		for (int caseNo=1; caseNo-1 < numCases; caseNo++) {
			
			ArrayList<Integer> possibleFirstCards = new ArrayList<Integer>();
			ArrayList<Integer> possibleCards = new ArrayList<Integer>();
			
			int rowNo1 = Integer.parseInt(inFile.nextLine());
			for (int r=1; r-1<4; r++){
				String cards = inFile.nextLine();
				if (r == rowNo1) {
					line = new Scanner(cards);
					while (line.hasNextInt()){
						int firstPossible = line.nextInt();
						
						possibleFirstCards.add(firstPossible);
					}
					line.close();
				}
			}
			// We have got the possible cards from the first row
			
			int rowNo2 = Integer.parseInt(inFile.nextLine());
			for (int r=1; r-1<4; r++){
				String cards = inFile.nextLine();
				if (r == rowNo2) {
					line = new Scanner(cards);
					while (line.hasNextInt()){
						int secondPossible = line.nextInt();
						
						if (possibleFirstCards.contains(secondPossible)){
							possibleCards.add(secondPossible);
						}
					}
					line.close();
				}
			}
			// We have got the possible cards from the second row
		
		String result;
		if (possibleCards.size() == 0){
			result = "Volunteer cheated!";
		} else if (possibleCards.size() == 1) {
			result = String.valueOf(possibleCards.get(0));
		} else {
			result = "Bad magician!";
		}
		
		outFile.write("Case #"+caseNo+": "+result+'\n');
		
		}
		
		outFile.close();
		inFile.close();
		System.out.println("Done!");
	}
	
}
