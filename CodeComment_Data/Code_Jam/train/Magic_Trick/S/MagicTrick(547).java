package methodEmbedding.Magic_Trick.S.LYD1312;

import java.util.Scanner;
import java.util.Arrays;


public class MagicTrick {
	public static void main(String[] args)
	{
		int tests = 0;
		int first = 0;
		int second = 0;
		
		int autoIn = 0;
		
		int found = 0;
		int card = 0;
		
		int[][] array = new int[4][4];
		int[][] array2 = new int[4][4];
		
		
		Scanner scan = new Scanner(System.in);
		
		tests = scan.nextInt();
		
		for( int i = 1; i < tests+1; i++) 
		{
			found = 0;
			card = 0;
			
			first = scan.nextInt() - 1;
			for ( int j = 0; j < 4; j++ )
			{
				for ( int k = 0; k < 4; k++ )
				{
//					autoIn++;
					array[j][k] = scan.nextInt();
				}
			}
			
			
			second = scan.nextInt() - 1;
			for ( int j = 0; j < 4; j++ )
			{
				for ( int k = 0; k < 4; k++ )
				{
					array2[j][k] = scan.nextInt();
				}
			}
			
			for ( int j = 0; j < 4; j++ )
			{
				for ( int k = 0; k < 4; k++ )
				{
					if( array[first][j] == array2[second][k] ){
						found++;
						card = array[first][j];
					}
				}
			}
			
			if( found == 0 )
			{
				System.out.println("Case #"+i+": Volunteer cheated!");
			}
			else if( found == 1 )
			{
				System.out.println("Case #"+i+": "+ card);
			}else if( found > 1)
			{
				System.out.println("Case #"+i+": Bad magician!");
			}
			

		}
	}
}
