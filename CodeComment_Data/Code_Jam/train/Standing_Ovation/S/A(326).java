package methodEmbedding.Standing_Ovation.S.LYD217;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A
{
	public static void main(String[] args)
	{
		Scanner s;
		try
		{
			final String fileName = "A-small-attempt1";
			s = new Scanner(new File(fileName + ".in"));
			PrintWriter writer = new PrintWriter(new File(fileName + ".out"));
			long T = s.nextLong();
			
			for (int i = 0; i < T; i++)
			{
				int maxLength = s.nextInt() + 1;
				String levelsShyness = s.next();
				int lvl, res = 0, people = 0;
				
				for (lvl = 0; lvl < maxLength; lvl++)
				{
					try
					{
						int n = Integer.parseInt(levelsShyness.charAt(lvl)+"");
						
						if (n != 0)
						{
							if (people < lvl)
							{
								res += lvl - people;
								people += lvl;
							}
							
							people += n;
						}
					}
					catch (IndexOutOfBoundsException | NumberFormatException foo)
					{
						
					}
				}
				
				writer.println("Case #" + (i+1) + ": " + res);
			}
			
			System.out.println("finished");
			s.close();
			writer.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}	
	}
}
