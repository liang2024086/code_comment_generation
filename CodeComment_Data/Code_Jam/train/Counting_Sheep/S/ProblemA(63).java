package methodEmbedding.Counting_Sheep.S.LYD1615;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProblemA
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new FileReader("A-small-attempt0.in"));

		// input file name goes above
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"out.out")));

		int noOfCases = Integer.parseInt(f.readLine());

		for (int i = 0; i < noOfCases; i++)
		{
			int n = Integer.parseInt(f.readLine());
			boolean[] seen = new boolean[10];

			for (int j = 1; j < 500; j++)
			{
				int number = n * j;
				String nString = Integer.toString(number);
				for (int k = 0; k < nString.length(); k++)
				{
					String current = Character.toString(nString.charAt(k));
					seen[Integer.parseInt(current)] = true;
				}
				boolean done = true;
				for (int l = 0; l < 10; l++)
				{
					if (seen[l] == false)
					{
						done = false;
						break;
					}
				}
				if (done == true)
				{
					out.println("Case #" + (i+1) + ": " + number);
					break;
				}
				else if (j == 499)
				{
					out.println("Case #" + (i+1) + ": INSOMNIA");
					break;
				}

			}

		}
		out.close();

	}
}
