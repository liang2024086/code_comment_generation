package methodEmbedding.Magic_Trick.S.LYD548;

import java.util.Scanner;


public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );

		Integer t = input.nextInt();
		for( int i = 0; i < t; i++ ) {
			int idxFirstRow = input.nextInt();
			int[] firstRow = new int[4];
			
			for( int j = 0; j < 4; j++ ) {
				for( int k = 0; k < 4; k++ ) {
					int card = input.nextInt();
					if( ( j + 1 ) == idxFirstRow ) {
						firstRow[k] = card;
					}
				}
			}

			int idxSecondRow = input.nextInt();
			int[] secondRow = new int[4];

			for( int j = 0; j < 4; j++ ) {
				for( int k = 0; k < 4; k++ ) {
					int card = input.nextInt();
					if( ( j + 1 ) == idxSecondRow ) {
						secondRow[k] = card;
					}
				}
			}

			int cardsFounded = 0;
			int idxCard = -1;
			for( int j = 0; j < 4; j++ ) {
				int card = firstRow[j];
				for( int k = 0; k < 4; k++ ) {
					if( card == secondRow[k] ) {
						cardsFounded++;
						idxCard = j;
					}
				}
			}

			if( cardsFounded == 0 ) {
				System.out.println("Case #" + ( i + 1 ) + ": Volunteer cheated!");
			} else if( cardsFounded == 1 ) {
				System.out.println("Case #" + ( i + 1 ) + ": " + firstRow[idxCard]);
			} else {
				System.out.println("Case #" + ( i + 1 ) + ": Bad magician!");
			}
		}

		input.close();
	}
}
