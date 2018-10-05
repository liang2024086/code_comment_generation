package methodEmbedding.Standing_Ovation.S.LYD1933;

import java.util.Scanner;

public class StandingOvation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numTests = scanner.nextInt();
    for (int testNum = 1; testNum <= numTests; ++testNum) {
      int shyest = scanner.nextInt();
      String sequence = scanner.next();

      int numPeople = 0;
      int numFriendsToBring = 0;
      for (int i = 0; i <= shyest; ++i) {
        int extraFriends = 0;
        if (numPeople < i) {
          extraFriends = i - numPeople;
        }
        numFriendsToBring += extraFriends;
        numPeople += Character.getNumericValue(sequence.charAt(i)) +
            extraFriends;
      }

      System.out.format("Case #%d: %d%n", testNum, numFriendsToBring);
    }
  }
}
