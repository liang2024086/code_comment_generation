package methodEmbedding.Counting_Sheep.S.LYD1033;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String [] args) throws Exception {
    Scanner sc = new Scanner(new File("a.in"));
    PrintWriter out = new PrintWriter(new FileWriter("a.out"));
    int T = sc.nextInt();
    int cs = 1;

    while (cs <= T) {
      long n = sc.nextLong();
      out.print("Case #" + cs + ": ");
      if (n == 0) {
        out.println("INSOMNIA");
        cs++;
        continue;
      }
      Set<Integer> s = new TreeSet<Integer>();
      for (long i = 1; i <= 10000000; ++i) {
        long x = i * n;
        while (x > 0) {
          s.add((int)x % 10);
          x /= 10;
        }
        if (s.size() > 9) {
          out.println(i * n);
          break;
        }
      }
      if (s.size() <= 9) out.println("INSOMNIA");
      cs++;
    }
    out.close();
  }
}
