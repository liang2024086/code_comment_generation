package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1371;

import java.util.Scanner;

public class Cookie
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner( System.in );
		int test = sc.nextInt();
		
		for( int i = 1; i <= test; i++ )
		{
			double result = 0;
			// C cost
			// F add
			// X target
			
			//start with 2
			// if no farm: ans = X/2
			// if 1 farm: ans = cost/2 + X/(2+F)
			// if 2 farms: ans = cost/2 +  cost/(2+F) + X/(2+2F)
			// ans: [ (2+F) cost + 2cost ] / 2 (2+F) + x /(2+2F)
			// if 3 farms : ans = cost/2 + cost/(2+F) + cost/(2+2F) + X/(2+3F)
			// if n farms: ans = cost/2
			
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			
			double min = X/2.0;
			double currF = F;
			double currCost = 0;
			while( true )
			{
				double tempCost = currCost + ( C/( 2+currF-F ) );
				double now = ( tempCost ) +( X/(2+currF) );
				currCost = tempCost;
				currF+=F;
				if( min > now )
				{
					//System.out.println(currCost+" heyyy\n");
					min = now;
				}
				else
				{
					break;
				}
			}
			
			if( i != 1 )
				System.out.println();
			System.out.printf( "Case #%d: %.7f", i, min );
		}
	}
	
}
