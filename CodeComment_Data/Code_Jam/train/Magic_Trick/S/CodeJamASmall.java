package methodEmbedding.Magic_Trick.S.LYD1011;

import java.io.*;
import java.util.StringTokenizer;
// The "CodeJamASmall" class.
//created by sameer chitley
public class CodeJamASmall
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt0.in"));
	PrintWriter out = new PrintWriter (new FileWriter ("A-small-attempt0.out"));

	int[] gridOne = new int [4];
	int[] gridTwo = new int [4];
	int numOne, numTwo, numCases;

	String answer = "";

	numCases = Integer.parseInt (in.readLine ());

	for (int l = 0 ; l < numCases ; l++)
	{
	    numOne = Integer.parseInt (in.readLine ());
	    for (int i = 1 ; i < numOne ; i++)
	    {
		in.readLine ();
	    }
	    StringTokenizer line = new StringTokenizer (in.readLine ());
	    for (int k = 0 ; k < 4 ; k++)
	    {
		gridOne [k] = Integer.parseInt (line.nextToken ());
	    }
	    for (int i = numOne ; i < 4 ; i++)
	    {
		in.readLine ();
	    }

	    numTwo = Integer.parseInt (in.readLine ());
	    for (int i = 1 ; i < numTwo ; i++)
	    {
		in.readLine ();
	    }
	    StringTokenizer line2 = new StringTokenizer (in.readLine ());
	    for (int k = 0 ; k < 4 ; k++)
	    {
		gridTwo [k] = Integer.parseInt (line2.nextToken ());
	    }
	    for (int i = numTwo ; i < 4 ; i++)
	    {
		in.readLine ();
	    }


	    //if no elements in gridOne match gridTwo then Volunteer Cheated
	    //if >1 elements in grid One match gridTwo then Bad magician
	    //else output #

	    int numMatches = 0, matchValue = 0;

	    for (int i = 0 ; i < 4 ; i++)
	    {
		for (int j = 0 ; j < 4 ; j++)
		{
		    if (gridOne [i] == gridTwo [j])
		    {
			numMatches++;
			matchValue = gridOne [i];
		    }
		}
	    }

	    if (numMatches == 0)
	    {
		out.println ("Case #" + (l + 1) + ": Volunteer cheated!");
	    }
	    else if (numMatches == 1)
	    {
		out.println ("Case #" + (l + 1) + ": " + matchValue);
	    }
	    else
	    {
		out.println ("Case #" + (l + 1) + ": Bad magician!");
	    }

	}

	in.close ();
	out.close ();
	// Place your code here
    } // main method
} // CodeJamASmall class
