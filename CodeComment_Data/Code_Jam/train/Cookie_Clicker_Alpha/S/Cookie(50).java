package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1589;

import java.util.*;
import java.text.DecimalFormat;
class Cookie
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double c,f,x;
		int t,count=0;
		t=sc.nextInt();
		while(t!=0)
		{
			count++;
			c=sc.nextDouble();
			f=sc.nextDouble();
			x=sc.nextDouble();
			double totaltime=0,time=0,time1=0,time2=0,rate=2;
			if(x>c)
			{
				time=c/rate;
				time2=x/(rate+f);
				time1=x/rate;
				while((time+time2)<time1)
				{
					rate+=f;
					totaltime+=time;
					time=c/rate;
					time2=x/(rate+f);
					time1=x/rate;
				}
				totaltime+=time1;
			}
			else
			{
				totaltime=x/rate;
			}
			t--;
			System.out.println("Case #"+count+": "+ new DecimalFormat("#0.0000000").format(totaltime));
		}
	}
}
