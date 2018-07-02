package methodEmbedding.Cookie_Clicker_Alpha.S.LYD286;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		for (int test = 0, tests = in.nextInt(); test < tests; test++)
		{
			double c = in.nextDouble(), f = in.nextDouble(), x = in.nextDouble();
			double t = 0;
			long n = (long)(x/c-2/f-1)+1;
			for (long i = 0; i < n; i++)
			{
				t += c/(2+i*f);
			}
			t += x/(2+n*f);
			System.out.println("Case #" + (test+1) + ": " + Math.min(t, x/2));
		}
	}
}
