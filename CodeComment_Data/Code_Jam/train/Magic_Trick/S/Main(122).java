package methodEmbedding.Magic_Trick.S.LYD641;

import java.util.*;

public class Main{
  static final String ANSWER = "Case #%d: %d\n";
  static final String BADMAG = "Case #%d: Bad magician!\n";
  static final String VOLCHT = "Case #%d: Volunteer cheated!\n";
  
  public static void main(String args[]) throws Exception {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int t = 1; t <= T; t++) {
      int row1 = in.nextInt()-1;
      int[][] arr1 = new int[16][16];
      for (int r = 0; r < 4; r++) {
        for (int c = 0; c < 4; c++) {
          arr1[r][c] = in.nextInt();
        }
      }
      
      int row2 = in.nextInt()-1;
      int[][] arr2 = new int[16][16];
      for (int r = 0; r < 4; r++) {
        for (int c = 0; c < 4; c++) {
          arr2[r][c] = in.nextInt();
        }
      }
      
      int cnt = 0;
      int ans = -1;
      for (int c1 = 0; c1 < 4; c1++) {
        for (int c2 = 0; c2 < 4; c2++) {
          if (arr1[row1][c1] == arr2[row2][c2]) {
            cnt++;
            ans = arr1[row1][c1];
          }
        }
      }
      
      if (cnt == 1) {
        System.out.printf(ANSWER, t, ans);
      } else if (cnt == 0) {
        System.out.printf(VOLCHT, t);
      } else {
        System.out.printf(BADMAG, t);
      }
    }
  }
}
