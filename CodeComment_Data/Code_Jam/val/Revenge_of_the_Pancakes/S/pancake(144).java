package methodEmbedding.Revenge_of_the_Pancakes.S.LYD373;

import java.util.*;

public class pancake 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);		
		int cases = in.nextInt();
		in.nextLine();
		for(int g=1; g<=cases; g++)
		{
			String stack = in.nextLine();			
			int flip = 0;
			
			while (stack.contains("-"))
			{
				int index = stack.lastIndexOf("-");
				char[] hold = stack.toCharArray();
						
				for(int i=0; i<=index; i++)
				{
					if(hold[i] == '+')
						hold[i] = '-';
					else
						hold[i] = '+';
				}		
				stack = new String(hold);
				flip++;
			}			
			System.out.println("Case #"+g+": "+flip);
		}		
		in.close();
	}	
}
