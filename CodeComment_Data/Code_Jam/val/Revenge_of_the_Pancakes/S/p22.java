package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1114;

import java.util.*;
import java.lang.*;
import java.io.*;

class p22
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    //StringTokenizer st=new StringTokenizer(br.readLine());
		BufferedReader br=new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter pw=new PrintWriter("output2.txt");
	    int t=Integer.parseInt(br.readLine());
		for(int q=1;q<=t;q++)
		{
			String s=br.readLine();
			long ans=0;
			for(int i=1;i<s.length();i++)
			{
				if(s.charAt(i)!=s.charAt(i-1))
				{
					ans++;
				}
			}
			if(s.charAt(s.length()-1)=='-')
			{
				ans++;
			}
			pw.println("Case #"+q+": "+ans);
		}
		pw.close();
	}
}
