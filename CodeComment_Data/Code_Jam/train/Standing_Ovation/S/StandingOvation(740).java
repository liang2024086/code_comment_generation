package methodEmbedding.Standing_Ovation.S.LYD512;

import java.util.*;
import java.io.*;

public class StandingOvation 
{

	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("A-small-attempt1.in"));
		PrintWriter out = new PrintWriter(new File("outputA.txt"));
		int t = in.nextInt();
		for (int j = 1; j <= t; j++)
		{
			int sMax = in.nextInt();
			int ans = 0;
			int cnt = 0;
			String s = in.next();
			for (int i = 0; i <= sMax; i++)
			{
				int k = s.charAt(i) - '0';
				if (cnt < i)
				{
					ans += i - cnt;
					cnt = i;
				}
				cnt += k;
			}
			out.println("Case #" + j + ": " + ans);
			
		}
		in.close();
		out.close();
	}
}
