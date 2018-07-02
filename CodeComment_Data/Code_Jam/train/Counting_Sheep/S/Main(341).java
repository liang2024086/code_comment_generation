package methodEmbedding.Counting_Sheep.S.LYD483;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		boolean[] allNumbers = new boolean[10];
		Arrays.fill(allNumbers, true);

		for (int i = 1; i <= t; ++i)
		{
			int n = in.nextInt();

			if (n == 0)
			{
				System.out.println("Case #" + i + ": INSOMNIA");
			}
			else
			{
				boolean[] numbersFound = new boolean[10];
				boolean asleep = false;

				for (int j = 1; !asleep; ++j)
				{
					char[] numbs = String.valueOf(n * j).toCharArray();

					for (char c : numbs)
					{
						int nd = c - 48;

						numbersFound[nd] = true;

						boolean numberNotFound = false;

						for (int k = 0; k < numbersFound.length; ++k)
						{
							if (numbersFound[k] == false)
							{
								numberNotFound = true;
								break;
							}
						}

						asleep = !numberNotFound;

						if (asleep)
						{
							System.out.println("Case #" + i + ": " + n * j);
							break;
						}
					}
				}
			}
		}

		in.close();
		System.exit(0);
	}
}
