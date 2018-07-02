package methodEmbedding.Magic_Trick.S.LYD2150;

import java.io.*;
import java.util.*;
import java.lang.Integer;

class A
{

    public static void main (String[] args) throws IOException
    {

	BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt1.in"));
	PrintWriter out = new PrintWriter (new FileWriter ("A.23.out"));

	int cases = Integer.parseInt (in.readLine ());
	for (int zee = 0 ; zee < cases ; zee++)
	{
	    int lineCounter = 0;
	    int first = Integer.parseInt (in.readLine ());

	    for (int x = 1 ; x < first ; x++)
	    {
		String garbage = in.readLine ();
		lineCounter++;
	    }



	    int[] firstRow = new int [4 + 1];
	    String line = in.readLine ();

	    StringTokenizer st = new StringTokenizer (line);
	    for (int x = 0 ; x < 4 ; x++)

		{
		    firstRow [x] = Integer.parseInt (st.nextToken ());
		}


	    for (int x = first ; x < 4 ; x++)
	    {
		String garbage = in.readLine ();
	    }
	    lineCounter = 0;


	    int second = Integer.parseInt (in.readLine ());

	    for (int x = 1 ; x < second ; x++)
	    {
		String garbage = in.readLine ();
		lineCounter++;
	    }


	    int[] secondRow = new int [4 + 1];



	    String line2 = in.readLine ();

	    StringTokenizer st1 = new StringTokenizer (line2);
	    for (int x = 0 ; x < 4 ; x++)

		{
		    secondRow [x] = Integer.parseInt (st1.nextToken ());
		}

	    for (int x = second ; x < 4 ; x++)
	    {
		String garbage = in.readLine ();
	    }

	    int number = 0;
	    int counter = 0;
	    for (int x = 0 ; x < 4 ; x++)
	    {

		for (int y = 0 ; y < 4 ; y++)
		{
		    if (firstRow [x] == secondRow [y])
		    {
			counter++;
			number = firstRow [x];
		    }
		}

	    }


	    if (counter == 1)
	    {
		out.println ("Case #" + (zee + 1) + ": " + number);

	    }
	    else if (counter > 1)
	    {
		out.println ("Case #" + (zee + 1) + ": " + "Bad magician!");
	    }
	    else
	    {
		out.println ("Case #" + (zee + 1) + ": " + "Volunteer cheated!");
	    }
	}
	in.close ();
	out.close ();
    }
}
