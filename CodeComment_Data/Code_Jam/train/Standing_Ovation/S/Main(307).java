package methodEmbedding.Standing_Ovation.S.LYD868;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      for (int t = 1, T = s.nextInt(); t <= T; ++t) {
        int shynessLevelMax = s.nextInt();
        String line = s.next();
        int additionalFriends = 0;
        for (int shynessLevel = 0, standingSum = 0; shynessLevel <= shynessLevelMax; ++shynessLevel) {
          int numOfShynessLevel = line.charAt(shynessLevel) - '0';
          if (standingSum < shynessLevel) {
            int needToAdd = shynessLevel - standingSum;
            additionalFriends += needToAdd;
            standingSum += needToAdd;
          }
          standingSum += numOfShynessLevel;
        }
        System.out.printf("Case #%d: %d\n", t, additionalFriends);
      }
    }
  }
}
