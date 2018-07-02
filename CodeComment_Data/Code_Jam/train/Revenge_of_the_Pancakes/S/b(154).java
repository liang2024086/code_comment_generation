package methodEmbedding.Revenge_of_the_Pancakes.S.LYD691;

import java.util.*;
import java.io.*;

public class b {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for(int i = 1; i <= t; ++i) {
      String stack = in.next();
      int count = 0;
      char comp = stack.charAt(0);
      for(int j=1;j<stack.length();j++){
        if(stack.charAt(j)!=comp){
          comp = stack.charAt(j);
          count++;
        }
      }
      if(comp=='-') count++;
      System.out.println("Case #" + i + ": " + count);
    }
  }
}
