package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1026;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * 
 * @author amarziali
 */
public class Cookie {

  /**
   * @param args
   */
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(new FileInputStream("d:/in.txt"));
    PrintWriter out = new PrintWriter(new File("d:/out.txt"));
    int numCases = scanner.nextInt();

    for (int i = 0; i < numCases; i++) {
      double farmCost = scanner.nextDouble();
      double cookieIncrement = scanner.nextDouble();
      double target = scanner.nextDouble();
      double actualTime = 0;
      double actualRatio = 2.0;
      while (true) {
        double timeToBuy = actualTime + farmCost / actualRatio;
        double timeToTarget = actualTime + target / actualRatio;
        if (timeToTarget <= timeToBuy) {
          out.println("Case #" + (i + 1) + ": " + timeToTarget);
          break;
        }
        double timeToTargetWithBuy = timeToBuy + target / (actualRatio + cookieIncrement);
        if (timeToTargetWithBuy < timeToTarget) {
          actualTime = timeToBuy;
          actualRatio += cookieIncrement;
        }
        else {
          out.println("Case #" + (i + 1) + ": " + Math.round(timeToTarget * 1e7) / 1e7d);
          break;
        }
      }
    }

    out.close();
    scanner.close();

  }
}
