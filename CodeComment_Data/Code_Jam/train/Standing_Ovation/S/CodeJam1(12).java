package methodEmbedding.Standing_Ovation.S.LYD302;

import java.util.Scanner;
public class CodeJam1 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int Smax[]=new int[T];
		String P[]=new String[T];
		for(int i=0;i<=T-1;i++)
		{
			Smax[i]=in.nextInt();
			P[i]=in.next();
		}
		for(int i=0;i<=T-1;i++)
		{
			char c[]=new char[Smax[i]+1];
			c=P[i].toCharArray();
			int z=i+1;
			if(c[0]=='0' && Smax[i]==0) 
			{
				System.out.println("Case #"+z+": 0");
			} 
			else 
			{
				int a=0;
				int sum=0;
				for(int j=1;j<=c.length;j++)
				{
					sum+=(int)(c[j-1]-'0');
					if(sum<j)
					{
						a+=j-sum;
						sum=j;
					}
				}
				System.out.println("Case #"+z+": "+a);
			}
		}
	}
}
