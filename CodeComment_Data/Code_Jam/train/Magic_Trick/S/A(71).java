package methodEmbedding.Magic_Trick.S.LYD1687;

import java.io.*;
import java.util.*;

public class A
{
  public static void main (String [] args) throws Exception
  {
    BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt1.in"));
    PrintWriter out = new PrintWriter (new FileWriter ("out.txt"));
    
    int cases = Integer.parseInt (in.readLine ());
    for (int x = 0; x< cases; x++)
    {
      int firstRow = Integer.parseInt (in.readLine ());
      String firstNum = "";
      int [] firstNumbers = new int [4] ;
      
      for (int y = 0; y<firstRow ; y++)
        firstNum = in.readLine ();
      for (int y = firstRow; y<4 ; y++)
        in.readLine ();
      
      int secondRow = Integer.parseInt (in.readLine ());
      String secondNum="";
      int [] secondNumbers = new int [4] ;
      
      for (int y = 0; y<secondRow ; y++)
        secondNum = in.readLine ();
      for (int y = secondRow; y < 4 ; y++)
        in.readLine ();
      
      StringTokenizer s1 = new StringTokenizer (firstNum);
      StringTokenizer s2 = new StringTokenizer (secondNum);

      for (int l = 0; l < 4; l++)
      {
        firstNumbers [l] = Integer.parseInt (s1.nextToken ());
        secondNumbers [l] = Integer.parseInt (s2.nextToken ());
      }
      int count = 0;
      int num = 0;
      for (int y = 0;y<4; y++)
      {
        for (int i = 0; i < 4; i++)
        {
          if (firstNumbers [y] == secondNumbers [i])
          {
            count++;
            num = firstNumbers [y];
          }
        }
      }
      out.print ("Case #");
      out.print (x+1);
      out.print (": ");
      if (count == 0)
        out.println ("Volunteer cheated!");
      else if (count > 1)
        out.println ("Bad magician!");
      else
        out.println (num);
      
    }
    
    out.close ();
  }
}
