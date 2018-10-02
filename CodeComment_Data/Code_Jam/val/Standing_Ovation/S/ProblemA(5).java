package methodEmbedding.Standing_Ovation.S.LYD1812;

import java.util.*;
import java.lang.*;
import java.io.*;

class ProblemA
{
	public static void main(String[] arg)
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=1; t<=T; t++) 
		{
			int sol =0;
			int Smax = in.nextInt();
			String s = in.next();
			int sum=0;
			if (s.length() > 1)
			{
				for(int i=0;i<s.length(); i++)
				{
					if(sum<i)
					{
						sol += i-sum;
						sum += i-sum;
					}
					sum += Integer.parseInt(Character.toString(s.charAt(i)));	
				}
			}
			System.out.println("Case #"+t +": "+ sol);
		}
	}
}
