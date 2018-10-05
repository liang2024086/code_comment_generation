package methodEmbedding.Standing_Ovation.S.LYD885;

import java.util.*;
import java.io.*;

public class Problem1
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("input.in");
		Scanner sc = new Scanner(f);
		String c = sc.nextLine();
		int count  = Integer.parseInt(c);
		for (int i = 0; i < count; i++)
		{
			String inp = sc.nextLine();
			String[] inps = inp.split(" ");
			int standing = 0;
			int pplNeeded = 0;
			int len = Integer.parseInt(inps[0]);
			for (int j = 0; j <= len; j++)
			{
				if (standing < j)
				{
					int x = j - standing;
					pplNeeded = pplNeeded + x;
					standing = standing + x;
				}
				int y = (int)(inps[1].charAt(j) - '0');
				standing = standing + y;
				// System.out.println("standing === " + standing);

			}
			int k = i+1;
			System.out.println("Case #" + k + ": " + pplNeeded);
		}
	}
}
