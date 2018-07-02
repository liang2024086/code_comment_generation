package methodEmbedding.Cookie_Clicker_Alpha.S.LYD210;

import java.util.*;
import java.io.*;

public class CookieClickerAlpha {
  private Scanner in;

  public CookieClickerAlpha() {
    in = new Scanner(System.in);

    int T = in.nextInt();

    for (int i = 1; i <= T; i++) {
      double C = in.nextDouble();
      double F = in.nextDouble();
      double X = in.nextDouble();

      long num = (long) ((F * X - 2.0 * C) / (F * C));

      double elapsed = 0.0;

      for (long j = 0; j < num; j++) {
        elapsed += C / (2.0 + j * F);
      }

      if (num < 0) num = 0;

      elapsed += X / (2.0 + num * F);

      System.out.println("Case #" + i + ": " + elapsed);
    }
  }

  public static void main(String[] args) {
    new CookieClickerAlpha();
  }
}
