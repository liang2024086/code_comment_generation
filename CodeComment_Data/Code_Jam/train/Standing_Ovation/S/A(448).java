package methodEmbedding.Standing_Ovation.S.LYD2106;

import java.io.*;

public class A {

	public static void main( String args[] ) throws IOException{
		
		BufferedReader input = new BufferedReader( new FileReader("A-small-attempt0.in") );
		BufferedWriter output = new BufferedWriter( new FileWriter("output.out") );
		int T = Integer.parseInt( input.readLine() );
		String[] line;
		int cur, ans;
		
		for( int i = 1; i <= T; i++ ){
			line = input.readLine().split(" ");
			ans = 0;
			cur = line[1].charAt(0) - '0';
			for( int j = 1; j < line[1].length(); j++ ){
				int aux = line[1].charAt(j) - '0';
				if( aux > 0 && j > cur ){
					ans += j - cur;
					cur += j - cur;
				}
				cur += aux;
			}
			output.write( "Case #" + i + ": " + ans + "\n" );
		}
		
		input.close();
		output.close();
	}
	
}
