package methodEmbedding.Standing_Ovation.S.LYD951;

import java.util.Scanner;

public class A {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int T = in.nextInt();

    for (int i = 0; i < T; i++) {
      
      int frnds = 0;
      int aud = 0;

      int smax = in.nextInt();
      char[] si = in.next().toCharArray();

      for (int j = 0; j <= smax; j++) {
        if (aud < j) {
          frnds++;
          aud++;
        }
        
        aud += Character.getNumericValue(si[j]);
      }
      
      System.out.format("Case #%d: %d\n", (i + 1), frnds);
      
    }
    in.close();
  }
}
