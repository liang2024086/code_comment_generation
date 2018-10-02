package methodEmbedding.Counting_Sheep.S.LYD1619;

import java.util.*;
import java.io.*;
class sheepx
{
	public static void main (String[] args)
	{
	Scanner okla=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	int T,N,imp;
 	T=okla.nextInt();
	int res[]= new int[T];
	for(int i=0;i<T;i++)
	 {
		int n=0,aju=99;
	 	int temp[]=new int[10];
	 	 int flag[]=new int[10];
	 	N=okla.nextInt();
	 	for(int k=1;(n!=N)||(aju==0);k++)
	 	{
	 	n=k*N;
		imp=n;
		int r;
		while(imp>0)
			{r=imp%10;
	 		if(flag[r]==0)
	 		{
					temp[r]=r;
					flag[r]=1;}
	 			imp/=10;}
	 	for(int m=0;m<10;m++){
	 			if(flag[m]==1)
	 			aju=1;
	 			else
	 			{
	 			aju=0;
	 			break;}}
	 	if(aju==1||(n==0))
	 	break;}
	 	if(aju==1)
	 	res[i]=n;
	 	else 
		res[i]=99;}
	 for(int i=0;i<T;i++)
	 if(res[i]==99)
	 System.out.println("case #"+(i+1)+": INSOMNIA");
	 else
	 System.out.println("case #"+(i+1)+": "+res[i]);}}
