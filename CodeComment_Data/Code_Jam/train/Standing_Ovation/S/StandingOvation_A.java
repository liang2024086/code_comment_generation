package methodEmbedding.Standing_Ovation.S.LYD893;


import java.util.ArrayList;
import java.util.Scanner;

public class StandingOvation_A
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		ArrayList<String> lstOutput = new ArrayList<String>();

		for(int i = 1; i <= T; i++)
		{
			int sMax = in.nextInt();
			// in.nextLine();

			String sAudiance = in.nextLine().trim();
			int iInvited = 0;
			int iStanding = 0;

			for(int k = 0; k <= sMax; k++)
			{
				if(k + 1 > sAudiance.length())
				{
					break;
				}

				String kString = sAudiance.substring(k, k + 1);
				int iValue = Integer.parseInt(kString);

				if(k > iStanding)
				{
					int newInvited = (k - iStanding);
					iInvited += newInvited;
					iStanding += newInvited;
				}

				iStanding += iValue;
			}

			String sOutput = "Case #" + i + ": ";
			sOutput += iInvited;
			lstOutput.add(sOutput);
		}

		for(String string : lstOutput)
		{
			System.out.println(string);
		}

		in.close();
	}
}
