package methodEmbedding.Cookie_Clicker_Alpha.S.LYD911;

import java.util.*;

public class CJB
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for(int num = 1; num <= test; num++)
		{
			double farmPrice = sc.nextDouble();
			double farmRate = sc.nextDouble();
			double goal = sc.nextDouble();

			double rate = 2;

			double maxTime = goal/rate;
			double minTime = maxTime;
			double timeToNext = 0;

			while(true)
			{
				timeToNext += farmPrice/rate;
				rate += farmRate;
				double nextTime = timeToNext + goal/rate;

				if(Math.abs(nextTime - minTime) < 0.00000001)
					break;

				if(nextTime > minTime)
					break;
				minTime = nextTime;
			}
			System.out.printf("Case #%d: %.7f\n", num, minTime);
		}
	}
}
