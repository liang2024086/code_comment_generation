package methodEmbedding.Magic_Trick.S.LYD1021;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=1;i<=T;i++)
		{
			int r1=Integer.parseInt(br.readLine());
			r1=r1-1;
			int A[][]=new int[4][4];
			for(int j=0;j<4;j++)
			{int p=0;
				String Temp=br.readLine()+" ";
				int sp=0,ep=0;
			   for (int k=0;k<Temp.length();k++)
			   {
			   	if(Temp.charAt(k)==' ')
			   	{
			   		ep=k;
			   	A[j][p]=Integer.parseInt(Temp.substring(sp,ep));
			   	sp=ep+1;p++;
			   }
			}}
			
			int r2=Integer.parseInt(br.readLine());
			r2=r2-1;
			int B[][]=new int[4][4];
			for(int j=0;j<4;j++)
			{int p=0;
				String Temp=br.readLine()+" ";
				int sp=0,ep=0;
			   for (int k=0;k<Temp.length();k++)
			   {
			   	if(Temp.charAt(k)==' ')
			   	{
			   		ep=k;
			   	B[j][p]=Integer.parseInt(Temp.substring(sp,ep));
			   	sp=ep+1;p++;
			   }
			}}
			int c=0,v=0;
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					if (A[r1][j]==B[r2][k])
					{
						c++;
						v=B[r2][k];
					}
				}
			}
			if(c==1)
			System.out.println("Case #"+i+": "+v);
			else if (c>1)
			System.out.println("Case #"+i+": Bad Magician!");
			else
			System.out.println("Case #"+i+": Volunteer cheated!");
			
		}
	}
}
