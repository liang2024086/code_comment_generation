package methodEmbedding.Cookie_Clicker_Alpha.S.LYD601;


import java.util.Scanner;

public class CJ2014QualiBCookieClickerAlpha
{

	public static void main(String[] args)
	{
		final Scanner in = new Scanner(System.in);		
		final int T = in.nextInt();
		long t0 = System.nanoTime();
		for (int t = 0; t < T; t++)
		{
			double C = Double.parseDouble(in.next()); // price farm
			double F = Double.parseDouble(in.next()); // farmcookies per second
			double X = Double.parseDouble(in.next()); // target
			double rate = 2.0;
			double time = 0;
			
			
			while (C/rate + X/(rate+F) < X/rate)
			{
				time += C/rate;
				rate += F;
			}

			time += X/rate;

			System.out.format("Case #%d: %s\n", (t+1),  Double.toString(time) );
		}
		in.close();
		long t1 = System.nanoTime();
		//System.out.println(" Done in " + ((t1-t0)/1000000000.0) );
	}

}
