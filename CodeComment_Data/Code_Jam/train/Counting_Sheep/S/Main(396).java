package methodEmbedding.Counting_Sheep.S.LYD1299;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
          int n = in.nextInt();
          
          if (n == 0) {
              System.out.println("Case #" + i + ": INSOMNIA");
              continue;
          }
          
          Set<Integer> set = new HashSet<Integer>();
          
          int iter = 0;
          int num = n;
          
          while (set.size() < 10) {
              if (iter != 0) {
                  num = iter * n;
              }
              String numstr = Integer.toString(num);
              for (int j = 0; j < numstr.length(); j++) {
                  int digit = Character.getNumericValue(numstr.charAt(j));
                  set.add(digit);
              }
              iter++;
          }
          
          
          System.out.println("Case #" + i + ": " + (num));
        }
        in.close();
    }

}
