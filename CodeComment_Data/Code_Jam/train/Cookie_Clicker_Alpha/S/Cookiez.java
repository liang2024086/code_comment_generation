package methodEmbedding.Cookie_Clicker_Alpha.S.LYD729;

import java.io.*;
import java.util.*;

public class Cookiez
{
  public static void main (String [] args) throws IOException
  {
    BufferedReader read = new BufferedReader (new FileReader ("B-small-attempt0.in"));
    PrintWriter print = new PrintWriter (new FileWriter ("output.txt"));
    int iterations = Integer.parseInt (read.readLine ());
    for (int count = 1; count <= iterations; count ++)
    {
      String [] inputs = read.readLine ().split (" ");
      double cost = Double.parseDouble (inputs [0]);
      double rate = Double.parseDouble (inputs [1]);
      double target = Double.parseDouble (inputs [2]);
      
      double lowestTime = Double.MAX_VALUE;
      
      double currentRate = 2;
      
      int numberOfTargetBuys = 0;
      while (true)
      {
        double time = 0;
        currentRate = 2;
        for (int x = 0; x < numberOfTargetBuys; x ++)
        {
          time += cost/currentRate;
          currentRate += rate;
        }
        time += target / currentRate;
        if (time < lowestTime)
          lowestTime = time;
        else
          break;
        numberOfTargetBuys ++;
      }
      String lowestTimeParsed = String.valueOf (lowestTime);
      lowestTimeParsed = (lowestTimeParsed + "00000000").substring (0,(lowestTimeParsed + "000000000").indexOf (".") + 8);
      print.println ("Case #" + count + ": " + lowestTimeParsed);
    }
    print.close ();
  }
}
