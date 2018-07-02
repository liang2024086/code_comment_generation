package methodEmbedding.Counting_Sheep.S.LYD1539;

import java.io.*;
import java.util.*;

class Demo
{
public static void main(String[] args)
	{
	try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int test=1;
		for(test=1; test<=t; test++)
			{
			long n=Long.parseLong(br.readLine());
			long m=n;
			long e=n;
			int flag=0;
			if(n==0)
				{
				System.out.println("Case #"+test+": "+"INSOMNIA");
				}
			int a[]=new int[11];
			int i=2;
			while(n>=1)
				{
				while(m>0)
					{
					int q=(int)m%10;
					a[q]=1;
					m=m/10;
					}
				int count=0;
				for(int j=0; j<=9; j++)
					{
					if(a[j]>0)
						{
						flag=1;
						count++;
						}
					}
				if(flag==1 && count==10)
					{
					break;
					}
				n=i*e;
				m=n;
				i++;
				}
			if(flag==1 && n!=0)
				{
				System.out.println("Case #"+test+": "+n);
				}
			}
		}catch(Exception e){System.out.println(e);}
	}
}
