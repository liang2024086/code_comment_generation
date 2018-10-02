package methodEmbedding.Counting_Sheep.S.LYD676;

import java.util.Scanner;

public class CountingSheep {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            final int N = in.nextInt();
            boolean digitFlags[] = new boolean[10];
            if (N == 0) {
                System.out.printf("Case #%d: INSOMNIA\n", t);
                continue;
            }
            boolean sawAllDigits = false;
            int sum = N;
            while (!sawAllDigits) {
                int sumCopy = sum;
                do {
                    digitFlags[sumCopy % 10] = true;
                    sumCopy /= 10;
                } while (sumCopy > 0);

                sawAllDigits = true;
                for (boolean digit : digitFlags) {
                    if (!digit) {
                        sum += N;
                        sawAllDigits = false;
                        break;
                    }
                }
            }
            System.out.printf("Case #%d: %d\n", t, sum);
        }
    }
}
