package methodEmbedding.Magic_Trick.S.LYD1810;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class A {

  public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter(System.out);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String x = br.readLine();
    int n = Integer.parseInt(x);

    for (int k = 0; k < n; k++) {
      x = br.readLine();
      int a1 = Integer.parseInt(x) - 1;

      int[][] m1 = new int[4][4];

      for (int i = 0; i < 4; i++) {
        x = br.readLine();
        String[] xx = x.split(" ");
        for (int j = 0; j < xx.length; j++) {
          m1[i][j] = Integer.parseInt(xx[j]);
        }
      }
      x = br.readLine();
      int a2 = Integer.parseInt(x) - 1;

      int[][] m2 = new int[4][4];

      for (int i = 0; i < 4; i++) {
        x = br.readLine();
        String[] xx = x.split(" ");
        for (int j = 0; j < xx.length; j++) {
          m2[i][j] = Integer.parseInt(xx[j]);
        }
      }


      //
      int ans = -1;
      String r = "Volunteer cheated!";
      for (int t = 1; t <= 16; t++) {
        boolean good = false;
        for (int j = 0; j < 4; j++) {
          if (m1[a1][j] == t) {
            good = true;
          }
        }
        if (!good) {
          continue;
        }
        good = false;
        for (int j = 0; j < 4; j++) {
          if (m2[a2][j] == t) {
            good = true;
          }
        }
        if (good) {
          if (ans == -1) {
            r = "" + t;
            ans = t;
          } else {
            r = "Bad magician!";
            break;
          }
        }
      }
      System.out.println("Case #" + (k + 1) + ": " + r);
    }


  }
}
