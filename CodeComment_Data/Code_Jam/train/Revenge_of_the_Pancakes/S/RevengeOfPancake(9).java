package methodEmbedding.Revenge_of_the_Pancakes.S.LYD356;

import java.util.*;
import java.io.*;

public class RevengeOfPancake {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int result=0;

            String s = in.next();
            char a=s.charAt(0);
            int k=1;
            while (k<s.length())
            {
               // System.out.println("a="+a);
               if (s.charAt(k)!=a){ result++;}
                a=s.charAt(k);

                k++;
            }
            if (a=='-') result++;
            System.out.println("Case #" + i + ": " + result);
        }
    }
}
