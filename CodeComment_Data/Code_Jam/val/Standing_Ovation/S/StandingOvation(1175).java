package methodEmbedding.Standing_Ovation.S.LYD441;

import java.util.*;

public class StandingOvation{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int t=0; t<T; t++) {
      sc.next();
      String str = sc.next();
      int count = 0;
      int people = 0;
      for(int i=0; i<str.length(); i++) {
        char c = str.charAt(i);
        int p = Integer.parseInt(""+c);
        if (p==0) continue;
        if (people >= i) {
          people += p;
        }else {
          count += (i-people);
          people += count;
          people += p;
        }
      }
      System.out.println("Case #" + (t+1) + ": " + count);
    }
  }
}
