package methodEmbedding.Standing_Ovation.S.LYD659;

import java.util.Scanner;

public class StandingOvation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numTestCases = sc.nextInt();
    int caseNum = 0;

    while (caseNum++ < numTestCases) {
      int Smax = sc.nextInt();
      char[] SlevelsCh = sc.next().toCharArray();
      int[] Slevels = new int[Smax+1];
      for (int i = 0; i < Smax + 1; i++)
        Slevels[i] = SlevelsCh[i] - '0';
      
      int optimalCount = 0;
      int currentCount = 0;
      for (int level = 0; level < Smax + 1; level++) {
        while ((Slevels[level] != 0) && (currentCount < level)) {
          optimalCount += 1;
          currentCount += 1;
        }

        if ((Slevels[level] != 0) && (currentCount >= level)) {
          currentCount += Slevels[level];
        }
      }

      System.out.printf("Case #%d: %d\n", caseNum, optimalCount);
    }
  }
}
