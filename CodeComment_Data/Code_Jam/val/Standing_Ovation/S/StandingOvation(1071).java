package methodEmbedding.Standing_Ovation.S.LYD1112;


import java.util.Scanner;

public class StandingOvation
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int c;
		int x;
		int v;
		int t;
		int p;
		int cases = input.nextInt();
		String levels;
		for (c = 1; c <= cases; c++)
		{
			x = 0;
			t = 0;
			input.nextInt();
			levels = input.next();
			for (p = 0; p < levels.length(); p++)
			{
				v = levels.charAt(p) - '0';
				if (v > 0 && t < p)
				{
					x += p - t;
					t = p;
				}
				t += v;
			}
			System.out.printf("Case #%d: %d\n", c, x);
		}
	}

}
