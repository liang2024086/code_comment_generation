package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1064;

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();

    for (int i = 1; i <= n; ++i) {
      String tok = in.next();
      tok = tok.replaceAll("[+]+", "+");
      tok = tok.replaceAll("[-]+", "-");
      int len = tok.length();
      if (tok.charAt(len-1) == '+')
        len--;
      System.out.println("Case #" + i + ": " + len);
    }
  }
}
