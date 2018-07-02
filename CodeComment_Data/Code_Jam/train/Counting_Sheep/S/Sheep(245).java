package methodEmbedding.Counting_Sheep.S.LYD954;

import java.util.*;
import java.io.*;

public class Sheep
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
		int T = Integer.parseInt(in.readLine());
		PrintWriter out = new PrintWriter("Sheep.out");
		for (int t = 1; t <=T; t++)
		{
			int n = Integer.parseInt(in.readLine());
			boolean found[] = new boolean[10];
			boolean f = false;
			int s = 1;
			while (!f)
			{
				if (n == 0)
				{
					f = true;
					out.printf("Case #%d: INSOMNIA%n",t);
				}
				else
				{
					boolean bf = false;
					for (int i = 0; i < 10 && !bf; i++)
					{
						if (found[i] == false)
							bf = true;
					}
					// If all the founds are true.
					if (!bf)
					{
						out.printf("Case #%d: %d%n",t,n * (s-1));
						f = true;
					}
					else
					{
						int bn = n * s;
						while (bn > 0)
						{
							found[bn % 10] = true;
							bn /= 10;
						}
						s++;
					}
				}
			}
		}
		out.close();

	}

}
