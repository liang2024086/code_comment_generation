package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1128;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
        String stack = in.next();
        int result = 1;
        char prevState = stack.charAt(0);
        for (int j = 1; j < stack.length(); j++) {
            if(stack.charAt(j) == prevState)
                continue;
            result += 1;
            prevState = stack.charAt(j);
        }
        if(stack.charAt(stack.length() - 1) == '+')
            result -= 1;
      System.out.println("Case #" + i + ": " + result);
    }
  }
}
