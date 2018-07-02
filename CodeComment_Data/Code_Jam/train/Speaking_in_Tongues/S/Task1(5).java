package methodEmbedding.Speaking_in_Tongues.S.LYD1356;

/*
Bianca - Code Jam
 */

import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.File;

public class Task1
{

    public static void main (String[] args)
    {
	char ch = ' ';
	final int DIFF = 97;
	final char[] OUT = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};

	try
	{

	    FileWriter outFile = new FileWriter ("C:/Users/Roland Bohmer/Desktop/Bianca/Code Jam/A-small-attempt0.out");
	    PrintWriter out = new PrintWriter (outFile);

	    File fn = new File ("A-small-attempt0.in");
	    Scanner scIn = new Scanner (fn);
	    int numLines = Integer.parseInt (scIn.nextLine ().trim ());

	    for (int ii = 0 ; ii < numLines ; ii++)
	    {
		out.print ("Case #" + (ii + 1) + ": ");
		char[] inLet = scIn.nextLine ().toCharArray ();
		for (int jj = 0 ; jj < inLet.length ; jj++)
		{
		    if (inLet[jj] == (-65+DIFF))
		    {
                       out.print (' ');
		    }
		    else
		    {
			out.print (OUT [(int) inLet[jj] - DIFF]);
		    }
		}
		out.println ();
	    }
	    out.close ();
	    outFile.close ();
	    scIn.close ();
	}
        catch (Exception f)
        {
        System.out.println (f.getMessage ());
        }

    }
}
