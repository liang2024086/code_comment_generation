package methodEmbedding.Speaking_in_Tongues.S.LYD398;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class SpeakingInTongues
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		File inputFile = null;
		File outputFile = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str = null;
		int nTestCase = 0;

		char[] encodedChar = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' };

		try
		{
			inputFile = new File("A-small.in");
			outputFile = new File("A-small.out");
			br = new BufferedReader(new FileReader(inputFile));
			bw = new BufferedWriter(new FileWriter(outputFile));

			str = br.readLine();
			nTestCase = Integer.parseInt(str);

			for (int i = 0; i < nTestCase; i++)
			{
				if ((str = br.readLine()) != null)
				{
					char[] strChar = str.toCharArray();
					StringBuffer originalStr = new StringBuffer();
					for (char ch : strChar)
					{
						switch (ch)
						{
							case ' ':
								originalStr.append(' ');
								break;
							default:
								originalStr.append(encodedChar[ch - 'a']);
								break;
						}
					}
					bw.write("Case #" + (i + 1) + ": " + originalStr + "\n");
				}
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			if (br != null)
			{
				br.close();
			}
			if (bw != null)
			{
				bw.flush();
				bw.close();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
