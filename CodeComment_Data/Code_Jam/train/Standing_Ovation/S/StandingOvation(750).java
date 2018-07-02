package methodEmbedding.Standing_Ovation.S.LYD832;

import java.util.*;
import java.io.*;

public class StandingOvation {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileOutputStream("StandingOvation.out"));
		int times = file.nextInt();
		file.nextLine();
		for(int t = 1; t<= times; t++)
		{
			int level = 0;
			int smax = file.nextInt();
			int count = 0;
			int extra = 0;
			String people = file.nextLine();
			people = people.substring(1);
			for(int x = 0; x < people.length(); x++)
			{
				
				int current = Integer.valueOf(people.substring(x, x+1));

				if(current > 0)
				{
					if( x <= level)
					{
						level += current;
					}
					else
					{
						

						count = x-level;
						level += count;
						extra += count;
						level += current;
					}
					
				}
			}
			out.println("Case #" + t + ": " + extra);
			
		}
		
		
		
		out.close();
	}
}
