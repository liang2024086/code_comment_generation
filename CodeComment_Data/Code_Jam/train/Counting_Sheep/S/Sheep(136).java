package methodEmbedding.Counting_Sheep.S.LYD1693;

import java.util.Scanner;

public class Sheep {
    public static void main(String[] main) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();

            if (n == 0) {
                System.out.println(String.format("Case #%d: INSOMNIA", i));
            } else {
                boolean[] bla = new boolean[10];
                for (int k = 0; k < 10; ++k) bla[k] = false;

                int x = 0;

                while (true) {
                    x += n;

                    int y = x;
                    while (y > 0) {
                        bla[y % 10] = true;
                        y /= 10;
                    }

                    boolean sleep = true;
                    for (int k = 0; k < 10; ++k) {
                        sleep = sleep && bla[k];
                    }

                    if (sleep) {
                        System.out.println(String.format("Case #%d: %d", i, x));
                        break;
                    }
                }
            }
        }
    }
}
