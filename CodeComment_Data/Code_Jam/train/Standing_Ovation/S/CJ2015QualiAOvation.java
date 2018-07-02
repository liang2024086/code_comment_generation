package methodEmbedding.Standing_Ovation.S.LYD1019;


import java.util.Scanner;

@SuppressWarnings("unused")
public class CJ2015QualiAOvation
{

	public static void main(String[] args)
	{
		final Scanner in = new Scanner(System.in);		
		final int T = in.nextInt();
		long t0 = System.nanoTime();
		for (int t = 0; t < T; t++)
		{
			long clappers = 0;
			long required = 0;
			int Smax = in.nextInt();
			
			String parts = in.next();
			int [] levels = new int[Smax+1];
			for (int i=0; i<Smax+1; i++)
			{
				levels[i] = Integer.parseInt(parts.substring(i, i+1));
				
				if (levels[i] ==0) continue;
				
				if (clappers < i+1) // people at this level
				{
					required += (i - clappers);
					clappers += required;
				}
				clappers += levels[i];
			}

			System.out.format("Case #%d: %d\n", (t+1), required );
		}
		in.close();
		long t1 = System.nanoTime();
		//System.out.println(" Done in " + ((t1-t0)/1000000000.0) );
	}

}
