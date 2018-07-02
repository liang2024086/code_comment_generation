package methodEmbedding.Revenge_of_the_Pancakes.S.LYD72;

import java.io.*;
import java.util.*;
public class ProblemB
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int count,length;
		String panCakes;
		for(int tc = 1; tc<= t; tc++)
		{
			panCakes = br.readLine();
			count = 0;
			length = panCakes.length();
			for(int i= 0; i < length - 1;i++)
			{
				if(panCakes.charAt(i)!= panCakes.charAt(i + 1))
					count++;
			}
			if((panCakes.charAt(0)== '+' && panCakes.charAt(length-1)== '-') || (panCakes.charAt(0)== '-' && panCakes.charAt(length-1)== '-'))
				count++;	
			System.out.println("Case #"+tc+": "+count);
		}
	}
}
