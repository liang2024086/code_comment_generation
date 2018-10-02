package methodEmbedding.Revenge_of_the_Pancakes.S.LYD793;


import java.util.*;
import java.io.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        PancakeRevenge problem = new PancakeRevenge();
        for (int i = 1; i <= t; ++i) {
            System.out.println("Case #" + i + ": " + problem.alg(in)+ " " );
        }
    }


}
