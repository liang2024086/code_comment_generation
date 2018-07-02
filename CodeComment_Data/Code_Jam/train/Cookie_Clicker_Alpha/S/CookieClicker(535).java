package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1551;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author satyanash
 */
public class CookieClicker
{

	private static final int INITIAL_COOKIE_RATE = 2;

	public static void main(String[] args)
		throws IOException
	{
		File input;
		BufferedReader br;
		try
		{
			input = new File(args[0]);
			br = new BufferedReader(new FileReader(input));
		} catch (ArrayIndexOutOfBoundsException | FileNotFoundException e)
		{
			return;
		}

		int testCases = Integer.parseInt(br.readLine());
		List<TestCase> cases = new ArrayList<>(testCases);

		for (int i = 0; i < testCases; i++)
		{
			String[] strs = br.readLine().split(" ");
			TestCase t = new TestCase();
			t.farmCost = Double.parseDouble(strs[0]);
			t.rateIncrement = Double.parseDouble(strs[1]);
			t.winCookies = Double.parseDouble(strs[2]);
			cases.add(t);
		}

		for (int i = 0; i < cases.size(); i++)
		{
			TestCase t = cases.get(i);

			//System.out.println("Case #" + (i + 1));
			//System.out.println("Farm Cost: " + t.farmCost);
			//System.out.println("Rate Increment: " + t.rateIncrement);
			//System.out.println("Win Cookies: " + t.winCookies);


			double rate = INITIAL_COOKIE_RATE;
			//int farmCount = 0;

			//Assume we already start with enough to buy our first farm
			double time = t.farmCost / rate;
			double cookies = t.farmCost;

			while(true)
			{
				if (cookies == t.winCookies)
				{
					break;
				}

				double requiredCookies = t.winCookies - cookies;
				double requiredTime = requiredCookies / rate;
				double timeToNextFarm = t.farmCost / rate;

				double projectedRate = rate + t.rateIncrement;
				double projectedRemainingCookies = t.winCookies - (cookies - t.farmCost );
				double projectedRequiredTime = projectedRemainingCookies / projectedRate;
				double projectedTimeToNextFarm = t.farmCost / projectedRate;

				if (projectedRequiredTime < requiredTime)
				{
					//buy a new farm
					rate += t.rateIncrement;
					cookies -= t.farmCost;

					//jump to the next instance in time where we might buy a new farm
					time += projectedTimeToNextFarm;
					cookies += t.farmCost;

					//yay! one more farm!
					//farmCount++;
				} else if( projectedRequiredTime >= requiredTime)
				{
					//If we are not buying farms anymore, jump straight to the end
					time += requiredTime;
					cookies += requiredCookies;
				}
			}
			//System.out.println("FINISH TIME: " + time);
			//System.out.println("FINAL BUILDINGS: " + farmCount);
			//System.out.println("FINAL PRODUCTION RATE : " + rate);
			//System.out.println("=========================================================");
			System.out.println("Case #" + (i + 1) + ": " + time);
		}
	}

}
