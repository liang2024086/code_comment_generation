package methodEmbedding.Counting_Sheep.S.LYD1418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingSheep {
  @SuppressWarnings("resource")
  public static void main(String[] args) throws IOException {
    int small = 200;
    int big = 1000000;
    Scanner scanner = null;
    
    try {
      scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      int t = scanner.nextInt();
      List<Character> listofDigits = null;
      if (t >= 1 && t <= 100) {
        for (int m = 1; 1 <= t; t--, m++) {
          int n = scanner.nextInt();

          if (n >= 0 && n <= small) {
            if (n == 0) {
              System.out.println("Case #" + m + ": INSOMNIA");
            }
            else {
              listofDigits = new ArrayList<Character>(10);
              
              for (int i = 1; n > 0; i++) {
                int x =i*n;
                String str = Integer.toString(x);
                for (int y = 0; y < str.length(); y++) {
                  char digit = str.charAt(y);
                  if (!listofDigits.contains(digit)) {
                    listofDigits.add(digit);
                    if (listofDigits.size() == 10) {
                      break;
                    }
                  }

                }
                if (listofDigits.size() == 10) {
                  System.out.println("Case #" + m + ": " + x);
                  break;
                }
              }
            }
          }
        }

      }
    }
    catch (Exception ex) {
      System.out.println(ex);
    }

  }
}
