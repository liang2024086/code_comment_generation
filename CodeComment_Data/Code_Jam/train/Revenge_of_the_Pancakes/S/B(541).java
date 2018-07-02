package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1003;

import java.util.*;
public class B {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] ARgS) {
    
    int T = Integer.valueOf(sc.nextLine());
    for(int _case = 1; _case <= T; _case++) {
      
      String line = sc.nextLine();
      int flips = 0;
      
      for(int i = 0; i < line.length();) {
        char c = line.charAt(i);
        boolean isFirstFlip = i == 0;
        if (c == '-') {
          while( i < line.length() && line.charAt(i) == '-')
            i++;
          if (isFirstFlip) {
            flips++;
          } else {
            flips += 2;
          }
        }
        i++;
      }
      System.out.printf("Case #%d: %d\n", _case, flips );
    }


  }
}
