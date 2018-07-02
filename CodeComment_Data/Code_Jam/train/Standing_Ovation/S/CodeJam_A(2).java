package methodEmbedding.Standing_Ovation.S.LYD1706;

import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

public class CodeJam_A
{
    //int[] shyness = new int [1001];
    public CodeJam_A ()
    {
	try
	{
	    StringTokenizer st;
	    BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt0.in"));
	    PrintWriter out = new PrintWriter (new FileWriter ("output.txt"));
	    int testCases = Integer.parseInt (in.readLine ());
	    int temp1 = 0, temp2 = 0, temp3 = 0, temp = 0, moreFriends = 0;
	    String num = "";
	    for (int i = 0 ; i < testCases ; i++)
	    {
		moreFriends = 0;
		st = new StringTokenizer (in.readLine ());
		temp1 = Integer.parseInt (st.nextToken ());
		num = st.nextToken ();
		temp2 = Integer.parseInt (num);
		//System.out.println (temp1 + ", " + num);
		for (int j = 0 ; j <= temp1 ; j++)
		{

		    a:
		    for (int k = temp1 - j ; k >= 0 ; k--)
		    {
			if (k == (temp1 - j))
			{
			    temp = k;

			}
			else
			{
			    temp -= Character.getNumericValue (num.charAt (k));
			    if (k == 0)
			    {
				temp -= moreFriends;
				if (temp > 0)
				    moreFriends += temp;

			    }

			    if (temp <= 0)
				break a;
			}
			//System.out.println (j + ", " + k + ", " + temp + ", " + moreFriends);
		    }
		    //System.out.println (j  + " " + temp);

		}
		out.println ("Case #" + (i + 1) + ": " + moreFriends);
	    }
	    out.close ();
	}
	catch (IOException e)
	{
	}
    }


    public static void main (String[] args)
    {
	new CodeJam_A ();
    }
}



