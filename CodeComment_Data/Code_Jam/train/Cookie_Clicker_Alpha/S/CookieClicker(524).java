package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1539;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClicker {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new File("CookieClicker.in"));
    PrintWriter out = new PrintWriter(new File("CookieClicker.out"));
    int cases = in.nextInt();
    for (int co = 1; co <= cases; co++) {
      double c = in.nextDouble();
      double f = in.nextDouble();
      double x = in.nextDouble();

      double min = x / 2;
      double r = 2;
      // this is probably enough farms:
      int maxFarms = (int) 1e7;
      double time = 0;
      for (int farmsToBuy = 1; ; farmsToBuy++) {
        double timeToBuy = c / r;
        time += timeToBuy;
        if (time >= min) break;
        r += f;
        double ansTime = time + (x / r);
        if (ansTime < min) min = ansTime;
      }

      System.out.printf("Case #%d: %.7f\n", co, min);
      out.printf("Case #%d: %.7f\n", co, min);
    }
    out.close();
  }
}
