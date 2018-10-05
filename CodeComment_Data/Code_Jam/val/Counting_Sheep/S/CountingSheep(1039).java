package methodEmbedding.Counting_Sheep.S.LYD623;

import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class CountingSheep
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner in=new Scanner(System.in);
	int T,N,curr;
 	T=in.nextInt();
	int res[]= new int[T];
 
	for(int i=0;i<T;i++)
	 {
		int n=0,comp=99;
	 	int temp[]=new int[10];
	 	 int flag[]=new int[10];
	 	N=in.nextInt();
	 	 	for(int k=1;(n!=N)||(comp==0);k++)
	 	{
	 		n=k*N;
		curr=n;
		int rem;
			while(curr>0)
			{
				rem=curr%10;
	 			if(flag[rem]==0)
	 			{
					temp[rem]=rem;
					flag[rem]=1;
	 			}
	 			curr/=10;
			}//while loop
 
	 		for(int m=0;m<10;m++)
	 		{
	 			if(flag[m]==1)
	 			comp=1;
	 			else
	 			{
	 			comp=0;
	 			break;
	 			}
	 		}//for flag check
 
	 		if(comp==1||(n==0))
	 		break;
	 	}// for k loop
	 	if(comp==1)
	 	res[i]=n;
	 	else 
		res[i]=99;
	 	}//for i loop
	 for(int i=0;i<T;i++)
	 if(res[i]==99)
	 System.out.println("case #"+(i+1)+": INSOMNIA");
	 else
	 System.out.println("case #"+(i+1)+": "+res[i]);
	}
}
