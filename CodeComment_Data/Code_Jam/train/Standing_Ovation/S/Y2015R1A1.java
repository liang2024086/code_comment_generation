package methodEmbedding.Standing_Ovation.S.LYD1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Y2015R1A1
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int[] aud;
		Scanner in = new Scanner(new File("dbg1.txt"));
		in.useLocale(Locale.US);
		
		int T = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= T; i++)
		{
			int max = in.nextInt() + 1;
			String n = in.next();
			in.nextLine();
			
			int f = 0;	// needed
			int sum = 0;

			aud = new int[max];
			
			for (int j = 0; j < max; j++)
			{
				aud[j] = n.charAt(j) - '0';
			}
			
			for (int j = 0; j < max; j++)
			{
				if (sum + f < j)
				{
					f = j - sum;
				}
				
				sum += aud[j];
			}
			
			System.out.println("Case #" + i + ": " + f);
		}
		
		in.close();
	}

}
