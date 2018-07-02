package methodEmbedding.Standing_Ovation.S.LYD1707;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation
{
	public StandingOvation(Scanner scanner, PrintWriter printWriter)
	{
		int numTests = scanner.nextInt ();

		for (int testNum = 1; testNum <= numTests; testNum++)
		{
			scanner.nextInt ();

			String shynessString = scanner.next ();
			int numPeopleStanding = 0;
			int numFriendsNeeded = 0;

			for (int shyness = 0; shyness < shynessString.length (); shyness++)
			{
				int numWithShyness = Integer.valueOf (shynessString.substring (shyness, shyness + 1));

				if (numWithShyness > 0 && numPeopleStanding < shyness)
				{
					numFriendsNeeded += shyness - numPeopleStanding;
					numPeopleStanding = shyness;
				}

				numPeopleStanding += numWithShyness;
			}

			printWriter.println ("Case #" + testNum + ": " + numFriendsNeeded);
		}
	}

	public static void main(String[] args)
	{
		Scanner scanner = null;
		PrintWriter printWriter = null;

		try
		{
			printWriter = new PrintWriter ("C:/Users/Steven/Desktop/A-small-attempt0.out");
			scanner = new Scanner (new File ("C:/Users/Steven/Desktop/A-small-attempt0.in"));

			new StandingOvation (scanner, printWriter);
		}
		catch (Exception e)
		{
		}
		finally
		{
			if (scanner != null)
			{
				scanner.close ();
			}
			if (printWriter != null)
			{
				printWriter.close ();
			}
		}
	}
}
