package methodEmbedding.Magic_Trick.S.LYD186;


import java.util.HashSet;
import java.util.Scanner;

public class CJ2014QualiAMagicTrick
{

	public static void main(String[] args)
	{
		final Scanner in = new Scanner(System.in);		
		final int T = in.nextInt();
		long t0 = System.nanoTime();
		for (int t = 0; t < T; t++)
		{
			int a1 = in.nextInt() - 1;
			
			HashSet<Integer> [] matrix1 = new HashSet[4];
			HashSet<Integer> [] matrix2 = new HashSet[4];
						
			for (int r=0; r<4; r++)
			{
				matrix1[r] = new HashSet<Integer>();
				for (int c=0; c<4; c++)
				{
					matrix1[r].add( in.nextInt() );
				}
			}
			
			int a2 = in.nextInt() - 1;
			
			for (int r=0; r<4; r++)
			{
				matrix2[r] = new HashSet<Integer>();
				for (int c=0; c<4; c++)
				{
					matrix2[r].add( in.nextInt() );
				}
			}
			
			int matches = 0;	
			int number = -1;
			for(Integer x : matrix1[a1])
			{
				if (matrix2[a2].contains(x)) {
					matches++;
					number = x;
				}
			}
			
			if (matches == 0) {
				System.out.format("Case #%d: %s\n", (t+1), "Volunteer cheated!" );
				continue;
			}
			if (matches != 1) {
				System.out.format("Case #%d: %s\n", (t+1), "Bad magician!" );
				continue;
			}
			
			System.out.format("Case #%d: %d\n", (t+1), number );
		}
		in.close();
		long t1 = System.nanoTime();
		//System.out.println(" Done in " + ((t1-t0)/1000000000.0) );
	}

}
