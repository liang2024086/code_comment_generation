package methodEmbedding.Revenge_of_the_Pancakes.S.LYD234;

import java.util.*;

public class pancakes
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int numCases = Integer.parseInt(scan.nextLine());

		for (int i = 1; i <= numCases; i++)
		{
			int flips = 0; 
			String n = scan.next();
			int index = n.length()-1; 
			char curr;
			if (n.charAt(index) == '-')
			{
				flips++; 
				index--;
				curr = '-';
				while (index >= 0)
				{
					char temp = n.charAt(index);
					if (curr != temp)
					{
						flips++;
						curr = temp; 
					}
					index--;
				}
			}
			else if (n.charAt(index) == '+')
			{ 
				index--;
				curr = '+';
				while (index >= 0)
				{
					char temp = n.charAt(index);
					if (curr != temp)
					{
						flips++;
						curr = temp; 
					}
					index--;
				}
			}
				
			System.out.println("Case #" + i + ": " + flips);
		}
	}
}
