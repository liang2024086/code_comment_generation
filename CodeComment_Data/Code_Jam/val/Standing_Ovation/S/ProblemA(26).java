package methodEmbedding.Standing_Ovation.S.LYD1537;

import java.io.*;
import java.awt.*;
import java.util.*;
public class ProblemA
{
  public static void main (String [] args) throws Exception
  {
    Scanner in = new Scanner (new FileReader ("A-small-attempt0.in"));
    PrintWriter out = new PrintWriter (new FileWriter ("out.txt"));
    int cases = in.nextInt ();
    in.nextLine();
    for (int x = 0; x < cases; x++)
    {
      int maxShy = in.nextInt();
      int [] people = new int [maxShy + 1];
      String audience = in.next();
      for (int y = 0; y <= maxShy; y++)
      {
        people [y] = Integer.parseInt (audience.substring (y,y+1));
      }
      int friends = 0;
      int peeps = people [0];
      for (int y = 1; y <= maxShy; y++)
      {
        if ((peeps + friends) < y)
        {
          friends ++;
        }
        peeps += people [y];
      }
      out.println ("Case #" + (x+1) + ": " + friends);
    }
    out.close();
  }
}
