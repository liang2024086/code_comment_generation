package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1067;

import java.util.Scanner;
public class q2
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int test=input.nextInt();
		for(int i=0;i<test;i++)
		{
			double C=input.nextDouble();
			double F=input.nextDouble();
			double X=input.nextDouble();
			
			int NUMBERS=0;
			while(X/(2+(NUMBERS+1)*F)<(X-C)/(2+NUMBERS*F))
			{
				NUMBERS++;
			}
			double totalTime=0;
			for(int j=0;j<NUMBERS;j++)
			{
				totalTime+=(C/(2+j*F));
			}
			
			totalTime+=X/(2+NUMBERS*F);
			System.out.printf("Case #%d: %7.7f\n",i+1,totalTime);
		}
	}
}
