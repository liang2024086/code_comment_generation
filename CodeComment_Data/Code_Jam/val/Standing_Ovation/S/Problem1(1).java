package methodEmbedding.Standing_Ovation.S.LYD478;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1
{
	public static void main( String[] args )
	{
		FileInputStream fstream = null;
		BufferedReader br;
		int t;
		try
		{
			fstream = new FileInputStream( args[0] );
			br = new BufferedReader( new InputStreamReader( fstream ) );

			String str = br.readLine();
			t = Integer.parseInt( str );
			for ( int i = 0; i < t; i++ )
			{
				int count = 0, addCount = 0;
				str = br.readLine();
				String v[] = str.split( " " );
				int sm = Integer.parseInt( v[0] );
				count += Integer.parseInt( v[1].charAt( 0 ) + "" );
				for ( int j = 1; j <= sm; j++ )
				{
					if ( count < j )
					{
						int add = j - count;
						count += add;
						addCount += add;
					}
					count += Integer.parseInt( v[1].charAt( j ) + "" );
				}
				System.out.println( "Case #" + ( i + 1 ) + ": " + addCount );
			}

		}
		catch ( FileNotFoundException e )
		{
			e.printStackTrace();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		finally
		{
			if ( fstream != null )
			{
				try
				{
					fstream.close();
				}
				catch ( IOException e )
				{
					e.printStackTrace();
				}
			}
		}
	}
}
