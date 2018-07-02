package methodEmbedding.Magic_Trick.S.LYD792;

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
      int firstRow;
      int secondRow;
      int [] first = new int [4];
      int [] second = new int [4];
      int counter = 0;
      int answer = 0;
      int num4, num5, num6, num7;
      StringTokenizer st = new StringTokenizer ("");
      for (int x = 0; x < cases; x++)
      {
        counter = 0;
        firstRow = Integer.parseInt (in.readLine ());
        String line = "";
        for (int z = 0; z<4; z++)
        {
         line = in.readLine ();
          if (z+ 1 == firstRow)
          {
            st = new StringTokenizer (line);
          }

        }
        for (int z = 0; z<4; z++)
        {
         first [z] = Integer.parseInt (st.nextToken ()); 
        }
        
        secondRow = Integer.parseInt (in.readLine ());
        for (int z = 0; z< 4; z++)
        {
         line = in.readLine ();
          if (z+1 == secondRow)
            st = new StringTokenizer (line);
        }
        for (int z = 0; z<4; z++)
        {
          second [z] = Integer.parseInt (st.nextToken ());
     
        }
        for (int z = 0; z<4; z++)
        {
          for (int y = 0; y<4; y++)
          {
            if (first [z] == second [y])
            {
             counter ++;
             answer = first [z];
            }
          }
        }
        if (counter > 1)
         out.println ("Case #" + (x+1) + ": " + "Bad magician!");
        else if (counter == 0)
          out.println ("Case #" + (x+1) + ": " + "Volunteer cheated!");
        else if (counter == 1)
          out.println ("Case #" + (x+1) + ": " + answer);
      }
      in.close ();
      out.close ();
    }
    catch (IOException e)
    {
    }
  }
 
  public static void main (String[] args)
  {
    new A ();
  }
}
