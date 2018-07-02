package methodEmbedding.Standing_Ovation.S.LYD117;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
 * Teju Nareddy
 * 4/10/15
 * CodeJam 2015: Problem A
 */

public class A
{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new FileReader("A-small-attempt1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small-out.txt")));
		StringTokenizer st = new StringTokenizer(f.readLine());

		int cases = Integer.parseInt(st.nextToken());
		
		for (int j = 1; j <= cases; j++)
		{
			st = new StringTokenizer(f.readLine());
			int countOfZero = 0;
			long sum = 0;
			int max = Integer.parseInt(st.nextToken());

			String nums = st.nextToken();
			for (int i = 0; i < max; i++)
			{
				int num = Integer.parseInt(nums.charAt(i) + "");
				sum += num;

				if (num == 0 && sum <= i)
				{
					countOfZero++;
					sum += 1;
				}
			}

			out.println("Case #" + j + ": " + countOfZero);
		}

		f.close();
		out.close();
	}
}
