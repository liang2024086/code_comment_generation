package methodEmbedding.Revenge_of_the_Pancakes.S.LYD70;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      String n = in.next();
      if(n.length() == 1) {
          if(n.charAt(0) == '-')
              System.out.println("Case #" + i + ": 1");
          else
              System.out.println("Case #" + i + ": 0");
      }
      else {
          int count = 0;
          for(int j = 0; j < n.length()-1; j++) {
              if(n.charAt(j) != n.charAt(j+1)){
                  count++;
              }
          }
          if(n.charAt(n.length()-1) == '-')
              count++;
          System.out.println("Case #" + i + ": " + count);
      }
      //System.out.println("Case #" + i + ": " + (n + m) + " " + (n * m));
    }
  }
}
