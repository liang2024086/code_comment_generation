package methodEmbedding.Speaking_in_Tongues.S.LYD443;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.PrintStream;
//import java.util.StringTokenizer;
import java.util.HashMap;

public class TestJAM
{
	public static void main (String[] args)
	{
		HashMap <String, String> charMap = new HashMap ();
		
		charMap.put("a", "y");
		charMap.put("b", "h");
		charMap.put("c", "e");
		charMap.put("d", "s");
		charMap.put("e", "o");
		charMap.put("f", "c");
		charMap.put("g", "v");
		charMap.put("h", "x");
		charMap.put("i", "d");
		charMap.put("j", "u");
		charMap.put("k", "i");
		charMap.put("l", "g");
		charMap.put("m", "l");
		charMap.put("n", "b");
		charMap.put("o", "k");
		charMap.put("p", "r");
		charMap.put("q", "z");
		charMap.put("r", "t");
		charMap.put("s", "n");
		charMap.put("t", "w");
		charMap.put("u", "j");
		charMap.put("v", "p");
		charMap.put("w", "f");
		charMap.put("x", "m");
		charMap.put("y", "a");
		charMap.put("z", "q");
				
		BufferedReader br = null;
		PrintStream ps = null;
		
		try
		{
			int t;
			int count;
			String line;
			String g;
			String s;
						
			br = new BufferedReader (new FileReader ("A-small-attempt0.in"));
			ps = new PrintStream (new FileOutputStream ("A-small-attempt0.out"));
						
			line = br.readLine ();
			t = Integer.parseInt (line);
			
			for (int testCase = 0; testCase < t; testCase++)
			{
				s = "";
				g = br.readLine ();
				
				for (int i = 0; i < g.length (); i++)
				{
					if (g.charAt (i) != ' ')
						s += charMap.get (String.valueOf (g.charAt (i)));
					else
						s += " ";
				}
				
//				System.out.println ("Case #" + (testCase + 1) + ": " + s);				

				ps.println ("Case #" + (testCase + 1) + ": " + s);
			}
						

//			ps.println ("test1 test1 test1");
			
//			System.out.println ("Hola Mundo!!!");			
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace ();
		}
		catch (NumberFormatException nfe)
		{
			nfe.printStackTrace ();
		}
		finally
		{
			if (ps != null)
			{
				ps.close ();
			}
			if (br != null)
			{
				try
				{
					br.close ();					
				}
				catch (IOException ioe)
				{
					ioe.printStackTrace ();
				}
			}
		}
	}	
}




