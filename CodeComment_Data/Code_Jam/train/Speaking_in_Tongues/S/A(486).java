package methodEmbedding.Speaking_in_Tongues.S.LYD1414;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.*;

public class A
{	
	public A( String fn)
	{
		try{
			char[] oa = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
						  'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
			char[] na = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 
						  'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
			BufferedReader r = new BufferedReader( new FileReader( fn + ".in"));
			PrintWriter w = new PrintWriter( new FileWriter( fn + ".out"));
			List<String> lines = new LinkedList<String>();
			Map<Character,Character> tt = new HashMap<Character,Character>();
			
			int t = Integer.valueOf( r.readLine());
			for( int i = 0; i < t; i++)
				lines.add( r.readLine());

			for( int i = 0; i < 26; i++)
				tt.put( oa[i], na[i]); 
				
			int c = 1;
			for( String line : lines){
				w.print( "Case #" + c + ": ");
				System.out.print( "Case #" + c++ + ": ");
				for( int j = 0; j < line.length(); j++)
					if( line.charAt( j) == ' '){
						w.print( " ");
						System.out.print( " ");
					}else{
						w.print( tt.get( line.charAt( j)));
						System.out.print( tt.get( line.charAt( j)));
					}
				w.println();
				System.out.println();
			}
			r.close();
			w.close();
		}catch( Exception e){}
	}
	
	public static void main( String[] args) throws Exception
	{
		new A( args[0]);
	}
}
