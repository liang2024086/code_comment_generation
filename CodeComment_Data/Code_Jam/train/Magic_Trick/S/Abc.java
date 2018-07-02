package methodEmbedding.Magic_Trick.S.LYD1912;

import java.io.*;
class Abc
{
	public static void main(String []args)throws IOException
	{
		BufferedReader str=new BufferedReader(new InputStreamReader(System.in));
		int n,i,j,x,a1,a2;

		n=Integer.parseInt(str.readLine());
		int t1[][]=new int[4][4];
		int t2[][]=new int[4][4];
		int o[]=new int[n];
		int o1[]=new int[n];
		String s;
		String s1[]=new String[4];
		String s2[]=new String[4];
		for(x=0;x<n;x++)
		{	
			a1=Integer.parseInt(str.readLine());
			for(i=0;i<4;i++)
			{
				s=str.readLine();
				s1=s.split(" ");
				for(j=0;j<4;j++)
				{
					t1[i][j]=Integer.parseInt(s1[j]);
				}
			}
			a2=Integer.parseInt(str.readLine());
			for(i=0;i<4;i++)
			{
				s=str.readLine();
				s1=s.split(" ");
				for(j=0;j<4;j++)
				{
					t2[i][j]=Integer.parseInt(s1[j]);
				}
			}
			int count=0;
			a1--;
			a2--;

			for(i=0;i<4;i++)
			{
				if(t1[a1][i]==t2[a2][i])
				{
					o1[x]=t1[a1][i];
					count++;
				}
			}
			for(i=0;i<3;i++)
			{
				if(t1[a1][i]==t2[a2][i+1])
				{
					o1[x]=t1[a1][i];
					count++;
				}
			}	
			for(i=0;i<2;i++)
			{
				if(t1[a1][i]==t2[a2][i+2])
				{
					o1[x]=t1[a1][i];
					count++;
				}
			}		
			for(i=0;i<1;i++)
			{
				if(t1[a1][i]==t2[a2][i+3])
				{
					o1[x]=t1[a1][i];
					count++;
				}
			}	
			o[x]=count;
		}
		for(x=0;x<n;x++)
		{
			if(o[x]==0)
				System.out.println("Case #"+(x+1)+":"+" "+"Volunteer cheated!");
			else
			if(o[x]>1)
				System.out.println("Case #"+(x+1)+":"+" "+"Bad magician!");
			else
			if(o[x]==1)
				System.out.println("Case #"+(x+1)+":"+" "+o1[x]);

		}
	}
}
