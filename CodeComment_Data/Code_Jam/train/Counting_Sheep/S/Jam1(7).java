package methodEmbedding.Counting_Sheep.S.LYD357;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
class Jam1
{
	public static void main(String[] argv) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++)
		{
			int n=Integer.parseInt(br.readLine());
			
			if(n==0)
			{
				System.out.println("Case #"+i+": "+"INSOMNIA");
			}
			else
			{
				
				int a[]=new int[10];
				long j=0;
				long count=0;
				long c=1;
				long d=1;
				long q=1;
				while(count!=10)
				{
					 q=d*n;
					
					String str=String.valueOf(q);
					
					char ch[]=str.toCharArray();
					long g=ch.length;
					
					for(int h=0;h<g;h++)
					{
						String str1=Character.toString(ch[h]);
						int w=Integer.parseInt(str1);

						if(a[w]!=1)
						{
						a[w]=1;
						count++;
						}
						
					}
					d++;
					j++;
					
				}
				System.out.println("Case #"+i+": "+q);
				
				
				
			}
			
		}
	}
}
