package methodEmbedding.Standing_Ovation.S.LYD315;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandingOvation {

    public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int tests = Integer.parseInt(br.readLine());

      for (int t = 0; t < tests; t++)  {
        String inputLine = br.readLine().split(" ")[1];
        int extraPeople = 0;
        int peopleStanding = 0;
        for (int i = 0; i < inputLine.length(); i++) {
          int people = Character.getNumericValue(inputLine.charAt(i));
          if (people == 0) continue;

          if (peopleStanding < i) {
            extraPeople += i - peopleStanding;
            peopleStanding += i - peopleStanding;
          }
          peopleStanding += people;
        }

        System.out.printf("Case #%d: %d\n", t+1, extraPeople);
      }

    }
}
