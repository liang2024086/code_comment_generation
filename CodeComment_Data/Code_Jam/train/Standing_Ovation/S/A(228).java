package methodEmbedding.Standing_Ovation.S.LYD1149;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner in = new Scanner(new File("A-small-attempt0.in"));
    PrintWriter out = new PrintWriter(new File("A-small-attempt0.out"));

    int T = in.nextInt();
    for (int t = 1; t <= T; t++) {
      in.nextInt();
      char c[] = in.next().toCharArray();

      int peopleUp = Integer.parseInt(c[0] + "");
      int peopleNeeded = 0;
      for (int i = 1; i < c.length; i++) {
        Integer need = Integer.parseInt(c[i] + "");
        if (peopleUp <= i) {
          int get = i - peopleUp;
          peopleNeeded += get;
          peopleUp += get;
        }

        peopleUp += need;
      }
      out.println("Case #" + t + ": " + peopleNeeded);
    }

    out.close();
  }

}
