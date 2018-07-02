package methodEmbedding.Magic_Trick.S.LYD1820;

import java.util.*;
import java.io.*;

public class AMagicTrick
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new BufferedReader(new FileReader("A-small.in")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small.out")));
		
		int t = in.nextInt();
		for (int i = 1; i <= t; i++)
		{
			int r1 = in.nextInt() - 1;
			Set<Integer> poss1 = new HashSet<Integer> ();
			for (int r = 0; r < 4; r++)
				for (int c = 0; c < 4; c++)
				{
					int x = in.nextInt();
					if (r1 == r)
						poss1.add(x);
				}
			int r2 = in.nextInt() - 1;
			Set<Integer> poss2 = new HashSet<Integer> ();
			for (int r = 0; r < 4; r++)
				for (int c = 0; c < 4; c++)
				{
					int x = in.nextInt();
					if (r2 == r)
						poss2.add(x);
				}
			poss1.retainAll(poss2);
			if (poss1.size() > 1)
				out.println("Case #" + i + ": Bad magician!");
			else if (poss1.size() < 1)
				out.println("Case #" + i + ": Volunteer cheated!");
			else
				for (int n : poss1)
					out.println("Case #" + i + ": " + n);
		}
		out.flush();
		out.close();
	}
}
