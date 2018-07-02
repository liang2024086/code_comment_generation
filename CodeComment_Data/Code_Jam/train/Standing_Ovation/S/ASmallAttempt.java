package methodEmbedding.Standing_Ovation.S.LYD1102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASmallAttempt {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numCases = Integer.parseInt(br.readLine());
    for (int i = 0; i < numCases; i++) {
      String caseStr = br.readLine();
      String[] parts = caseStr.split(" ");
      int smax = Integer.parseInt(parts[0]);
      int[] shy = new int[smax + 1];
      for (int j = 0; j < parts[1].length(); j++) {
        shy[j] = Integer.parseInt(parts[1].substring(j, j + 1));
      }

      int requiredFriends = 0;
      int peopleStanding = 0;
      for (int j = 0; j < parts[1].length(); j++) {
        if (peopleStanding < j) {
          requiredFriends += j - peopleStanding;
          peopleStanding += j - peopleStanding;
        }
        peopleStanding += shy[j];
      }
      System.out.println("Case #" + (i + 1) + ": " + requiredFriends);
    }
  }
}

