package methodEmbedding.Magic_Trick.S.LYD230;

import java.util.*;

public class MagicTrick {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num_cases = sc.nextInt();
		
		for (int n = 0; n < num_cases; n++)
		{
		
			int first_index = sc.nextInt();
			int[] first_row = new int[4];
			
			for (int i = 1; i <= 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					int next = sc.nextInt();
					if (first_index == i)
					{
						first_row[j] = next;
					}
				}
			}
			
			int matches = 0;
			int number = 0;
			
			int second_index = sc.nextInt();
			for (int i = 1; i <= 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					int next = sc.nextInt();
					if (second_index == i)
					{
						for (int k = 0; k < 4; k++)
						{
							if (next == first_row[k])
							{
								matches++;
								number = next;
							}
						}
					}
				}
			}
			
			if (matches == 0)
			{
				System.out.printf("Case #%d: Volunteer cheated!\n", n+1);
			}
			else if (matches == 1)
			{
				System.out.printf("Case #%d: %d\n", n+1, number);
			}
			else
			{
				System.out.printf("Case #%d: Bad magician!\n", n+1);
			}
			
		}
		

	}
}
