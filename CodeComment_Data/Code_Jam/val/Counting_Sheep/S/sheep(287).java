package methodEmbedding.Counting_Sheep.S.LYD965;

import java.util.StringTokenizer;
import java.io.*;
import java.util.*;

public class sheep
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("sheep.in");
			File d = new File("sheep.out");
			BufferedReader r = new BufferedReader(new FileReader(f));
			BufferedWriter w = new BufferedWriter(new FileWriter(d));
			int T = Integer.parseInt(r.readLine());
			String l;
			String res = "";
			int count;
			int num, cnum;
			Set<Character> cset = new HashSet<Character>();
			
			for(int i = 0; i < T;  i++)
			{
				cset.clear();
				for(char c : "0123456789".toCharArray()) {
					cset.add(c);
				}
				count = 1;
				l = r.readLine();
				num = cnum = Integer.parseInt(l);
				if(cnum == 0)
					res += "Case #" +(i+1) + ": INSOMNIA\n";
				else 
				{
					while(!cset.isEmpty() && count < 1000000)
					{
						num = cnum * count;
						
						for(char c : Integer.toString(num).toCharArray()) {
							cset.remove(c);
						}
						count++;						
					}
					res += "Case #" +(i+1) + ": " + num + "\n";
				}
			}
			System.out.println(res);
			w.write(res);
			r.close();
			w.close();
		}
		catch(Exception e)
		{
		}
	}
}
