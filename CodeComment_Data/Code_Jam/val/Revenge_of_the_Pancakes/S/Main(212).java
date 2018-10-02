package methodEmbedding.Revenge_of_the_Pancakes.S.LYD127;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * @author Jaryt Bustard
 */
public class Main
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();

		for (int i = 1; i <= t; i++)
		{
			String stackString = in.next();
			String target = stackString.replace("-", "+");
			char[] stackArray = stackString.toCharArray();
			boolean allHappy = target.equals(new String(stackArray));
			int flips = 0;

			if (stackArray.length == 1)
			{
				if (stackArray[0] == '-')
				{
					System.out.println("Case #" + i + ": 1");
				}
				else
				{
					System.out.println("Case #" + i + ": 0");
				}
			}
			else if (!allHappy)
			{
				flipAgain:
				do
				{
					char topPancake = stackArray[0];

					for (int j = 0; j < stackArray.length; j++)
					{
						char pancakeState = stackArray[j];

						if (pancakeState != topPancake)
						{
							allHappy = target.equals(new String(stackArray));
							flips++;
							continue flipAgain;
						}
						else
						{
							if (pancakeState == '+')
							{
								stackArray[j] = '-';
							}
							else if (pancakeState == '-')
							{
								stackArray[j] = '+';
							}
						}
					}

					flips++;
					allHappy = target.equals(new String(stackArray));
				}
				while (!allHappy);
			}
			
			if (stackArray.length != 1)
			{
				System.out.println("Case #" + i + ": " + flips);
			}
		}

		in.close();
		System.exit(0);
	}
}
