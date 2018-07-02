package methodEmbedding.Standing_Ovation.S.LYD1266;

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			int TC = Integer.parseInt(br.readLine());
			for(int i=0;i<TC;i++)
			{
				int as = 0;
				int f = 0;
				String[] arr = br.readLine().split(" ");
				int maxs = Integer.parseInt(arr[0]);
				for(int s=0;s<=maxs;s++)
				{
					int c = Character.getNumericValue(arr[1].charAt(s));
					if(s == 0)
					{
						as += c;
						continue;
					}
					if(as >= s && s > 0)
					{
						as += c;
					}
					else if (as < s && s > 0)
					{
						++f;
						as += c;
						as += 1;
					}
				}
				System.out.println("Case #" + (i+1) + ": " + f);
			}
		}
		catch(Exception e)
		{}
	}
}
