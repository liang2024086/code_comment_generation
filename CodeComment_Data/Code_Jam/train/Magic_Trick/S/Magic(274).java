package methodEmbedding.Magic_Trick.S.LYD1124;

import java.util.Scanner;

public class Magic
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner( System.in );
		int test = sc.nextInt();
		
		for( int i = 1; i <= test; i++ )
		{
			String result = "Volunteer cheated!";
			
			int[] array = new int[17];
			
			int first = sc.nextInt();
			
			for( int j = 1; j <= 4; j++ )
			{
				for( int k = 0; k < 4; k++ )
				{
					if( j == first )
					{
						array[sc.nextInt()]++;
					}
					else
					{
						sc.nextInt();
					}
				}
			}
			
			int second = sc.nextInt();
			int count = 0;
			for( int j = 1; j <= 4; j++ )
			{
				for( int k = 0; k < 4; k++ )
				{
					if( j == second )
					{
						int index = sc.nextInt();
						if( array[index] > 0 )
						{
							count++;
							result = index+"";
							if( count > 1 )
							{
								result = "Bad magician!";
							}
						}
					}
					else
					{
						sc.nextInt();
					}
				}
			}
			
			if( i != 1 )
				System.out.println();
			System.out.printf( "Case #%d: %s", i, result );
		}
	}
	
}
