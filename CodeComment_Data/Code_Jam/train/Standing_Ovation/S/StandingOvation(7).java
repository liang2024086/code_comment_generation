package methodEmbedding.Standing_Ovation.S.LYD201;

import java.util.*; 

public class StandingOvation {
  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    final int T = in.nextInt();
    for (int i = 1; i <= T; i++) {
      int smax = in.nextInt();
      String ss = in.next();
      int add = 0;
      int sum = 0;
      for (int j = 0; j <= smax; j++) {
        add = Math.max(add, j - sum);
        sum += ss.charAt(j) - '0';
      }
      System.out.println("Case #" + i + ": " + add);
    }
  }
}
