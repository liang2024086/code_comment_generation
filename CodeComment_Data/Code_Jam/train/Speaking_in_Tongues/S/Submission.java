package methodEmbedding.Speaking_in_Tongues.S.LYD123;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Submission
{
	public static char[] map = {
	//a   b   c   d   e   f   g   h   i   j   k   l   m   n   o   p   q   r   s
	 'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n',
	//t   u   v   w   x   y   z
	 'w','j','p','f','m','a','q'   };
	
	public static void main (String[] args)
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
			
			int numCases = Integer.parseInt(in.readLine());
			
			for (int i=0; i<numCases; i++)
			{
				if (i != 0) { out.println(); }
				out.print("Case #"+(i+1)+": ");
				
				String s = in.readLine();
				for (int j=0; j<s.length(); j++)
				{
					int intVal = s.charAt(j);
					if (intVal == 32) { out.print(" "); }
					else
					{
						out.print (map [intVal - 97]);
					}
				}
			}
			
			out.close();
		}
		catch (IOException e)
		{
			System.out.println ("Problem with file!");
		}
	}

}
