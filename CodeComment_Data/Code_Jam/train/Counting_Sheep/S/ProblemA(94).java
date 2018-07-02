package methodEmbedding.Counting_Sheep.S.LYD811;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProblemA {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt() + 1;
        for (int i = 1 ; i < N ; i++) {
    			   long num = in.nextLong();
             if (num == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
                continue;
             }
             Set<Character> set = new HashSet<Character>();
             long mult = 0;
             while (set.size() != 10) {
                mult += num;
                char[] ar = (mult + "").toCharArray();
                for (char c : ar)
                  set.add(c);
             }
    			   System.out.println("Case #" + i + ": " + mult);
        }
		    in.close();
    }
}
