package methodEmbedding.Standing_Ovation.S.LYD2187;

import java.util.Scanner;

public class StandingOvation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int tc = 1; tc <= T; tc++)
		{
			int res = 0, p = 0;
			in.next();
			char[] a = in.next().toCharArray();
			for (int i = 0; i < a.length; i++)
			{
				if (p < i && a[i] > '0')
				{
					res += i - p;
					p += i - p;
				}
				p += a[i] - '0';
			}
			System.out.printf("Case #%d: %d\n", tc, res);
		}
	}
}
