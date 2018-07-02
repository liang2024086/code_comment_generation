package methodEmbedding.Standing_Ovation.S.LYD2211;

import java.io.*;
import java.lang.*;
import java.util.*;
class cjam1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		Scanner scn=new Scanner(System.in);	
		int T=scn.nextInt();
		int add;
		int res[]=new int[T];
		for(int i=0;i<T;i++)
		{	
//		System.out.println("Case"+i);	
			int Tadd=0;
			add=0;
			int NS=0;
			int S=scn.nextInt();
			
			String S2=scn.nextLine();
			S2=S2.trim();
			int SN[]=new int[S+1];
			String STR=""+S2;
			for(int j=0;j<=S;j++)
			{
		
				SN[j]=STR.charAt(j);
				SN[j]=SN[j]-48;
//				System.out.println("SN[j]="+SN[j]);
			}
			for(int j=0;j<=S;j++)
			{
				if(NS>=j)
					NS+=SN[j];
				else
				{
					add=j-NS;
					
					Tadd+=add;
					NS=NS+add+SN[j];
//					System.out.println("Add="+add);
				}
//				System.out.println("NS="+NS);
			}
			res[i]=Tadd;
			Tadd=add=0;
		}
		for(int i=0;i<T;i++)
			System.out.println("Case #"+(i+1)+": "+res[i]);
	}
}
