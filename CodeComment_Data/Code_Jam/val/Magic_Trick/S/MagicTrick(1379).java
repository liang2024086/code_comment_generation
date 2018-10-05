package methodEmbedding.Magic_Trick.S.LYD1017;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ryandao on 4/12/14.
 */
public class MagicTrick {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();

    for (int i = 1; i <= T; i++) {
      int ans1 = in.nextInt();
      int[] before = new int[4];
      int[] after = new int[4];

      // Scan the before row
      for (int j = 0; j < 4; j++) {
        int nextInt;
        for (int k = 0; k < 4; k++) {
          nextInt = in.nextInt();
          if (j == ans1 - 1) {
            before[k] = nextInt;
          }
        }
      }

      // Scan the after row
      int ans2 = in.nextInt();
      for (int j = 0; j < 4; j++) {
        int nextInt;
        for (int k = 0; k < 4; k++) {
          nextInt = in.nextInt();
          if(j == ans2 - 1) {
            after[k] = nextInt;
          }
        }
      }

      // Check for correct ans
      int overlap = 0;
      int res = 0;
      for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 4; k++) {
          if (before[j] == after[k]) {
            overlap ++;
            res = before[j];
          }
        }
      }

      if (overlap == 0) {
        System.out.println("Case #" + i + ": Volunteer cheated!");
      } else if (overlap == 1) {
        System.out.println("Case #" + i + ": " + res);
      } else {
        System.out.println("Case #" + i + ": Bad magician!");
      }
    }
  }
}
