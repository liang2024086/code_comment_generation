package methodEmbedding.Revenge_of_the_Pancakes.S.LYD946;

import java.util.*;

class q2
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
	for(int j = 1;j<k+1;j++)
	{
		String s = sc.next();
		int i = s.length()-1; int count = 0;
		while(i>=0)
		{
			while(i>=0 && s.charAt(i) != '-')
			{
				i--;
			}
			if(i>=0)
			{
				count++;
			}
			while(i>=0 && s.charAt(i) != '+')
			{
				i--;
			}
			if(i>=0)
			{
				count++;
			}
		}
	System.out.print("Case #"+j+": ");
	System.out.println(count);
	}	
	}
}
