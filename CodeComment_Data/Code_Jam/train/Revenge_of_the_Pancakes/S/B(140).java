package methodEmbedding.Revenge_of_the_Pancakes.S.LYD884;

import java.util.*;
import java.io.*;
public class B
{
	public static void main(String[] args) throws Exception
	{
//		Scanner in = new Scanner(System.in);
//		PrintWriter out = new PrintWriter(System.out);
		
		Scanner in = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("B-small.out"));
		
		int t = in.nextInt();
		for(int x = 0; x < t; x++)
		{
			char[] s = in.next().toCharArray();
			
			int result = 0;
			char type = '+';
			for(int y = s.length - 1; y >= 0; y--)
			{
				if(s[y] != type)
				{
					result++;
				}
				
				type = s[y];
			}
			
			out.println("Case #" + (x + 1) + ": " + result);
		}
		
		out.close();
	}
}
