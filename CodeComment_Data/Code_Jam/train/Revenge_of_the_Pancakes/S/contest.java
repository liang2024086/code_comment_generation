package methodEmbedding.Revenge_of_the_Pancakes.S.LYD375;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class contest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int count;
      String temp = new String();
      String string = new String();
      
      for (int i = 0; i < N; i++)
      {
         temp = scan.next();
         count = 0;
         for (int j = temp.length() - 1; j >= 0; j--)
         {
            if (temp.substring(j, j + 1).equals("-"))
            {
               for (int k = 0; k < j + 1; k++)
               {
                  if (temp.substring(k, k + 1).equals("-"))
                  {
                     temp = temp.substring(0, k) + "+" + temp.substring(k + 1);
                  }
                  else
                  {
                     temp = temp.substring(0, k) + "-" + temp.substring(k + 1);
                  }
               }
               count++;
            }
         }
         string += /*temp + */"Case #" + (i + 1) + ": " + count + "\r\n";
      }
      
      try
      {
         PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
         System.setOut(out);
      }
      catch (FileNotFoundException e)
      {
      }
      System.out.print(string);
   }
}
