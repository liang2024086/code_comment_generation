package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1047;

import java.util.*;
public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 1; i <= count; i++)
		{
			String str = sc.next();
			int c = 0;
			char temp = str.charAt(0);
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(temp);
			
			for(int j = 1; j < str.length(); j++)
			{
				char ch = str.charAt(j);
				
				if(ch != temp)
				{
					temp = ch;
					sb.append(ch);
				}
			}
			
			String s = sb.toString();
			
			boolean one = true;
			
			char comp = s.charAt(0);
			for(int j = 1; j < s.length(); j++)
			{
				char tes = s.charAt(j);
				if(comp != tes)
				{
					one = false;
					if(tes == '+')
					{
						c += 1;
					}
					else
					{
						c += 2;
					}
					comp = '+';
				}
			}
			if(comp == '-' && one)
			{
				c++;
			}
			
			System.out.println("Case #" + i + ": " + c);
		}

	}
}
