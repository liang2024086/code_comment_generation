package methodEmbedding.Cookie_Clicker_Alpha.S.LYD368;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class CookieClickerAlpha
{
  public static void main(String[] args) throws IOException
  {
    final String BASE_PATH = "/Users/Aman/Desktop/CookieClickerAlpha";

    try (Scanner scanner = new Scanner(Paths.get(BASE_PATH + ".in"));
         PrintWriter writer = new PrintWriter(BASE_PATH + ".out"))
    {
      final int testCaseCount = scanner.nextInt();
      final double initialRate = 2.0;

      for (int i = 1; i <= testCaseCount; ++i)
      {
        double farmCost = scanner.nextDouble();
        double farmRate = scanner.nextDouble();
        double valueToReach = scanner.nextDouble();

        double bestTime = valueToReach;

        int iterationCount = 0;
        while (true)
        {
          double time = 0;
          double currentRate = initialRate;
          for (int j = 0; j < iterationCount; ++j)
          {
            time += farmCost / currentRate;
            currentRate += farmRate;
          }

          time += valueToReach / currentRate;

          if (time > bestTime)
          {
            break;
          }
          else
          {
            bestTime = time;
          }

          ++iterationCount;
        }

        writer.println("Case #" + i + ": " + String.format("%.7f", bestTime));
      }
    }
  }
}
