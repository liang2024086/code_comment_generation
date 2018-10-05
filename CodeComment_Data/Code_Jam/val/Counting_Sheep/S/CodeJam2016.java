package methodEmbedding.Counting_Sheep.S.LYD799;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CodeJam2016
{

	public static void main(String[] args) throws Exception
	{

		BufferedReader br = new BufferedReader(new FileReader(new File(
				"C:\\Users\\Chintan Trivedi\\Downloads\\A-small-attempt1.in")));
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int j = 1; j <= T; j++)
		{

			int N = Integer.parseInt(br.readLine());

			List<Character> numbers_seen = new LinkedList<Character>();
			int i = 1;
			if (N == 0)
			{
				System.out.println("Case #" + j + ": INSOMNIA");
				continue;
			}
			int ans = 0;
			while (numbers_seen.size() < 10)
			{
				ans = N * i;
				for (char c : Integer.toString(ans).toCharArray())
				{
					// System.out.println(ans);

					if (!numbers_seen.contains(new Character(c)))
					{
						numbers_seen.add(new Character(c));
					}
				}
				i++;
			}
			System.out.println("Case #" + j + ": " + ans);
		}

	}
}
