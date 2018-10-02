package methodEmbedding.Magic_Trick.S.LYD151;

import java.util.Scanner;

public class MagicTrick {

  public static void main(String[] args) {
    int T;
    int first;
    int second;
    int[][] gf = new int[4][4];
    int[][] gs = new int[4][4];

    Scanner scan = new Scanner(System.in);
    T = scan.nextInt();

    for (int loop = 1; loop <= T; ++loop) {
      // read input
      first = scan.nextInt();
      for (int i = 0; i < 4; ++i) {
        for (int j = 0; j < 4; ++j) {
          gf[i][j] = scan.nextInt();
        }
      }

      second = scan.nextInt();
      for (int i = 0; i < 4; ++i) {
        for (int j = 0; j < 4; ++j) {
          gs[i][j] = scan.nextInt();
        }
      }

      // solve
      int arr[] = new int[17];
      for (int i = 0; i < 4; ++i) {
        arr[gf[first-1][i]]++;
        arr[gs[second-1][i]]++;
      }

      int cnt = 0;
      int result = 0;
      for (int i = 1; i < 17; ++i) {
        if (arr[i] == 2) {
          cnt++;
          result = i;
        }
      }

      if (cnt == 0) {
        System.out.println("Case #" + loop + ": Volunteer cheated!");
      } else if (cnt == 1) {
        System.out.println("Case #" + loop + ": " + result);
      } else {
        System.out.println("Case #" + loop + ": Bad magician!");
      }
    }
  }
}
