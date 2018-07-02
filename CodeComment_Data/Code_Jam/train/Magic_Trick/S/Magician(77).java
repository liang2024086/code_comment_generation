package methodEmbedding.Magic_Trick.S.LYD2214;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Magician 
{
	public static void main(String[] args)
	{
		try {
		BufferedReader in = new BufferedReader(new FileReader("input.in"));
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		String text = in.readLine();
		int cases = Integer.parseInt(text);
		for (int i=0;i<cases;i++)
		{
			int firstGuess = Integer.parseInt(in.readLine())-1;
			String[] firstMatrix = new String[4];
			for (int j=0;j<4;j++)
			{
				firstMatrix[j] = in.readLine();
			}
			int secondGuess = Integer.parseInt(in.readLine())-1;
			String[] secondMatrix = new String[4];
			for (int j=0;j<4;j++)
			{
				secondMatrix[j] = in.readLine();
			}
			String[] firstTokens = firstMatrix[firstGuess].split(" ");
			String[] secondTokens = secondMatrix[secondGuess].split(" ");
			
			int occurance = 0;
			String guess = "";
			for (int j=0;j<4;j++)
			{
				for (int k=0;k<4;k++)
				{
					if (secondTokens[k].equals(firstTokens[j]))
					{
						occurance++;
						guess = firstTokens[j];
					}
				}
			}
			System.out.println(occurance + " Case #" + (i+1) + ": " + ((occurance > 1) ? "Bad magician!" : (occurance == 1) ? guess : "Volunteer cheated!"));
			writer.println("Case #" + (i+1) + ": " + ((occurance > 1) ? "Bad magician!" : (occurance == 1) ? guess : "Volunteer cheated!"));
		}
		in.close();
		writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
