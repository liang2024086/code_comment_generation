package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1213;


import java.io.*;
import java.util.*;

public class b {

  public static void main(String[] args) throws Exception{
    Scanner inf = new Scanner(new FileReader("in.txt"));
    int nn = inf.nextInt();
    for (int ii = 0; ii < nn; ii++) {
      double c = inf.nextDouble();
      double f = inf.nextDouble();
      double x = inf.nextDouble();
      double cur = 2.0;
      double time = 0;
      double ans = x / 2.0;
      while (true) {
        time += c / cur;
        cur += f;
        if (ans > time + x / cur) ans = time + x / cur; else break;
      }
      //System.out.format("%.7f\n", ans);
      System.out.format("Case #%d: %.7f\n", (ii+1), ans);
    }
    inf.close();
  }

}
