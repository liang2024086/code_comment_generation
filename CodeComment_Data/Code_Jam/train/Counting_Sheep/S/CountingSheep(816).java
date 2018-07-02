package methodEmbedding.Counting_Sheep.S.LYD626;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CountingSheep
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int t = 0; t < T; ++t)
		{
			long N = Long.parseLong(in.readLine());
			if (N == 0)
			{
				System.out.printf("Case #%d: INSOMNIA\n", t+1);
				continue;
			}
			HashSet<Character> digits = new HashSet<Character>();
			long curr = 0;
			while (digits.size() < 10)
			{
				curr += N;
				String s = curr+"";
				for (int i = 0; i < s.length(); ++i) digits.add(s.charAt(i));
			}
			System.out.printf("Case #%d: %d\n", t+1, curr);
		}
	}
}
