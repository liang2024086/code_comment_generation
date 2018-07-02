package methodEmbedding.Revenge_of_the_Pancakes.S.LYD321;


import java.util.Scanner;

public class Solution2 {
public static void main(String arg[])
{

	StringBuilder sb = null;
	Scanner sc= new Scanner(System.in);
	int t= sc.nextInt();
	for(int i=0;i<t;i++)
	{
	    sb = new StringBuilder(sc.next());
		int count = 0;
	    while(true)
		{
			
			char f = sb.charAt(0);
			int j = 1;
			for(j=1;j<sb.length();j++)
			{
				if(sb.charAt(j) == f)
					continue;
				else
					break;
			}
			if(j == sb.length() && sb.charAt(0) == '+')
			{
				System.out.println("Case #"+(i+1)+": "+count);
				break;
			}
			char targ = ' ';
			if(f == '+')
				targ = '-';
			else
				targ = '+';
			for(int k=0;k<=j-1;k++)
				sb.setCharAt(k, targ);
			count++;	
			
		}
		
	}	
	
}

}
