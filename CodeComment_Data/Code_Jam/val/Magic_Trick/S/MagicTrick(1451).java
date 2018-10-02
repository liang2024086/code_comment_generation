package methodEmbedding.Magic_Trick.S.LYD1413;

import java.util.Scanner;

/**
 * MagicTrick yourDescription
 *
 * @author yourName
 * @version 1.00 2014/4/12
 */
 
public class MagicTrick 
{
    public static void main( String[] args) 
	{
    	Scanner scan = new Scanner(System.in);
		int guessed;
		int[][] numbers, numbers2;
		int guess1;
		int guess2;
		int count;
		int T;
		guessed = 0;
		
			numbers = new int[4][4];
			numbers2 = new int[4][4];
			T = scan.nextInt();

			for (int i = 1; i < T + 1; i++){
				guess1 = scan.nextInt();
				
				count = 0;
				for (int j= 0; j< 4; j++){
					for (int k = 0; k < 4; k++){
						numbers[k][j] = scan.nextInt();
					}
				}
				
				guess2 = scan.nextInt();
				
				for (int j= 0; j< 4; j++){
					for (int k = 0; k < 4; k++){
						numbers2[k][j] = scan.nextInt();
					}
				}
				
				for (int j= 0; j< 4; j++){			
					for (int k = 0; k < 4; k++){
							if(	numbers[j][guess1  - 1] == numbers2[k][guess2 - 1] ){
								count++;
								guessed = numbers[j][guess1 - 1];
							}
					}
				}
				if (count == 1)
						System.out.println ("Case #" + i +": " + guessed );
				else if (count > 1)
					System.out.println ("Case #" + i + ": Bad magician!");
				else if (count == 0)
					System.out.println ("Case #" + i + ": Volunteer cheated!" );
			}
		
		

		
	}
	
} // end of class MagicTrick
