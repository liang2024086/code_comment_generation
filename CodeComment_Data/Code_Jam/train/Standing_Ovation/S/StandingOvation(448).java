package methodEmbedding.Standing_Ovation.S.LYD64;

import java.util.BitSet;
import java.util.Scanner;

public class StandingOvation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; ++i) {
            int size = in.nextInt();
            String s = in.next();

            BitSet bs = new BitSet(size + 1);

            for (int j = 0; j <= size; ++j) {
                if (s.charAt(j) > '0') {
                    bs.set(j);
                }
            }

            int totalAdded = 0;

            for (int total = 0, setIndex = bs.nextSetBit(0); setIndex >= 0; setIndex = bs.nextSetBit(setIndex + 1)) {
                if (total < setIndex) {
                    int numAdded = setIndex - total;
                    totalAdded += numAdded;
                    total += numAdded;
                }

                total += (s.charAt(setIndex) - '0');

                if (i == Integer.MAX_VALUE) {
                    break;
                }
            }

            System.out.printf("Case #%d: %d\n", i + 1, totalAdded);
        }
    }
}
