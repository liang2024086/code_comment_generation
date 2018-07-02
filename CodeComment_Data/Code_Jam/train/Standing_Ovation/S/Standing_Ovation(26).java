package methodEmbedding.Standing_Ovation.S.LYD975;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Standing_Ovation
{

	public static void main(String[] args)
	{
		BufferedReader br = null;

		try
		{

			String sCurrentLine = null;
			int nTestCases = 0;
			int i = 1;
			br = new BufferedReader(new FileReader("D:\\rahul\\Learning\\java\\workspace\\CodeJam\\input\\Standing_Ovation\\A-small-attempt1.in"));
			//br = new BufferedReader(new InputStreamReader(System.in));

			while ((sCurrentLine = br.readLine()) != null)
			{
				if(nTestCases == 0)
				{
					nTestCases = Integer.parseInt(sCurrentLine);
				}
				else
				{
					//for(int i = 0; i < nTestCases; ++i)
					{
						String[] arr = sCurrentLine.split(" ");
						int sMax = Integer.parseInt(arr[0]);
						String level = arr[1];
						int counter = 0;
						int present = 0;
						int totalNeeded = 0;
						for(int j = 0; j < sMax+1; ++j)
						{
							int required = j;
							if(required > present)
							{
								int callMore = required - present;
								totalNeeded += callMore; 
								present += callMore;
							}
							
							char current = level.charAt(j);
							int iCurrent = Character.getNumericValue(current);
							present += iCurrent;
						}
						System.out.println("Case #"+ i++ +": " +totalNeeded);
					}
				}
			}

		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (br != null)
					br.close();
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}

}
