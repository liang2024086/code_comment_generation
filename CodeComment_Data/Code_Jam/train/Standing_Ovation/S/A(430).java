package methodEmbedding.Standing_Ovation.S.LYD1361;

import java.util.*;

class A {
  public static void main(String[] arg) {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    for (int i =1; i <=t; ++i) {
      int n = s.nextInt();
      int seen = 0;
      int ans = 0;
      String inp = s.next();
      for(int j = 0; j <= n; j++) {
        char c = inp.charAt(j);
        int ci = c - '0';

        if (ci != 0) {
          if (seen < j) {
            ans += j - seen;
            seen += j - seen;
          }
        }
        seen += ci;
      }
      System.out.println("Case #"+i+ ": " + ans);
    }
  }
}
