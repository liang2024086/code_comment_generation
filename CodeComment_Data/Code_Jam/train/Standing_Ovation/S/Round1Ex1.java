package methodEmbedding.Standing_Ovation.S.LYD2062;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * 
 * @author amarziali
 */
public class Round1Ex1 {

  /**
   * @param args
   */
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(new File("d:/in.txt"));
    PrintWriter out = new PrintWriter("d:/out.txt");
    int caseno = in.nextInt();
    in.nextLine();
    for (int i = 0; i < caseno; i++) {
      in.nextInt();
      // int[] shies = new int[shymax + 1];
      String tmp = in.nextLine().trim();
      int friends = 0;
      int actuals = 0;
      for (int j = 0; j < tmp.length(); j++) {
        int current = Integer.parseInt(tmp.subSequence(j, j + 1).toString());
        // friends = friends + ();
        if (actuals < j) {
          // add friend here
          int delta = (j - actuals);
          friends += delta;
          actuals += delta;
        }
        actuals += current;
      }
      out.println("Case #" + (i + 1) + ": " + friends);

    }
    out.close();
    in.close();
  }
}
