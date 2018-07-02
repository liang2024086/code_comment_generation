package methodEmbedding.Standing_Ovation.S.LYD1017;

import java.io.*;
import java.util.*;

public class A
{
  public A ()
  {
    try
    {
      BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt0.in"));
      PrintWriter out = new PrintWriter (new FileWriter ("OUT.txt"));      
      int cases = Integer.parseInt (in.readLine ());
      int [] list;
      int ans;
      int standing;
      for (int x = 0; x<cases; x++)
      {
        ans = 0;
        standing = 0;
        String line = in.readLine ();
        int maxS = Integer.parseInt (line.charAt (0) + "");
        list = new int [maxS + 1];
        for (int y = 0; y< maxS+1; y++)
        {
          list [y] = Integer.parseInt (line.charAt (y+2) + "");
        }
        standing += list [0];
        for (int y = 1; y<list.length; y++)
        {
          if (list [y] != 0)
          {
            if (standing < y)
            {
              int temp = y - standing;
              for (int z = 0; z<temp; z++)
              {
                ans ++;
                standing ++;
              }
            }
          }
          standing += list [y];
        }
        out.println ("Case #"+(x+1)+": "+ ans);
      }
      
      in.close ();
      out.close ();
    }
    catch (IOException e)
    {
      System.out.println ("Crashed");
    }
  }
  
  
  public static void main (String[] args)
  {
    new A ();
  }
}
