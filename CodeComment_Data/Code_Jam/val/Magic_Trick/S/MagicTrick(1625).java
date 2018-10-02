package methodEmbedding.Magic_Trick.S.LYD825;

import java.util.*;
import java.io.*;

public class MagicTrick
{
	public static void main(String args[]) throws Exception
	{
                In in = new In(args[0]);
                int test = in.readInt();
	        String text;
                int[] cards1 = new int[16];
                int[] cards2 = new int[16];
		File file = new File("Data.txt");
		if (!file.exists()) 
		{
			file.createNewFile();		
		}

		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
            
            for (int i = 0; i < test; i++)
            {
                  int firstGuess = in.readInt();
                  
                  for (int j = 0; j < 16; j++)
                        cards1[j] = in.readInt();
                  
                  int secondGuess = in.readInt();
                  
                  for (int j = 0; j < 16; j++)
                        cards2[j] = in.readInt();
                  
                  int count = 0;
                  int card = -1;
                  
		
                  for (int x = (firstGuess - 1) * 4, n = x + 4; x < n; x++)
                        for (int y = (secondGuess - 1) * 4, m = y + 4; y < m; y++)
                              if (cards1[x] == cards2[y])
                              {
                                    card = cards1[x];
                                    count++;
                              }
                  
                  if (count == 0)
		{
                        text = "Case #" + (i+1) + ": Volunteer cheated!";
			writer.write(text);
			writer.newLine();
		}
		
                  else if (count == 1)
		{
                       text = "Case #" + (i+1) + ": " + card;
			writer.write(text);
			writer.newLine();
		}

                  else
		{

                        text = "Case #" + (i+1) + ": Bad magician!";
			writer.write(text);
			writer.newLine();
		}
		
            }
		writer.close();

      }
}
