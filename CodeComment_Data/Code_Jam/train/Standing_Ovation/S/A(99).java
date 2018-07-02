package methodEmbedding.Standing_Ovation.S.LYD1545;

import java.util.*;

public class A
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int i = 1; i<=cases; i++)
		{
			System.out.print("Case #" + i + ": ");
			int total = in.nextInt();
			int[] shy = new int[total + 1];
			String shyString = in.nextLine().trim();
			for (int j = 0; j < shy.length; j++)
			{
				shy[j] = Integer.parseInt(shyString.substring(j, j+1));
			}
			int currentStanding = 0;
			int needed = 0;
			for (int k = 0; k < shy.length; k++)
			{
				if (currentStanding + needed < k)
				{
					needed++;
				}
				currentStanding += shy[k];
			}
			System.out.println(needed);
		}
	}
}
