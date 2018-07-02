package methodEmbedding.Standing_Ovation.S.LYD1354;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

import static java.lang.System.*;

import java.io.*;

public class StandingOvation {
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		int times = in.nextInt();
		for(int i = 0; i<times; i++)
		{
			int maxshyness = in.nextInt();
			ArrayList<Integer> audience = new ArrayList<Integer>();
			TreeMap<Integer,Integer> aud = new TreeMap<Integer,Integer>();
			char[] v = in.next().toCharArray();
			for(int c = 0; c<v.length; c++)
			{	
				aud.put(c, v[c]-48);
			}
			for(Entry<Integer, Integer> k: aud.entrySet())
			{
				int lvl = (int) k.getKey();
				for(int d = 0; d<(int)k.getValue(); d++)
				{
					audience.add(lvl);
				}
			}
			//out.println(audience.toString());
			int invites = 0;
			int currentov = 0;
			while(audience.size()>0)
			{
				for(int b = 0; b<audience.size();b++)
				{
					if(audience.get(b)<=currentov)
					{	audience.remove(b); --b;
						 ++currentov;
					}
					
				}
				if(audience.size()>0) {
					invites++;
					currentov++;
				}
				
				//out.println(audience.toString());
			}
			
			out.println("Case #"+(i+1)+": "+invites);
			
		}
	}
}
