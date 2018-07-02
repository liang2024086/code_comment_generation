package methodEmbedding.Standing_Ovation.S.LYD394;

import java.util.Scanner;

public class StandingOvation {

  public static void main(String arg[]) {

    try (final Scanner s = new Scanner(System.in)) {
      final int ntc = s.nextInt();
      for(int tci = 1; tci <= ntc; tci++) {
        final int smax = s.nextInt();
        final String sss = s.nextLine().trim();
        final int[] ss = new int[smax+1];
        for(int si = 0; si < ss.length; si++)
          ss[si] = sss.charAt(si) - '0';
        int counter = ss[0];
        int ti = 0;
        for(int si = 1; si < ss.length; si++) {
          if(si > counter) {
            ti += si - counter;
            counter += si - counter;
          }
          counter += ss[si];
        }
        System.out.println("Case #" + tci + ": " + ti);
      } 
    }
  }
}
