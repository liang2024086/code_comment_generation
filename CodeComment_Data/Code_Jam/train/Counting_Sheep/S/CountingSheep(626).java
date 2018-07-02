package methodEmbedding.Counting_Sheep.S.LYD952;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountingSheep {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {
            int t = in.nextInt();
            for (int i = 1; i <= t; ++i) {
                int n = in.nextInt();

                if (n == 0) {
                    System.out.println("Case #" + i + ": INSOMNIA");
                } else {
                    int m = n;
                    for (char seen = 0; seen != 0x3FF; m += n) {
                        int l = m;
                        do {
                            seen |= 1 << (l % 10);
                        } while ((l /= 10) != 0);
                    }

                    System.out.println("Case #" + i + ": " + (m - n));
                }
            }
        }
    }
}
