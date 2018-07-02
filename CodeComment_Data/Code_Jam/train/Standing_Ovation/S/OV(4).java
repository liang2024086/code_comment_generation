package methodEmbedding.Standing_Ovation.S.LYD1864;

import java.util.Scanner;

public class OV {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        final int cases = s.nextInt();

        for (int c = 1; c <= cases; ++c) {
            final int shyMax = s.nextInt();
            final char[] levels = s.next().toCharArray();

            int numup = levels[0]-'0';
            int numAdded = 0;
            for (int i = 1; i < levels.length; ++i) {
                final int num = levels[i] - '0';
                
                if (num == 0)
                    continue;

                if (numup >= i) {
                    numup += num;
                } else {
                   final int needed = i - numup;
                    numup += needed;
                    numup += num;
                    numAdded += needed;
                }
            }

            System.out.printf("Case #%d: %s\n", c, numAdded);
        }
        s.close();
    }

   

}
