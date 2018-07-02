package methodEmbedding.Counting_Sheep.S.LYD612;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class MyFile {
  private static final Path INPATH = Paths.get("/Users/mkobit/Downloads/A-small-attempt0.in");

  public static void main(String[] args) throws IOException {
    final BufferedReader bufferedReader = Files.newBufferedReader(INPATH);
    final int nCases = Integer.parseInt(bufferedReader.readLine());

    for (int caseNumber = 1; caseNumber <= nCases; caseNumber++) {
      final BigInteger increment = new BigInteger(bufferedReader.readLine());
      if (increment.equals(BigInteger.ZERO)) {
        System.out.println("Case #" + caseNumber + ": INSOMNIA");
        continue;
      }
      final Set<Integer> numbers = new HashSet<>();

      BigInteger accumulator = BigInteger.ZERO;
      while (numbers.size() != 10) {
        accumulator = accumulator.add(increment);

        accumulator.toString().chars()
            .forEach(numbers::add);
      }
      System.out.println("Case #" + caseNumber + ": " + accumulator);
    }

  }
}
