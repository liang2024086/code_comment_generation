package methodEmbedding.Standing_Ovation.S.LYD1767;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * 
 */

/**
 * @author Alex
 *
 */
public class GCC2015
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt")))
		{
			String line = br.readLine();

			if (line != null)
			{
				int cases = Integer.parseInt(line);
				int caseCounter = 0;
				line = br.readLine();
				try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")))
				{
				while (line != null)
				{
					System.out.println(line);
					cases--;
					caseCounter++;
					StringTokenizer st = new StringTokenizer(line);
					if (st.countTokens() != 2)
					{
						System.out.println("Error in Case #" + caseCounter + " Tokenizer!");
					}
					int smax = Integer.parseInt(st.nextToken());
					String s = st.nextToken();
					int numberPS = Integer.parseInt(s.substring(0, 1));
					int numberPI = 0;
					for (int i = 1; i <= smax; i++)
					{
						int nexts = Integer.parseInt(s.substring(i, i+1));
						if (i > numberPS)
						{
							numberPI = numberPI + i - numberPS;
							numberPS = i;
						}
						numberPS = numberPS + nexts;
					}
					System.out.println("Case #" + caseCounter + ": " + numberPI);
					writer.write("Case #" + caseCounter + ": " + numberPI);
					writer.newLine();
					line = br.readLine();
				}
				}
				if (cases != 0)
				{
					System.out.println("Something wrong on case number!");
				}
			}
		} catch (FileNotFoundException e)
		{
			System.out.println("Error!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Error!");
			e.printStackTrace();
		}
	}
}
