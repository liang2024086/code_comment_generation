package methodEmbedding.Revenge_of_the_Pancakes.S.LYD914;

import java.util.*;
import static java.lang.Math.*;

public class BPancakes {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int T = stdin.nextInt();
    for(int testCase = 1; testCase <= T; ++testCase) {
      int count = 0;
      char[] pancakes = stdin.next().toCharArray();

      char happiness = pancakes[0];

      for(int i = 1; i < pancakes.length; ++i) {
        if(pancakes[i] != happiness) {
          happiness = pancakes[i];
          ++count;
        }
      }

      if(happiness == '-')
        ++count;

      System.out.printf("Case #%d: %d\n", testCase, count);
    }
  }
}
