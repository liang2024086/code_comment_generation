package methodEmbedding.Counting_Sheep.S.LYD797;

import java.io.*;
import java.util.*;

public class prob1 
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("A-small-attempt1.in"));
		PrintWriter out = new PrintWriter(new File("file1output.txt"));
		int times = Integer.parseInt(in.nextLine());
		for(int i = 0; i<times; i++)
		{
			int num = in.nextInt();
			if (num == 0)
			{
				System.out.println("Case #" + (i+1) + ": INSOMNIA");
				out.println("Case #" + (i+1) + ": INSOMNIA");
			}				
			else
			{
				int[] digits;
				digits = new int[10];
				long test = 0;
				boolean check = false;
				while(!check)
				{
					test += num;
					String s = String.valueOf(test);
					for (int k = 0; k<s.length(); k++)
					{
						String part = s.substring(k, k+1);
						digits[Integer.parseInt(part)]++;
				}
					check = true;
					for (int j : digits)
					{
						if(j==0)
							check = false;
					}
				}
				System.out.println("Case #" + (i+1) + ": " + test);
				out.println("Case #" + (i+1) + ": " + test);
			}
		}
		in.close();
		out.close();
	}
}
