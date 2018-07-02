package methodEmbedding.Standing_Ovation.S.LYD1865;

import java.util.*;
import java.io.*;

public class StandingOvation
{
  
  
  public static void main (String args []) throws Exception
  {
    Scanner sc = new Scanner (new File ("A-small-attempt0.in"));
    PrintWriter out = new PrintWriter (new FileWriter (new File ("output.txt")));
    int cases = sc.nextInt ();
    
    for (int x = 0; x < cases; x++)
    {
      int max = sc.nextInt ();
      int standing = 0;
      int added = 0;
      String shyness = sc.next ();
      for (int y = 0; y <= max; y++)
      {
        if (standing < y)
        {
          added += y - standing;
          standing += y - standing;
        }
        standing += Integer.parseInt (shyness.substring (y, y+1));
      }
      out.println ("Case #" + (x+1) + ": " + added);
    }
    out.close();
  }
  
  
}
