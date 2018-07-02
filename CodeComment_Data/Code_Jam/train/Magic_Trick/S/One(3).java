package methodEmbedding.Magic_Trick.S.LYD744;


import java.util.Scanner;

public class One {

  public static void main (String args[]) {
    int row1, row2;
    int[] set1 = new int[4];
    int x;
    Scanner in = new Scanner(System.in);
    int nTests;
    nTests = in.nextInt();
    for (int i = 0; i < nTests; i++) {
      int res = 0; // 0: not found, 100: multiple
      row1 = in.nextInt();
      for (int r = 0; r < 4; r++) {
        if (r != row1 - 1) {
          for (int c = 0; c < 4; c++) {
            in.nextInt();
          }
        } else {
          for (int c = 0; c < 4; c++) {
            set1[c] = in.nextInt();
          }
        }
      }
      row2 = in.nextInt();
      for (int r = 0; r < 4; r++) {
        if (r != row2 - 1) {
          for (int c = 0; c < 4; c++) {
            in.nextInt();
          }
        } else {
          for (int c = 0; c < 4; c++) {
            x = in.nextInt();
            for (int k = 0; k < 4; k++) {
              if (x == set1[k]) {
                if (res != 0) {
                  res = 100;
                } else {
                  res = x;
                }
              }
            }
          }
        }
      }

      if (res == 0) {
        System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
      } else if (res == 100) {
        System.out.println("Case #" + (i + 1) + ": Bad magician!");
      } else {
        System.out.println("Case #" + (i + 1) + ": " + res);
      }
    }
    return;
  }
}
