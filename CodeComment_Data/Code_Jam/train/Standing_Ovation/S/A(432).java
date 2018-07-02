package methodEmbedding.Standing_Ovation.S.LYD861;

import java.util.*;

class Main
{	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int TT = in.nextInt();
		
		for(int T = 1; T <= TT; ++T)
		{
			int maxShy = in.nextInt();
			String audience = in.next();
			
			int ret = 0;
			int standingCount = 0;
			for(int i=0; i<=maxShy; ++i)
			{
				int c = (int)(audience.charAt(i) - '0');
				if(standingCount < i)
				{
					ret += (i - standingCount);
					standingCount = i;
				}
				standingCount += c;
			}
			
			System.out.println("Case #" + T + ": " + ret);
		}
	}
}
