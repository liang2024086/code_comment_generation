package methodEmbedding.Magic_Trick.S.LYD652;

import java.util.Scanner;

public class magic {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int t;
    if (s.hasNextInt())
      t = s.nextInt();
    else {
      System.out.println("bad input");
      return;
    }
    for (int i = 1; i <= t; i++) {
      int[] validNums = new int[4];
      int row = s.nextInt();
      s.nextLine();

      for (int j = 1; j <= 4; j++) {
        if (j == row) {
          for (int k = 0; k < 4; k++) {
            validNums[k] = s.nextInt();
          }
          s.nextLine();
        }
        else {
          s.nextLine();
        }
      }


      row = s.nextInt();
      s.nextLine();
      boolean found = false;
      boolean broken = false;
      int match = -1;

      for (int j = 1; j <= 4; j++) {
        if (j == row) {
          for (int k = 0; k < 4; k++) {
            int tmp = s.nextInt();
            for (int x : validNums) {
              if (x == tmp && !broken) {
                if (found) {
                  System.out.println("Case #" + i + ": Bad magician!");
                  broken = true;
                  break;
                }
                else {
                  found = true;
                  match = tmp;
                }
              }
            }
          }
          s.nextLine();
        }
        else {
          s.nextLine();
        }
      }

      if (!broken) {
        if (found)
          System.out.println("Case #" + i + ": " + match);
        else
          System.out.println("Case #" + i + ": Volunteer cheated!");
      }
    }
  }
}
