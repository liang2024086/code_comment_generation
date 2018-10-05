package methodEmbedding.Revenge_of_the_Pancakes.S.LYD696;

import java.util.*;

public class pancakes
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		int T=in.nextInt();
		for(int t=0;t<T;t++)
		{
			String S=in.next();
			int count=0;
			char check = S.charAt(0);
			for(int i=1;i<S.length();i++)
			{
				if(S.charAt(i) != check)
				{
					count++;
					check=S.charAt(i);
				}
			}
			if(check=='-')
			{
				count++;
			}
			System.out.println("Case #" +(t+1) +": " +count);
		}
	}
}
