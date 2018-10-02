package methodEmbedding.Standing_Ovation.S.LYD955;

/**
 * https://code.google.com/codejam/contest/dashboard?c=32003#s=p0
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation
{
	static String inputFile = "";
	static String outputFile = "";

	static
	{
		inputFile = "A.in";
		outputFile = "/home/sandeep/A.out";
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = null;
		BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));

		br = new BufferedReader(new FileReader("/home/sandeep/Downloads/A-small-attempt0.in"));
		int testCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCases; i++)
		{
			String row = br.readLine();
			String[] rowStr = row.split(" ");
			int maxShy = Integer.parseInt(rowStr[0]);
			int[] shyness = new int[maxShy + 1];

			String s = rowStr[1];
			for (int j = 0; j <= maxShy; j++)
			{
				shyness[j] = Integer.parseInt(s.charAt(j) + "");
			}

			int curr = shyness[0];
			int lack = 0, totalLack = 0;
			for (int j = 1; j <= maxShy; j++)
			{
				lack = j - curr > 0 ? j - curr : 0;
				totalLack += lack;
				curr += shyness[j] + lack;
			}

			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Case #");
			stringBuilder.append((i + 1));
			stringBuilder.append(": ");
			stringBuilder.append(totalLack);
			stringBuilder.append("\n");
			out.write(stringBuilder.toString());
		}
		out.flush();

	}
}
