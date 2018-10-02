package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1106;

import java.util.*;

class pB {
	public static void main(String[] lolcopter)
	{
		Scanner in = new Scanner(System.in);

		// T cases.
		int T = in.nextInt();

		for (int i = 0; i < T; i++)
		{
			// Get all inputs.
			double C = in.nextDouble(), F = in.nextDouble(), X = in.nextDouble();
			// TEST
			// System.out.println("C: " + C + "	F: " + F + "	X: " + X);

			// Base case.
			double timeOld = X / 2.0;
			double timeNew = X / 2.0;
			
			double firstTerm = C / 2;
			long j = 1;
			while (timeOld >= timeNew)
			{
				// Cycle through times
				timeOld = timeNew;

				double base = 2 + (j * F);
				timeNew = firstTerm +(X / base);
				firstTerm = firstTerm + (C / base);
				j++;
			}

			// Output Result
			System.out.print("Case #" + (i + 1) + ": ");
			System.out.format("%.7f\n", timeOld);

		}

	}
}

