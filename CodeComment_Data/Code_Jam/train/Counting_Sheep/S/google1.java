package methodEmbedding.Counting_Sheep.S.LYD1636;

import java.util.*;
import java.io.*;
class goo
{

	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter pr=new PrintWriter("ind1.txt");
		int b=Integer.parseInt(br.readLine());
		for(int k=0;k<b;k++)
		{
			long c=Long.parseLong(br.readLine());
			long d=c;
			long q=1;
			long k1=0;
			int w=0;
			int a[]=new int[10];
			if(c==0)
			{
				pr.println("Case #"+(k+1)+": "+"INSOMNIA");
			}
			else
			{
			abc:while(true)
			{
				c=d*q;
				k1=c;
			while(c!=0)
			{
				w=(int)c%10;
				a[w]++;
				c=(int)c/10;
			}
			for(int i=0;i<10;i++)
			{
				if(a[i]==0)
				{
					break;
				}
				if(i==9&&a[i]!=0)
				{
					pr.println("Case #"+(k+1)+": "+k1);
					break abc;
				}
			}
			q++;
			
			
			}
			
			
			}
	}
	pr.close();
}
}
