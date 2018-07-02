package methodEmbedding.Revenge_of_the_Pancakes.S.LYD877;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RevengePancakes
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int t = 0; t < T; ++t)
		{
			String s = in.readLine();
			int cnt = 0;
			for (int i = 1; i < s.length(); ++i)
			{
				if (s.charAt(i) != s.charAt(i-1)) cnt++;	
			}
			if (s.charAt(s.length()-1) == '-') cnt++;
			System.out.printf("Case #%d: %d\n", t+1, cnt);
		}
	}
}
