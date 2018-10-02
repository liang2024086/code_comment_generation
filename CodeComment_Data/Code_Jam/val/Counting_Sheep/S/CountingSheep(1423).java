package methodEmbedding.Counting_Sheep.S.LYD1698;

import java.util.*;
import java.io.*;

public class CountingSheep {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int i = 0; i < t; i += 1) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.printf("Case #%d: INSOMNIA\n", i+1);
                continue;
            }
            int seen = 0;
            long acc = 0;
            while (seen < 0x3ff) {
                acc += n;
                long tmp = acc;
                while (tmp > 0) {
                    int digit = (int)(tmp % 10);
                    seen |= (1 << digit);
                    tmp /= 10;
                }
            }
            System.out.printf("Case #%d: %d\n", i+1, acc);
        }
    }
}

