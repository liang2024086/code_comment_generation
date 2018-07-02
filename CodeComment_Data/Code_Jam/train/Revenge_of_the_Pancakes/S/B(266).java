package methodEmbedding.Revenge_of_the_Pancakes.S.LYD327;

import java.util.Scanner;

public class B {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int cases = input.nextInt();
    input.nextLine();

    for (int i = 0; i < cases; i++) {
      int flips = 0;
      String s = input.nextLine();
      int length = s.length();
      int count = length - s.replace("-", "").length();
      while (count > 0) {
        flips++;
        String required = "";
        String replace = "";
        if (s.charAt(0) == '+') {
          required = "-";
          replace = "+";
        }
        else {
          required = "+";
          replace = "-";
        }
        int m = s.indexOf(required);
        if (m == -1) {
          break;
        }
        s = s.substring(0, m).replace(replace, required).concat(s.substring(m));

        count = length - s.replace("-", "").length();
      }

      int printNo = i + 1;
      System.out.println("Case #" + printNo + ": " + flips);
    }

    input.close();

  }

}
