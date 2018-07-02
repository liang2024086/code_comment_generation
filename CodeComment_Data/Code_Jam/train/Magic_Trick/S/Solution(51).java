package methodEmbedding.Magic_Trick.S.LYD1282;

import java.util.*;
public class Solution{
	public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        for(int k=1;k<=t;k++)
        {
			int i1=obj.nextInt();
			int a[][]=new int[4][4];
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				a[i][j]=obj.nextInt();
			}
			int i2=obj.nextInt();
			int b[][]=new int[4][4];
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				b[i][j]=obj.nextInt();
			}
			int flag=0,no=0;
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(a[i1-1][i]==b[i2-1][j])
					{
						flag=flag+1;
						no=a[i1-1][i];
					}
				}
			}
			if(flag==1)
			System.out.println("Case #"+k+": "+no);
			else if(flag==0)
			System.out.println("Case #"+k+": "+"Volunteer Cheated!");
			else
			System.out.println("Case #"+k+": "+"Bad magician!");
		}
	}
}
