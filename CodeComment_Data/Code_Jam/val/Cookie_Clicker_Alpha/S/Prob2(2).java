package methodEmbedding.Cookie_Clicker_Alpha.S.LYD240;

import java.io.*;
import java.util.*;
import java.text.*;
public class Prob2
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader (new FileReader ("B-small-attempt0.in"));
	PrintWriter out = new PrintWriter (new FileWriter ("Bsmall.out"));
	DecimalFormat fo=new DecimalFormat ("0.0000000");
	int T = Integer.parseInt (in.readLine ());
	double c, f, x, t, r;
	StringTokenizer st;
	for (int a = 0 ; a < T ; a += 1)
	{
	    st = new StringTokenizer (in.readLine ());
	    c = Double.parseDouble (st.nextToken ());
	    f = Double.parseDouble (st.nextToken ());
	    x = Double.parseDouble (st.nextToken ());
	    t = 0;
	    r = 2.000000;
	    while (true)
	    {
		if (x / r > (c / r + x / (r + f)))
		{
		    t += c / r;
		    r += f;
		}else
		{
		t+=x/r;
		break;
		}
	    }
	    out.println("Case #"+(a+1)+": "+fo.format(t));
	}
	out.close ();
    }
}

