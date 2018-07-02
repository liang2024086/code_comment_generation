package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1298;

import java.util.*;
import java.io.*;
public class Main 
{

	public static void main(String[] args)
	{
		double cost = 500.0;
		double f = .04;
		double goal = 2000.0;
		boolean finished = false;
		int ultimatecounter = 1;
		int instances = 0;
		
		try
		{
			FileReader file = new FileReader("B-small-attempt0.in");
			Scanner scan = new Scanner(file);
			
			instances = scan.nextInt();
			for (int k = 0; k < instances; k++)
			{
			cost = scan.nextDouble();
			f = scan.nextDouble()/100;
			goal = scan.nextDouble();
			double rate = .02;
			double total1 = 0.0;
			double total2 = 0.0;
			double upfront = 0.0;
			
				
			total1 = goal/rate;
			total1 = goal/rate;
			for(;;)
			{

				upfront += (cost/rate);
				total2 = upfront + goal/(rate+f);

				if (total2 < total1)
				{
					total1 = total2;
					rate+= f;	
				}
				else break;

			}
			
			total1 = total1/100;
			total1 = (double)Math.round(total1 * 10000000) / 10000000;
			
			System.out.println("Case #" + ultimatecounter + ": " + total1);
			ultimatecounter++;
			}
		}
		catch(IOException e){}
	}
}
