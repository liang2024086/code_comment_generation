package methodEmbedding.Speaking_in_Tongues.S.LYD1104;

import java.util.*;
import java.io.*;

public class qualA
{
	public static void main(String[] args) throws IOException
	{
		Scanner sin = new Scanner(new File("/Users/G/Documents/Programming/Java/CodeJam2012/A-small-attempt0.in"));
		
		int n = sin.nextInt();
		sin.nextLine();
		
		char[] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		
		for(int i = 1; i <= n; ++i)
		{
			String s = sin.nextLine();
			
			System.out.print("Case #"+i+": ");
			
			for(int j = 0; j < s.length(); ++j)
			{
				if(s.charAt(j) == ' ')
				{
					System.out.print(' ');	
				}
				else
				{
					System.out.print(map[s.charAt(j) - 'a']);
				}
			}
			
			System.out.println();
		}	
	}
}
