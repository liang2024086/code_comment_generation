package methodEmbedding.Magic_Trick.S.LYD1536;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class A
{
  public static void main (String [] args) throws IOException   
  {
    BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt3.in"));
    PrintWriter out = new PrintWriter (new FileWriter ("aOUT.txt"));
    
    StringTokenizer s;
    String total = in.readLine();
    String line;
    int[][] cardsOne = new int[4][4];
    int[][] cardsTwo = new int[4][4];
    int rowOne;
    int rowTwo;
    
    for (int d = 1;d<=Integer.parseInt (total);d++)
    {
      rowOne = Integer.parseInt(in.readLine()) - 1;
      for(int r = 0; r < 4; r++)
      {
        line = in.readLine();
        s = new StringTokenizer(line);
        for(int n = 0; n < 4; n++)
        {
          cardsOne[r][n] = Integer.parseInt(s.nextToken());
        }
      }
      rowTwo = Integer.parseInt(in.readLine()) - 1;
      for(int r = 0; r < 4; r++)
      {
        line = in.readLine();
        s = new StringTokenizer(line);
        for(int n = 0; n < 4; n++)
        {
          cardsTwo[r][n] = Integer.parseInt(s.nextToken());
        }
      }
      int card = 0;
      boolean bad = false;
      for(int r = 0; r < 4; r++)
      {
        for(int n = 0; n < 4; n++)
        {
          if (cardsTwo[rowTwo][r] == cardsOne[rowOne][n])
          {
            if(card > 0)
            {
              bad = true;
            }
            card = cardsTwo[rowTwo][r];
          }
        }
      }
      out.print("Case #" + d + ": ");
        if(card == 0)
        {
          out.println("Volunteer cheated!");
        }
        else
        {
          if(bad)
          {
            out.println("Bad magician!");
          }
          else
          {
            out.println(card);
          }
        }
    }
    out.close();
  }
}


