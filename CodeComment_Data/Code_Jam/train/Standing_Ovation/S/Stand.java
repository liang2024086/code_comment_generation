package methodEmbedding.Standing_Ovation.S.LYD1869;

import java.util.*;

public class Stand {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numTests = Integer.parseInt(input.nextLine());
    for (int t = 0; t < numTests; t++) {
      int maxShy = Integer.parseInt(input.next());
      char[] audienceChar = input.next().trim().toCharArray();
      int[] audience = new int[audienceChar.length];
      for (int i = 0; i < audience.length; i++) {
        audience[i] = Character.getNumericValue(audienceChar[i]);
      }


      int inviteCounter = 0;
      int peopleStanding = audience[0];
      for (int i = 1; i < audience.length; i++) {
        if (audience[i] != 0 && i > peopleStanding) {
          inviteCounter += i - peopleStanding;
          peopleStanding += i - peopleStanding;
          //System.out.println("i: " + i + " Adding " + (i-peopleStanding));
        }
        peopleStanding += audience[i];
      }

      System.out.println("Case #" + (t+1) + ": " + inviteCounter);
    }
  }
}
