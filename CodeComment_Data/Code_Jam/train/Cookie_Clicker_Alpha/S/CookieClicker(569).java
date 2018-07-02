package methodEmbedding.Cookie_Clicker_Alpha.S.LYD924;

import java.io.*;

public class CookieClicker
{
	public CookieClicker()
	{
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("B-small-attempt0.in"));
			String line = "";
			int Case = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < Case; i++)
			{
				String [] arr = br.readLine().split(" ");
				double C = Double.parseDouble(arr[0]);
				double F = Double.parseDouble(arr[1]);
				double X = Double.parseDouble(arr[2]);
				
				double timePassed = 0;
				double cookieContains = 0;
				double cookieGrowth = 2;
				while(cookieContains < X)
				{
					// compare cookie wait or buy a new farm
					//System.out.println("wait for win " + (X / cookieGrowth));
					//System.out.println("buy for win " + ((C / cookieGrowth) + (X/(cookieGrowth + F))));
					if((X / cookieGrowth) > ((C / cookieGrowth) + (X/(cookieGrowth + F))))
					{
						timePassed += C/cookieGrowth;
						cookieGrowth += F;
					}
					else
					{
						timePassed += X/cookieGrowth;
						break;
					}
				}
				System.out.println("Case #"+(i+1)+": "+String.format("%.7f",timePassed));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void main(String [] args)
	{
		new CookieClicker();
	}

}
