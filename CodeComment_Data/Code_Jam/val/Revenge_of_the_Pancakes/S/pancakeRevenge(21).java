package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1144;

import java.util.*;

public class pancakeRevenge {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int T = Integer.parseInt(scan.nextLine());
		
		for( int t = 1; t <= T; t++ )
		{
			String line = scan.nextLine();
			
			boolean pancakes[] = new boolean[line.length()];
			
			for( int i = 0; i < pancakes.length; i++ )
				if(line.charAt(i) == '+') pancakes[i] = true;
			
			
			int count = 0;
			boolean first = !pancakes[0]; 
			for( int i = 0; i < pancakes.length; i++ )
			{		
				if( i == pancakes.length - 1 && !pancakes[i])
				{
					if(first)
					{
						count+=1;
						first = false;
					}
					else
					{
						count+=2;
					}
				}
				else if( i < pancakes.length - 1 && !pancakes[i] && pancakes[i+1] )
					if(first)
					{
						count+=1;
						first = false;
					}
					else count += 2;
			}
			
			System.out.println("Case #" + t + ": " + count);
		}
	}
}
