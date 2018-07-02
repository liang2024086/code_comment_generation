package methodEmbedding.Revenge_of_the_Pancakes.S.LYD161;

import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for(int c = 0; c < cases; c++)
		{
			int num = 0;
			int badVibes = 0;
			String stack = input.next();
			for(int iter = 0; iter < stack.length(); iter++)
			{
				if(stack.charAt(iter) == '-')
				{
					num++;
					if(iter > 0)
						num++;
					while(iter + 1 < stack.length() && stack.charAt(iter+1) == '-')
					{
						iter++;
					}
				}
			}
			
			System.out.println("Case #" + (c+1) + ": " +  num);
		}

	}

}
