package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1388;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CookieClicker
{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new File("cookie.in"));
		PrintWriter printWrite = new PrintWriter(new File("cookie.out"));
		
		int numCases = inFile.nextInt();
		for (int cases = 0; cases < numCases; cases++)
		{
			double c = inFile.nextDouble();
			double f = inFile.nextDouble();
			double x = inFile.nextDouble();
			
			double rate = 2;
			
			double first = x / rate;	
			double second = c/rate + x/(rate+f);
					
			double prevTime = c/rate;
			rate += f;
	
			//System.out.println(first);
			//System.out.println(second);
			
			while (second < first)
			{
				first = second;
				
				prevTime += c/rate;
				
				rate += f;
				
				second = prevTime + x/(rate);
				//System.out.println(prevTime);	
				
				
				//System.out.println("");
				//System.out.println(first);
				//System.out.println(second);
				
			}
			
			//System.out.println(first);
			printWrite.println("Case #" + (cases + 1) + ": " + first);
		}
		
		inFile.close();
		printWrite.close();

		
			
		
	}
	
}
