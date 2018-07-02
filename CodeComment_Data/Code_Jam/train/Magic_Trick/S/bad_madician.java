package methodEmbedding.Magic_Trick.S.LYD1585;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class bad_madician {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("A-small-attempt1.in");
		Scanner scanner = new Scanner(file);
		
		int T = Integer.parseInt(scanner.next());
		
		for(int i = 1; i <= T; i++){
			int row = Integer.parseInt(scanner.next()) - 1;
			int[][] cards = new int[4][4];
			
			for(int j = 0; j < 16; j++){
				cards[j/4][j%4] = Integer.parseInt(scanner.next());				
			}
			
			int[] fcards = (int[])cards[row].clone();
			
			row = Integer.parseInt(scanner.next()) - 1;
			
			for(int j = 0; j < 16; j++){
				cards[j/4][j%4] = Integer.parseInt(scanner.next());				
			}
			
			
			int[] buf = new int[4];
			for(int j = 0; j < 4; j++){
				buf[j] = -1;
			}
			
			for(int j = 0, l = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					if(cards[row][j] == fcards[k]){
						buf[l++] = cards[row][j];
					}
				}
			}
			
			if(buf[0] == -1){
				System.out.println("Case #" + i + ": Volunteer cheated!");
			} else {
				if(buf[1] == -1){
					System.out.println("Case #" + i + ": " + buf[0]);
				} else {
					System.out.println("Case #" + i + ": Bad magician!");
				}
			}
		}
	}
}
