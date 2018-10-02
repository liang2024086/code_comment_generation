package methodEmbedding.Standing_Ovation.S.LYD2085;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by simonsaffer on 2015-04-11.
 */
public class StandingOvation {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner sc = new Scanner(new File(args[0]));

    int T = sc.nextInt();

    for (int i = 1; i <= T; i++) {

      int N = sc.nextInt()+1;

      String shyness = sc.next();

      /*int[] accum = new int[N];

      accum[0] = Character.getNumericValue(shyness.charAt(0));
      for (int j = 1; j < N; j++) {
        accum[j] = accum[j-1] + Character.getNumericValue(shyness.charAt(j));
      }*/

      int accum = Character.getNumericValue(shyness.charAt(0));
      int result = 0;
      for (int j = 1; j < N; j++) {
        if (accum < j) {
          result += j - accum;
          accum = j;
        }
        accum += Character.getNumericValue(shyness.charAt(j));
      }

      System.out.println("Case #" + i + ": " + result);

    }

  }

}
