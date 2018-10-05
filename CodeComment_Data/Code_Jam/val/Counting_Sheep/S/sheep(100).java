package methodEmbedding.Counting_Sheep.S.LYD350;

import java.util.*;
import java.io.*;

public class sheep {
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File("A-small-attempt1.in"));
		//Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for( int t = 1; t <= T; t++ )
		{
			boolean digitsSeen[] = new boolean[10];
			
			long i = 1;
			
			long number = scan.nextInt();
			
			System.out.print("Case #" + t + ": ");
			
			if(number == 0)
			{
				System.out.println("INSOMNIA");
				continue;
			}
			
			boolean done = false;
			
			while( !done )
			{
				String numberString = String.format("%d", number*i);
				
				for( int c = 0; c < numberString.length(); c++)
				{
					digitsSeen[numberString.charAt(c) - '0'] = true;
					
					//System.out.println("seen " + numberString.charAt(c));
				}
				
				done = true;
				
				for( int c = 0; c < digitsSeen.length; c++)
				{
					if( !digitsSeen[c] )
						done = false;
				}
				i++;
			}
			
			System.out.println(number*(i-1));
		}
		
	}
	
	public sheep()
	{
		
	}
}
