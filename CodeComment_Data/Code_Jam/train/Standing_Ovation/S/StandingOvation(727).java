package methodEmbedding.Standing_Ovation.S.LYD1909;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class StandingOvation
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
			int smax, standing, friends, extras, temp2;
			String temp;
			
			/* For Each Case */
			for (int n = 1; n <= cases; n ++)
			{
				smax = inputFile.nextInt();
				temp = inputFile.next();
				standing = 0;
				extras = 0;
				friends = 0;
				for (int i = 0; i <= smax; i++)
				{
					temp2 = temp.charAt(i) - 48;
					if (standing >= i)
					{
						standing += temp2;
					}
					else
					{
						extras = i - standing;
						standing += extras + temp2;
						friends += extras;
					}
					//System.out.println(i + ", " + standing);
				}
				//System.out.println("Case #" + n);
				//System.out.println("Case #" + n +": " + friends);
				outputFile.println("Case #" + n +": " + friends);

			}
			outputFile.close();
			inputFile.close();
			System.out.println("Complete!");
		}
	}
