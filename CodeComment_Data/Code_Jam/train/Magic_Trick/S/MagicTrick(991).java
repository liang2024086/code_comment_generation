package methodEmbedding.Magic_Trick.S.LYD2205;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MagicTrick
{
	public static void main (String[] args) throws FileNotFoundException
	{
		Scanner s = new Scanner (new File ("A-small-attempt1.in"));
		FileWriter f;
		try
		{
			f = new FileWriter ("output.txt");

			int tests = s.nextInt ();
			for (int i = 1; i <= tests; i++)
			{
				int count = 0;
				int ans = -1;
				int[] one = new int[4];
				
				int rowone = s.nextInt ();
				for (int x = 0; x < 4; x++)
				{
					for (int y = 0; y < 4; y++)
					{
						if (x == rowone-1)
						{
							one[y] = s.nextInt ();
						}
						else
						{
							s.nextInt ();
						}
					}
				}
				
				int rowtwo = s.nextInt ();
				for (int x = 0; x < 4; x++)
				{
					for (int y = 0; y < 4; y++)
					{
						if (x == rowtwo-1)
						{
							int temp = s.nextInt ();
							for (int h = 0; h < 4; h++)
							{
								if (one[h] == temp)
								{
									count++;
									ans = temp;
								}
							}
						}
						else
						{
							s.nextInt ();
						}
					}
				}
				
				f.write ("Case #" + i + ": ");
				if (count == 1)
				{
					f.write (ans + "\n");
				}
				else if (count > 1)
				{
					f.write ("Bad magician!\n");
				}
				else
				{
					f.write ("Volunteer cheated!\n");
				}
			}
			
			f.close ();
		}
		catch ( IOException e )
		{
			
		}
		
	}
}
