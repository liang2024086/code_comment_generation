package methodEmbedding.Revenge_of_the_Pancakes.S.LYD564;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Q2 {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("B-small-attempt0.in"));
		int numCases = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < numCases; i++)
		{
			int flips = 0;
			String stack = in.readLine();
			char curr = stack.charAt(0);
			for(int j = 1; j < stack.length(); j++)
			{
				if(stack.charAt(j) != curr) 
				{
					flips++;
					curr = stack.charAt(j);
				}
			}
			if(curr == '-') flips++;
			System.out.println("Case #" + (i+1) + ": " + flips);
		}
	}
}
