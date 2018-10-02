package methodEmbedding.Cookie_Clicker_Alpha.S.LYD351;

import java.util.Scanner;


public class q2
{

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int testcase=s.nextInt();
		for(int i=0;i<testcase;i++)
		{
			double c=s.nextDouble();
			double f=s.nextDouble();
			double x=s.nextDouble();
			
			int n=0;
			while(x/(2+(n+1)*f)<(x-c)/(2+n*f))
			{
				n++;
			}
			double time=0;
			for(int j=0;j<n;j++)
			{
				time+=(c/(2+j*f));
			}
			
			time+=x/(2+n*f);
			System.out.printf("Case #%d: %7.7f\n",i+1,time);
		}
	}
}
