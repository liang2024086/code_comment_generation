package methodEmbedding.Revenge_of_the_Pancakes.S.LYD349;

import java.io.File;
import java.util.Scanner;

public class Two {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ine = new Scanner(new File("A-small-attempt0.in"));
		int n = ine.nextInt();
		for(int i=0;i<n;i++)
		{
			String s = ine.next();
			int l = s.length();
			int ct=0;
			char t = s.charAt(0);
			if (t == '-' && l == 1)
				ct++;
			for(int j=1;j<l;j++)
			{
				if(t != s.charAt(j))
				{
					t = s.charAt(j);
					ct++;
				}
			}
			if (t == '-' & l > 1)
				ct++;
			System.out.println("Case #"+(i+1)+": "+ct);
		}
		
		
		
	}

}
