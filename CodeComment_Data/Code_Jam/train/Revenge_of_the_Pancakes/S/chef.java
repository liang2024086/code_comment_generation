package methodEmbedding.Revenge_of_the_Pancakes.S.LYD687;

import java.io.*;
import java.util.*;
class O
{
	
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++)
		{
			String str = br.readLine();
			char x[] = str.toCharArray();
			boolean all=false;
			int count = 0;
			
			for(int j=x.length-1;j>=0;j--)
			{
				if(x[j]=='-')
				{
					count++;
					for(int p=j;p>=0;p--)
					{
						if(x[p]=='-')
							x[p]='+';
						else
							x[p]='-';
					}
				}
			}
			
			System.out.println("Case #"+i+": "+count);
		}
	}
}
