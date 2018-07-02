package methodEmbedding.Counting_Sheep.S.LYD690;

import java.util.*;
import java.io.*;

public class CountingSheep {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        long n;
        int done;
        long m;
        int last;
        int recCount;
        String s;
        final int limit = 500;
        String[] split;
        Integer number;
        for (int i = 1; i <= t; ++i) {
            n = in.nextLong();
            done = 0;
            m = 1;
            last = 0;
            recCount = 0;
            s = "";
            while (done != 1023 && recCount < limit) {
                s = String.valueOf(n * m);
                split = s.split("");
                for (int i1 = 1; i1 < split.length; i1++) {
                    number = Integer.valueOf(split[i1]);
                    switch (number) {
                        case 1:
                            done |= 0b1;
                            break;
                        case 2:
                            done |= 0b10;
                            break;
                        case 3:
                            done |= 0b100;
                            break;
                        case 4:
                            done |= 0b1000;
                            break;
                        case 5:
                            done |= 0b10000;
                            break;
                        case 6:
                            done |= 0b100000;
                            break;
                        case 7:
                            done |= 0b1000000;
                            break;
                        case 8:
                            done |= 0b10000000;
                            break;
                        case 9:
                            done |= 0b100000000;
                            break;
                        case 0:
                            done |= 0b1000000000;
                            break;
                    }
                }
                if (done == last) {
                    recCount++;
                } else {
                    recCount = 0;
                    last = done;
                }
                m++;
            }
            if (recCount == limit) {
                System.out.printf("Case #%d: INSOMNIA\n", i);
            } else {
                System.out.printf("Case #%d: %s\n", i, s);
            }
        }
    }
}
