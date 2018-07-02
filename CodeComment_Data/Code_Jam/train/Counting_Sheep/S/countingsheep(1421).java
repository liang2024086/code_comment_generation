package methodEmbedding.Counting_Sheep.S.LYD615;

import java.util.*;
import java.io.*;
public class countingsheep {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    
    for (int i = 1; i <= t; ++i) {
      int n = in.nextInt();
      HashSet<Integer> digits = new HashSet<Integer>();
      int current = n;
      if (current == 0) {
          System.out.println("Case #" + i + ": " + "INSOMNIA");
      }
      else {
          int iter = 1;
          while (digits.size() < 10) {
              String stringnumber = String.valueOf(iter*n);
              for (int j = 0; j < stringnumber.length(); j++){
                  char c = stringnumber.charAt(j);
                  int d = Character.getNumericValue(c);
                  digits.add(d);
              }
              iter++;
          }
              //int m = in.nextInt();
          System.out.println("Case #" + i + ": " + (iter-1)*n);
      }
    }
  }
}
