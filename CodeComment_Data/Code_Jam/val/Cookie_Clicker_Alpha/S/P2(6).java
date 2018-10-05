package methodEmbedding.Cookie_Clicker_Alpha.S.LYD926;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class P2
{
	public static void main( String args[] )
	{
		Scanner in = new Scanner( System.in );
		double c, f, x;
		
		in.useLocale( Locale.US );
		int t = in.nextInt();
		for( int i = 0; i < t; i++ )
		{
			double time = 0.0;
			double p = 0.0, taxa = 2.0;
			
			c = in.nextDouble();
			f = in.nextDouble();
			x = in.nextDouble();
			
			while( p + c < x && ( c / taxa ) + ( x / ( taxa + f ) ) < x / taxa )
			{
				time += c / taxa;
				p += c;
				taxa += f;
			} // fim de while
			
			if( p < x )
				time += x / taxa;
				
			System.out.printf( Locale.US, "Case #%d: %.7f\n", i + 1, time );
			
		} // fim de for
		
		
	} // fim de main
} // fim de classe
