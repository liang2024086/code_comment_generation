package methodEmbedding.Revenge_of_the_Pancakes.S.LYD693;

import java.io.*;
import java.util.*;
public class RPancakes {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        String input;
        for (int i = 1; i <= t; ++i) {
            int resultado = 0;
            input = in.next();
            for (int j = 1; j < input.length(); j++){
                if( input.charAt(j) != input.charAt(j-1)){
                    resultado++;
                }
            }
            if( input.endsWith("-")){
                resultado++;
            }
            System.out.println("Case #" + i + ": " + resultado);
        }
    }
}
