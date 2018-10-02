package methodEmbedding.Standing_Ovation.S.LYD2203;

import java.io.*;
class ov {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		PrintWriter pw = new PrintWriter( System.out );
		int i = 1;
		int t = Integer.parseInt( br.readLine() );
		while ( t > 0 ) {
			String str = br.readLine();
			String st[] = str.split( "[ ]" );
			int l = Integer.parseInt( st[0] );
			String s = st[1];
			int[] shy = new int[l+1];
			for ( int x = 0;x < l+1;x++ ) {
				shy[x] = s.charAt(x) - 48;
			}
			int added = 0;
			int ssum = 0;
			for( int x = 0;x < l+1;x++ ) {
				if( ssum >= x ) {
					ssum += shy[x];
					continue;
				}
				int d = x - ssum;
				added += d;
				ssum += d + shy[x];
			}
			System.out.println( "Case #"+i+": "+added );
			i++;
			t--;
		}
	}
}
