package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1210;

// The "CookieClicker" class.
import java.util.*;
import java.io.*;
public class CookieClicker
{
  public static void main (String[] args) throws IOException
  {
    double production = 2;
    double money = 0.0;
    BufferedReader in = new BufferedReader (new FileReader ("B-small-attempt1.in"));
    PrintWriter out = new PrintWriter (new FileWriter ("output.txt"));
    int count = Integer.parseInt (in.readLine ());
    for (int x = 0 ; x < count ; x++)
    {
      production = 2;
      out.print ("Case #" + (x + 1) + ": ");
      StringTokenizer st = new StringTokenizer (in.readLine ());
      double cost = Double.parseDouble (st.nextToken ());
      double adder = Double.parseDouble (st.nextToken ());
      double total = Double.parseDouble (st.nextToken ());
      double time = 0.0;
      while (true)
      {
        if (total / production < cost / production + total / (production + adder))
        {
          time += total / production;
          break;
        }
        time += cost / production;
        production += adder;
        money = 0.0;
      }
      time *= 10000000;
      time = Math.round (time);
      time /= 10000000;
      out.println (time);
    }
    in.close ();
    out.close ();
  } // main method
} // CookieClicker class
