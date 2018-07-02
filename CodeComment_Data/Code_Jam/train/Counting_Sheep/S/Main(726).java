package methodEmbedding.Counting_Sheep.S.LYD166;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int t = in.nextInt();

        for (int i = 1; i <= t; ++i) {
            long n = in.nextLong();
            SheepCounter sheepCounter = new SheepCounter(n);

            System.out.println("Case #" + i + ": " + sheepCounter.showLastNumber());
        }
    }
}
