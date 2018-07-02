package methodEmbedding.Revenge_of_the_Pancakes.S.LYD606;

import java.io.*;
import java.util.*;
public class RevengeOfThePancakes
{
  static Scanner in;
  static PrintWriter out;
  static String temp;
  static int flips, max;
  public static void main (String [] args)
  {
    try 
    {
      in = new Scanner (new FileReader ("B-small-attempt1.in"));
      out = new PrintWriter (new FileWriter ("out.txt"));
      max = in.nextInt ();
      in.nextLine();
      for (int x = 0; x < max ; x++)
      {
        flips = 1;
        temp = in.nextLine ();
        for (int y = 1; y < temp.length(); y++)
        {
          if (temp.charAt (y) != temp.charAt (y-1))
          {
            flips ++;
          }
        }
        if (temp.charAt (temp.length ()-1) == '+')
        {
          out.println("Case #" + (x+1) + ": " + (flips - 1));
        }
        else
        {
          out.println("Case #" + (x+1) + ": " + flips);
        }
      }
    }
    catch (IOException e)
    {
    }
          out.close();
      in.close();
  }
}
