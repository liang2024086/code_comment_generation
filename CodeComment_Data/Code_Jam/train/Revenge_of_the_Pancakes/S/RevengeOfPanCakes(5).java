package methodEmbedding.Revenge_of_the_Pancakes.S.LYD703;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class RevengeOfPanCakes {

  public static void main(String[] args) {
    try (InputStreamReader isr = new InputStreamReader(new FileInputStream("inputs/BSmall.txt")); BufferedReader br = new BufferedReader(isr);) {
      int t = Integer.parseInt(br.readLine());

      for (int i = 0; i < t; i++) {
        String testCase = br.readLine();
        int count = 0;
        int ind = testCase.indexOf("-");

        // ++-----
        if (ind > 0)
          count++;

        // all + in starting are skipped
        while (ind > -1) {
          // increase the count as it has a minus
          count++;
          int plusIndex = testCase.indexOf("+", ind);
          if (plusIndex == -1) {
            break;
          } else {
            ind = testCase.indexOf("-", plusIndex);
            if (ind > -1)
              count++;// need to increase twice if we have a - after +
          }
        }


        System.out.println("Case #" + (i + 1) + ": " + count);
      }

    } catch (Exception ex) {
    }

  }

}
