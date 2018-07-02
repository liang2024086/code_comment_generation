package methodEmbedding.Revenge_of_the_Pancakes.S.LYD381;


import java.io.*;
import java.util.*;

class RPancakes {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = inputReader.nextInt(); 
        String in;
        for (int j = 1; j <= t; ++j) {
            int result = 0;
            in = inputReader.next();
            for (int j1 = 1; j1 < in.length(); j1++) {
                if (in.charAt(j1) != in.charAt(j1 - 1)) {
                    result++;
                }
            }
            if (in.endsWith("-")) {
                result++;
            }
            System.out.println("Case #" + j + ": " + result);
        }
    }
}
