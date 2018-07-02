package methodEmbedding.Magic_Trick.S.LYD1765;

import java.util.Scanner;

public class Magic_Trick {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] cards;
		int row1,row2,card = 0;
		String output;
		
		for (int i = 1; i <= t; i++) {
			cards = new int[17];
			
			//first arrangement
			row1 = in.nextInt();
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					card = in.nextInt();
					if (j == row1) {
						cards[card] += 1;
					}
				}
				
			}
			
			//second arrangement
			row2 = in.nextInt();
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					card = in.nextInt();
					if (j == row2) {
						cards[card] += 1;
					}
				}
				
			}
			
			int count = 0;
			//check cards
			for (int j = 1; j <= 16; j++) {
				if (cards[j] == 2) {
					count += 1;
					card = j;
				}
			}
			
			if (count == 1) {
				output = Integer.toString(card);
			} 
			else if (count > 1) {
				output = "Bad magician!";
			}
			else {
				output = "Volunteer cheated!";
			}
			
			System.out.println("Case #" + i + ": " + output);
		}

	}

}
