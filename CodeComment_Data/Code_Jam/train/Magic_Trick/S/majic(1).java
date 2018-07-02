package methodEmbedding.Magic_Trick.S.LYD263;

import java.util.*;
class magic
{
	public static void main(String args[])
	{
		int cases,f_ans,s_ans;
		int f_mat[][]=new int[4][4];
		int s_mat[][]=new int[4][4];
		Scanner s=new Scanner(System.in);
		cases=s.nextInt();
		for(int a=0;a<cases;a++)
		{
			int found=0;
			int val[]=new int[4];
			f_ans=s.nextInt();
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					f_mat[i][j]=s.nextInt();
				}
			}
			s_ans=s.nextInt();
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					s_mat[i][j]=s.nextInt();
				}
			}
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					//System.out.println(" "+f_mat[f_ans][j]+" "+s_mat[s_ans][i]);
					if(f_mat[f_ans-1][j]==s_mat[s_ans-1][i])
					{
						val[found]=f_mat[f_ans-1][j];
						found=found+1;
					}
				}
			}
			if (found==1)
			{
				System.out.println("Case #"+(a+1)+": "+val[0]);
			}
			else if (found==0)
			{
				System.out.println("Case #"+(a+1)+": Volunteer cheated!" );
			}
			else if (found>1)
			{
				System.out.println("Case #"+(a+1)+": Bad Magician!");
			}
		}
		
	}
}
