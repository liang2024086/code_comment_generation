package methodEmbedding.Revenge_of_the_Pancakes.S.LYD53;

import java.util.*;
public class pancake
{
	static boolean debug = true;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int N = in.nextInt();
		for(int n = 1; n <= N; n++)
		{
			char[] stack = in.next().toCharArray();
			int flipsNeeded = 0;
			boolean onPlus = true;
			for(int i = stack.length - 1; i >= 0; i--)
			{
				if(onPlus != (stack[i] == '+'))
				{
					onPlus = !onPlus;
					flipsNeeded++;
				}
			}

			System.out.println("Case #"+n+": "+flipsNeeded);
		}
	}
}
