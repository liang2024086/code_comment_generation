package methodEmbedding.Counting_Sheep.S.LYD1279;

import java.util.*;
import java.lang.*;
import java.io.*;

class p1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    //StringTokenizer st=new StringTokenizer(br.readLine());
		BufferedReader br=new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter pw=new PrintWriter("output1.txt");
	    int t=Integer.parseInt(br.readLine());
		for(int q=1;q<=t;q++)
		{
			long n=Long.parseLong(br.readLine());
			if(n==0)
			{
				pw.println("Case #"+q+": INSOMNIA");
			}
			else
			{
				long a[]=new long[10];
				int c=0;
				long z=n,ans=0,mul=2;
				while(true)
				{
					ans=z;
					while(z!=0)
					{
						int d=(int)(z%10);
						if(a[d]==0)
						{
							c++;
							a[d]++;
						}
						z=z/10;
					}
					if(c==10)
					{
						break;
					}
					z=n*mul;
					mul++;
				}
				pw.println("Case #"+q+": "+ans);
			}
		}
		pw.close();
	}
}
