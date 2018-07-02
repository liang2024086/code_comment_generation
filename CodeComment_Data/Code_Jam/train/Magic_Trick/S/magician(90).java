package methodEmbedding.Magic_Trick.S.LYD434;

import java.io.*;
import java.util.*;
public class magician
{
  public static void main (String[]args)
  {
    int rounds, index = 0;
    int guess, guess2;
    int count = 0;
    String[][]cards = new String[4][4];
    String[][]cards2 = new String[4][4];
    boolean liar = true;
    boolean correct = false;
    try
    {
      BufferedReader buff = new BufferedReader(new FileReader("A-small-attempt1.in"));
      PrintWriter printz = new PrintWriter(new FileWriter("out.txt"));
      rounds = Integer.parseInt(buff.readLine());
      for (int z = 0; z < rounds; z++)
      {
        guess = Integer.parseInt(buff.readLine());
        for (int x = 0; x < 4; x++)
        {
          Scanner scan= new Scanner (buff.readLine());
          for (int y = 0; y < 4; y++)
          {
            cards[x][y] = scan.next();
          }
        }
        guess2 = Integer.parseInt(buff.readLine());
        for (int x = 0; x < 4; x++)
        {
          Scanner scan2= new Scanner (buff.readLine());
          for (int y = 0; y < 4; y++)
          {
            cards2[x][y] = scan2.next();
          }
        }    
        boolean pass1 = false;
        boolean pass2 = false;
        boolean pass3 = false;
        /*for (int y = 0; y < 4; y++)
         {
         for (int x = 0; x < 4; x++)
         {
         if (cards[guess-1][x].equals(cards2[0][y]))      
         pass1 = true;
         if (cards[guess-1][x].equals(cards2[1][y]) && pass1)
         pass2 = true;
         if (cards[guess-1][x].equals(cards2[2][y]) && pass2)
         pass3 = true;
         if (cards[guess-1][x].equals(cards2[3][y]) && pass3)
         correct = true;
         }
         }
         */
        /*
         for (int y = 0; y < 4; y++)
         {
         for (int x = 0; x < 4; x++)
         {
         if (cards[guess-1][y].equals(cards2[guess2-1][x]))
         liar = false;
         }
         }
         */
        /*if (liar)
         {
         printz.println("Case #" + (z+1) + ": Volunteer cheated!");
         }
         else if (!correct)
         {
         printz.println("Case #" + (z+1) + ": Bad magician!");
         }
         else
         {
         */
        for (int x = 0; x < 4; x++)
        {
          for (int y = 0; y < 4; y++)
          {
            if (cards[guess-1][x].equals(cards2[guess2-1][y]))
            {
              index = y;
              count++;
            }
          }
        }
        if (count == 1)
          printz.println("Case #" + (z+1) + ": "+  cards2[guess2-1][index]);
        else if (count == 0)
          printz.println("Case #" + (z+1) + ": Volunteer cheated!");
        else
          printz.println("Case #" + (z+1) + ": Bad magician!");
        //}
        count = 0;
        liar = true;
        correct = false;
      }
      printz.close();
    }
    catch(IOException e)
    {
      System.exit(2);
    }
  }
}
