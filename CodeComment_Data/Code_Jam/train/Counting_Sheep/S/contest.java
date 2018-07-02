package methodEmbedding.Counting_Sheep.S.LYD578;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class contest
{
   public static void main(String[] args)
   {
      TreeSet<Integer> set = new TreeSet<Integer>();
      Scanner scan = new Scanner(System.in);
      int T = scan.nextInt();
      String temp = new String();
      String string = new String();
      int tempo = 0;
      for (int i = 0; i < T; i++)
      {
         tempo = scan.nextInt();
         for (int j = 0; j < 100 && set.size() != 10; j++)
         {
            temp = Integer.toString(tempo * (j + 1));
            for (int k = 0; k < temp.length(); k++)
            {
               set.add(Integer.parseInt(temp.substring(k, k + 1)));
            }
         }
         string += "Case #" + Integer.toString(i + 1) + ": ";
         if (set.size() == 10)
         {
            string += temp + "\r\n"; 
         }
         else
         {
            string += "INSOMNIA\r\n";
         }
         set.clear();
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
