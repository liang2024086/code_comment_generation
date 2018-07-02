package methodEmbedding.Standing_Ovation.S.LYD175;

import java.util.*;
import java.io.*;

public class StandingOvation {
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("shyness.txt"));
		int test = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < test; i++)
		{
			int smax = scan.nextInt();
			String levels = scan.nextLine().trim();
			int[] lvls = new int[smax+1];
			for(int lcv = 0; lcv < levels.length(); lcv++)
				lvls[lcv] = Integer.parseInt(levels.substring(lcv, lcv+1));

			// simulate audience members standing up
			int numStanding = 0;
			int numNeeded = 0;
			for(int lcv = 0; lcv < lvls.length; lcv++)
			{
				if(numStanding < lcv)
				{
					if(lvls[lcv] == 0)
						continue;
					int need = lcv - numStanding;
					numStanding += need + lvls[lcv];
					numNeeded += need;
				}
				else
					numStanding += lvls[lcv];
			}
			int caseNum = i+1;
			System.out.println("Case #" + caseNum + ": " + numNeeded);
		}
	}
}
