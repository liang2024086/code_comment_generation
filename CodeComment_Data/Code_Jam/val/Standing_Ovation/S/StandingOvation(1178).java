package methodEmbedding.Standing_Ovation.S.LYD32;


import java.io.*;
import java.util.*;

public class StandingOvation {

	public static void main(String[] args) throws Exception {
		BufferedReader f = new BufferedReader(new FileReader("standing.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(
				new FileWriter("standing.out")));
		// Use StringTokenizer vs. readLine/split -- lots faster
		StringTokenizer st = new StringTokenizer(f.readLine());
		// Get line, break into tokens
		int testcases = Integer.parseInt( st.nextToken() );
		
		for( int i = 1; i <= testcases; i++ )
		{
			st = new StringTokenizer( f.readLine() );
			// create array
			int length = Integer.parseInt(st.nextToken());
			int[] stand = new int[length+1];
			String s = st.nextToken();
			
			// iterate through array
			int addMore = 0;
			stand[0] = Character.getNumericValue( s.charAt(0) );
			int up = stand[0];
			// fencepost added
			for( int j = 1; j < s.length(); j++ )
			{
				stand[j] = Character.getNumericValue( s.charAt(j) );
				while( up < j )
				{
					addMore++;
					up++;
				}
				up += stand[j];
			}
			out.println( "Case #" + i + ": " + addMore );
		}
		out.close();
		System.exit(0);            
	}

}
