package methodEmbedding.Standing_Ovation.S.LYD142;

import java.io.BufferedReader;
import java.io.FileReader;

public class A {
	public static void main( String[] args ) throws Exception {
		FileReader fr = new FileReader( "A-small.in" );
		BufferedReader br = new BufferedReader( fr );

		int cases = Integer.parseInt( br.readLine() );

		for (int c = 1; c <= cases; c++) {
			String[] s = br.readLine().split(" ");
			int numMembers = Integer.parseInt( s[0] );
			String audience = s[1];
			int total = 0;
			long result = 0;
			
			for(int i=0; i <= numMembers; i++) {
				int numShy = Integer.parseInt(audience.substring(i, i+1));
				//System.out.printf("i: %d, numShy: %d, total: %d\n", i, numShy, total);
				if(total < i && numShy > 0) {
					result += i - total;
					total = i;
				}
				total += numShy;
			}
			
			System.out.printf("Case #%d: %d\n", c, result);
		}

		fr.close();
	}
}
