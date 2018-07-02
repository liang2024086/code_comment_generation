package methodEmbedding.Standing_Ovation.S.LYD957;

import java.util.Scanner;

public class StandingOvation {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int TEST_CASES = stdin.nextInt();
    for(int caseNumber = 1; caseNumber <= TEST_CASES; ++caseNumber) {
      int peopleNeeded = 0;
      int peopleStanding = 0;
      stdin.nextInt(); //ignore smax
      char[] shyness = stdin.next().toCharArray();

      for(int i = 0; i < shyness.length; ++i) {
        if(peopleStanding < i) {
          int deltaPeople = i - peopleStanding;
          peopleNeeded += deltaPeople;
          peopleStanding += deltaPeople;
        }
        peopleStanding += shyness[i] - '0';
      }

      System.out.println("Case #" + caseNumber + ": " + peopleNeeded);
    }
  }
}
