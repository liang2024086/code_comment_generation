package methodEmbedding.Cookie_Clicker_Alpha.S.LYD550;

import java.util.*;

class Cookie
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int cases = scan.nextInt();

    double C, F, X, rate, time;

    for(int x = 1; x <= cases; x++)
    {
      C = scan.nextDouble();
      F = scan.nextDouble();
      X = scan.nextDouble();

      rate = 2.0;
      time = 0.0;

      while(X/rate > (C/rate + (X/(rate+F))))
      {
        time += C/rate;
        rate += F;
      }

      time += X/rate;

      System.out.printf("Case #%d: %.7f\n", x, time);
    }
  }
}
