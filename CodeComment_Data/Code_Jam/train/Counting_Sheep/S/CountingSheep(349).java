package methodEmbedding.Counting_Sheep.S.LYD1478;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class CountingSheep
{
	private static final String PROBLEM_NAME = "CountingSheep";
	private static final String PATH = "I:/EclipseWorkspace/CodeJam2016/src/com/devil/qualification/countingsheep/";

	public static void main(String[] arg) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader(PATH + PROBLEM_NAME + ".in"));
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(PATH + PROBLEM_NAME + ".out")));

		int totalTests = Integer.parseInt(reader.readLine());
		String numberString;
		int number;
		StringBuilder str;
		long multNumber;
		long answer = -1;
		for (int test = 0; test < totalTests; test++)
		{
			number = Integer.parseInt(reader.readLine());
			str = new StringBuilder("0000000000");

			for (long multiplier = 1; multiplier < 10000; multiplier++)
			{
				multNumber = multiplier * number;
				numberString = String.valueOf(multNumber);
				for (int index = 0; index < numberString.length(); index++)
				{
					str.setCharAt(Character.getNumericValue(numberString.charAt(index)), '1');
				}
				if (!str.toString().contains("0"))
				{
					answer = multNumber;
					break;
				}
			}

			if (answer == -1)
			{
				writer.println("Case #" + (test + 1) + ": INSOMNIA");
			}
			else
			{
				writer.println("Case #" + (test + 1) + ": " + answer);
			}

			answer = -1;
		}

		reader.close();
		writer.close();
	}
}
