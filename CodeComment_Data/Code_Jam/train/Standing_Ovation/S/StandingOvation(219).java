package methodEmbedding.Standing_Ovation.S.LYD1572;

import java.util.*;
import java.io.*;

public class StandingOvation
{
	public static void main(String args[]) throws FileNotFoundException
	{
		FileReader read = new FileReader("input.in");
		Scanner input = new Scanner(read);

		int cases = input.nextInt();

		for (int i = 0; i < cases; i++)
		{
			int max = input.nextInt();
			int clap = 0;
			int friends = 0;
			String rest = input.next();

			for (int k = 0; k <= max; k++)
			{
				if (clap < k)
				{
					friends += k - clap;
					clap += k - clap;
				}

				clap += rest.charAt(k) - 48;
			}

			System.out.println("Case #" + (i + 1) + ": " + friends);
		}
	}
}
