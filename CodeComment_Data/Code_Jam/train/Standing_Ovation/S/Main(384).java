package methodEmbedding.Standing_Ovation.S.LYD42;

import java.util.*;
import java.io.*;
public class Main
{
  public Main () throws Exception
  {
    Scanner in = new Scanner (new File ("A-small-attempt0.in"));
    PrintWriter out = new PrintWriter (new File ("A-small-attempt0.out"));
    int temp = in.nextInt ();
    for (int i = 0; i < temp; i ++)
    {
      int answer = 0;
      int previous = 0;
      in.nextInt ();
      String str = in.next ();
      for (int n = 0; n < str.length (); n ++)
      {
        if (n == 0)
          previous = Integer.parseInt ("" + str.charAt (n));
        else
        {
          if (n > previous)
          {
            answer += n - previous;
            previous += n - previous;
          }
          previous += Integer.parseInt ("" + str.charAt (n));
        }
      }
      out.println ("Case #" + (i+1) + ": " + answer);
    }
    
    out.close ();
    System.out.println ("Over");
  }
  
  public static void main (String [] args)
  {
    try
    {
      new Main ();
    }
    catch (Exception e)
    {
      e.printStackTrace ();
    }
  }
}
