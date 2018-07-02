package methodEmbedding.Revenge_of_the_Pancakes.S.LYD982;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class B {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    in.nextLine();
    for (int i = 1; i <= t; ++i) {
      String stack = in.nextLine();
//      System.out.println("stack = " + stack);
      int flips = 0;
      char c = stack.charAt(0);
      for (int j = 1; j < stack.length(); j++) {
//        System.out.println("c = " + c);
        if (c == stack.charAt(j)) {
          continue;
        } else {
          flips++;
          c = c == '-' ? '+' : '-';
        }
      }

      if (c == '-') {
        flips++;
      }

      System.out.printf("Case #%s: %s%n", i, flips);
    }
  }
}
