package methodEmbedding.Counting_Sheep.S.LYD84;

import java.util.*;
import java.io.*;
public class Main1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      int n = in.nextInt();
      if(n == 0) {
          System.out.println("Case #" + i + ": INSOMNIA");
          continue;
      }
      long tmp, num;
      boolean[] digits = new boolean[10];
      boolean found = false;
      tmp = n;
      num = n;
      while(!found) {
          while(tmp > 9) {
              digits[(int) (tmp%10)] = true;
              tmp /= 10;
          }
          digits[(int) tmp] = true;
          num += n;
          tmp = num;
          found = true;
          for (int j = 0; j < 10; j++)
              found &= digits[j];
          
      }
      num -= n;
      System.out.println("Case #" + i + ": " + num);
    }
  }
}
