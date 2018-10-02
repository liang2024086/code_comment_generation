package methodEmbedding.Revenge_of_the_Pancakes.S.LYD251;

import java.io.*;
import java.util.*;

public class Main1
{
	public static void main(String[] args)throws Exception
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int w = 1;
		while(w<=T)
		{
			String s = input.next();
			s = s.trim();
			int flips = 0;
			char prev = s.charAt(0);
			for(int i=1; i<s.length(); i++)
			{
				if(prev!=s.charAt(i))
				{
					flips++;
				}
				prev = s.charAt(i);
			}
			if(s.charAt(s.length()-1)=='-')
			{
				flips++;
			}
			System.out.println("Case #"+w+": "+flips);
			w++;
		}
	}
}
