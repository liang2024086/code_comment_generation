package methodEmbedding.Magic_Trick.S.LYD1941;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class TrickChecker {

	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("No input file provided.");
			System.exit(1);
		}
		
		File inputFile = new File(args[0]);
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		
		
		Scanner scanner = new Scanner(reader);
		int t = scanner.nextInt();
		
		for (int i = 1; i<=t; i++) {
			int firstPickedRow = scanner.nextInt();
			
			int[] cardsInFirstPickedRow = null;
			
			for (int j=1; j<=4; j++) {
				int[] cardsInRow = new int[4];
				
				cardsInRow[0] = scanner.nextInt();
				cardsInRow[1] = scanner.nextInt();
				cardsInRow[2] = scanner.nextInt();
				cardsInRow[3] = scanner.nextInt();
				
				if ( j == firstPickedRow ) {
					cardsInFirstPickedRow = cardsInRow;
				}
			}
			
			int secondPickedRow = scanner.nextInt();
			
			int[] cardsInSecondPickedRow = null;
			
			for (int j=1; j<=4; j++) {
				int[] cardsInRow = new int[4];
				
				cardsInRow[0] = scanner.nextInt();
				cardsInRow[1] = scanner.nextInt();
				cardsInRow[2] = scanner.nextInt();
				cardsInRow[3] = scanner.nextInt();
				
				if ( j == secondPickedRow ) {
					cardsInSecondPickedRow = cardsInRow;
				}
			}
			
			
			ArrayList<Integer> cardsInCommon = new ArrayList<Integer>();
			
			for (int firstRowCard : cardsInFirstPickedRow) {
				for (int secondRowCard : cardsInSecondPickedRow) {
					if (firstRowCard == secondRowCard) {
						cardsInCommon.add(new Integer(firstRowCard));
					}
				}
			}
			
			System.out.print("Case #" + i  + ": ");
			
			if (cardsInCommon.size() == 1) {
				System.out.println(cardsInCommon.get(0));
			}
			else if (cardsInCommon.size() == 0) {
				System.out.println("Volunteer cheated!");
			}
			else {
				System.out.println("Bad magician!");
			}
		}
		
		
		reader.close();
	}

}
