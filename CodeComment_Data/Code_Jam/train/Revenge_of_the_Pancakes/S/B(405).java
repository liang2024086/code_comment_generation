package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1020;

import java.util.*;
public class B 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=1;i<=t ;i++ ) 
		{
			String S = in.next();
			int l = S.length();
			int ans=0;
			for (int j=0;j<l-1 ;j++ ) 
			{
				if (S.charAt(j)!=S.charAt(j+1)) 
				{
					ans++;
				}	
			}
			if (S.charAt(l-1)=='-') 
			{
				ans++;	
			}
			System.out.println("Case #"+i+": "+ans);
		}
	}
}
