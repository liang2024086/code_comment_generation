package methodEmbedding.Magic_Trick.S.LYD2113;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		String[] split = null;
		int i, j, caseNr, choosen, count, card, tmpCard;
		int T = Integer.valueOf(reader.readLine());
		boolean[] cardSet = new boolean[17];
		for (caseNr = 1 ; caseNr <= T; caseNr++)
		{
			cardSet = new boolean[17];
			
			choosen = Integer.valueOf(reader.readLine())-1;
			
			for(i = 0; i < 4; i++)
			{
				line = reader.readLine();
				if (i == choosen)
				{
					split = line.split("\\s+");
					for(j = 0; j < 4; j++)
					{
						cardSet[Integer.valueOf(split[j])] = true;
					}
				}
			}
			
			choosen = Integer.valueOf(reader.readLine())-1;		
			count = 0;
			card = -1;
			
			for(i = 0; i < 4; i++)
			{
				line = reader.readLine();
				
				if (i == choosen)
				{
					split = line.split("\\s+");
					for(j = 0; j < 4; j++)
					{
						tmpCard = Integer.valueOf(split[j]);
						if (cardSet[tmpCard])
						{
							count++;
							card = tmpCard;
						}
					}
				}
			}
			if (count == 1)
			{
				System.out.println("Case #" + caseNr + ": " + card);
			}
			else if (count > 1)
			{
				System.out.println("Case #" + caseNr + ": Bad magician!");
			}
			else if (count == 0)
			{
				System.out.println("Case #" + caseNr + ": Volunteer cheated!");
			}
		}
	}
}
