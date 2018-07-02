package methodEmbedding.Standing_Ovation.S.LYD91;

import java.io.*;
import java.util.*;

public class StandingOvation
{
  public static void main (String [] args) throws IOException
  {
    BufferedReader input = new BufferedReader (new FileReader ("A-small-attempt0.in"));
    PrintWriter output = new PrintWriter (new FileWriter ("output.txt"));
    int count = Integer.parseInt (input.readLine ());
    for (int x = 1; x <= count; x ++)
    {
      String [] variables = input.readLine ().split (" ");
      int numberOfFriends = 0;
      int totalStanding = 0;
      for (int y = 0; y <= Integer.parseInt (variables [0]); y ++)
      {
        if (totalStanding >= y)
        {
          totalStanding += variables [1].charAt (y)-48;
        }
        else
        {
          numberOfFriends += y - totalStanding;
          totalStanding += y - totalStanding + variables [1].charAt (y)-48;
        }
      }
      output.println ("Case #" + x + ": " + numberOfFriends);
    }
    output.close ();
  }
}
