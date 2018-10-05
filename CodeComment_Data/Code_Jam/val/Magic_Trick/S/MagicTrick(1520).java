package methodEmbedding.Magic_Trick.S.LYD1761;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class MagicTrick
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		int[][] set = new int[4][4];
		String answer;
		for (int i = 1; i <= t; i++)
		{

			int firstRow = reader.nextInt();
			for (int k = 0; k < 4; k++)
			{
				for (int m = 0; m < 4; m++)
					set[k][m] = reader.nextInt();
			}
			Set<Integer> firstSet = new HashSet<Integer>();
			for (int j = 0; j < 4; j++)
			{
				firstSet.add(set[firstRow-1][j]);
			}

			int secondRow = reader.nextInt();
			for (int k = 0; k < 4; k++)
			{
				for (int m = 0; m < 4; m++)
					set[k][m] = reader.nextInt();
			}
			Set<Integer> secondSet = new HashSet<Integer>();
			for (int j = 0; j < 4; j++)
			{
				secondSet.add(set[secondRow-1][j]);
			}

			Set<Integer> intersection = new HashSet<Integer>(firstSet);
			intersection.retainAll(secondSet);

			if (intersection.size() == 0)
				answer = "Volunteer cheated!";
			else if (intersection.size() == 1)
			{
				Object[] answer_array = intersection.toArray();
				answer = answer_array[0].toString();
			}
			else
				answer = "Bad magician!";

			System.out.println("Case #"+i+": "+answer);
		}
	}
}
