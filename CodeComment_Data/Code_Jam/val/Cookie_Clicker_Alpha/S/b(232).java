package methodEmbedding.Cookie_Clicker_Alpha.S.LYD396;

import java.util.Scanner;


public class b {
	
	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		int t = in.nextInt();
		
		for (int z = 1; z <= t; z++)
		{
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			
			double cur = Math.min(c, x);
			double prod = 2;
			double time = Math.min(c / prod, x / prod);
			while (cur + 1e-9 < x)
			{
				if (cur < c)
				{
					time += (c - cur) / prod;
					cur = c;
					continue;
				}
				
				double timeToWin = (x - cur) / prod;
				double timeToWinIfBuy = (x - cur + c) / (prod + f);
				
				if (timeToWinIfBuy < timeToWin)
				{
					cur -= c;
					prod += f;
				}
				else
				{
					time += timeToWin;
					break;
				}
			}
			
			System.out.printf("Case #%d: %.7f\n", z, time);
		}
	}

}
