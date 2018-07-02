package methodEmbedding.Magic_Trick.S.LYD1481;

import java.io.*;
import java.util.StringTokenizer;

class codejam2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		int i,T,n,j,k;
		int [][] A=new int [4][4];
		int [][] B=new int [4][4];
		StringTokenizer st ;

		T=Integer.parseInt(obj.readLine());

		int [] Res=new int [T];		
		int [] Val=new int [T];
		
		
		for(i=0;i<T;i++)
		{
			int a1,a2,c=0;
		
			a1=Integer.parseInt(obj.readLine());
			
			
			for(k=0;k<4;k++)
			{	st = new StringTokenizer(obj.readLine()) ;
				for(int l=0;l<4;l++)
					A[k][l]=Integer.parseInt(st.nextToken());
			}

			a2=Integer.parseInt(obj.readLine());
			
			
			for(k=0;k<4;k++)
			{	st = new StringTokenizer(obj.readLine()) ;
				for(int l=0;l<4;l++)
					B[k][l]=Integer.parseInt(st.nextToken());
			}
			

			a1--;
			a2--;

			for(k=0;k<4;k++)
			{
				for(int l=0;l<4;l++)
				{
					if(A[a1][k]==B[a2][l])
					{
						c++;
						Val[i]=A[a1][k];
					}
				}
			}

			if(c==1)//exactly 1 soln
				Res[i]=1;

			else if(c==0)//no soln
				Res[i]=0;
			else
				Res[i]=2;

		}//for i

		for(i=0;i<T;i++)
		{
			if(Res[i]==1)
			{
				System.out.println("Case #"+(i+1)+": "+Val[i]);
			}
			
			else if(Res[i]==0)
			{
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}
			else
			{
				System.out.println("Case #"+(i+1)+": Bad magician!");
				
			}
		}
	}
}
