package methodEmbedding.Counting_Sheep.S.LYD1475;


import java.util.Scanner;

/**
 * Created by pubudu on 4/9/16.
 */
public class CountingSheep {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        long N;
        boolean[] digits;
        int count;

        for (int i = 0; i < T; i++) {
            digits = new boolean[10];
            count = 0;
            N = in.nextInt();
            long k = 1;

            if (N == 0) {
                System.out.println("Case #" + (i+1) + ": INSOMNIA");
                continue;
            }

            for (long j = N; ; j = N * k) {
                while (j > 0) {
                    if (!digits[(int)(j % 10)]) {
                        digits[(int)(j % 10)] = true;
                        count++;
                    }

                    j /= 10;
                }

                if (count >= 10) {
                    System.out.println("Case #" + (i+1) + ": " + (N * k));
                    break;
                }

                k++;
            }
        }
    }
}
