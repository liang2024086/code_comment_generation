package methodEmbedding.Magic_Trick.S.LYD566;

import java.io.*;

public class A
{
    public static void main (String[] args) throws Exception
    {
	BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt1.in"));
	PrintWriter out = new PrintWriter (new FileWriter ("A-small-attempt1.out"));

	int cases = Integer.parseInt (in.readLine ());
	int q1 = 0;
	int q2 = 0;
	String temp = "";
	String[] r1 = new String [4];
	String[] r2 = new String [4];
	int count = 0;
	int result = 0;

	for (int x = 1 ; x < cases + 1 ; x++)
	{
	    q1 = Integer.parseInt (in.readLine ());
	    for (int y = 0 ; y < q1 ; y++)
		temp = in.readLine ();
	    r1 = temp.split (" ");
	    for (int y = 0 ; y < 4 - q1 ; y++)
		temp = in.readLine ();

	    q2 = Integer.parseInt (in.readLine ());
	    for (int y = 0 ; y < q2 ; y++)
		temp = in.readLine ();
	    r2 = temp.split (" ");
	    for (int y = 0 ; y < 4 - q2 ; y++)
		temp = in.readLine ();

	    for (int a = 0 ; a < 4 ; a++)
	    {
		for (int b = 0 ; b < 4 ; b++)
		{
		    if (r1 [a].equals (r2 [b]))
		    {
			count++;
			result = Integer.parseInt (r1 [a]);
		    }
		}
	    }

	    if (count == 1)
		out.println ("Case #" + x + ": " + result);
	    else if (count == 0)
		out.println ("Case #" + x + ": Volunteer cheated!");
	    else
		out.println ("Case #" + x + ": Bad magician!");
	    count = 0;
	}
	out.close ();
    }
}
