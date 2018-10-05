package methodEmbedding.Magic_Trick.S.LYD1939;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class MagicTrick {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new File("MagicTrick.in"));
    PrintWriter out = new PrintWriter(new File("MagicTrick.out"));
    int cases = in.nextInt();
    for (int co = 1; co <= cases; co++) {
      int g = in.nextInt() - 1;
      TreeSet<Integer> s = new TreeSet<Integer>();
      for (int r = 0; r < 4; r++)
        for (int c = 0; c < 4; c++)
          if (g == r) s.add(in.nextInt());
          else in.nextInt();
      g = in.nextInt() - 1;
      TreeSet<Integer> t = new TreeSet<Integer>();
      for (int r = 0; r < 4; r++)
        for (int c = 0; c < 4; c++)
          if (g == r) t.add(in.nextInt());
          else in.nextInt();

      t.retainAll(s);
      if (t.size() == 1) {
        out.printf("Case #%d: %d\n", co, t.first());
      } else if (t.size() != 0) {
        out.printf("Case #%d: Bad magician!\n", co);
      } else {
        out.printf("Case #%d: Volunteer cheated!\n", co);
      }
    }
    out.close();
  }
}
