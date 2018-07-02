package methodEmbedding.Revenge_of_the_Pancakes.S.LYD179;

import java.util.*;
import java.awt.*;
import java.io.*;

public class Yolo2
{
    public static void main (String args[])
    {
	BufferedReader in;
	PrintWriter out;
	try
	{
	    in = new BufferedReader (new FileReader ("B-small-attempt0.in"));
	    out = new PrintWriter (new FileWriter ("out.txt"));
	    int lines = Integer.parseInt (in.readLine ());
	    for (int x = 0 ; x < lines ; x++)
	    {
		String pancakes = in.readLine();
		int changes = 0;
		for (int y = 0; y < pancakes.length()-1; y++)
		{
		    if (pancakes.charAt(y)!=pancakes.charAt(y+1))
			changes++;
		}
		if (pancakes.charAt(pancakes.length()-1) == '+')
		    out.println ("Case #"+(x+1)+": "+changes);
		else
		    out.println ("Case #"+(x+1)+": "+(changes+1));
	    }
	    in.close ();
	    out.close ();
	}
	catch (FileNotFoundException e)
	{
	}
	catch (IOException i)
	{
	}
    }
}
