package methodEmbedding.Standing_Ovation.S.LYD1441;

import java.util.*;

public class A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test = 1, cases = Integer.parseInt(sc.nextLine());

		int sMax;
		String shyness;

		int clapping;
		int i;
		int friends;

		while(test <= cases)
		{
			sMax = sc.nextInt();
			shyness = sc.next();

			clapping = 0;
			friends = 0;

			for(i = 0; i <= sMax; i++)
			{
				if(clapping < i)
				{
					friends += i - clapping;
					clapping = i;
				}

				clapping += (shyness.charAt(i) - '0');
			}

			System.out.println("Case #" + test + ": " + friends);

			test++;
		}
	}
}
