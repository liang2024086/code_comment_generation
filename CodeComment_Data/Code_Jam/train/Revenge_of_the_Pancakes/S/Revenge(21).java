package methodEmbedding.Revenge_of_the_Pancakes.S.LYD439;

import java.util.*;
import java.io.*;

public class Revenge {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  public static void main(String[] args) throws IOException {

    int t = Integer.valueOf(br.readLine());
     
    for (int i = 1; i <= t; i++) {

      String str = br.readLine();
      int count = 0;
      char prev = str.charAt(0);
      for (char ch : str.toCharArray()) {
        if (ch != prev) {
          count++;
          prev = ch;
        }
      }
      if (prev != '+')
        count++;

      System.out.printf("Case #%d: %d\n", i, count);


    }
  
  }

}
