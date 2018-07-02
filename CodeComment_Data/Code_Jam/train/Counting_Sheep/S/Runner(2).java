package methodEmbedding.Counting_Sheep.S.LYD1637;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        CountingSheep countingSheep = new CountingSheep();

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            System.out.println("Case #" + i + ": " + countingSheep.sheepSleep(n));
        }
    }
}
