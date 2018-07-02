package methodEmbedding.Speaking_in_Tongues.S.LYD536;

// The "googlenese" class.
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer.*;
import hsa.Console;

public class googlenese
{
    static Console c;           // The output console

    public static void main (String[] args) throws IOException
    {
	BufferedReader input = new BufferedReader (new FileReader ("input.txt"));
	PrintWriter output = new PrintWriter (new FileWriter ("output.txt"));

	final String english = "abcdefghijklmnopqrstuvwxyz";
	final String googlenese = "yhesocvxduiglbkrztnwjpfmaq";

	int lines = Integer.parseInt (input.readLine ());
	String G, out, word = "";

	for (int i = 1 ; i <= lines ; i++)
	{ 
	out = "Case #" + i + ":";

	    G = input.readLine ();
	    StringTokenizer string1 = new StringTokenizer (G);
	    while (string1.hasMoreTokens ())
	    {
	    out += " ";
		word = string1.nextToken ();
		for (int j = 0 ; j < word.length () ; j++)
		{
		    
		    String letter = word.substring (j, j + 1);
		    int idr = english.indexOf (letter) ;
		    if (idr != -1)
		    {
			out += googlenese.substring (idr , idr +1) ;
		    }

		    else
		    {
			out += letter;
		    }

		}

	    }
	    output.println (out);


	}

	input.close ();
	output.close ();
    }



    // Place your program here.  'c' is the output console
} // main method
// googlenese class
