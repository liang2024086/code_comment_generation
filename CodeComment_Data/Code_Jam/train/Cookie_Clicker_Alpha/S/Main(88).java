package methodEmbedding.Cookie_Clicker_Alpha.S.LYD905;

import java.util.*;

public class Main{
  static final double EPS = 0.000001;
  static final String ANSWER = "Case #%d: %.7f\n";
  
  public static void main(String args[]) throws Exception {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int t = 1; t <= T; t++) {
      double c = in.nextDouble();
      double f = in.nextDouble();
      double x = in.nextDouble();
      double ans = 0.0;
      double num = 2.0;
      
      if ((c-x) > -EPS) {
        ans = x / 2.0;
      } else {
        double y = c / f;
        while (y - (x - c) / num < EPS) {
          ans += c / num;
          num += f;
        }
        ans += x / num;
      }
      
      System.out.printf(ANSWER, t, ans);
    }
  }
}
