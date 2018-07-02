package methodEmbedding.Revenge_of_the_Pancakes.S.LYD130;

import java.util.*;

public class B {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			String s = in.next();
			s += "+";
			
			int flips = 0;
			for(int c = 0; c < s.length() - 1; c++)
			{
				if(s.charAt(c) != s.charAt(c + 1))
					flips++;
			}
			
			System.out.printf("Case #%d: %d\n", i + 1, flips);
		}
	}
}
