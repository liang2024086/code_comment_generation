package methodEmbedding.Speaking_in_Tongues.S.LYD1334;

import java.util.*;
import java.io.*;

public class A
{
	public static void main( String args[] )throws Exception
	{
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		char domain[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char kodomain[] = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' };
		String str;
		int i, j, length, index, test;
		
		test = Integer.parseInt( in.readLine() );
		
		for( i = 0 ; i < test ; i++ )
		{
			str = in.readLine();
			length = str.length();
			
			System.out.print( "Case #" + ( i + 1 ) + ": " );
			for( j = 0 ; j < length ; j++ )
			{
				if( str.charAt( j ) != ' ' )
				{
					index = str.charAt( j ) - 'a';
					System.out.print( kodomain[ index ] );
				}
				else
					System.out.print( ' ' );
			}
			
			System.out.println();
		}
	}
}
