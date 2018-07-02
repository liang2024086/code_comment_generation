package methodEmbedding.Cookie_Clicker_Alpha.S.LYD907;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;

/**
 * 
 */

/**
 * @author baseman
 * 
 */
public class QuestionB
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		int numOfTC = 0;
		final String inputFile = "input.txt";
		final String outFile = "out.txt";
		Console c = System.console();
		try
		{
			BufferedReader br = new BufferedReader( new FileReader( inputFile ) );
			PrintWriter pw = new PrintWriter( new FileWriter( outFile ) );
			String line = br.readLine();
			if ( line != null && ! line.isEmpty() )
			{
				numOfTC = Integer.parseInt( line );
				for ( int i = 1; i <= numOfTC; i++ )
				{
					line = br.readLine();
					String[] inputs = line.split( " " );
					double result = 0;
					double C = Double.parseDouble( inputs[0] );
					double F = Double.parseDouble( inputs[1] );
					double X = Double.parseDouble( inputs[2] );
					if ( X <= C )
					{
						result = ( double ) X / 2.0d;
					} else
					{
						double cookiepersec = 2.0d;
						while ( ( X / cookiepersec ) > ( ( double ) ( C / cookiepersec ) + ( double ) ( X / ( cookiepersec + F ) ) ) )
						{
							result += ( double ) ( C / cookiepersec );
							cookiepersec += F;

						}
						result += ( double ) ( X / cookiepersec );
					}
					pw.println( "Case #" + i + ": " + new DecimalFormat( "#0.0000000" ).format( result ) );
				}
			}
			br.close();
			pw.close();
		} catch ( Exception ex )
		{
			System.out.println( "Exception: " + ex.toString() );
			c.readLine();
		}

	}

}
