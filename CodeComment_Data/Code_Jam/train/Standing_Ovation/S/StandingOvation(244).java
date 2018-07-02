package methodEmbedding.Standing_Ovation.S.LYD137;

import java.util.*;

public class StandingOvation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 1; i <= t; ++i)
		{
			in.nextInt();
			String line = in.next();
			int extra = 0;
			int current = 0;
			for (int idx = 0; idx < line.length(); ++idx)
			{
				extra += Math.max(0, idx - (current + extra));
				current += line.charAt(idx) - '0';
			}
			
			System.out.printf("Case #%d: %d\n", i, extra);
		}
	}
}
