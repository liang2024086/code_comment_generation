package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1104;

import java.io.*;
import java.util.*;
public class P2 {

	public static void main (String[] args) throws Exception 
	{

		BufferedReader in = new BufferedReader(new FileReader("in.in"));
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
		int t = Integer.parseInt(in.readLine());
		for(int i = 1; i <= t;i++)
		{
			int counter = 0; 
			String temp = in.readLine();
			boolean[] values = new boolean[temp.length()];
			for( int z = 0; z <temp.length();z++)
			{
				if(temp.charAt(z) == '+')
					values[z] = true;
				else 
					values [z] = false; 
			}
			for (int z = 1; z > 0;z++)
			{
				if(Arrays.toString(values).contains("f"))
				{
					if(!Arrays.toString(values).contains("t"))
					{
						for(int x = 0; x<values.length;x++)
						{
							values[x] =true; 
						}
						counter++; 
					}
					else
					{
						if(values[z] != values[z-1])
						{
							for (int x = 0; x <z;x++)
							{
								values[x] = !values[x]; 
							}
							counter++; 
						}
					}
				}
				else
				{
					break;
				}
			}
			out.println("Case #"+ i +": " + counter);
		}
		out.close(); 
	}
}
