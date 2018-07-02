package methodEmbedding.Cookie_Clicker_Alpha.S.LYD449;

import java.util.Scanner ;
import java.io.FileWriter ; 
import java.io.FileReader ; 

class Cookie
{
	public static void main( String args[] )
	{
		try
		{
			Scanner s = new Scanner( new FileReader("A-small-attempt1.in") );
			FileWriter r = new FileWriter("output.txt");
			int T = s.nextInt() ;
			
			for( int t = 0 ; t < T ; t++ )
			{
				double C = s.nextDouble();
				double F = s.nextDouble();
				double X = s.nextDouble();
				
				int no = 0 ; 
				double rate = 2.0 ;
				double time = 0.0 ;
				
				while( true )
				{
					time += C / rate ; 
					
					double t1 = X / ( rate + F ) ;
					double t2 = ( X - C ) / ( rate ) ;
					
					if( t1 < t2 )
					{
						no = 0 ;
						rate += F ;
					}
					else
					{
						time += (X-C)/rate ;
						break ;
					}
				}
				r.write( "Case #"+(t+1)+": "+time +"\n");
				r.flush();
			}
		}
		catch(Exception e){}
	}
}
