package methodEmbedding.Cookie_Clicker_Alpha.S.LYD382;

import java.util.*;
class cookie
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		int i; //loop control
		double c,f,x;
		double n,t;
		for(i=1;i<=test;i++)
		{
			c=sc.nextDouble();
			f=sc.nextDouble();
			x=sc.nextDouble();
			n=2.0;
			t=0.0;
			if(x<=c)
				t=x/n;
			else
			{
				while(((c/n) + (x/(n+f))) < (x/n))
				{
					t=t+(c/n);
					n=n+f;
				}
				t=t+(x/n);
			}
			System.out.println("Case #"+i+": "+t);
		}
	}
}
			
		
		
