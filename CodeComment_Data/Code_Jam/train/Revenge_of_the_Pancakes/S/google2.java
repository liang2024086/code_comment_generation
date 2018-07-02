package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1072;

import java.util.*;
import java.io.*;
class goo1
{

	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("B-small-attempt0.in"));
        PrintWriter pr=new PrintWriter("ind1.txt");
		int b=Integer.parseInt(br.readLine());
		for(int k=1;k<=b;k++)
		{
			String s=br.readLine();
			int l=s.length();
			char c=s.charAt(0);
			int c1=0;
			for(int i=0;i<l;i++)
			{
				if(s.charAt(i)!=c)
				{
					c1++;
					c=s.charAt(i);
				}
			}
			if(c=='+')
			{
				pr.println("Case #"+k+": "+c1);
			}
			else
			{
				pr.println("Case #"+k+": "+(c1+1));
			}
		}
		pr.close();
	}
}
	
