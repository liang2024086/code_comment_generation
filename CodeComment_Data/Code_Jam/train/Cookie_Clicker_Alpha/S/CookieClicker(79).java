package methodEmbedding.Cookie_Clicker_Alpha.S.LYD937;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CookieClicker {

  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(new File("CookieClicker"));
      int cases = scan.nextInt();
      
      for (int i = 0; i < cases; ++i) {
        double C = scan.nextDouble();
        double F = scan.nextDouble();
        double X = scan.nextDouble();
        double cur = 0;
        double curWin = 2;
        double elapsed = 0;
        while (cur < X) {
          double toC = C / curWin;
          double toXViaC = toC + X / (curWin + F);
          double toX = X / curWin;
          if (toXViaC < toX) {
            curWin += F;
            elapsed += toC;
          } else {
            elapsed += toX;
            break;
          }
        }
        System.out.printf("Case #%d: %.7f\n", (i+1), elapsed);
      }
      scan.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
