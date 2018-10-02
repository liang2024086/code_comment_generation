package methodEmbedding.Magic_Trick.S.LYD625;

import java.io.InputStreamReader;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(new InputStreamReader(System.in));
		int cases = input.nextInt();
		for(int i = 0; i < cases; i++){
			int firstRow = input.nextInt() -1;
			int[][] firstArrangement = new int[4][4];
			int[][] secondArrangement = new int[4][4];
			for(int j = 0; j < 4; j++){
				for (int k = 0; k < 4; k++){
					firstArrangement[j][k] = input.nextInt();
				}
			}
			int secondRow = input.nextInt()-1;
			for(int j = 0; j < 4; j++){
				for (int k = 0; k < 4; k++){
					secondArrangement[j][k] = input.nextInt();
				}
			}
			int numMatches = 0;
			int match = 0;
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					if(firstArrangement[firstRow][j] == secondArrangement[secondRow][k]){
						numMatches++;
						match = firstArrangement[firstRow][j];
					}
				}
			}
			System.out.print("Case #" + (i+1) + ": ");
			if(numMatches > 1){
				System.out.println("Bad magician!");
			}
			else if(numMatches == 0){
				System.out.println("Volunteer cheated!");
			}else{
				System.out.println( match);
			}
		}

	}

}
