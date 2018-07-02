package methodEmbedding.Counting_Sheep.S.LYD1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sheeps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int count = Integer.parseInt(br.readLine());


        for (int i = 1; i <= count; i++) {
            long n = Integer.parseInt(br.readLine());
            if (n == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
                continue;
            }


            boolean[] seen = new boolean[10];
            int seenCount = 0;

            long j = 0;
            while(true) {
                j += n;
                long x = j;
                while(x > 9) {
                    int y = (int) x % 10;
                    if (!seen[y]) {
                        seenCount++;
                        seen[y] = true;

                    }
                    x /= 10;
                }

                if (!seen[(int)x]) {
                    seenCount++;
                    seen[(int)x] = true;
                }

                if (seenCount == 10) break;
            }

            System.out.println("Case #" + i + ": " + j);
        }
    }
}
