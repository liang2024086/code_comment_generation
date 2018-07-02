package methodEmbedding.Revenge_of_the_Pancakes.S.LYD112;

import java.io.*;
import java.util.*;

public class CodeJamB {

  public static void main(String [] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    in.nextLine();
    for (int i = 1; i <= t; i++) {
      String p = in.nextLine();
      char c = p.charAt(0);
      int r = 0;
      for (int j = 1; j < p.length(); j++) {
        if (c != p.charAt(j)) {
          r++;
          c = p.charAt(j);
        }
      }
      if (p.charAt(p.length() - 1) == '-') {
        r++;
      }
      System.out.println("Case #" + i + ": " + r);
    }
  }

}
