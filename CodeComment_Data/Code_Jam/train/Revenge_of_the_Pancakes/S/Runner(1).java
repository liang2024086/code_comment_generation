package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1032;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws FileNotFoundException {

        PancakeRevenge pancakeRevenge = new PancakeRevenge();

        Scanner in;

        boolean local = false;

        if (local == true) {
            in = new Scanner(new BufferedReader(new FileReader("B-small-attempt0.in")));
        } else {
            in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        }

        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            String n = in.next();
            System.out.println("Case #" + i + ": " + pancakeRevenge.executeManeuver(n));
        }
    }
}
