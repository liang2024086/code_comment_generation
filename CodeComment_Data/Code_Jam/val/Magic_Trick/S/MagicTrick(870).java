package methodEmbedding.Magic_Trick.S.LYD1211;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;


public class MagicTrick {
	public static void main(String[] args)
	{
		Scanner input = null;
		PrintWriter output = null;
		try
		{
			input = new Scanner(new FileInputStream("input.txt"));
			output = new PrintWriter(new FileOutputStream("output.txt"));
		}
		catch (Exception e)
		{
			System.out.println("Error opening file(s)!");
			System.exit(1);
		}
		
		int cases = input.nextInt();
		for (int i = 1; i <= cases; i++)
		{
			boolean options[] = new boolean[17];
			for (int j = 0; j < 16; j++)  // Set all options to false
			{
				options[j] = false;
			}
			int choice = input.nextInt();
			choice--;  // Offset, arrays start at 0!

			for (int j = 0; j < 4; j++)
			{
				for (int k = 0; k < 4; k++)
				{
					int current = input.nextInt();
					if (choice != j) // If this wasn't the row we chose, move on
					{
						continue;
					}
					else
					{
						options[current] = true;
					}
				}
			}
			
			// Process second choice
			choice = input.nextInt();
			choice--;  // Offset, arrays start at 0!

			for (int j = 0; j < 4; j++)
			{
				for (int k = 0; k < 4; k++)
				{
					int current = input.nextInt();
					if (choice == j) // If this was the row they chose, move on
					{
						continue;
					}
					else
					{
						options[current] = false;
					}
				}
			}
			
			// Process Result
			output.print("Case #" + i + ": ");
			int answer = 0;
			boolean processed = false;
			for (int j = 0; j < 17; j++)  // Set all options to false
			{
				if (options[j])
				{
					if(answer == 0)
					{
						answer = j;
					}
					else
					{
						output.println("Bad magician!");
						processed = true;
						break;
					}
				}
			}
			
			if (!processed)
			{
				if (answer == 0)
				{
					output.println("Volunteer cheated!");
				}
				else
				{
					output.println(answer);
				}
			}
		}
		
		input.close();
		output.close();
	}
}
