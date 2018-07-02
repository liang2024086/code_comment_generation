package methodEmbedding.Magic_Trick.S.LYD1412;

import java.util.*;

class pA {

	public static void main(String[] locats)
	{

		Scanner in = new Scanner(System.in);
	
		int T = in.nextInt();

		// Run for each case.
		for (int i = 0; i < T; i++)
		{
			// First grid.
			int ans1 = in.nextInt();

			int[] numbers = new int[4];
			// Loop through each row in grid.
			for (int j = 0; j < 4; j++)
			{
				// loop through cols
				for (int k = 0; k < 4; k++)
				{
					if (ans1 == j + 1)
					{
						numbers[k] = in.nextInt();
					}
					else
					{
						in.nextInt();
					}
				}
			}

			// Second Grid.
			int ans2 = in.nextInt();

			int[] numbers2 = new int[4];
			// Loop through each row in grid.
			for (int j = 0; j < 4; j++)
			{
				// loop through cols
				for (int k = 0; k < 4; k++)
				{
					if (ans2 == j + 1)
					{
						numbers2[k] = in.nextInt();
					}
					else
					{
						in.nextInt();
					}
				}
			}
			
			// Now we just check if any of the entries in the rows match.
			// 0 impossible; 1 sure; >1 impossible.
			int match = 0;
			int theNumber = 0;
			for (int j = 0; j < 4; j ++)
			{
//				System.out.println("s1: " + numbers[j]+ "	s2: " + numbers2[j]);
				for (int k = 0; k < 4; k++)
				{
					if (numbers[j] == numbers2[k])
					{
			 			match++;	
						theNumber = numbers[j];
					}
				}	
			}
			
			// Now for the output
			//
			System.out.print("Case #" + (i+1) + ": ");
			if (match == 0) 
			{
				// Impossible
				System.out.println("Volunteer cheated!");
			}
			else if (match == 1)
			{
				// print result.
				System.out.println(theNumber);
			}
			else
			{ 
				// unknowable
				System.out.println("Bad magician!");
			}
		}
	}
}
