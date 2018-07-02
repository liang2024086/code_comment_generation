package methodEmbedding.Magic_Trick.S.LYD2187;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class P1
{
	public static void main( String args[] )
	{
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> tmp = new ArrayList<Integer>();
		Scanner in = new Scanner( System.in );
		
		int t = in.nextInt();
		for( int i = 0; i < t; i++ )
		{
			l1.clear();
			l2.clear();
			tmp.clear();
			
			int op1 = in.nextInt();
			for( int j = 1; j <= 4; j++ )
			{
				for( int k = 1; k <= 4; k++ )
				{
					int x = in.nextInt();
					if( j == op1 )
						l1.add( x );
				} // fim de for
			} // fim de for
			
			int op2 = in.nextInt();		
			for( int j = 1; j <= 4; j++ )
			{
				for( int k = 1; k <= 4; k++ )
				{
					int x = in.nextInt();
					if( j == op2 )
						l2.add( x );
				} // fim de for
			} // fim de for
				
			for( int s1 : l1 )
			{
				for( int s2 : l2 )
				{
					if( s1 == s2 )
						tmp.add( s1 );
				} // fim de for
			} // fim de for
			
			if( tmp.isEmpty() )	
				System.out.printf( "Case #%d: Volunteer cheated!\n", i + 1 );
			else if( tmp.size() == 1 )
				System.out.printf( "Case #%d: %d\n", i + 1, tmp.get( 0 ) );
			else		
				System.out.printf( "Case #%d: Bad magician!\n", i + 1 );
			
		} // fim de for
		
		
	} // fim de main
} // fim de classe
