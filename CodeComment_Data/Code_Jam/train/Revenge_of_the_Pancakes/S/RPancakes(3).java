package methodEmbedding.Revenge_of_the_Pancakes.S.LYD534;


import java.io.*;
import java.util.*;

class RPancakes {

    public static void main(String[] args) {
        Scanner lec = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = lec.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        String input;
        for (int j = 1; j <= a; ++j) 
        {
            int res = 0;
            input = lec.next();
            for (int i = 1; i < input.length(); i++) 
            {
                if (input.charAt(i) != input.charAt(i - 1)) 
                {
                    res++;
                }
            }
            if (input.endsWith("-")) 
            {
                res++;
            }
            System.out.println("Case #" + j + ": " + res);
        }
    }
}
