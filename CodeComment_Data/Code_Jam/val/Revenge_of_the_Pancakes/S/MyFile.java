package methodEmbedding.Revenge_of_the_Pancakes.S.LYD398;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFile {
  private static final Path INPATH = Paths.get("/Users/mkobit/Downloads/B-small-attempt0.in");

  public static void main(String[] args) throws IOException {
    try(final BufferedReader bufferedReader = Files.newBufferedReader(INPATH)) {

      final int nCases = Integer.parseInt(bufferedReader.readLine());

      for (int caseNumber = 1; caseNumber <= nCases; caseNumber++) {
        int flips = 0;
        String pancakes = bufferedReader.readLine();
        boolean previousHappy = pancakes.charAt(0) == '+';
        int atIndex = 1;

        while (atIndex < pancakes.length()) {
          if (pancakes.charAt(atIndex) != (previousHappy ? '+' : '-')) {
            previousHappy = !previousHappy;
            flips++;
          }
          atIndex++;
        }
        if (!previousHappy) flips++;
        System.out.println("Case #" + caseNumber + ": " + flips);
      }
    }
  }
}
