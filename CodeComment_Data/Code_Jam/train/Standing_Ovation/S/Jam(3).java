package methodEmbedding.Standing_Ovation.S.LYD78;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Jam {
	public static void main( String[] args )
	{
		File file = new File("A-small-attempt1.in.txt" );
		try {
			Scanner scan = new Scanner ( file );
			int loops = scan.nextInt();
			scan.nextLine();
//			System.out.println( loops );
			int digits = 0;
			int number = 0;
			String numStr = "";
			int i = 1;
			while ( i <= loops )
			{
				int sum = 0;
				int count = 0;
				digits = scan.nextInt();
				numStr = scan.nextLine();
//				System.out.println( digits + " " + numStr );
				sum = Character.getNumericValue( numStr.charAt(1));
				for ( int j = 2 ; j <= digits + 1; j++ )
				{
					int index = j - 1;
//					System.out.print( "Current index: " + j + " Current sum: " + sum );
//					System.out.println( Character.getNumericValue( numStr.charAt(j)) );
//				    System.out.println( "Sum upon " + j + "; " + sum );
					if ( sum < index && Character.getNumericValue( numStr.charAt(j)) != 0 )
					{
						int temp = index - sum;
//						System.out.print( "Temp is: " + temp );
						sum = sum + temp;
						count = count + temp;
//						System.out.print( "Count is: " + count );
					}
					sum = sum + Character.getNumericValue( numStr.charAt(j));
				}
				
				System.out.println( "Case #" + i + ": " + count);
				i++;
			}
			scan.close();

		}
		catch ( FileNotFoundException e )
		{
			e.printStackTrace();
		}
	}
}
