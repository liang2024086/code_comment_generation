package methodEmbedding.Magic_Trick.S.LYD1952;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Magician {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner inputFile = new Scanner(new FileReader("inputfile.txt"));
		
		int tests = inputFile.nextInt();
		
		if(tests>100 || tests<1) {
			throw new IllegalArgumentException();
		}
		
		int firstRow, secondRow;
		
		int[] cards = new int[16];
		int[] cardsInRow = new int[4];
		
		for(int i = 0; i<tests; i++) {
			firstRow = inputFile.nextInt();
			for(int j=0; j<16; j++) {
				cards[j] = inputFile.nextInt();
			}
			secondRow = inputFile.nextInt();
			int counter = 0;
			for(int j = (firstRow-1)*4; j< ((firstRow-1)*4 + 4); j++) {
				cardsInRow[counter] = cards[j];
				counter++;
			}
			for(int j=0; j<16; j++) {
				cards[j] = inputFile.nextInt();
			}
			
			boolean cardFound = false;
			int cardResult = 0;
			boolean badMagician = false;
			for(int j = (secondRow-1)*4; j< ((secondRow-1)*4 + 4); j++) {
				for(int k = 0; k < 4; k++) {
					if(cards[j] == cardsInRow[k]) {
						if(cardFound) {
							badMagician = true;
						} else {
							cardFound = true;
							cardResult = cards[j];
						}
					}
				}
			}
			if(badMagician) {
				System.out.println("Case #" + (int) (i+1) + ": Bad magician!");
			} else if(cardFound) {
				System.out.println("Case #" + (int) (i+1) + ": " + cardResult);
			} else {
				System.out.println("Case #" + (int) (i+1) + ": Volunteer cheated!");
			}
		}
	}

}
