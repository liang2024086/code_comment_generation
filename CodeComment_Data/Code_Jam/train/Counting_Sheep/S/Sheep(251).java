package methodEmbedding.Counting_Sheep.S.LYD1618;

import java.io.*;
import java.util.*;
class Sheep{

	public static void main(String [] arfs)throws Exception
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
		PrintStream out=new PrintStream("out_atempt_0.txt");
		int arr[];
		long n,tmp;
		int mul,d,l;
		
		long t=Long.parseLong(br.readLine());
		for(int i=0;i<t;i++)
		{
			arr=new int[10];
			n=Long.parseLong(br.readLine());
			for(mul=1;true;mul++)
			{
				tmp=mul*n;
				if(tmp==0)
				{
					mul=0;
					break;
				}
				while(tmp>0)
				{
					d=(int)tmp%10;
					arr[d]=1;
					tmp/=10;
				}
				for(l=0;l<10;l++)
					if(arr[l]==0)
						break;
				if(l>=10)
					break;
			}
			if(mul!=0)
				out.println("Case #"+(i+1)+": "+(mul*n));
			else
				out.println("Case #"+(i+1)+": INSOMNIA");
		}

	}

}
