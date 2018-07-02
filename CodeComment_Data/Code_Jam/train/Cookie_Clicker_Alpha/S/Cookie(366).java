package methodEmbedding.Cookie_Clicker_Alpha.S.LYD966;

import java.util.*;


public class Cookie
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		String out = "";

		for (int i = 1; i <= count; i++)
		{
			double tot = 0;
			double cookieCount = 0;
			double cookieRate = 2;
			double minCookie = input.nextDouble();
			double rateInc = input.nextDouble();
			double maxCookie = input.nextDouble();
			

			while(true)
			{
				double maxTime = (maxCookie - cookieCount)/cookieRate;
				double maxTimeOpt = (minCookie/cookieRate) + (maxCookie/(cookieRate+rateInc));
				double maxTimeAdd = (minCookie/cookieRate);

				if (maxTime > maxTimeOpt)
				{
					cookieRate = cookieRate + rateInc;
					tot = tot + maxTimeAdd;			
				}
				else
				{
					tot = tot + maxTime;
					break;
				}
			}
			out = out + "Case #" + i + ": " + tot + '\n';
		}
		System.out.println(out);
	}
}
