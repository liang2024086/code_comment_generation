package methodEmbedding.Standing_Ovation.S.LYD694;

import java.util.*;
import java.io.*;
public class StandingOvation
{

	public static void main(String[] args)throws IOException
	{
		//BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader (new FileReader("A-small-attempt0.in"));
		int T = Integer.parseInt(in.readLine());
		PrintWriter out = new PrintWriter("out");
		for(int t =0;t<T;t++)
		{
			String[] tokens = in.readLine().split(" ");
			String audience = tokens[1];
			int friends=0;
			int total=0;
			total+=Integer.parseInt(audience.substring(0,1));
			for(int i =1;i<audience.length();i++)
			{
				if (total>=i)
				{
					total+=Integer.parseInt(audience.substring(i,i+1));
				}
				else
				{
					int numNeeded = i-total;
					friends+=numNeeded;
					total+=numNeeded;
					total+=Integer.parseInt(audience.substring(i,i+1));
				}
			}
			
			out.printf("Case #%d: %d%n",t+1,friends);
			
		}
		out.close();

	}

}
