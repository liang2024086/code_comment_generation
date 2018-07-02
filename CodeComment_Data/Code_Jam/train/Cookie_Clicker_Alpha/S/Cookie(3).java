package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1629;

import java.util.*;
import java.io.*;
class Cookie
{
  
	public static void main(String args[])throws IOException
	{
		File f=new File("cfi.in");
		Scanner sc=new Scanner(f);
		FileWriter fout=new FileWriter("out1.out");
		int test,k,i,j;
		test=sc.nextInt();
		double C,F,X,time=0,cookie=2;
		for(k=1;k<=test;k++)
		{	
			time=0;cookie=2;
			C=sc.nextDouble();
			F=sc.nextDouble();
			X=sc.nextDouble();
		
			if(X<=C)
			{//fout.write("Case #"+(k)+": "+time+"\n");
			time=X/cookie;
				}
				else
				{
				while(((C/cookie)+X/(cookie+F))<X/cookie)
			{
			
			
			time+=C/cookie;	
			cookie+=F;	
			}
			time+=X/cookie;
			
			}
		fout.write("Case #"+(k)+": "+time+"\n");
		}
	fout.close();
	}}
