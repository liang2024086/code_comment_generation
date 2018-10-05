package methodEmbedding.Cookie_Clicker_Alpha.S.LYD994;

import java.util.*;
public class cookies 
{
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int cases=sc.nextInt();
	for(int i=1;i<=cases;i++)
	{
		double c=sc.nextDouble();
		double f=sc.nextDouble();
		double x=sc.nextDouble();
		double rate=2;
		double time=0,fint=0;
		double cookies=0;
		while(true)
		{
					double ratetemp=rate+f;
					double ratetemp1=ratetemp+f;
					double temp=time+x/rate;
			
					double temp1=time+c/rate+x/ratetemp;
					if(temp1<temp)
					{
						time=time+c/rate;
						rate=rate+f;
					}
					else
					{
					
						fint=temp;
						break;
					}				
				
		}
			
		
		System.out.print("Case #"+i+": ");
		System.out.print(String.format("%.9g%n", fint));
		System.out.println();
	}
	
}
}
