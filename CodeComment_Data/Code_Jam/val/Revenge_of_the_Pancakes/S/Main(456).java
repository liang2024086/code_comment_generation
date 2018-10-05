package methodEmbedding.Revenge_of_the_Pancakes.S.LYD830;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    in.nextLine();
    for (int i = 1; i <= t; i++) {
      String stack = in.nextLine();
      
      int flips = 0;
      char c = '+';
      for (int n = 1; n <= stack.length(); n++) {
        if(stack.charAt(stack.length() - n) != c) {
          flips++;
        }
        c = stack.charAt(stack.length() - n);
      }
      System.out.println("Case #" + i + ": " + flips);
    }
  }
}
