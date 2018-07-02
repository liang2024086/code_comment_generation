package methodEmbedding.Magic_Trick.S.LYD706;

import java.io.*;
import java.util.Scanner;

public class A
{
	public static void main(String[] args) throws IOException
	{
		String fileName = "A-small1";
		Scanner in = new Scanner(new File(fileName + ".in"));
		PrintWriter out = new PrintWriter(new FileWriter(fileName + ".out"));

		int noOfCases = in.nextInt();
		for (int caseNo = 1; caseNo <= noOfCases; caseNo++)
		{
			int[] numbers = new int[17];
			for (int repeat = 0; repeat < 2; repeat++)
			{
				int rowSelected = in.nextInt();
				for (int number = 0; number < 16; number++)
				{
					int next = in.nextInt();
					int start = (rowSelected - 1) * 4;
					if (number >= start && number < start + 4)
						numbers[next]++;
				}
			}
			int card = 0;
			for (int number = 1; number <= 16 && card >= 0; number++)
			{
				if (numbers[number] == 2)
				{
					if (card == 0)
						card = number;
					else
						card = -1;
				}
			}
			if (card == -1)
				out.printf("Case #%d: Bad magician!%n", caseNo);
			else if (card == 0)
				out.printf("Case #%d: Volunteer cheated!%n", caseNo);
			else
				out.printf("Case #%d: %d%n", caseNo, card);

		}
		in.close();
		out.close();

	}

}
