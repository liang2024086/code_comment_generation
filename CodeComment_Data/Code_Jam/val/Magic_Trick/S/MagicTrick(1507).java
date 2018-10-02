package methodEmbedding.Magic_Trick.S.LYD1264;

import java.util.Scanner;

public class MagicTrick
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for (int t = 1; t <= T; t++)
		{
			int firstAnswer = in.nextInt() - 1; // make 0-indexed
			int[] rowNumbers = new int[4];
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					int num = in.nextInt();
					if (i == firstAnswer)
					{
						rowNumbers[j] = num;
					}
				}
			}

			int secondAnswer = in.nextInt() - 1;
			int finalAnswer = -1;
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					int num = in.nextInt();
					if (i == secondAnswer)
					{
						for (int k = 0; k < 4; k++)
						{
							if (rowNumbers[k] == num)
							{
								if (finalAnswer == -1)
								{
									// good answer
									finalAnswer = num;
								}
								else
								{
									// bad magician
									finalAnswer = -2;
								}
							}
						}
					}
				}
			}

			System.out.printf("Case #%d: ", t);
			if (finalAnswer == -1)
			{
				System.out.println("Volunteer cheated!");
			}
			else if (finalAnswer == -2)
			{
				System.out.println("Bad magician!");
			}
			else
			{
				System.out.println(finalAnswer);
			}
		}

		in.close();
	}

}
