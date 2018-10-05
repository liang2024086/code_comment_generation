package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1189;

import java.util.*;
class prob2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		double test_cases = in.nextDouble();
		for (int i=0;i<test_cases;i++)
		{
			double C = in.nextDouble(); 
			double F = in.nextDouble();
			double X = in.nextDouble();
			double total_cookies=0;
			double rem_cookies=X;
			double f=2;
			double t=0;
			double temp=500/f;
			while(total_cookies<X)
			{
				if (((X-(total_cookies+C))/f)>(rem_cookies/(f+F)))
				{
					t=t+C/f;
					f=f+F;
					//total_cookies=total_cookies+C;
					//rem_cookies=X-total_cookies;
					
					
				}
				else 
				{
					t=t+rem_cookies/f;
					total_cookies=total_cookies+rem_cookies;
					rem_cookies=X-total_cookies;
				}
			}
			int j=i+1;
			System.out.println("Case #"+j+": "+t);
		}
	}
	
}
