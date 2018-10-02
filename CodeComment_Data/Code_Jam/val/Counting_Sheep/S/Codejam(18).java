package methodEmbedding.Counting_Sheep.S.LYD1307;


import java.util.Scanner;

public class Codejam {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int T = s.nextInt();
    for (int k = 1; k <=T; k++) {
      int N = s.nextInt();
      if (N == 0) {
        System.out.println("Case #" + k + ": INSOMNIA");
        continue;
      }
      boolean nums[] = new boolean[10];
      for (int i = 0; i < 10; i++) nums[i] = false;
      int total = 0;
      int i = 0;
      while (total < 10) {
        i++;
        String ns = String.valueOf(i * N);
        for (int j = 0 ; j < ns.length() ; j++) {
          char c = ns.charAt(j);
          if (!nums[c - '0']) {
            nums[c - '0'] = true;
            total++;
          }
        }
      }
      System.out.println("Case #" + k + ": " + i * N);
    }
  }

}
