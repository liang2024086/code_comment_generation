package methodEmbedding.Standing_Ovation.S.LYD1195;

import java.util.Scanner;

public class codeJam2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Te=sc.nextInt();
		int Smax[]=new int[Te];
		String Pe[]=new String[Te];
		for(int i=0;i<=Te-1;i++)
		{
			Smax[i]=sc.nextInt();
			Pe[i]=sc.next();
		}
		for(int i=0;i<=Te-1;i++)
		{
			char[] c=new char[Smax[i]+1];
			c=Pe[i].toCharArray();
			int x=i+1;
			if(Smax[i]==0&&c[0]=='0')
			{
				System.out.println("Case #"+x+": 0");
			}
			else
			{
				int y=0;
				int sum =0;
				for(int j=1;j<=c.length;j++)
				{
					sum+=(int)(c[j-1]-'0');
					if(sum<j)
					{
						y+=j-sum;
						sum=j;
					}
				}
				System.out.println("Case #"+x+": "+y);	
			}
		}
	}
}

			
