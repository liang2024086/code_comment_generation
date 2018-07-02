package methodEmbedding.Counting_Sheep.S.LYD1644;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    Set<Character> set = new HashSet<Character>();
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      int n = in.nextInt();
      int sleep = n;
      if(n == 0) {
        System.out.println("Case #" + i + ": " + "INSOMNIA");
      }
      else {
        int count = 1;
        while(set.size() != 10){
            sleep = n*count;
            System.out.println(sleep);
            String number = String.valueOf(sleep);
            for(int j = 0; j < number.length(); j++) {
                char current = number.charAt(j);
                set.add(current);
            }
            count++;
        }
        System.out.println("Case #" + i + ": " + sleep);
      }
    }
  }
}
