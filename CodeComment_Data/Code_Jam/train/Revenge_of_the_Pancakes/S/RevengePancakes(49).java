package methodEmbedding.Revenge_of_the_Pancakes.S.LYD717;


import java.io.*;
import java.util.*;
public class RevengePancakes {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            String s = in.next();
            int result = 0;
            char lastChar = '+';
            for (int j = s.length()-1; j>=0; --j){
                char nextChar = s.charAt(j);
                if (lastChar != nextChar){
                    ++result;
                    lastChar = nextChar;
                }
            }
            System.out.println("Case #" + i + ": " + result);
        }
        in.close();
    }
}
