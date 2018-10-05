package methodEmbedding.Standing_Ovation.S.LYD50;

import java.util.Scanner;


public class ovation {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int z = 0; z < t; z++)
		{
			int n = in.nextInt();
			char[] c  = in.next().toCharArray();
			
			int amountNeeded = 0;
			int curAmount = 0;
			for (int i = 0; i <= n; i++)
			{
				if (curAmount < i)
				{
					amountNeeded += i - curAmount;
					curAmount += i - curAmount;
				}
				
				curAmount += c[i] - '0';
			}
			
			System.out.println("Case #" + (z + 1) + ": " + amountNeeded);
		}
	}
}
