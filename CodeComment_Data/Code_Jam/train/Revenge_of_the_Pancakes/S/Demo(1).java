package methodEmbedding.Revenge_of_the_Pancakes.S.LYD756;

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
			String str=br.readLine();
			int n=str.length();
			int a[]=new int[n];
			for(int i=0; i<n; i++)
				{
				if(str.charAt(i)=='+')
					a[i]=1;
				else
					a[i]=0;
				}
			n=n-1;
			int count=0;
			while(n>=0)
				{
				while(a[n]==1)
					{
					n--;
					if(n<0)
						{
						break;
						}
					}
				if(n<0)
					{
					break;
					}
				else
					{
					for(int j=0; j<=n; j++)
						{
						if(a[j]==1)
							a[j]=0;
						else
							a[j]=1;
						}
					count++;
					}
				}
			System.out.println("Case #"+test+": "+count);
			}
		}catch(Exception e){System.out.println(e);}
	}
}
