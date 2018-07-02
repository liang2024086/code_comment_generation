package methodEmbedding.Magic_Trick.S.LYD550;

import java.io.*;
import java.util.*;

public class CardCompare
{  
  public CardCompare()
  {
    try
    {
      BufferedReader in = new BufferedReader(new FileReader("A-small-attempt3.in"));
      int cards[] = new int[4];
      int cards2[] = new int[4];
      int row1choose;
      int row2choose;
      int counter;
      
      PrintWriter out = new PrintWriter (new FileWriter("output.txt"));
      
      int testCases = Integer.parseInt(in.readLine());
      
      for (int x = 0; x < testCases; x++)
      {
        String a = "";
        String line = "";
        counter = 0;
        row1choose = Integer.parseInt(in.readLine()) -1 ;   
        StringTokenizer st = new StringTokenizer ("");
        
        for(int y = 0; y < 4; y++)
        {
          line = in.readLine();
          if (y == row1choose)
          {
            st = new StringTokenizer(line);
          }
        }
        for(int y = 0; y < 4; y++)
        {
          cards[y] = Integer.parseInt(st.nextToken());
        }
        
        row2choose = Integer.parseInt(in.readLine())-1;
        
        for(int y = 0; y < 4; y++)
        {
          line = in.readLine();
          if (y == row2choose)
          {
            st = new StringTokenizer(line);
          }
        }
        for(int y = 0; y < 4; y++)
        {
          cards2[y] = Integer.parseInt(st.nextToken());
        }
        
        for (int y = 0; y < 4; y++)
        {
          for (int z = 0; z < 4; z++)
          {
            if (cards[y] == cards2[z])
            {
              counter++;
              a = cards[y] + "";
            }
          }
        }
        
        if (counter == 0)
        {
          out.println("Case #" + (x+1) + ": Volunteer cheated!");
        }
        else if (counter > 1)
        {
          out.println("Case #" + (x+1) + ": Bad magician!");
        }
        else
        {
          out.println("Case #" + (x+1) + ": " + a); 
        }
      }
      out.close();
    }
    catch(IOException e)
    {
    }
  }
  public static void main(String[]args)
  {
    CardCompare c = new CardCompare();
  }
}
