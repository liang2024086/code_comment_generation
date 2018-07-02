package methodEmbedding.Revenge_of_the_Pancakes.S.LYD987;

import java.util.*;
import java.io.*;

class GCJ02
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader ( new InputStreamReader (System.in));
		int t=Integer.parseInt(br.readLine());
		int i=0;
		while(i++<t)
		{
			String str= br.readLine();
			int count=0;
			boolean flip=false;
			for(int j=str.length()-1;j>=0;j--)
			{
				if(str.charAt(j)=='+')
				{
					if(flip)
					{
						flip=false;
						count++;
					}
					else
					{
						continue;
					}
				}
				else
				{
					if(flip)
					{
						continue;
					}
					else
					{
						flip=true;
						count++;
					}
				}

			}
			System.out.println("Case #"+i+": "+count);	
		}
	}
}
