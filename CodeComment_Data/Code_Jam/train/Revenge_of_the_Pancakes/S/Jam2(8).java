package methodEmbedding.Revenge_of_the_Pancakes.S.LYD255;

import java.io.*;
import java.util.*;
class Jam2
{
	public static void main(String[] argv) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++)
		{
			String str=br.readLine();
			int x=str.length();
			char ch[]=str.toCharArray();
			int count=0;
			int j=x-1;
			int r=0;
			while(count!=x)
			{
				if(ch[j]=='+')
				{
					j--;
					count++;
				}
				else
				{
					for(int z=j;z>=0;z--)
					{
						if(ch[z]=='-')
						{
							ch[z]='+';
						}
						else
						{
							ch[z]='-';
						}
					}
					r++;
					j--;
					count++;
				}
			}
			System.out.println("Case #"+i+": "+r);
			
		}
	}
}
