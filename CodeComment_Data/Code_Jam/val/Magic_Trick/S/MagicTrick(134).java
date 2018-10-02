package methodEmbedding.Magic_Trick.S.LYD670;

import java.io.*;
import java.util.*;

public class MagicTrick {

	public MagicTrick() throws FileNotFoundException{
		Scanner reader = new Scanner(new File("A-small-attempt1.in"));
		PrintStream out = new PrintStream(new FileOutputStream("A-small-attempt1.out"));
		System.setOut(out);
		
		int[] cardsBefore = new int[4];
		int[] cardsAfter = new int[4];
		
		int numOfTests = reader.nextInt();
		for(int i = 1; i <= numOfTests; ++i) {
		
			int firstRowPick = reader.nextInt();
			for(int row = 1; row <= 4; ++row) {
				for(int col = 0; col < 4; ++col) {
					int cell = reader.nextInt();
					if(row == firstRowPick) {
						cardsBefore[col] = cell;
					}
				}
			}
			
			int secondRowPick = reader.nextInt();
			for(int row = 1; row <= 4; ++row) {
				for(int col = 0; col < 4; ++col) {
					int cell = reader.nextInt();
					if(row == secondRowPick) {
						cardsAfter[col] = cell;
					}
				}
			}
			
			// 1 = num, 2 = bad magic, 3 = bad volunteer

			int count = 0;
			int num = 0;
			int[] histo = new int[4];
			for(int testFirst = 0; testFirst < 4; ++testFirst) {
				for(int testSecond = 0; testSecond < 4; ++testSecond) {
					if(cardsBefore[testFirst] == cardsAfter[testSecond]) {
						num = cardsBefore[testFirst];
						++count;
					}
				}
			}

			int caseNum = 1;
			if(count > 1) caseNum = 2;
			if(count < 1) caseNum = 3;
			switch(caseNum) {
				case 1:
					System.out.println("Case #"+i+": "+num);
					break;
				case 2:
					System.out.println("Case #"+i+": Bad magician!");
					break;
				case 3:
					System.out.println("Case #"+i+": Volunteer cheated!");
					break;
				default:	// aint gonna happen
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException{
		new MagicTrick();
	}
}
