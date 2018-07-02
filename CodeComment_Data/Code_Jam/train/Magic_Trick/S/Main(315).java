package methodEmbedding.Magic_Trick.S.LYD1506;

import java.io.*;
import java.util.ArrayList;
public class Main {
	
	public static String [] firstrow;
	public static	String [] secondrow;
	
	public static void main (String [] args)throws IOException
	{
		
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		int test = Integer.parseInt(bf.readLine());
		for(int t = 1; t <= test; t++)
		{
			int rownum = Integer.parseInt(bf.readLine());
			for(int i = 1; i < 5; i++)
			{
				if(i == rownum)
				{
					firstrow = bf.readLine().split(" ");
				}
				else bf.readLine();
			}
			int rownum2 = Integer.parseInt(bf.readLine());
			for(int j = 1; j < 5; j++)
			{
				if(j == rownum2)
				{
					secondrow = bf.readLine().split(" ");
				}
				else bf.readLine();
			}
			ArrayList <String> list = new ArrayList<String>();
			
			for(int a = 0; a < 4; a++)
			{
				for(int b = 0; b < 4; b++)
				{
					if(firstrow[a].equals(secondrow[b]))
					{
						list.add(firstrow[a]);
					}
				}
			}
			if(list.size()==0) System.out.println("Case #"+t+": Volunteer cheated!");
			if(list.size()==1) System.out.println("Case #"+t+": "+list.get(0));
			if(list.size() >1) System.out.println("Case #"+t+": Bad magician!");
			
			
			
		}
		
		
	}

}
