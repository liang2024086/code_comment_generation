package methodEmbedding.Revenge_of_the_Pancakes.S.LYD736;

import java.io.*;
import java.util.*;

class pancakes1
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		PrintStream ot = new PrintStream(new FileOutputStream("OutputB1.txt"));
        System.setOut(ot);
		int t = sc.nextInt(),t1=t;
		while(t-->0)
		{
			String S = sc.next();
			int c=1;
			for(int i=1; i<S.length(); i++)
			{
				if(S.charAt(i)!=S.charAt(i-1)) c++;
			}
			System.out.println("Case #"+(t1-t)+": "+((S.charAt(S.length()-1)=='-')?c:c-1));
		}
	}
}
