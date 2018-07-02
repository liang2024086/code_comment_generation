package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1566;

import java.io.*;
import java.util.*;

public class CookieClicker {

	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new FileReader
				("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter
				(new FileWriter("B-small-attempt0.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int nOfTests = Integer.parseInt( st.nextToken() );
		double[][] valueArray = new double[ nOfTests ][ 3 ]; 
		
		// input valueArray
		for( int counterOne = 0; counterOne < nOfTests; counterOne++ )
		{
			// next line
			StringTokenizer nLine = new StringTokenizer(f.readLine());
			
			for( int counterTwo = 0; counterTwo < 3; counterTwo++ )
			{
				valueArray[ counterOne ][ counterTwo ] = 
						Double.parseDouble( nLine.nextToken() );
			}
			
		}
		
		// calculations
		for( int counterOne = 0; counterOne < nOfTests; counterOne++ )
		{
			double time = 0;
			double rate = 2;
			double C = valueArray[ counterOne ][ 0 ];
			double F = valueArray[ counterOne ][ 1 ];
			double X = valueArray[ counterOne ][ 2 ];
			
			
			if ( X > C )
			{
				while( ( (X - C)/rate )> ( X / (rate + F) ) )
				{
					time += ( C/rate );
					rate += F;
					
				}
				
				time += ( X/rate );
			
			}
			
			if ( X < C )
			{
				time += ( X/rate );
				
			}
			
			out.println( "Case #" + ( counterOne + 1 ) +
						": " + time );
			
		}
		
		
		out.close();      
		
	}

}
