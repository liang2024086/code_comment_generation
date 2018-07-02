package methodEmbedding.Counting_Sheep.S.LYD1248;

import java.io.*;
import java.util.*;
public class CountingSheep
{
  static Scanner in;
  static PrintWriter out;
  static int temp, start, max;
  static int [] values = new int [10];
  static boolean check;
  public static void main (String [] args)
  {
    try 
    {
      in = new Scanner (new FileReader ("A-small-attempt1.in"));
      out = new PrintWriter (new FileWriter ("out.txt"));
      max = in.nextInt ();
      for (int x = 0 ; x < max; x++)
      {
              System.out.println(x);
        temp = in.nextInt ();
        start = temp;
        if (temp == 0)
        {
          out.println("Case #" + (x+1) + ": " + "INSOMNIA");
        }
        else
        {
          while (true)
          {
            for (int y = 0; y < String.valueOf(temp).length(); y ++)
            {
              values[Integer.parseInt(String.valueOf(String.valueOf(temp).charAt(y)))] ++;
            }
            for (int y = 0; y < values.length; y++)
            {
              if (values [y] >= 1)
              {
                check = true;
              }
              else
              {
                check = false;
                break;
              }
            }
            if (check)
            {
              out.println("Case #" + (x+1) + ": " + temp);
              break;
            }
            else
            {
              temp += start;
            }
          }
        }
        for (int y = 0; y < values.length; y ++)
        {
          values [y] = 0;
        }
      }
                  out.close();
            in.close ();
    }
    catch (IOException e)
    {
    }
    catch (NumberFormatException e)
    {
    }
  }
}
