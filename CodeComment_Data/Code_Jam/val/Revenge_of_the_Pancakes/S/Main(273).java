package methodEmbedding.Revenge_of_the_Pancakes.S.LYD326;


import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
        String n = in.next();
        int ans = 0;
        for(int k = 0; k < n.length();){
            boolean a = false;
            while (k < n.length() && n.charAt(k) == '-'){
                k++;
                a = true;
            }
            if(a)
                ++ans;
            while (k < n.length() && n.charAt(k) == '+'){
                ++k;
            }
            ++ans;
        }
        System.out.println("Case #" + i + ": " + --ans);
    }
  }
}
