package methodEmbedding.Cookie_Clicker_Alpha.S.LYD899;

import java.util.*; // for the haxing

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int iterations = in.nextInt();
    for (int i = 1; i <= iterations; i++) {

      // Get parameters
      double c = in.nextDouble();
      double f = in.nextDouble();
      double x = in.nextDouble();

      // Gotta start somewhere
      double t = Double.POSITIVE_INFINITY;

      // Zero farms
      double newT = x/2;

      // This curve will have one minimum: find it
      for (int j=1; newT < t; j++) {
        t = newT;
        newT = x/(j*f + 2); // The time after buying i farms
        for (int k = 0; k < j; k++) {
          newT += c/(2 + k*f); // Time to buy farms
        }
      }

      // Print minimum time
      System.out.format("Case #%d: %.7f\n", i, t);
    }
  }
}
