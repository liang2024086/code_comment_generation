package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1052;

/*
 * ID: mrdevil1 LANG: JAVA TASK: test
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.TextSyntax;

class RevengePancakes
{

	private static final String PROBLEM_NAME = "RevengePancakes";
	private static final String PATH = "I:/EclipseWorkspace/CodeJam2016/src/com/devil/qualification/";

	public static void main(String[] arg) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader(PATH + PROBLEM_NAME + ".in"));
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(PATH + PROBLEM_NAME + ".out")));

		int testCases = Integer.parseInt(reader.readLine());

		String inputString;
		int minFlips = 0;

		char currentChar;
		char nextChar;
		for (int input = 0; input < testCases; input++)
		{
			inputString = reader.readLine();
			minFlips = 0;
			if (inputString.length() == 1)
			{
				if (inputString.equals("-"))
				{
					minFlips += 1;
				}
			}
			else
			{
				for (int i = 0; i < inputString.length() - 1; i++)
				{
					currentChar = inputString.charAt(i);
					nextChar = inputString.charAt(i + 1);
					if (i == inputString.length() - 2)
					{
						if (nextChar == '-')
						{
							minFlips += 1;
						}
					}
					if (nextChar == currentChar)
					{
						continue;
					}
					else
					{
						minFlips += 1;
					}
				}
			}
			writer.println("Case #" + (input + 1) + ": " + minFlips);
		}
		reader.close();
		writer.close();
	}
}
