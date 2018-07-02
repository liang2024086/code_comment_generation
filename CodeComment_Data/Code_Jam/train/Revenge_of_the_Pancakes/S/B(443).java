package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1040;

import java.io.*;
import java.util.*;

public class B
{
  public B ()
  {
    try
    {
      BufferedReader in = new BufferedReader (new FileReader ("B-small-attempt0.in"));
      PrintWriter out = new PrintWriter (new FileWriter ("out3.txt"));
      StringTokenizer st;
      
      int numCases = Integer.parseInt (in.readLine ());
      for (int q = 0; q < numCases;q++)
      {
        String a = in.readLine();
        int counter = 0;
        String temp = "";
        for (int x = a.length()-1; x >= 0; x--)
        {
          if (a.charAt (x) == '+')
          {
            if (q==2)
            continue;
          }
          else
          {
            for (int y = 0; y <=x; y++)
            {
              if (a.charAt (y) == '+'){
                temp = temp + "-";
              }
              else if (a.charAt (y)=='-')
              {
                temp = temp+"+";
              }
            }
            for (int c = x+1; c <a.length()-1; c++)
            {
              temp = temp + a.charAt (c); 
            }
            counter++;
            a = temp;
            temp = "";
          }
        }
        out.println ("Case #"+(q+1)+": "+ counter);
      }
      
      in.close ();
      out.close (); 
    }
    catch (IOException e)
    {
    }
  }
  
  public static void main (String [] args)
  {
    new B ();
  }
}
