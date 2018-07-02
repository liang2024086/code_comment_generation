package methodEmbedding.Revenge_of_the_Pancakes.S.LYD835;

import java.util.*;

public class B {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int T = input.nextInt();

    for (int t = 1; t <= T; t++) {
      System.out.printf("Case #%d: ", t);
      String str = input.next();
      int start = 0;
      int val = 0;
      while (start < str.length()) {
        boolean has = false;
        while (start < str.length() && str.charAt(start) == '+') {
          has = true;
          start++;
        }
        if (has && start < str.length()) {
          val++;
        }
        has = false;
        while (start < str.length() && str.charAt(start) == '-') {
          has = true;
          start++;
        }
        if (has) {
          val++;
        }
      }
      System.out.println(val);
    }
  }
}
