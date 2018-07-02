package methodEmbedding.Counting_Sheep.S.LYD834;


import java.util.*;
import java.io.*;

public class CountSheep 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			int n = in.nextInt();
			long total = 0;
			String result = "INSOMNIA";
			String totalString = "";

			int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			boolean zeros = true;
			if (n != 0)
			{
				while (zeros)
				{
					total += n;
					totalString = String.valueOf(total);
					char[] totalChars = totalString.toCharArray();
					//System.out.println(totalString);

					for (int j = 0; j < totalChars.length; j++)
					{
						numbers[Character.getNumericValue(totalChars[j])]++;
					}
					zeros = false;
					for (int k = 0; k < 10; k++)
					{
						if (numbers[k] == 0)
							zeros = true;
					}
				}
				result = totalString;
			}
			System.out.println("Case #" + (i + 1) + ": " + result);
		}
		in.close();
	}

}
