package methodEmbedding.Standing_Ovation.S.LYD1885;


import java.util.Scanner;


public class StandingOvation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Scanner data = new Scanner(System.in);
		System.out.print("Enter the test data: ");
		int testCases = Integer.parseInt(in.next());
		String[] results = new String[testCases];
		
		for (int i = 1; i <= testCases; i++)
		{
			int arraySize = Integer.parseInt(in.next());
			char[] audienceData = in.next().toCharArray();
			int[] audienceLevels = new int[arraySize + 1];
			for (int j = 0; j < audienceData.length; j++)
			{
				audienceLevels[j] = Integer.parseInt(audienceData[j] + ""); 
			}
			int friendsNeeded = 0;
			for (int k = 0; k < audienceLevels.length; k++)
			{
				int sum = 0;
				int l = 0;
				do
				{
					sum += audienceLevels[l];
					//System.out.println(audienceLevels[l]);
					l++;
				}
				while(l < k);
				//System.out.println("Sum: " + sum + " Friends Needed: " + friendsNeeded);
				if (sum + friendsNeeded < k)
				{
					friendsNeeded += k - (sum + friendsNeeded);
				}
			}
			results[i - 1] = "Case #" + i + ": " + friendsNeeded;
		}
		System.out.println();
		for (int i = 0; i < testCases; i++)
		{
			System.out.println(results[i]);
		}
	}
}
