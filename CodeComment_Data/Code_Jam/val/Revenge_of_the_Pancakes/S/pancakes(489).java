package methodEmbedding.Revenge_of_the_Pancakes.S.LYD513;

import java.util.StringTokenizer;
import java.io.*;
import java.util.*;

public class pancakes
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("pancakes.in");
			File d = new File("pancakes.out");
			BufferedReader r = new BufferedReader(new FileReader(f));
			BufferedWriter w = new BufferedWriter(new FileWriter(d));
			int T = Integer.parseInt(r.readLine());
			String l;
			String res = "";
			int count;
			char g, c;
			int num, cnum;
			Set<Character> cset = new HashSet<Character>();
			
			for(int i = 0; i < T;  i++)
			{
				count = 0;
				
				l = r.readLine();
				cset.clear();
				g = c = l.charAt(0);
				for(int j = 1; j < l.length(); j++) 
				{
					if(c != l.charAt(j))
						count++;
					c = l.charAt(j);
				}
				if(count%2 == 1 && g == '+' || count%2 == 0 && g == '-' )
					count++;
				res += "Case #" +(i+1) + ": " + count + "\n";
				
			}
			//System.out.println(res);
			w.write(res);
			r.close();
			w.close();
		}
		catch(Exception e)
		{
		}
	}
}
