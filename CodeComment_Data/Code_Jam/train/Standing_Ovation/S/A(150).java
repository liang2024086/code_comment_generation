package methodEmbedding.Standing_Ovation.S.LYD499;

import java.util.*;

public class A {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int T = input.nextInt();
    for (int i = 0; i < T; i++) {
      int S = input.nextInt();
      String spec = input.next();
      int cur = spec.charAt(0) - '0';
      int need = 0;
      for (int j = 1; j < spec.length(); j++) {
        int x = spec.charAt(j) - '0';
        if (cur + need < j) {
          need += j - (cur + need);
        }
        cur += x;
      }
      System.out.printf("Case #%d: %d\n", i + 1, need);
    }
  }
}
