package methodEmbedding.Counting_Sheep.S.LYD132;

import java.io.*;
import java.util.Scanner;

public class CountingSheep {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileReader("smallA.in"));
        PrintStream out = new PrintStream(new FileOutputStream("A.out"));
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            if (N == 0) {
                out.println("Case #" + t + ": INSOMNIA");
                continue;
            }
            int last = 0;
            boolean[] digits = new boolean[10];
            for (int i = 1; !(digits[0] && digits[1] && digits[2] && digits[3] && digits[4] && digits[5] && digits[6] && digits[7] && digits[8] && digits[9]); i++) {
                last = i * N;
                int cur = last;
                while (cur != 0) {
                    digits[cur % 10] = true;
                    cur /= 10;
                }
            }
            out.println("Case #" + t + ": " + last);
        }
    }
}
