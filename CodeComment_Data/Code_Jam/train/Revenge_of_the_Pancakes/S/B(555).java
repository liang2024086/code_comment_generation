package methodEmbedding.Revenge_of_the_Pancakes.S.LYD611;

import java.util.*;
import java.io.*;

public class B
{
	public static void main(String[] args) throws Exception
	{
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("B-small-attempt0.in"));
		PrintStream out = new PrintStream(new File("B-small-attempt0.out"));
		int t = in.nextInt();
		for (int i = 1; i <= t; i++) 
		{
			String s = in.next();
			char[] c = s.toCharArray();
			int ans = 0;

			char cur = c[0];
			int j = 0;
			while(j < c.length)
			{
				if (c[j] != cur) {
					ans++;
					cur = c[j];
				}
				j++;
			}
			if (cur == '-') {
				ans++;
			}

			out.println("Case #"+i+": "+ans);
		}
		in.close();
		out.close();
	}

}
