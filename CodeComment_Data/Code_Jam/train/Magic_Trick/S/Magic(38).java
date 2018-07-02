package methodEmbedding.Magic_Trick.S.LYD1185;

import java.util.*;
class Magic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t,s1,s2,count=0,c1=0,ans=0;
		int a[][]=new int[4][4];
		int selr1[]=new int[4];
		int selr2[]=new int[4];
		t=sc.nextInt();
		while(t!=0)
		{
			s1=sc.nextInt();
			s1--;
			c1++;
			count=0;
			for (int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<4;i++)
			{
				selr1[i]=a[s1][i];
			}
			s2=sc.nextInt();
			s2--;
			for (int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<4;i++)
			{
				selr2[i]=a[s2][i];
			}
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(selr1[i]==selr2[j])
					{
						count++;
						ans=selr2[j];
					}
				}
			}
			if(count==0)
			{
				System.out.println("Case #"+c1+": Volunteer cheated!");
			}
			else if(count==1)
			{
				System.out.println("Case #"+c1+": "+ans);
			}
			else
			{
				System.out.println("Case #"+c1+": Bad magician!");
			}
			t--;
		}
	}	
}
