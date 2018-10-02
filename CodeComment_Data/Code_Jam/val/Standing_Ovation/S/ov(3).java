package methodEmbedding.Standing_Ovation.S.LYD131;

import java.util.*;

public class ov {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int ii=1;ii<=T;ii++) {
      int ans = 0;
      int sum = 0;
      int S = sc.nextInt();
      String inp = sc.next();
      for(int i=0;i<inp.length();i++) {
        if(sum < i) {
          int diff = i - sum;
          sum += diff;
          ans += diff;
        }
        sum += Integer.parseInt("" + inp.charAt(i));
      }

      System.out.printf("Case #%d: %d\n", ii, ans);
    }


  }

}
