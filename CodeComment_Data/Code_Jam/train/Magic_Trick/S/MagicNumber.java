package methodEmbedding.Magic_Trick.S.LYD1921;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int numCases;
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		numCases = Integer.parseInt(b.readLine());
		String firstRow = "";
		String secondRow = "";
		String[] firstNumbers = new String[4];
		int[] firstNumbersInt = new int[4];
		String[] secondNumbers = new String[4];
		int[] secondNumbersInt = new int[4];
		for (int i = 0; i < numCases; i++)
		{
			int firstRowChosen = Integer.parseInt(b.readLine());
			for (int j = 0; j < firstRowChosen; j++)
				firstRow = b.readLine();
			firstNumbers = firstRow.split(" ");
			for (int j = firstRowChosen; j < 4; j++)
				b.readLine();
			int secondRowChosen = Integer.parseInt(b.readLine());
			for (int j = 0; j < secondRowChosen; j++)
				secondRow = b.readLine();
			secondNumbers = secondRow.split(" ");
			for (int j = secondRowChosen; j < 4; j++)
				b.readLine();
				
			for (int j = 0; j < 4; j++)
			{
				firstNumbersInt[j] = Integer.parseInt(firstNumbers[j]);
				secondNumbersInt[j] = Integer.parseInt(secondNumbers[j]);
			}
			
			int duplicateCount = 0;
			int duplicateNumber = 0;
			
			for (int j = 0; j < 4; j++)
			{
				int firstNumber = firstNumbersInt[j];
				for (int k = 0; k < 4; k++)
				{
					if (firstNumber == secondNumbersInt[k])
					{
						duplicateCount++;
						duplicateNumber = firstNumber;
					}
				}
			}
			
			int caseNumber = i + 1;
			
			System.out.print("Case #" + caseNumber + ": ");
			if (duplicateCount == 0)
				System.out.println("Volunteer cheated!");
			else if (duplicateCount == 1)
				System.out.println(duplicateNumber);
			else
				System.out.println("Bad magician!");
		}
	}
}
