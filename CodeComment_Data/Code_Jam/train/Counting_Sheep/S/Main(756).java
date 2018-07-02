package methodEmbedding.Counting_Sheep.S.LYD1245;

import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args) throws Exception 
  {
    Scanner sc = new Scanner(new File("A-small-attempt2.in.txt"));
    int noOfCases = sc.nextInt();
    PrintWriter out = new PrintWriter(new FileWriter("output"));

    // Each case.
    for (int index = 1; index <= noOfCases; index++) {
      int n = sc.nextInt();
      System.out.println(n);
      int n1 = n;

      if (n == 0)
      {
        out.println("Case #" + index + ": INSOMNIA");
        continue;
      } // if

      boolean[] array = new boolean[10];
      System.out.println("Array");

      boolean not = true;
      int t = 2;
      int ans = n;
      while(not)
      {
        char[] chars = Integer.toString(n).toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
          array[Integer.parseInt(chars[i] + "")] = true;
        }
        not = false;
        for (boolean exist: array) {
          if (exist == false)
            not = true;
        }
        ans = n;
        n = t * n1;
        t++;
      } // while

      out.println("Case #" + index + ": " + ans);
    } // for

    out.close();
    sc.close();

  } // main

} // class Main
