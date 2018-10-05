package methodEmbedding.Magic_Trick.S.LYD1315;

import java.util.Scanner;


public class MagicTrick {

	public static void main( String args [] )
	{
		Scanner in = new Scanner(System.in);
		
		String n = in.nextLine();
		int nOfTests = Integer.parseInt( n );
		
		int[][] possibleArray = new int[ nOfTests ][ 2 ];
		String[][] cardArray = new String[ nOfTests ][ 2 ];
		
		for( int counterOne = 0; counterOne < nOfTests; counterOne++ )
		{
			// find card line 1
			
			String rowN = in.nextLine();
			
			for( int counterTwo = 0; counterTwo < 4; counterTwo++ )
			{
				String row = in.nextLine();

				
				if ( Integer.parseInt( rowN ) - 1 == counterTwo )
				{
					cardArray[counterOne][0] = row;
				}
				
			}
			
			// find card line 2
			
			rowN = in.nextLine();
			
			for( int counterTwo = 0; counterTwo < 4; counterTwo++ )
			{
				String row = in.nextLine();
				
				if ( Integer.parseInt( rowN ) - 1 == counterTwo )
				{
					cardArray[counterOne][1] = row;
				}
				
			}
			
		}
			
		for( int counterOne = 0; counterOne < nOfTests; counterOne++ )
		{
			String stringOne = cardArray[counterOne][0];
			String stringTwo = cardArray[counterOne][1];
			
			String[] arrayOne = stringOne.split( " " );
			String[] arrayTwo = stringTwo.split( " " );
			
			for( int counterTwo = 0; counterTwo < 4; counterTwo++ )
			{
				
				for ( int countThree = 0; countThree < 4; countThree++ )
				{
					
					if( Integer.parseInt(arrayOne[countThree]) ==
							Integer.parseInt( arrayTwo[counterTwo] ) )
					{
						possibleArray[counterOne][ 0 ] = 
								possibleArray[counterOne][0] + 1;
						possibleArray[counterOne][ 1 ] =
								Integer.parseInt(arrayTwo[counterTwo]);
					}
					
				}
				
			}
			
		}
		
		for( int counterOne = 0; counterOne < nOfTests; counterOne++ )
		{
			if( possibleArray[counterOne][0] == 0 )
			{
				System.out.println( "Case #" + ( counterOne + 1 ) +
						": Volunteer Cheated!" );
			}
			
			if( possibleArray[counterOne][0] == 1 )
			{
				System.out.println( "Case #" + ( counterOne + 1 ) +
						": " + possibleArray[counterOne][1] );
			}
			
			if( possibleArray[counterOne][0] > 1 )
			{
				System.out.println( "Case #" + ( counterOne + 1 ) +
						": Bad Magician!" );
			}
			
		}
		
	}
	
}
