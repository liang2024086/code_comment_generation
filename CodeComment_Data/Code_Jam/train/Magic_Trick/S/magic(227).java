package methodEmbedding.Magic_Trick.S.LYD1092;

import java.util.*;
class magic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j;
		int ar1[][]=new int[4][4];
		int ar2[][]=new int[4][4];
		int num1,num2;
		int count,ans=0;
		for(int loop=1;loop<=t;loop++)
		{
			num1=sc.nextInt();
			for(i=0;i<4;i++)
				for(j=0;j<4;j++)
					ar1[i][j]=sc.nextInt();
			num2=sc.nextInt();
			for(i=0;i<4;i++)
				for(j=0;j<4;j++)
					ar2[i][j]=sc.nextInt();
					
			count=0;
			for(i=0;i<4;i++)
			{
				for(j=0;j<4;j++)
				{
					//System.out.println(ar1[num1-1][i]+" "+ar2[num2-1][j]);
					if(ar1[num1-1][i]==ar2[num2-1][j])
					{
						ans=ar1[num1-1][i];
						count=count+1;
					}
				}
			}
			
			if(count==0)
				System.out.println("Case #"+loop+": Volunteer cheated!");
			if(count==1)
				System.out.println("Case #"+loop+": "+ans);
			if(count>1)
				System.out.println("Case #"+loop+": Bad magician!");
		}
	}
}
			
