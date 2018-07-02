package methodEmbedding.Standing_Ovation.S.LYD1831;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class StandingOvation
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(
				new FileWriter("standing.out")));

		StringTokenizer st;
		int testCases = Integer.parseInt(in.readLine());
		for (int test = 1; test <= testCases; test++)
		{
			st = new StringTokenizer(in.readLine());
			int add = 0;

			int last = Integer.parseInt(st.nextToken()) + 1;
			String line = st.nextToken();

			int[] val = new int[last];
			int[] sum = new int[last];

			int v = line.charAt(0) - '0';
			val[0] = v;
			sum[0] = v;
			for (int i = 1; i < last; i++)
			{
				int value = line.charAt(i) - '0';
				val[i] = value;
				sum[i] = sum[i - 1] + value;
			}
			
			for (int i = 1; i < last; i++)
				if (val[i] > 0)
					if (sum[i - 1] + add < i)
						add += i - sum[i - 1] - add;

			out.printf("Case #%d: %d%n", test, add);
		}

		in.close();
		out.close();
	}
}
