package methodEmbedding.Magic_Trick.S.LYD269;

import java.util.Scanner;


public class Codejam {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int sets = scanner.nextInt();
		for(int i = 0; i < sets; i++){
			int first = scanner.nextInt() - 1;
			int[][] cards = new int[4][4];
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					cards[j][k] = scanner.nextInt();
				}
			}
			int second = scanner.nextInt() - 1;
			int[][] new_cards = new int[4][4];
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					new_cards[j][k] = scanner.nextInt();
				}
			}
			int[] card_row = cards[first];
			int[] new_card_row = new_cards[second];
			int count = 0;
			int card = 0;
			for(int j=0; j<4;j++){
				int num = card_row[j];
				for(int k=0;k<4;k++){
					if(new_card_row[k] == num){
						card = num;
						count++;
					}
				}
				
			}
			if(count == 0){
				System.out.println("Volunteer cheated!");
			}
			else if(count == 1){
				System.out.println(card);
			}
			else{
				System.out.println("Bad magician!");
			}
		}
		scanner.close();
	}
	
}
