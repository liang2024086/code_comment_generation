package methodEmbedding.Standing_Ovation.S.LYD490;

import java.io.*;
import java.util.Scanner;

public class A
{
	public static void main(String[] args) throws IOException
	{
		String fileName = "A-small1";
		Scanner in = new Scanner(new File(fileName + ".in"));
		PrintWriter out = new PrintWriter(new FileWriter(fileName + ".out"));

		int noOfCases = in.nextInt();
		for (int caseNo = 1; caseNo <= noOfCases; caseNo++)
		{
			int sMax = in.nextInt();
			String shy = in.next();
			int[] shyness = new int[sMax + 1];
			int totalAudienceStart = 0;
			for (int i = 0; i <= sMax; i++)
			{
				shyness[i] = shy.charAt(i) - '0';
				totalAudienceStart += shyness[i];
			}
			System.out.println("0123456");
			System.out.println(shy);
			System.out.println(totalAudienceStart);

			int noOfExtras = 0;
			int standing = shyness[0];
			int totalAudience = totalAudienceStart;
			while (standing < totalAudience)
			{

				for (int i = 1; i <= sMax; i++)
				{
					if (standing >= i)
						standing += shyness[i];
				}
				if (standing < totalAudience)
				{
					noOfExtras++;
					totalAudience  = totalAudienceStart + noOfExtras;
					standing = shyness[0] + noOfExtras;
				}
			}

			out.printf("Case #%d: %d%n", caseNo, noOfExtras);
			System.out.printf("Case #%d: %d%n", caseNo, noOfExtras);
		}
		in.close();
		out.close();

	}

}
