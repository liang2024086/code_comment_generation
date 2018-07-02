package methodEmbedding.Magic_Trick.S.LYD647;

import java.io.*;
import java.util.*;

public class A1
{
  public A1 ()
  {
    int test =0;
    int a;
    int b;
    int [] [] f;
    int [] [] s ;
    int ans=-1;
    boolean ansFound;
    boolean moreThanOne ;
    try 
    {
      BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt0.in"));
      PrintWriter out = new PrintWriter (new FileWriter ("out.txt"));
      StringTokenizer st;
      test = Integer.parseInt (in.readLine());
      for (int x = 0; x < test ; x++)
      {
        ans = -1;
        f = new int [4][4];
        s = new int [4][4];
        ansFound = false;
        moreThanOne = false;
        a = Integer.parseInt (in.readLine());
        a--;
        for (int y = 0; y < 4; y++)
        {
          st = new StringTokenizer (in.readLine ());
          f[y] [0] = Integer.parseInt ( st.nextToken());
          f[y] [1] = Integer.parseInt ( st.nextToken());
          f[y] [2] = Integer.parseInt ( st.nextToken());
          f[y] [3] = Integer.parseInt ( st.nextToken());
        }
        b = Integer.parseInt (in.readLine ());
        b--;
        for (int y = 0; y < 4; y++)
        {
          st = new StringTokenizer (in.readLine ());
          s[y] [0] = Integer.parseInt ( st.nextToken());
          s[y] [1] = Integer.parseInt ( st.nextToken());
          s[y] [2] = Integer.parseInt ( st.nextToken());
          s[y] [3] = Integer.parseInt ( st.nextToken());
        }
        
        search: 
        {
          for (int y= 0 ; y < 4; y++)
          {
            for (int z = 0; z < 4; z++)
            {
              if (f [a] [y] == s [b] [z])
              {
                if (!ansFound && !moreThanOne)
                {
                  ans = f [a] [y];
                  ansFound = true;
                }
                else
                {
                  moreThanOne = true;
                  break search;
                }
              }
            }
          }
        }
        out.print("Case #" + (x+1) + ": ");
        if (!ansFound)
        {
          out.println ("Volunteer cheated!");
        }
        else if (moreThanOne)
        {
          out.println ("Bad magician!");
        }
        else
        {
          out.println (ans);
        }
      }
      out.close();
    }
    catch (Exception e)
    {
    }
  }
  public static void main (String [] args)
  {
    new A1 ();
  }
}
