package methodEmbedding.Magic_Trick.S.LYD317;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrick
{
	public static void main(String[] args)
	{
		/* Load Input File */
		Scanner inputFile = null;
		try
		{
			inputFile = new Scanner(new File("input-small.in"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("No Input File Found");
		}

		/* Create Output File */
		PrintWriter outputFile = null;
		try
		{
			outputFile = new PrintWriter(new FileOutputStream("output-small.out"));
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("Output File Creation Error!");
		}
				
		/* Read Number of Cases */
		int cases = inputFile.nextInt();
		System.out.println(cases + " Cases Found!");
		
		/* Initialize Variables */
		int row1, row2, count, result;
		int[][] cards1, cards2;
				
		/* For Each Case */
		for (int t = 1; t <= cases; t ++)
		{
			cards1 = new int[4][4];
			cards2 = new int[4][4];
			
			row1 = inputFile.nextInt();
			for (int m = 0; m < 4; m ++)
			{
				for (int n = 0; n < 4; n ++)
				{
					cards1[m][n] = inputFile.nextInt();
				}
			}
			row2 = inputFile.nextInt();
			for (int m = 0; m < 4; m ++)
			{
				for (int n = 0; n < 4; n ++)
				{
					cards2[m][n] = inputFile.nextInt();
				}
			}
			count = 0;
			result = 0;
			for (int m = 0; m < 4; m ++)
			{
				for (int n = 0; n < 4; n ++)
				{
					if(cards1[row1 - 1][m] == cards2[row2 - 1][n])
					{
						count ++;
						result = cards1[row1 - 1][m];
					}
				}
			}
			if (count == 0)
				outputFile.println("Case #" + t +": Volunteer cheated!");
			else if (count == 1)
				outputFile.println("Case #" + t +": " + result);
			else
				outputFile.println("Case #" + t +": Bad magician!");
		}
		outputFile.close();
		inputFile.close();
		System.out.println("Complete!");
	}
}
