package methodEmbedding.Standing_Ovation.S.LYD1026;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Problem1 {
  public static void main(String[] args) throws Exception {
    final Scanner scanner = new Scanner(new File("Google/input.txt"));
    final BufferedWriter writer = new BufferedWriter(new FileWriter("Google/output.txt"));
    final int T = scanner.nextInt();
    for (int t = 1; t <= T; t++) {
      final int Smax = scanner.nextInt();
      final String S = scanner.next();
      int standers = 0;
      int extras = 0;
      for (int i = 0; i < S.length(); i++) {
        final int Si = Integer.parseInt(S.substring(i, i+1));
        if (standers >= i) {
          standers += Si;
        } else {
          final int needed = i - standers;
          extras += needed;
          standers += needed + Si;
        }
      }
      writer.write("Case #" + t + ": " + extras + '\n');
    }
    writer.close();
    scanner.close();
  }
}
