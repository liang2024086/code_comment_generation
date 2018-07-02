package methodEmbedding.Cookie_Clicker_Alpha.S.LYD9;

/**
 * @author Francis
 * @version 1.0.0
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cookie {

  public static void main(String[] args) {
    int T;
    double C;
    double F;
    double X;
    double increment;
    double time;

    Scanner scan = new Scanner(System.in);
    T = scan.nextInt();

    for (int loop = 1; loop <= T; ++loop) {
      C = scan.nextDouble();
      F = scan.nextDouble();
      X = scan.nextDouble();
      increment = 2.0;
      time = X / increment;
      double farmtime = 0.0;

      while (true) {
        double onemorefarm = farmtime + (C / increment) + (X / (increment + F));
        if (time < onemorefarm) {
          break;
        } else {
          farmtime += C / increment;
          increment += F;
          time = onemorefarm;
        }
      }

      DecimalFormat df = new DecimalFormat("0.0000000");
      String result = df.format(time);
      System.out.println("Case #" + loop + ": " + result);
    }
  }
}
