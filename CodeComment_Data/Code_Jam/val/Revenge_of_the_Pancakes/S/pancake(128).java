package methodEmbedding.Revenge_of_the_Pancakes.S.LYD488;

import java.util.*;

class pancake
{
	public static void main(String... S)
	{
		Scanner sc = new Scanner(System.in);
		int noTest = sc.nextInt();
		for(int p=0;p<noTest;p++)
		{
			String in = sc.next();
			int len = in.length();
			int count=0;
			if (len==1)
			{
				if (in.charAt(0)=='+')
				{
					System.out.println("Case #"+(p+1)+": "+count);
				}
				else
				{
					count++;
					System.out.println("Case #"+(p+1)+": "+count);
				}
				continue;
			
			}
			else
			{
				String in1 = in;
				for(int i=1;i<len;i++)
				{
					if(in.charAt(i)==in.charAt(i-1))
					{
						continue;
					}
					else
					{
						
						count++;
					}
				
				}
				if((in.charAt(len-1)=='-'))
				{
					count++;
				}
				System.out.println("Case #"+(p+1)+": "+count);
			}
			
		}
	}
	

}
