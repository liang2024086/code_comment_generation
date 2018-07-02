package methodEmbedding.Counting_Sheep.S.LYD323;

import java.util.*;
import java.io.*;
import java.math.*;
public class Sheep {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n_cases = Integer.parseInt(in.nextLine());  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int caase = 1; caase <= n_cases; ++caase) {
      long n = Long.parseLong(in.nextLine());
      String res = "";
      if (n == 0) res = "INSOMNIA";
      else {
        Set<Character> set = new HashSet<Character>();
        long i = 1;
        
        long nn = n;
        while(set.size()<10) {
          nn = n * i;
          String nStr = "" + nn;
          // System.out.println(nStr);
          for(int j=0; j< nStr.length() && set.size()<10; j++) {
            set.add(nStr.charAt(j));
          }  
          i++;
        }
        res = "" + nn;
      }
      System.out.println("Case #" + caase + ": " + res);
    }
  }
}

