package methodEmbedding.Revenge_of_the_Pancakes.S.LYD923;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    int t = Integer.parseInt(br.readLine());  // Scanner has functions to read ints, longs, strings, chars, etc.
    PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
    for (int i = 1; i <= t; ++i) {
		
		String line = br.readLine();
		int len = line.length();
		boolean done = false;
		int count = 0;
		String fin = "";
		for (int b = 0; b < len; b++)
		{
			fin += "+";
		}
		while (!done)
		{
			String rev = "";
			String end = "";
			boolean found = false;
			if (line.equals(fin))
				{
					done = true;
					break;
				}
			count++;
			for (int z = len -1; z >= 0; z--)
			{
				if ( !found && line.charAt(z) == '-')
				{
					found = true;
				}
				else if (!found)
					end = line.charAt(z) + end;
				if (found)
				{
					if (line.charAt(z)== '+')
					{
						rev = "-" + rev;
					}
					else
					{
						rev = "+" + rev;
					}
				}
			}
							line = rev + end;
	
		}
		writer.println ("Case #"+i+": "+ count);
      
    }
    writer.close();
  }
}
