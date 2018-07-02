package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1233;

import java.util.Scanner;


public class CookieClicker {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		
		for(int i=1;i<=T;i++)
		{
			double cookies=0;
			double C=in.nextDouble();
			double F=in.nextDouble();
			double X=in.nextDouble();
			double time=0;
			double rate=2;
			
			while(cookies<X)
			{
				if(X-cookies<C)
				{
					time+=(X-cookies)/rate;
					cookies=X;
				}
					
				else if(cookies<C)
				{
					time+=(C-cookies)/rate;
					cookies=C;
				}
				else
				{
					if((X-cookies)/rate>(X)/(rate+F))
					{
						cookies=cookies-C;
						rate=rate+F;
					}
					else
					{
						time=time+(X-cookies)/rate;
						cookies=X;
					}
				}
			}
			System.out.println("Case #"+i+": "+time);
			
		}
	}
}
