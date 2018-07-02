package methodEmbedding.Counting_Sheep.S.LYD1527;

import java.util.*;
import java.io.*;

class GCJ01
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader ( new InputStreamReader (System.in));
		int t=Integer.parseInt(br.readLine());
		int i=0;
		while(i++<t)
		{
			int n=Integer.parseInt(br.readLine());
			Set<Integer> s= new HashSet<Integer>();
			if(n==0)
			{
				System.out.println("Case #"+i+": INSOMNIA");
			}
			else
			{
				int j=1;
				while(true)
				{
					int x=j*n;
					while(x!=0)
					{
						s.add(x%10);
						x=x/10;
					}
					if(s.size()==10)
					{
						System.out.println("Case #"+i+": "+j*n);
						break;
					}
					j++;
				}
			}	
		}
	}
}
