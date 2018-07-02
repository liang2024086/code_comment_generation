package methodEmbedding.Cookie_Clicker_Alpha.S.LYD283;

import java.util.Scanner;


public class CookieCutter {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		String[] output = new String[cases];
		
		for(int i = 0; i < cases; i++)
		{
			double rate = 2;
			double farm = in.nextDouble();
			double increase = in.nextDouble();
			double needed = in.nextDouble();
			double seconds = 0;
			boolean done = false;
			
			while(!done)
			{
				double secFarms = seconds + (needed / (rate));
				double secmoreFarms = seconds + (farm / rate) + (needed / (rate + increase));
				
				if(secFarms <= secmoreFarms)
				{
					seconds += (needed / (rate));
					done = true;
				}
				
				else
				{
					seconds += (farm / rate);
					rate += increase;
				}
			}
			
			output[i] = Double.toString(seconds);
		}
		
		for(int a = 0; a < cases; a++)
		{
			System.out.println("Case #" + (a + 1) + ": " + output[a]);
		}
	}
}
