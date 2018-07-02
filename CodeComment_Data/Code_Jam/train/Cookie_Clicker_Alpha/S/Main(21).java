package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1505;

import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);
    int t = 0;
    double c, f, x;
    double curr;
    double ans;
    double t1, t2;
    while (sr.hasNext()) {
      t = sr.nextInt();
      for (int s = 0; s < t; s++) {
        ans = 0;
        c = sr.nextDouble();
        f = sr.nextDouble();
        x = sr.nextDouble();
        curr = 2;
        while (true) {
          t1 = x / curr;
          t2 = x / (curr + f) + c / curr;
          if (t1 >= t2) {
            ans += (c / curr);
            curr += f;
          } else {
            ans += (x / curr);
            break;
          }
        }
        System.out.printf("Case #%d: %.7f\n", s + 1, ans);
      }
    }

    sr.close();
  }
}
