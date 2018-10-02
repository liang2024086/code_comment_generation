package methodEmbedding.Cookie_Clicker_Alpha.S.LYD598;


import java.util.*;
import java.io.*;
import java.text.*;

public class ProblemB {

	/**
	 * main method
	 * @param args arguments 
	 * @throws Exception exception
	 */
	public static void main(String[] args) throws Exception {
		// input
		BufferedReader reader
		= new BufferedReader( new InputStreamReader( System.in ) );
		
		String line = reader.readLine();
		int num = Integer.parseInt( line );
		
		DecimalFormat df = new DecimalFormat( "0.0000000" );
		
		// each test cases
		for( int i = 1; i <= num; i++ ) {
			line = reader.readLine();
			StringTokenizer st = new StringTokenizer( line );
			double c = Double.parseDouble( st.nextToken() );
			double f = Double.parseDouble( st.nextToken() );
			double x = Double.parseDouble( st.nextToken() );
			
			boolean loop = true;
			double gain = 2.0;
			double t = 0.0;
			
			while( loop ) {
				double tbase = c / gain;
				double t0 = t + x / gain;
				gain = gain + f;
				double t1 = t + tbase + x / gain;
				if( t0 <= t1 ) {
					loop = false;
					t = t0; 
				}
				else {
					t = t + tbase;
				}
			}
			
			System.out.println( "Case #" + i + ": " + df.format( t ) );
		}
		
		reader.close();
	}
}
