package methodEmbedding.Standing_Ovation.S.LYD1830;

import java.util.Scanner;

public class Prima {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int t = kb.nextInt();
    int c = 1;
    String ans = "";
    while (t > 0) {
      int all = 0;
      int plus = 0;
      int m = kb.nextInt();
      String a = kb.next();
      int i = 0;
      while (i < a.length()) {
        String ac = a.substring(i, i + 1);
        int s = Integer.parseInt(ac);
          while(all < i) {
          all++;
          plus++;
           }
          all += s;
          i++;
          }
       ans += "Case #"+c+":"+" "+plus+"\n";
       t--;
       c++;
       }
   System.out.println(ans);

  }
}
